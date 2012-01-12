package org.bukkit.conversations;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.LinkedList;
import java.util.Queue;

/**
 */
public class Conversation {

    private Queue<PromptFactory> conversationQueue = new LinkedList<PromptFactory>();
    private Prompt activePrompt;
    
    private Plugin plugin;
    private CommandSender forWhom;

    private boolean modal;
    private ConversationPrefix prefix;
    private int timeoutSeconds;

    public Conversation(Plugin plugin, CommandSender forWhom) {
        this.plugin = plugin;
        this.forWhom = forWhom;
    }
    
    public CommandSender getForWhom() {
        return forWhom;
    }
    
    public boolean isModal() {
        return modal;
    }

    void setModal(boolean modal) {
        this.modal = modal;
    }

    public ConversationPrefix getPrefix() {
        return prefix;
    }

    void setPrefix(ConversationPrefix prefix) {
        this.prefix = prefix;
    }
    
    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }
    
    public void appendPrompt(Prompt prompt) {
        conversationQueue.add(new StaticPromptFactory(prompt));
    }
    
    public void appendPrompt(PromptFactory factory) {
        conversationQueue.add(factory);
    }

    public void begin() {
        outputNextPrompt();
        //forWhom.beginConversation(this);
    }

    public void acceptInput(String input) {
        if(activePrompt != null) {
            activePrompt.acceptInput(this, input);
            outputNextPrompt();
        }
    }

    public void abandon() {
        //forWhom.abandonConversation(this);
    }

    private void outputNextPrompt() {
        PromptFactory factory = conversationQueue.poll();
        if(factory == null) {
            abandon();
        } else {
            activePrompt = factory.createPrompt();
            forWhom.sendMessage(prefix.getPrefix(forWhom) + activePrompt.getPromptText(forWhom));
            if(!activePrompt.blocksForInput()) {
                outputNextPrompt();
            }
        }
    }

    private class StaticPromptFactory extends PromptFactory {
        private Prompt prompt;

        public StaticPromptFactory(Prompt prompt) {
            super(null);
            this.prompt = prompt;
        }
        
        public Prompt createPrompt() {
            return prompt;
        }
    }
}

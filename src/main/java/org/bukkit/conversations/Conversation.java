package org.bukkit.conversations;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

import java.util.LinkedList;
import java.util.Queue;

/**
 */
public class Conversation {

    private Prompt currentPrompt;
    
    private Plugin plugin;
    private Conversable forWhom;

    private boolean modal;
    private ConversationPrefix prefix;
    private int timeoutSeconds;

    public Conversation(Plugin plugin, Conversable forWhom, Prompt firstPrompt) {
        this.plugin = plugin;
        this.forWhom = forWhom;
        this.currentPrompt = firstPrompt;
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

    public void begin() {
        outputNextPrompt();
        forWhom.beginConversation(this);
    }

    public void acceptInput(String input) {
        if(currentPrompt != null) {
            currentPrompt = currentPrompt.acceptInput(input);
            outputNextPrompt();
        }
    }

    public void abandon() {
        currentPrompt = null;
        forWhom.abandonConversation(this);
    }

    private void outputNextPrompt() {
        if(currentPrompt == null) {
            abandon();
        } else {
            forWhom.sendMessage(prefix.getPrefix(forWhom) + currentPrompt.getPromptText(forWhom));
            if(!currentPrompt.blocksForInput()) {
                currentPrompt = currentPrompt.acceptInput(null);
                outputNextPrompt();
            }
        }
    }
}

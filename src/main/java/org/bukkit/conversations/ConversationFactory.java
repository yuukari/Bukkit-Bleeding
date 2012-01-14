package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class ConversationFactory {

    private boolean isModal;
    ConversationPrefix prefix;
    int timeout;
    List<Prompt> prompts;
    Plugin plugin;
    
    public ConversationFactory(Plugin plugin)
    {
        plugin = plugin;
        isModal = true;
        prefix = new PluginNameConversationPrefix(plugin);
        timeout = 600; // 5 minutes
        prompts = new ArrayList<Prompt>();
    }

    public ConversationFactory withModality(boolean modal)
    {
        isModal = modal;
        return this;
    }

    public ConversationFactory withPrefix(ConversationPrefix prefix) {
        this.prefix = prefix;
        return this;
    }

    public ConversationFactory withTimeout(int timeoutInSeconds) {
        this.timeout = timeoutInSeconds;
        return this;
    }

    public ConversationFactory withPrompt(Prompt prompt) {
        prompts.add(prompt);
        return this;
    }

    public Conversation buildConversation(Conversable forWhom) {
        Conversation conversation = new Conversation(plugin, forWhom);
        conversation.setModal(isModal);
        conversation.setPrefix(prefix);
        conversation.setTimeoutSeconds(timeout);
        for(Prompt p : prompts) {
            conversation.appendPrompt(p);
        }
        return conversation;
    }
}

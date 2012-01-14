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
    Prompt firstPrompt;

    public ConversationFactory()
    {
        isModal = true;
        prefix = new NullConversationPrefix();
        timeout = 600; // 5 minutes
        firstPrompt = Prompt.END_OF_CONVERSATION;
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

    public ConversationFactory withFirstPrompt(Prompt prompt) {
        firstPrompt = prompt;
        return this;
    }

    public Conversation buildConversation(Conversable forWhom) {
        Conversation conversation = new Conversation(forWhom, firstPrompt);
        conversation.setModal(isModal);
        conversation.setPrefix(prefix);
        conversation.setTimeoutSeconds(timeout);
        return conversation;
    }
}

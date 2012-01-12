package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class MessagePrompt extends Prompt{

    public MessagePrompt(Plugin plugin) {
        super(plugin);
    }

    @Override
    public boolean blocksForInput() {
        return false;
    }

    @Override
    public void acceptInput(Conversation activeConversation, String input) {
        // Do nothing. Never called.
    }
}

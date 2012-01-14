package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class MessagePrompt extends PromptBase {

    public MessagePrompt() {
        super();
    }

    @Override
    public boolean blocksForInput() {
        return false;
    }

    public Prompt acceptInput(String input) {
        return getNextPrompt();
    }

    protected abstract Prompt getNextPrompt();
}

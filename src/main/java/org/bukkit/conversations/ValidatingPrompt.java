package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class ValidatingPrompt extends PromptBase {
    public ValidatingPrompt(Plugin plugin) {
        super(plugin);
    }

    public Prompt acceptInput(String input) {
        if (isInputValid(input)) {
            return acceptValidatedInput(input);
        } else {
            // Redisplay this prompt to the user to re-collect input
            return this;
        }
    }
    
    protected abstract boolean isInputValid(String input);
    
    protected abstract Prompt acceptValidatedInput(String input);
}

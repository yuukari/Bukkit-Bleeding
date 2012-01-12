package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class ValidatingPrompt extends Prompt{
    public ValidatingPrompt(Plugin plugin) {
        super(plugin);
    }

    @Override
    public void acceptInput(Conversation activeConversation, String input) {
        if (isInputValid(input)) {
            acceptValidatedInput(activeConversation, input);
        } else {
            // Redisplay this prompt to the user to re-collect input
            activeConversation.appendPrompt(this);
        }
    }
    
    protected abstract boolean isInputValid(String input);
    
    protected abstract void acceptValidatedInput(Conversation activeConversation, String input);
}

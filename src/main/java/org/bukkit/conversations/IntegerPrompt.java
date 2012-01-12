package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class IntegerPrompt extends ValidatingPrompt{
    public IntegerPrompt(Plugin plugin) {
        super(plugin);
    }

    @Override
    protected boolean isInputValid(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    protected void acceptValidatedInput(Conversation activeConversation, String input) {
        acceptValidatedInput(activeConversation, Integer.parseInt(input));
    }

    protected abstract void acceptValidatedInput(Conversation activeConversation, int input);

}

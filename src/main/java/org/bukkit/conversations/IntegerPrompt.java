package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class IntegerPrompt extends ValidatingPrompt{
    public IntegerPrompt() {
        super();
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
    protected Prompt acceptValidatedInput(String input) {
        return acceptValidatedInput(Integer.parseInt(input));
    }

    protected abstract Prompt acceptValidatedInput(int input);

}

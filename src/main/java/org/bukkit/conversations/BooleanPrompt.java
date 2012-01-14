package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class BooleanPrompt extends ValidatingPrompt{
    public BooleanPrompt() {
        super();
    }

    @Override
    protected boolean isInputValid(String input) {
        return input.equalsIgnoreCase("yes")  ||
               input.equalsIgnoreCase("no")   ||
               input.equalsIgnoreCase("true") ||
               input.equalsIgnoreCase("false");
    }

    @Override
    protected Prompt acceptValidatedInput(String input) {
        return acceptValidatedInput(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("true"));
    }

    protected abstract Prompt acceptValidatedInput(boolean input);
}

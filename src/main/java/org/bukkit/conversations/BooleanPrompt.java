package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class BooleanPrompt extends ValidatingPrompt{
    public BooleanPrompt(Plugin plugin) {
        super(plugin);
    }

    @Override
    protected boolean isInputValid(String input) {
        return input.equalsIgnoreCase("yes")  ||
               input.equalsIgnoreCase("no")   ||
               input.equalsIgnoreCase("true") ||
               input.equalsIgnoreCase("false");
    }

    @Override
    protected void acceptValidatedInput(Conversation activeConversation, String input) {
        acceptValidatedInput(activeConversation, input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("true"));
    }

    protected abstract void acceptValidatedInput(Conversation activeConversation, boolean input);
}

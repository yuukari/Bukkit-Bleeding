package org.bukkit.conversations;

/**
 * BooleanPrompt is the base class for any prompt that requires a boolean response from the user.
 */
public abstract class BooleanPrompt extends ValidatingPrompt{

    public BooleanPrompt() {
        super();
    }

    @Override
    protected boolean isInputValid(ConversationContext context, String input) {
        return input.equalsIgnoreCase("yes")  ||
               input.equalsIgnoreCase("no")   ||
               input.equalsIgnoreCase("true") ||
               input.equalsIgnoreCase("false");
    }

    @Override
    protected Prompt acceptValidatedInput(ConversationContext context, String input) {
        return acceptValidatedInput(context, input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("true"));
    }

    /**
     * Override this method to perform some action with the user's boolean response.
     * @param context Context information about the conversation.
     * @param input The user's boolean response.
     * @return The next {@link Prompt} in the prompt graph.
     */
    protected abstract Prompt acceptValidatedInput(ConversationContext context, boolean input);
}

package org.bukkit.conversations;

/**
 * ValidatingPrompt is the base class for any prompt that requires validation. ValidatingPrompt will keep replaying
 * the prompt text until the user enters a valid response.
 */
public abstract class ValidatingPrompt implements Prompt {
    public ValidatingPrompt() {
        super();
    }

    /**
     * Accepts and processes input from the user and validates it. If validation fails, this prompt is returned for
     * re-execution, otherwise the next Prompt in the prompt graph is returned.
     * @param context Context information about the conversation.
     * @param input The input text from the user.
     * @return This prompt or the next Prompt in the prompt graph.
     */
    public Prompt acceptInput(ConversationContext context, String input) {
        if (isInputValid(context, input)) {
            return acceptValidatedInput(context, input);
        } else {
            // Redisplay this prompt to the user to re-collect input
            return this;
        }
    }

    /**
     * Ensures that the prompt waits for the user to provide input.
     * @param context Context information about the conversation.
     * @return True.
     */
    public boolean blocksForInput(ConversationContext context) {
        return true;
    }

    /**
     * Override this method to check the validity of the player's input.
     * @param context Context information about the conversation.
     * @param input The player's raw console input.
     * @return True or false depending on the validity of the input.
     */
    protected abstract boolean isInputValid(ConversationContext context, String input);

    /**
     * Override this method to accept and processes the validated input from the user. Using the input, the next Prompt
     * in the prompt graph should be returned.
     * @param context Context information about the conversation.
     * @param input The validated input text from the user.
     * @return The next Prompt in the prompt graph.
     */
    protected abstract Prompt acceptValidatedInput(ConversationContext context, String input);
}

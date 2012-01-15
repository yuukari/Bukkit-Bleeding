package org.bukkit.conversations;

import org.apache.commons.lang.math.NumberUtils;

/**
 * NumericPrompt is the base class for any prompt that requires a {@link Number} response from the user.
 */
public abstract class NumericPrompt extends ValidatingPrompt{
    public NumericPrompt() {
        super();
    }

    @Override
    protected boolean isInputValid(ConversationContext context, String input) {
        return NumberUtils.isNumber(input);
    }

    @Override
    protected Prompt acceptValidatedInput(ConversationContext context, String input) {
        try
        {
            return acceptValidatedInput(context, NumberUtils.createNumber(input));
        } catch (NumberFormatException e) {
            return acceptValidatedInput(context, NumberUtils.INTEGER_ZERO);
        }
    }

    /**
     * Override this method to perform some action with the user's integer response.
     * @param context Context information about the conversation.
     * @param input The user's response as a {@link Number}.
     * @return The next {@link Prompt} in the prompt graph.
     */
    protected abstract Prompt acceptValidatedInput(ConversationContext context, Number input);

}

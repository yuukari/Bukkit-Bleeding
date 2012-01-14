package org.bukkit.conversations;

/**
 * IntegerPrompt is the base class for any prompt that requires an integer response from the user.
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

    /**
     * Override this method to perform some action with the user's integer response.
     * @param input The user's boolean response.
     * @return The next {@link Prompt} in the prompt graph.
     */
    protected abstract Prompt acceptValidatedInput(int input);

}

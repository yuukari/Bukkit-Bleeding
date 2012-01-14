package org.bukkit.conversations;

/**
 * MessagePrompt is the base class for any prompt that only displays a message to the user and requires no input.
 */
public abstract class MessagePrompt implements Prompt{

    public MessagePrompt() {
        super();
    }

    public boolean blocksForInput() {
        return false;
    }

    /**
     * Accepts and ignores any user input, returning the next prompt in the prompt graph instead.
     * @param input Ignored.
     * @return The next prompt in the prompt graph.
     */
    public Prompt acceptInput(String input) {
        return getNextPrompt();
    }

    /**
     * Override this method to return the next prompt in the prompt graph.
     * @return The next prompt in the prompt graph.
     */
    protected abstract Prompt getNextPrompt();
}

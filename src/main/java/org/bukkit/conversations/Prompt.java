package org.bukkit.conversations;

import org.bukkit.command.CommandSender;

/**
 * A Prompt is the main constituent of a {@link Conversation}. Each prompt displays text to the user and optionally
 * waits for a user's response. Prompts are chained together into a directed graph that represents the conversation
 * flow. To halt a conversation, END_OF_CONVERSATION is returned in liu of another Prompt object.
 */
public interface Prompt extends Cloneable {

    /**
     * A convenience constant for indicating the end of a conversation.
     */
    static final Prompt END_OF_CONVERSATION = null;

    /**
     * Gets the text to display to the user when this prompt is first presented.
     * @param forWhom The entity for whom this prompt is destined.
     * @return The text to display.
     */
    String getPromptText(CommandSender forWhom);

    /**
     * Checks to see if this prompt implementation should wait for user input or immediately display the next prompt.
     * @return If true, the {@link Conversation} will wait for input before continuing.
     */
    boolean blocksForInput();

    /**
     * Accepts and processes input from the user. Using the input, the next Prompt in the prompt graph is returned.
     * @param input The input text from the user.
     * @return The next Prompt in the prompt graph.
     */
    Prompt acceptInput(String input);
}

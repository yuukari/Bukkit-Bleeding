package org.bukkit.conversations;

import org.bukkit.command.CommandSender;

/**
 */
public interface Prompt extends Cloneable{
    String getPromptText(CommandSender forWhom);

    boolean blocksForInput();

    void acceptInput(Conversation activeConversation, String input);
}

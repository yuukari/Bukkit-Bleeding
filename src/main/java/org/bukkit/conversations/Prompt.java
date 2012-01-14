package org.bukkit.conversations;

import org.bukkit.command.CommandSender;

/**
 */
public interface Prompt extends Cloneable{

    static final Prompt END_OF_CONVERSATION = null;

    String getPromptText(CommandSender forWhom);

    boolean blocksForInput();

    Prompt acceptInput(String input);
}

package org.bukkit.conversations;

import org.bukkit.command.CommandSender;

/**
 */
public interface ConversationPrefix {
    String getPrefix(CommandSender forWhom);
}

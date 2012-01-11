package org.bukkit.conversations;

import org.bukkit.command.CommandSender;

/**
 */
public class NullConversationPrefix extends ConversationPrefix{
    public NullConversationPrefix() {
        super(null);
    }

    @Override
    public String getPrefix(CommandSender forWhom) {
        return "";
    }
}

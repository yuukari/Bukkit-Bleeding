package org.bukkit.conversations;

import org.bukkit.command.CommandSender;

/**
 */
public class NullConversationPrefix extends ConversationPrefixBase {
    public NullConversationPrefix() {
        super(null);
    }

    public String getPrefix(CommandSender forWhom) {
        return "";
    }
}

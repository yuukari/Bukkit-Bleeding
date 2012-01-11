package org.bukkit.conversations;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 */
public abstract class ConversationPrefix {
    protected Plugin plugin;

    public ConversationPrefix(Plugin plugin) {
        this.plugin = plugin;
    }

    public abstract String getPrefix(CommandSender forWhom);
}

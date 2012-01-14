package org.bukkit.conversations;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 */
public abstract class ConversationPrefixBase implements ConversationPrefix {
    protected Plugin plugin;

    public ConversationPrefixBase(Plugin plugin) {
        this.plugin = plugin;
    }

}

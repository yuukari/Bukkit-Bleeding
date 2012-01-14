package org.bukkit.conversations;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 */
public class PluginNameConversationPrefix extends ConversationPrefixBase {
    
    protected String separator;
    protected ChatColor prefixColor;
    
    private String cachedPrefix;
    
    public PluginNameConversationPrefix(Plugin plugin) {
        this(plugin, " > ", ChatColor.DARK_GRAY);
    }
    
    public PluginNameConversationPrefix(Plugin plugin, String separator, ChatColor prefixColor) {
        super(plugin);
        this.separator = separator;
        this.prefixColor = prefixColor;

        cachedPrefix = prefixColor + plugin.getDescription().getName() + separator + ChatColor.WHITE;
    }

    public String getPrefix(CommandSender forWhom) {
        return cachedPrefix;
    }
}

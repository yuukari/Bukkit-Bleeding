package org.bukkit.conversations;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * PluginNameConversationPrefix is a {@link ConversationPrefix} implementation that displays the plugin name in front of
 * conversation output.
 */
public class PluginNameConversationPrefix implements ConversationPrefix {
    
    protected String separator;
    protected ChatColor prefixColor;
    protected Plugin plugin;
    
    private String cachedPrefix;
    
    public PluginNameConversationPrefix(Plugin plugin) {
        this(plugin, " > ", ChatColor.DARK_GRAY);
    }
    
    public PluginNameConversationPrefix(Plugin plugin, String separator, ChatColor prefixColor) {
        this.separator = separator;
        this.prefixColor = prefixColor;
        this.plugin = plugin;

        cachedPrefix = prefixColor + plugin.getDescription().getName() + separator + ChatColor.WHITE;
    }

    /**
     * Prepends each conversation message with the plugin name.
     * @param forWhom The entity receiving the message.
     * @return An empty string.
     */
    public String getPrefix(CommandSender forWhom) {
        return cachedPrefix;
    }
}

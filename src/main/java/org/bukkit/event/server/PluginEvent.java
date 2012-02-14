package org.bukkit.event.server;

import org.bukkit.plugin.Plugin;

/**
 * Used for plugin enable and disable events
 */
@SuppressWarnings("serial")
public abstract class PluginEvent extends ServerEvent {
    private final Plugin plugin;

    public PluginEvent(final Plugin plugin) {
        super();
        this.plugin = plugin;
    }

    /**
     * Gets the plugin involved in this event
     *
     * @return Plugin for this event
     */
    public final Plugin getPlugin() {
        return plugin;
    }
}

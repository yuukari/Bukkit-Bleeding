package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class PromptFactory {

    protected Plugin plugin;

    public PromptFactory(Plugin plugin) {
        this.plugin = plugin;
    }

    public abstract Prompt createPrompt();
}

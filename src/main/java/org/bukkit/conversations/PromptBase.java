package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

/**
 */
public abstract class PromptBase implements Prompt {

    protected Plugin plugin;

    public PromptBase(Plugin plugin) {
        this.plugin = plugin;
    }

    public boolean blocksForInput() {
        return true;
    }

}

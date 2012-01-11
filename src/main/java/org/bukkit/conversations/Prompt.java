package org.bukkit.conversations;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 */
public abstract class Prompt implements Cloneable{

    protected Plugin plugin;

    public Prompt(Plugin plugin) {
        this.plugin = plugin;
    }
    
    public abstract String getPromptText(CommandSender forWhom);

    public abstract boolean blocksForInput();

    public abstract void acceptInput(String input);
}

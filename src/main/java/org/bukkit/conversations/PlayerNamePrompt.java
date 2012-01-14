package org.bukkit.conversations;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 */
public abstract class PlayerNamePrompt extends ValidatingPrompt{
    private Plugin plugin;

    public PlayerNamePrompt(Plugin plugin) {
        super();
        this.plugin = plugin;
    }

    @Override
    protected boolean isInputValid(String input) {
        return plugin.getServer().getPlayer(input) != null;
        
    }

    @Override
    protected Prompt acceptValidatedInput(String input) {
        return acceptValidatedInput(plugin.getServer().getPlayer(input));
    }
    
    protected abstract Prompt acceptValidatedInput(Player input);
}

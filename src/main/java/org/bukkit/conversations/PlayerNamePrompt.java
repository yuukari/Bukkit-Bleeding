package org.bukkit.conversations;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

/**
 * PlayerNamePrompt is the base class for any prompt that requires the player to enter another player's name.
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

    /**
     * Override this method to perform some action with the user's player name response.
     * @param input The user's player name response.
     * @return The next {@link Prompt} in the prompt graph.
     */
    protected abstract Prompt acceptValidatedInput(Player input);
}

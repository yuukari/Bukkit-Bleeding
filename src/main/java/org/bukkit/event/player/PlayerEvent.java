package org.bukkit.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;

/**
 * Represents a player related event
 */
@SuppressWarnings("serial")
public abstract class PlayerEvent extends Event {
    private final Player player;

    public PlayerEvent(final Player player) {
        super();
        this.player = player;
    }

    /**
     * Returns the player involved in this event
     *
     * @return Player who is involved in this event
     */
    public Player getPlayer() {
        // TODO: Mark final when PlayerChatEvent.setPlayer is removed
        return player;
    }
}

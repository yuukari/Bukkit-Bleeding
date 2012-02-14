package org.bukkit.event.player;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * Holds information for player teleport events
 */
@SuppressWarnings("serial")
public class PlayerTeleportEvent extends PlayerMoveEvent {
    private static final HandlerList handlers = new HandlerList();
    private final TeleportCause cause;

    public PlayerTeleportEvent(Player player, Location from, Location to) {
        this(player, from, to, null);
        // TODO
    }

    public PlayerTeleportEvent(final Player player, Location from, Location to, final TeleportCause cause) {
        super(player, from, to);

        this.cause = cause != null ? cause : TeleportCause.UNKNOWN;
    }

    /**
     * Gets the cause of this teleportation event
     *
     * @return Cause of the event
     */
    public TeleportCause getCause() {
        return cause;
    }

    public enum TeleportCause {
        /**
         * Indicates the teleporation was caused by a player throwing an Ender Pearl
         */
        ENDER_PEARL,
        /**
         * Indicates the teleportation was caused by a player executing a command
         */
        COMMAND,
        /**
         * Indicates the teleportation was caused by a plugin
         */
        PLUGIN,
        /**
         * Indicates the teleportation was caused by an event not covered by this enum
         */
        UNKNOWN;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

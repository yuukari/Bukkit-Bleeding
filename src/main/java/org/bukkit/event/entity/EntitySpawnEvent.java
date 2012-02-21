package org.bukkit.event.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when an {@link Entity} spawns into a world
 * <p />
 * This event is not called when the following events occur:
 * <ul>
 * <li>{@link ItemSpawnEvent}</li>
 * <li>{@link CreatureSpawnEvent}</li>
 * <li>{@link EntityShootBowEvent}</li>
 * <li>{@link org.bukkit.event.vehicle.VehicleCreateEvent}</li>
 * <li>{@link org.bukkit.event.painting.PaintingPlaceEvent}</li>
 * <li>{@link org.bukkit.event.player.PlayerJoinEvent} or {@link org.bukkit.event.player.PlayerRespawnEvent}</li>
 * </ul>
 */
public class EntitySpawnEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Location location;
    private boolean cancelled;

    public EntitySpawnEvent(final Entity what, final Location location) {
        super(what);
        this.location = location;
    }

    /**
     * Gets the location at which the entity is spawning.
     *
     * @return The location at which the entity is spawning
     */
    public Location getLocation() {
        return location;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

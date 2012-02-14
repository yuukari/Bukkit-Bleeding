package org.bukkit.event.vehicle;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Raised when a vehicle is destroyed, which could be caused by either a player
 * or the environment. This is not raised if the boat is simply 'removed'
 * due to other means.
 */
@SuppressWarnings("serial")
public class VehicleDestroyEvent extends VehicleEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Entity attacker;
    private boolean cancel;

    public VehicleDestroyEvent(final Vehicle vehicle, final Entity attacker) {
        super(vehicle);
        this.attacker = attacker;
        this.cancel = false;
    }

    /**
     * Gets the Entity that has destroyed the vehicle, potentially null
     *
     * @return the Entity that has destroyed the vehicle, potentially null
     */
    public Entity getAttacker() {
        return attacker;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

package org.bukkit.event.vehicle;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Raised when a vehicle collides with an entity.
 */
@SuppressWarnings("serial")
public class VehicleEntityCollisionEvent extends VehicleCollisionEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Entity entity;
    private boolean cancel;
    private boolean cancelPickup;
    private boolean cancelCollision;

    public VehicleEntityCollisionEvent(final Vehicle vehicle, final Entity entity) {
        super(vehicle);
        this.entity = entity;
        this.cancel = false;
        this.cancelPickup = false;
        this.cancelCollision = false;
    }

    public Entity getEntity() {
        return entity;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    public boolean isPickupCancelled() {
        return cancelPickup;
    }

    public void setPickupCancelled(boolean cancel) {
        cancelPickup = cancel;
    }

    public boolean isCollisionCancelled() {
        return cancelCollision;
    }

    public void setCollisionCancelled(boolean cancel) {
        cancelCollision = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

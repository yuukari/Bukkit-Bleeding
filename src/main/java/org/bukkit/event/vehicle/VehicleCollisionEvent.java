package org.bukkit.event.vehicle;

import org.bukkit.entity.Vehicle;

/**
 * Raised when a vehicle collides.
 */
@SuppressWarnings("serial")
public abstract class VehicleCollisionEvent extends VehicleEvent {
    public VehicleCollisionEvent(Vehicle vehicle) {
        super(vehicle);
    }
}

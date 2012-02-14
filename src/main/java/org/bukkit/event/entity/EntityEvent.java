package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Event;

/**
 * Represents an Entity-related event
 */
@SuppressWarnings("serial")
public abstract class EntityEvent extends Event {
    private final Entity entity;

    public EntityEvent(final Entity entity) {
        super();
        this.entity = entity;
    }

    /**
     * Returns the Entity involved in this event
     *
     * @return Entity who is involved in this event
     */
    public final Entity getEntity() {
        return entity;
    }
}

package org.bukkit.event.entity;

import org.bukkit.entity.Animals;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Thrown when an Entity breeds with another entity
 */
@SuppressWarnings("serial")
public class EntityBreedEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private final Animals[] parents;

    public EntityBreedEvent(final Entity entity, final Animals[] parents) {
        super(entity);
        this.parents = parents;
        this.cancel = false;
    }
    
    /**
     * Gets the entities responsible for creating the child
     * @return entities responsible for creating the child
     */
    public Animals[] getParents() {
        return parents;
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

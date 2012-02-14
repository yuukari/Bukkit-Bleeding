package org.bukkit.event.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Stores data for pigs being zapped
 */
@SuppressWarnings("serial")
public class PigZapEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private final Entity pigzombie;
    private final Entity bolt;

    public PigZapEvent(final Entity entity, final Entity bolt, final Entity pigzombie) {
        super(entity);
        this.bolt = bolt;
        this.pigzombie = pigzombie;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Gets the bolt which is striking the pig.
     *
     * @return lightning entity
     */
    public Entity getLightning() {
        return bolt;
    }

    /**
     * Gets the zombie pig that will replace the pig,
     * provided the event is not cancelled first.
     *
     * @return resulting entity
     */
    public Entity getPigZombie() {
        return pigzombie;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

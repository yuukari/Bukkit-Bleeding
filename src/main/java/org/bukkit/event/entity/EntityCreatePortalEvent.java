package org.bukkit.event.entity;

import java.util.List;
import org.bukkit.PortalType;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Thrown when a Living Entity creates a portal in a world.
 */
@SuppressWarnings("serial")
public class EntityCreatePortalEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final List<BlockState> blocks;
    private boolean cancel;
    private PortalType type = PortalType.CUSTOM;

    public EntityCreatePortalEvent(final Entity entity, final List<BlockState> blocks, final PortalType type) {
        super(entity);
        this.blocks = blocks;
        this.type = type;
        this.cancel = false;
    }

    /**
     * Gets a list of all blocks associated with the portal.
     *
     * @return List of blocks that will be changed.
     */
    public List<BlockState> getBlocks() {
        return blocks;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Gets the type of portal that is trying to be created.
     *
     * @return Type of portal.
     */
    public PortalType getPortalType() {
        return type;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

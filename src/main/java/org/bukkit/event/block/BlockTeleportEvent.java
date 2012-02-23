package org.bukkit.event.block;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Thrown when a block (such as a Dragon Egg) tries to teleport from one
 * location to another.
 */
public class BlockTeleportEvent extends BlockEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private Location from;
    private Location to;

    public BlockTeleportEvent(Block what, Location from, Location to) {
        super(what);
        this.from = from;
        this.to = to;
        this.cancel = false;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * Gets the location that this block moved from
     *
     * @return Location this block moved from
     */
    public Location getFrom() {
        return from;
    }

    /**
     * Sets the location that this block moved from
     *
     * @param from New location this block moved from
     */
    public void setFrom(Location from) {
        this.from = from;
    }

    /**
     * Gets the location that this block moved to
     *
     * @return Location the block moved to
     */
    public Location getTo() {
        return to;
    }

    /**
     * Sets the location that this block moved to
     *
     * @param to New Location this block moved to
     */
    public void setTo(Location to) {
        this.to = to;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
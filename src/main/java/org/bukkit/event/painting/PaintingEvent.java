package org.bukkit.event.painting;

import org.bukkit.entity.Painting;
import org.bukkit.event.Event;

/**
 * Represents a painting-related event.
 */
@SuppressWarnings("serial")
public abstract class PaintingEvent extends Event {
    private final Painting painting;

    public PaintingEvent(final Painting painting) {
        super();
        this.painting = painting;
    }

    /**
     * Gets the painting involved in this event.
     *
     * @return the painting
     */
    public final Painting getPainting() {
        return painting;
    }
}

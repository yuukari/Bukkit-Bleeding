package org.bukkit.event.player;

import org.bukkit.Location;
import org.bukkit.TravelAgent;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

/**
 * Called when a player completes the portaling process by standing in a portal
 */
@SuppressWarnings("serial")
public class PlayerPortalEvent extends PlayerTeleportEvent {
    private static final HandlerList handlers = new HandlerList();
    private boolean useTravelAgent;
    private TravelAgent travelAgent;

    public PlayerPortalEvent(final Player player, Location from, Location to, TravelAgent pta) {
        super(player, from, to);
        this.travelAgent = pta;
        this.useTravelAgent = true;
    }

    public void useTravelAgent(boolean useTravelAgent) {
        this.useTravelAgent = useTravelAgent;
    }

    public boolean useTravelAgent() {
        return useTravelAgent;
    }

    public TravelAgent getPortalTravelAgent() {
        return travelAgent;
    }

    public void setPortalTravelAgent(TravelAgent travelAgent) {
        this.travelAgent = travelAgent;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
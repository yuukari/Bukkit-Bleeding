package org.bukkit.event.player;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Holds information for player chat and commands
 */
@SuppressWarnings("serial")
public class PlayerChatEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancel;
    private String message;
    private String format = "<%1$s> %2$s";
    private final Set<Player> recipients;
    
    @Deprecated
    private Player spoofedPlayer;

    public PlayerChatEvent(final Player player, final String message) {
        super(player);
        this.recipients = new HashSet<Player>(Arrays.asList(player.getServer().getOnlinePlayers()));
        this.message = message;
        this.spoofedPlayer = player;
        this.cancel = false;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancel) {
        this.cancel = cancel;
    }
    
    @Override
    public Player getPlayer() {
        return spoofedPlayer;
    }

    /**
     * Gets the message that the player is attempting to send
     *
     * @return Message the player is attempting to send
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message that the player will send
     *
     * @param message New message that the player will send
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Sets the player that this message will display as, or command will be
     * executed as
     *
     * @param player New player which this event will execute as
     * @deprecated Use player.sendMessage instead
     */
    @Deprecated
    public void setPlayer(final Player player) {
        this.spoofedPlayer = player;
    }

    /**
     * Gets the format to use to display this chat message
     *
     * @return String.Format compatible format string
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the format to use to display this chat message
     *
     * @param format String.Format compatible format string
     */
    public void setFormat(final String format) {
        // Oh for a better way to do this!
        try {
            String.format(format, getPlayer(), message);
        } catch (RuntimeException ex) {
            ex.fillInStackTrace();
            throw ex;
        }

        this.format = format;
    }

    /**
     * Gets a set of recipients that this chat message will be displayed to
     *
     * @return All Players who will see this chat message
     */
    public Set<Player> getRecipients() {
        return recipients;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

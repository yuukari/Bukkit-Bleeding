package org.bukkit.plugin;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.EventException;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

/**
 * Stores relevant information for plugin listeners
 */
public class RegisteredListener {
    private final Listener listener;
    private final EventPriority priority;
    private final Plugin plugin;
    private final EventExecutor executor;
    private final boolean receiveCancelled;

    public RegisteredListener(final Listener listener, final EventExecutor executor, final EventPriority priority, final Plugin plugin, final boolean receiveCancelled) {
        this.listener = listener;
        this.priority = priority;
        this.plugin = plugin;
        this.executor = executor;
        this.receiveCancelled = receiveCancelled;
    }

    /**
     * Gets the listener for this registration
     *
     * @return Registered Listener
     */
    public Listener getListener() {
        return listener;
    }

    /**
     * Gets the plugin for this registration
     *
     * @return Registered Plugin
     */
    public Plugin getPlugin() {
        return plugin;
    }

    /**
     * Gets the priority for this registration
     *
     * @return Registered Priority
     */
    public EventPriority getPriority() {
        return priority;
    }

    /**
     * Calls the event executor
     *
     * @param event The event
     */
    public void callEvent(final Event event) throws EventException {
        if (event instanceof Cancellable){
            if (((Cancellable) event).isCancelled() && getIgnoreCancelled()){
                return;
            }
        }
        executor.execute(listener, event);
    }

     /**
     * Whether this listener accepts cancelled events
     *
     * @return whether cancelled events are received
     */
    public boolean getIgnoreCancelled(){
        return receiveCancelled;
    }
}

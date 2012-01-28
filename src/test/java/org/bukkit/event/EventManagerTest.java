package org.bukkit.event;

import org.bukkit.plugin.TestPlugin;
import org.bukkit.TestServer;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.PluginManager;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple tests for the events system.
 */
public class EventManagerTest {
    private PluginManager eventManager = TestServer.getInstance().getPluginManager();

    @Test
    public void testEventCalling() {
        final TestListener testListener = new TestListener();
        eventManager.registerEvents(testListener, new TestPlugin());
        eventManager.callEvent(new TestEvent());
        assertTrue(testListener.hasBeenCalled());
    }
    
    @Test
    public void testEventPriorities() {
        final List<EventPriority> calledEventPriorities = new ArrayList<EventPriority>();
        for (final EventPriority order : EventPriority.values()) {
            eventManager.registerEvent(TestEvent.class, new TestListener(), order, new EventExecutor() {
                public void execute(Listener listener, Event event) throws EventException {
                    calledEventPriorities.add(order);
                }
            }, new TestPlugin());
        }
        eventManager.callEvent(new TestEvent());
        assertEquals(calledEventPriorities.size(), EventPriority.values().length);
        for (EventPriority order : EventPriority.values()) {
            assertTrue("EventPriority not contained in results list! ", calledEventPriorities.indexOf(order) >= 0);
            assertEquals(calledEventPriorities.get(order.getSlot()), order);
        }
    }
}

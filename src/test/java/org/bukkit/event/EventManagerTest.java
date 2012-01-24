/*
 * This file is part of SpoutAPI (http://www.getspout.org/).
 *
 * The SpoutAPI is licensed under the SpoutDev license version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev license version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://getspout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */

package org.bukkit.event;

import org.bukkit.plugin.TestPlugin;
import org.bukkit.TestServer;
import org.bukkit.plugin.EventExecutor;
import org.bukkit.plugin.PluginManager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple tests for the events system.
 */
public class SimpleEventManagerTest {
	protected PluginManager eventManager;

	@Before
	public void setUp() {
		eventManager = TestServer.getInstance().getPluginManager();
	}

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

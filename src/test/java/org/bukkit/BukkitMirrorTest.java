package org.bukkit;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BukkitMirrorTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void test() throws NoSuchMethodException {
        Method[] serverMethods = Server.class.getDeclaredMethods();
        for(Method method : serverMethods) {
            Method mirrorMethod = Bukkit.class.getDeclaredMethod(method.getName(), method.getParameterTypes());
            assertTrue("Bukkit." + method.getName() + " must be static!", Modifier.isStatic(mirrorMethod.getModifiers()));
        }
    }

}

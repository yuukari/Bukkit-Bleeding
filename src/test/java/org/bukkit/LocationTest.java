package org.bukkit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.doubleThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.bukkit.util.Vector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LocationTest {

    @Mock World world;

    private final static double X = -10.5;
    private final static double Y = 10.5;
    private final static double Z = 0.0;
    private final static float YAW = -10.5f;
    private final static float PITCH = 45.5f;

    private final static int BLOCK_X = -11;
    private final static int BLOCK_Y = 10;
    private final static int BLOCK_Z = 0;

    private Location subject;
    private Location clone;
    private Location semiZero;
    private Location zero;

    @Before
    public void setup() {
        subject = new Location(world, X, Y, Z, YAW, PITCH);
        clone = new Location(world, X, Y, Z, YAW, PITCH);
        semiZero = new Location(world, 0, 0, 0, YAW, PITCH);
        zero = new Location(world, 0, 0, 0, 0, 0);
    }

    @Test
    public void locToBlock() {
        assertThat(Location.locToBlock(X), is(BLOCK_X));
        assertThat(Location.locToBlock(Y), is(BLOCK_Y));
        assertThat(Location.locToBlock(Z), is(BLOCK_Z));
    }

    @Test
    public void verifyValues() {
        assertThat(subject.getX(), is(X));
        assertThat(subject.getY(), is(Y));
        assertThat(subject.getZ(), is(Z));
        assertThat(subject.getYaw(), is(YAW));
        assertThat(subject.getPitch(), is(PITCH));
    }

    @Test
    public void verifyBlockCoordinates() {
        assertThat(subject.getBlockX(), is(BLOCK_X));
        assertThat(subject.getBlockY(), is(BLOCK_Y));
        assertThat(subject.getBlockZ(), is(BLOCK_Z));
    }

    @Test
    public void equalsWithAccessors() {
        Location newLocation = new Location(null, 0, 0, 0);

        newLocation.setX(subject.getX());
        newLocation.setY(subject.getY());
        newLocation.setZ(subject.getZ());
        newLocation.setYaw(subject.getYaw());
        newLocation.setPitch(subject.getPitch());
        newLocation.setWorld(subject.getWorld());

        assertThat(newLocation, is(subject));
    }

    @Test
    public void cloneEquals() {
        assertThat(subject.clone(), is(subject));
        assertThat(subject.clone().hashCode(), is(subject.hashCode()));
    }

    @Test
    public void zeroDoesNotAffectPitchYaw() {
        subject.zero();

        assertThat(subject.getX(), is(0D));
        assertThat(subject.getY(), is(0D));
        assertThat(subject.getZ(), is(0D));
        assertThat(subject.getYaw(), is(not(0F)));
        assertThat(subject.getPitch(), is(not(0F)));

        assertThat(subject, is(not(zero)));
        assertThat(subject, is(semiZero));
    }

    @Test
    public void getChunk() {
        subject.getChunk();

        verify(world, times(1)).getChunkAt(subject);
    }

    @Test
    public void getBlock() {
        subject.getBlock();

        verify(world, times(1)).getBlockAt(subject);
    }

    @Test
    public void getVector() {
        Vector vector = subject.toVector();

        assertThat(vector.getX(), is(subject.getX()));
        assertThat(vector.getY(), is(subject.getY()));
        assertThat(vector.getZ(), is(subject.getZ()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNullWorldLocation() {
        clone.setWorld(null);
        subject.add(clone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAnotherWorldLocation() {
        clone.setWorld(mock(World.class));
        subject.add(clone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNullVector() {
        subject.add((Vector) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtractNullWorldLocation() {
        clone.setWorld(null);
        subject.subtract(clone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtractAnotherWorldLocation() {
        clone.setWorld(mock(World.class));
        subject.subtract(clone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void subtractNullVector() {
        subject.subtract((Vector) null);
    }

    @Test
    public void addLocation() {
        subject.add(subject);

        assertThat(subject.getX(), is(X * 2));
        assertThat(subject.getY(), is(Y * 2));
        assertThat(subject.getZ(), is(Z * 2));
    }

    @Test
    public void addIndividually() {
        subject.add(subject.getX(), subject.getY(), subject.getZ());

        assertThat(subject.getX(), is(X * 2));
        assertThat(subject.getY(), is(Y * 2));
        assertThat(subject.getZ(), is(Z * 2));
    }

    @Test
    public void addVector() {
        subject.add(subject.toVector());

        assertThat(subject.getX(), is(X * 2));
        assertThat(subject.getY(), is(Y * 2));
        assertThat(subject.getZ(), is(Z * 2));
    }

    @Test
    public void subtractLocation() {
        subject.subtract(subject);

        assertThat(subject.getX(), is(0D));
        assertThat(subject.getY(), is(0D));
        assertThat(subject.getZ(), is(0D));
    }

    @Test
    public void subtractIndividually() {
        subject.subtract(subject.getX(), subject.getY(), subject.getZ());

        assertThat(subject.getX(), is(0D));
        assertThat(subject.getY(), is(0D));
        assertThat(subject.getZ(), is(0D));
    }

    @Test
    public void subtractVector() {
        subject.subtract(subject.toVector());

        assertThat(subject.getX(), is(0D));
        assertThat(subject.getY(), is(0D));
        assertThat(subject.getZ(), is(0D));
    }

    @Test
    public void multiplyOne() {
        subject.multiply(1);

        assertThat(subject, is(clone));
    }

    @Test
    public void multiplyMinusOne() {
        subject.multiply(-1);

        assertThat(subject.getX(), is(-1 * clone.getX()));
        assertThat(subject.getY(), is(-1 * clone.getY()));
        assertThat(subject.getZ(), is(-1 * clone.getZ()));

        // Sigh -0D != 0D :(
        //assertThat(subject, is(clone.subtract(clone.clone().multiply(2))));
    }

    @Test
    public void multiplyZero() {
        subject.multiply(0);

        assertThat(subject, is(semiZero));
    }

    @Test
    public void mathTest() {
        subject.subtract(clone);
        assertThat(subject, is(semiZero));

        subject.subtract(clone).subtract(clone).subtract(clone).add(clone.clone().multiply(3));
        assertThat(subject, is(semiZero));

        subject.add(clone.clone().multiply(1000)).subtract(clone.clone().multiply(500));
        assertThat(subject, is(clone.clone().multiply(1000 - 500)));
    }

    @Test
    public void length() {
        assertThat(zero.length(), is(0D));
        assertThat(zero.lengthSquared(), is(0D));

        assertThat(subject.length() * subject.length(), closeTo(subject.lengthSquared(), 0.00005));
    }

    @Test
    public void distance() {
        assertThat(zero.distance(zero), is(0D));
        assertThat(subject.distance(subject), is(0D));
    }

    @Test(expected = IllegalArgumentException.class)
    public void distanceSquaredNull() {
        subject.distanceSquared(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void distanceSquaredNullWorld() {
        clone.setWorld(null);
        subject.distanceSquared(clone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void distanceSquaredSourceNullWorld() {
        subject.setWorld(null);
        subject.distanceSquared(clone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void distanceSquaredDiffWorld() {
        clone.setWorld(mock(World.class));
        subject.distanceSquared(clone);
    }

    @Test
    public void distanceSquared() {
        assertThat(zero.distance(zero), is(0D));
        assertThat(subject.distance(subject), is(0D));
    }

    @Test
    public void equals() {

        assertFalse(subject.equals(null));
        assertFalse(subject.equals(1));

        clone = subject.clone(); clone.setWorld(null);
        assertFalse(subject.equals(clone));

        clone = subject.clone(); clone.setWorld(mock(World.class));
        assertFalse(subject.equals(clone));

        clone = subject.clone(); clone.setX(Double.NaN);
        assertFalse(subject.equals(clone));

        clone = subject.clone(); clone.setY(Double.NaN);
        assertFalse(subject.equals(clone));

        clone = subject.clone(); clone.setZ(Double.NaN);
        assertFalse(subject.equals(clone));

        clone = subject.clone(); clone.setPitch(Float.NaN);
        assertFalse(subject.equals(clone));

        clone = subject.clone(); clone.setYaw(Float.NaN);
        assertFalse(subject.equals(clone));

        assertTrue(subject.equals(subject));
    }

    // [Grum]: This is *so* horrible.
    @Test
    public void selfModifiableIsHorrible() {
        subject.setYaw(0);
        subject.setPitch(0);

        // This obviously should be subject.multiply(-1) :(
        assertThat(subject.subtract(subject).subtract(subject), is(zero));
    }

    @Test
    public void selfModifiableIsBrokenBadly() {
        subject.setYaw(0);
        subject.setPitch(0);
        Location secondClone = subject.clone();

        // This obviously should be zero :(
        assertThat(subject.subtract(clone.multiply(2)).add(clone), is(secondClone));

        // This one 'luckily' would work.
        //assertThat(subject.add(clone).subtract(clone.multiply(2)), is(zero));
    }

    // [Grum]: This is *so* broken.
    @Test
    public void substract_add_to_zero() {
        subject.setYaw(0);
        subject.setPitch(0);
        Location clone = subject.clone();

        assertThat(subject.subtract(clone).subtract(clone).add(clone), is(zero));
    }
}

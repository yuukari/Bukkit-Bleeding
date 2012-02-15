package org.bukkit;

/**
 * Represents a static, thread-safe snapshot of chunk of blocks corresponding to a 16x16x16 section of a chunk.
 * Purpose is to allow clean, efficient copy of a chunk section's data to be made, and then handed off for processing in another thread (e.g. map rendering)
 */
public interface ChunkSectionSnapshot {
    /**
     * Gets the X-coordinate of this chunk section
     *
     * @return X-coordinate
     */
    int getX();

    /**
     * Gets the Y-coordinate of this chunk section
     *
     * @return Y-coordinate
     */
    int getY();

    /**
     * Gets the Z-coordinate of this chunk section
     *
     * @return Z-coordinate
     */
    int getZ();

    /**
     * Gets name of the world containing this chunk section
     *
     * @return Parent World Name
     */
    String getWorldName();

    /**
     * Get block type for block at corresponding coordinate in the chunk section
     *
     * @param x 0-15
     * @param y 0-15
     * @param z 0-15
     * @return 0-4095
     */
    int getBlockTypeId(int x, int y, int z);

    /**
     * Get block data for block at corresponding coordinate in the chunk section
     *
     * @param x 0-15
     * @param y 0-15
     * @param z 0-15
     * @return 0-15
     */
    int getBlockData(int x, int y, int z);

    /**
     * Get sky light level for block at corresponding coordinate in the chunk section
     *
     * @param x 0-15
     * @param y 0-15
     * @param z 0-15
     * @return 0-15
     */
    int getBlockSkyLight(int x, int y, int z);

    /**
     * Get light level emitted by block at corresponding coordinate in the chunk section
     *
     * @param x 0-15
     * @param y 0-15
     * @param z 0-15
     * @return 0-15
     */
    int getBlockEmittedLight(int x, int y, int z);

    /**
     * Test if chunk section is empty
     * 
     * @return true if empty (all block types IDs are zero), false if not
     */
    boolean isEmpty();

    /**
     * Get world full time when chunk snapshot was captured
     *
     * @return time in ticks
     */
    long getCaptureFullTime();
}
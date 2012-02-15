package org.bukkit;

import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;

/**
 * Represents a chunk of blocks
 */
public interface Chunk {

    /**
     * Gets the X-coordinate of this chunk
     *
     * @return X-coordinate
     */
    int getX();

    /**
     * Gets the Z-coordinate of this chunk
     *
     * @return Z-coordinate
     */
    int getZ();

    /**
     * Gets the world containing this chunk
     *
     * @return Parent World
     */
    World getWorld();

    /**
     * Gets a block from this chunk
     *
     * @param x 0-15
     * @param y 0-(worldheight-1)
     * @param z 0-15
     * @return the Block
     */
    Block getBlock(int x, int y, int z);

    /**
     * Capture thread-safe read-only snapshot of chunk data
     *
     * @return ChunkSnapshot
     */
    ChunkSnapshot getChunkSnapshot();

    /**
     * Capture thread-safe read-only snapshot of chunk data
     *
     * @param includeMaxblocky - if true, snapshot includes per-coordinate maximum Y values
     * @param includeBiome - if true, snapshot includes per-coordinate biome type
     * @param includeBiomeTempRain - if true, snapshot includes per-coordinate raw biome temperature and rainfall
     * @return ChunkSnapshot
     */
    ChunkSnapshot getChunkSnapshot(boolean includeMaxblocky, boolean includeBiome, boolean includeBiomeTempRain);

    /**
     * Capture thread-safe read-only snapshot of chunk section data
     *
     * @param sy - section Y coordinate (block Y coordinate / 16)
     * 
     * @return ChunkSectionSnapshot
     */
    ChunkSectionSnapshot getChunkSectionSnapshot(int sy);

    /**
     * Get a list of all entities in the chunk.
     *
     * @return The entities.
     */
    Entity[] getEntities();

    /**
     * Get a list of all tile entities in the chunk.
     *
     * @return The tile entities.
     */
    BlockState[] getTileEntities();

    /**
     * Checks if the chunk is loaded.
     *
     * @return True if it is loaded.
     */
    boolean isLoaded();

    /**
     * Loads the chunk.
     *
     * @param generate Whether or not to generate a chunk if it doesn't already exist
     * 
     * @return true if the chunk has loaded successfully, otherwise false
     */
    boolean load(boolean generate);

    /**
     * Loads the chunk.
     *
     * @return true if the chunk has loaded successfully, otherwise false
     */
    boolean load();

    /**
     * Unloads and optionally saves the Chunk
     *
     * @param save Controls whether the chunk is saved
     * @param safe Controls whether to unload the chunk when players are nearby
     * 
     * @return true if the chunk has unloaded successfully, otherwise false
     */
    boolean unload(boolean save, boolean safe);

    /**
     * Unloads and optionally saves the Chunk
     *
     * @param save Controls whether the chunk is saved
     * 
     * @return true if the chunk has unloaded successfully, otherwise false
     */
    boolean unload(boolean save);

    /**
     * Unloads and optionally saves the Chunk
     *
     * @return true if the chunk has unloaded successfully, otherwise false
     */
    boolean unload();

    /**
     * Test if section (16x16x16 portion of chunk) is empty
     * 
     * @param sy Section Y coordinate (block Y / 16, from 0 to ((worldheight/16)-1))
     * 
     * @return true if empty (all block types IDs are zero), false if not
     */
    boolean isSectionEmpty(int sy);

    /**
     * Get first non-empty section Y coordinate, starting from world top
     * 
     * @return -1 if all empty, or section Y (block Y / 16) of first non-empty section in chunk
     */
    int getTopNonEmptySection();
    
    /**
     * Get biome at given coordinates
     *
     * @param x 0-15
     * @param z 0-15
     * 
     * @return Biome at given coordinate
     */
    Biome getBiome(int x, int z);

    /**
     * Set biome at given coordinates
     *
     * @param x 0-15
     * @param z 0-15
     * @param biome New biome value
     * 
     * @return true if biome changed, false if unchanged
     */
    boolean setBiome(int x, int z, Biome biome);
}

package org.bukkit.types.block;

import org.bukkit.types.item.ItemType;

/**
 * Represents the various types of blocks in a world.
 */
public interface BlockType extends ItemType {
    /**
     * Gets the ID of this BlockType.
     *
     * @return ID of this BlockType.
     */
    public int getId();

    /**
     * Gets a human readable name of this block.
     *
     * @return Human readable block name.
     */
    public String getName();

    /**
     * Sets how much light should be emitted from this block.
     * <p>
     * The value passed should be a value between 0 and 15, which respectively indicate
     * "no light" to "full light".
     * <p>
     * This method will not automatically update all blocks with the new light levels,
     * that will need to be done manually.
     *
     * @param light Light to emit.
     * @throws IllegalArgumentException Thrown if amount is < 0 or > 15
     */
    public void setLightEmission(int amount);

    /**
     * Gets how much light should be emitted from this block.
     * <p>
     * The value returned will be a value between 0 and 15, which respectively indicate
     * "no light" to "full light".
     *
     * @return Light to emit.
     */
    public int getLightEmission();

    /**
     * Sets how much light should be blocked by this block.
     * <p>
     * The value passed should be a value between  and 15, which respectively indicate
     * "no light" to "full light".
     * <p>
     * This method will not automatically update all blocks with the new light levels,
     * that will need to be done manually.
     * <p>
     * The value indicated by this method is how much to subtract from light as it passes
     * through this block type.
     *
     * @param light Light to block.
     * @throws IllegalArgumentException Thrown if amount is < 0 or > 15
     */
    public void setLightBlock(int amount);

    /**
     * Gets how much light should be blocked by this block.
     * <p>
     * The value returned will be a value between  and 15, which respectively indicate
     * "no light" to "full light".
     * <p>
     * The value indicated by this method is how much to subtract from light as it passes
     * through this block type.
     *
     * @return Light to block.
     */
    public int getLightBlock();

    public class Wrapper extends ItemType.Wrapper implements BlockType {
        public Wrapper(int id) {
            super(id);
        }

        @Override
        public BlockType getHandle() {
            return Blocks.get(getId());
        }

        @Override
        public String getName() {
            return getHandle().getName();
        }

        public void setLightEmission(int amount) {
            getHandle().setLightEmission(amount);
        }

        public int getLightEmission() {
            return getHandle().getLightEmission();
        }

        public void setLightBlock(int amount) {
            getHandle().setLightBlock(amount);
        }

        public int getLightBlock() {
            return getHandle().getLightBlock();
        }
    }
}

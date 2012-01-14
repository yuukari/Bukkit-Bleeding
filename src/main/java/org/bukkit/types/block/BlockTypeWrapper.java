package org.bukkit.types.block;

import org.bukkit.types.item.ItemWrapper;

/**
 * A wrapper class for {@link BlockType}s to point towards any registered BlockType with a given ID
 */
public class BlockTypeWrapper extends ItemWrapper implements BlockType {
    public BlockTypeWrapper(int id) {
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

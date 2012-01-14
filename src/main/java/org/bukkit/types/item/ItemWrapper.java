package org.bukkit.types.item;

/**
 * A wrapper class for {@link Item}s to point towards any registered Item with a given ID
 */
public class ItemWrapper extends BaseItemType {
    public ItemWrapper(int id) {
        super(id);
    }

    public ItemType getHandle() {
        return Items.get(getId());
    }

    public String getName() {
        return getHandle().getName();
    }

    public int getMaxUses() {
        return getHandle().getMaxUses();
    }

    public void setMaxUses(int uses) {
        getHandle().setMaxUses(uses);
    }

    public int getBurnTime() {
        return getHandle().getBurnTime();
    }

    public void setBurnTime(int ticks) {
        getHandle().setBurnTime(ticks);
    }
}

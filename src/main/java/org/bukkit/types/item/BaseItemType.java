package org.bukkit.types.item;

/**
 * Base {@link ItemType} class
 */
public abstract class BaseItemType implements ItemType {
    private final int id;
    private int burnTime = 0;

    public BaseItemType(int id) {
        this.id = id;
    }

    public final int getId() {
        return id;
    }

    public int getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(int ticks) {
        burnTime = ticks;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof ItemType) {
            ItemType other = (ItemType) obj;
            if (this.getId() == other.getId()) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        return hash;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + id + ", " + getName() + "]";
    }
}

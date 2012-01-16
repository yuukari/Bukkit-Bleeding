package org.bukkit.types.item;

/**
 * Represents the various type of Items in the game, that may be held by players
 */
public interface ItemType {
    /**
     * Gets the ID of this ItemType.
     *
     * @return ID of this ItemType.
     */
    public int getId();

    /**
     * Gets a human readable name of this block.
     *
     * @return Human readable block name.
     */
    public String getName();

    /**
     * Gets the maximum amount of times this item may be used before breaking.
     * <p>
     * This may be 0, in which case the item will never break.
     *
     * @return Maximum amount of times this item can be used, or 0 for infinite
     */
    public int getMaxUses();

    /**
     * Sets the maximum amount of times this item may be used before breaking.
     * <p>
     * This may be 0, in which case the item will never break.
     *
     * @param uses Maximum amount of times this item can be used, or 0 for infinite
     * @throws IllegalArgumentException Thrown if uses < 0
     */
    public void setMaxUses(int uses);

    /**
     * Gets the number of ticks this fuel type will burn for.
     *
     * @return Ticks this fuel will burn for.
     */
    public int getBurnTime();

    /**
     * Sets the number of ticks this item type will burn for.
     * A value of 0 or below will cause this type not to burn.
     *
     * @param ticks New number of ticks for this item type.
     * @throws IllegalArgumentException Thrown if damage < 0
     */
    public void setBurnTime(int ticks);

    public class Wrapper extends BaseItemType {
        public Wrapper(int id) {
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
}

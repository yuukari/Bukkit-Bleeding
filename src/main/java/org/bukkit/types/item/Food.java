package org.bukkit.types.item;

/**
 * Represents a food item, that may be used to feed an entity
 */
public interface Food extends ItemType {
    /**
     * Gets the amount of nourishment this item will restore to an entity.
     *
     * @return Amount of nourishment this item will restore.
     */
    public int getNourishment();

    /**
     * Sets the amount of nourishment this item will restore to an entity.
     *
     * @param amount The amount of nourishment this item will restore.
     * @throws IllegalArgumentException Thrown if amount < 0
     */
    public void setNourishment(int amount);

    public static class Wrapper extends ItemWrapper implements Food {
        public Wrapper(int id) {
            super(id);
        }

        @Override
        public Food getHandle() {
            return (Food) super.getHandle();
        }

        public int getNourishment() {
            return getHandle().getNourishment();
        }

        public void setNourishment(int amount) {
            getHandle().setNourishment(amount);
        }
    }
}

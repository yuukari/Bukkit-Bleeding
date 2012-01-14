package org.bukkit.types.item;

/**
 * Represents a sword item, that may be used to harm other entities
 */
public interface Weapon extends ItemType {
    /**
     * Gets the damage that this item will inflict upon an entity.
     *
     * @return Damage that this sword will create.
     */
    public int getDamage();

    /**
     * Sets the damage that this sword will inflict upon an entity.
     *
     * @param damage New damage that this will cause.
     * @throws IllegalArgumentException Thrown if damage < 0
     */
    public void setDamage(int damage);

    public static class Wrapper extends ItemWrapper implements Weapon {
        public Wrapper(int id) {
            super(id);
        }

        @Override
        public Weapon getHandle() {
            return (Weapon)super.getHandle();
        }

        public int getDamage() {
            return getHandle().getDamage();
        }

        public void setDamage(int damage) {
            getHandle().setDamage(damage);
        }
    }
}

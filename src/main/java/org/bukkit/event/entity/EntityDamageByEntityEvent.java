package org.bukkit.event.entity;

import org.bukkit.entity.Entity;

/**
 * Called when an entity is damaged by an entity
 */
@SuppressWarnings("serial")
public class EntityDamageByEntityEvent extends EntityDamageEvent {
    private final Entity damager;

    public EntityDamageByEntityEvent(final Entity damager, final Entity entity, final DamageCause cause, final int damage) {
        super(entity, cause, damage);
        this.damager = damager;
    }

    /**
     * Returns the entity that damaged the defender.
     *
     * @return Entity that damaged the defender.
     */
    public Entity getDamager() {
        return damager;
    }
}

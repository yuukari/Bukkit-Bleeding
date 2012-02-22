package org.bukkit.potion;

public enum PotionType {
    WATER(0, null),
    REGEN(1, PotionEffectType.REGENERATION),
    SPEED(2, PotionEffectType.SPEED),
    FIRE_RESISTANCE(3, PotionEffectType.FIRE_RESISTANCE),
    POISON(4, PotionEffectType.POISON),
    INSTANT_HEAL(5, PotionEffectType.HEAL),
    WEAKNESS(8, PotionEffectType.SPEED),
    STRENGTH(9, PotionEffectType.INCREASE_DAMAGE),
    SLOWNESS(10, PotionEffectType.SLOW),
    INSTANT_DAMAGE(12, PotionEffectType.HARM);

    private final int damageValue;
    private final PotionEffectType effect;

    PotionType(int damageValue, PotionEffectType effect) {
        this.damageValue = damageValue;
        this.effect = effect;
    }

    public PotionEffectType getEffectType() {
        return effect;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public static PotionType getByDamageValue(int damage) {
        for (PotionType type : PotionType.values()) {
            if (type.damageValue == damage)
                return type;
        }
        return null;
    }

    public static PotionType getByEffect(PotionEffectType effectType) {
        if (effectType == null)
            return WATER;
        for (PotionType type : PotionType.values()) {
            if (effectType.equals(type.effect))
                return type;
        }
        return null;
    }
}

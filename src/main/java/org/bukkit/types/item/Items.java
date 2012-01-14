package org.bukkit.types.item;

import java.util.HashMap;
import java.util.Map;

/**
 * Represent the default {@link ItemType}s that may be found in the server
 */
public final class Items {
    public static ItemType IRON_SPADE = new ItemWrapper(256);
    public static ItemType IRON_PICKAXE = new ItemWrapper(257);
    public static ItemType IRON_AXE = new ItemWrapper(258);
    public static ItemType FLINT_AND_STEEL = new ItemWrapper(259);
    public static ItemType APPLE = new ItemWrapper(260);
    public static ItemType BOW = new ItemWrapper(261);
    public static ItemType ARROW = new ItemWrapper(262);
    public static ItemType COAL = new ItemWrapper(263);
    public static ItemType DIAMOND = new ItemWrapper(264);
    public static ItemType IRON_INGOT = new ItemWrapper(265);
    public static ItemType GOLD_INGOT = new ItemWrapper(266);
    public static Weapon IRON_SWORD = new Weapon.Wrapper(267);
    public static Weapon WOOD_SWORD = new Weapon.Wrapper(268);
    public static ItemType WOOD_SPADE = new ItemWrapper(269);
    public static ItemType WOOD_PICKAXE = new ItemWrapper(270);
    public static ItemType WOOD_AXE = new ItemWrapper(271);
    public static Weapon STONE_SWORD = new Weapon.Wrapper(272);
    public static ItemType STONE_SPADE = new ItemWrapper(273);
    public static ItemType STONE_PICKAXE = new ItemWrapper(274);
    public static ItemType STONE_AXE = new ItemWrapper(275);
    public static Weapon DIAMOND_SWORD = new Weapon.Wrapper(276);
    public static ItemType DIAMOND_SPADE = new ItemWrapper(277);
    public static ItemType DIAMOND_PICKAXE = new ItemWrapper(278);
    public static ItemType DIAMOND_AXE = new ItemWrapper(279);
    public static ItemType STICK = new ItemWrapper(280);
    public static ItemType BOWL = new ItemWrapper(281);
    public static ItemType MUSHROOM_SOUP = new ItemWrapper(282);
    public static Weapon GOLD_SWORD = new Weapon.Wrapper(283);
    public static ItemType GOLD_SPADE = new ItemWrapper(284);
    public static ItemType GOLD_PICKAXE = new ItemWrapper(285);
    public static ItemType GOLD_AXE = new ItemWrapper(286);
    public static ItemType STRING = new ItemWrapper(287);
    public static ItemType FEATHER = new ItemWrapper(288);
    public static ItemType SULPHUR = new ItemWrapper(289);
    public static ItemType WOOD_HOE = new ItemWrapper(290);
    public static ItemType STONE_HOE = new ItemWrapper(291);
    public static ItemType IRON_HOE = new ItemWrapper(292);
    public static ItemType DIAMOND_HOE = new ItemWrapper(293);
    public static ItemType GOLD_HOE = new ItemWrapper(294);
    public static ItemType SEEDS = new ItemWrapper(295);
    public static ItemType WHEAT = new ItemWrapper(296);
    public static ItemType BREAD = new ItemWrapper(297);
    public static ItemType LEATHER_HELMET = new ItemWrapper(298);
    public static ItemType LEATHER_CHESTPLATE = new ItemWrapper(299);
    public static ItemType LEATHER_LEGGINGS = new ItemWrapper(300);
    public static ItemType LEATHER_BOOTS = new ItemWrapper(301);
    public static ItemType CHAINMAIL_HELMET = new ItemWrapper(302);
    public static ItemType CHAINMAIL_CHESTPLATE = new ItemWrapper(303);
    public static ItemType CHAINMAIL_LEGGINGS = new ItemWrapper(304);
    public static ItemType CHAINMAIL_BOOTS = new ItemWrapper(304);
    public static ItemType IRON_HELMET = new ItemWrapper(306);
    public static ItemType IRON_CHESTPLATE = new ItemWrapper(307);
    public static ItemType IRON_LEGGINGS = new ItemWrapper(308);
    public static ItemType IRON_BOOTS = new ItemWrapper(309);
    public static ItemType DIAMOND_HELMET = new ItemWrapper(310);
    public static ItemType DIAMOND_CHESTPLATE = new ItemWrapper(311);
    public static ItemType DIAMOND_LEGGINGS = new ItemWrapper(312);
    public static ItemType DIAMOND_BOOTS = new ItemWrapper(313);
    public static ItemType GOLD_HELMET = new ItemWrapper(314);
    public static ItemType GOLD_CHESTPLATE = new ItemWrapper(315);
    public static ItemType GOLD_LEGGINGS = new ItemWrapper(316);
    public static ItemType GOLD_BOOTS = new ItemWrapper(317);
    public static ItemType FLINT = new ItemWrapper(318);
    public static ItemType PORK = new ItemWrapper(319);
    public static ItemType GRILLED_PORK = new ItemWrapper(320);
    public static ItemType PAINTING = new ItemWrapper(321);
    public static ItemType GOLDEN_APPLE = new ItemWrapper(322);
    public static ItemType SIGN = new ItemWrapper(323);
    public static ItemType WOOD_DOOR = new ItemWrapper(324);
    public static ItemType BUCKET = new ItemWrapper(325);
    public static ItemType WATER_BUCKET = new ItemWrapper(326);
    public static ItemType LAVA_BUCKET = new ItemWrapper(327);
    public static ItemType MINECART = new ItemWrapper(328);
    public static ItemType SADDLE = new ItemWrapper(329);
    public static ItemType IRON_DOOR = new ItemWrapper(330);
    public static ItemType REDSTONE = new ItemWrapper(331);
    public static ItemType SNOW_BALL = new ItemWrapper(332);
    public static ItemType BOAT = new ItemWrapper(333);
    public static ItemType LEATHER = new ItemWrapper(334);
    public static ItemType MILK_BUCKET = new ItemWrapper(335);
    public static ItemType CLAY_BRICK = new ItemWrapper(336);
    public static ItemType CLAY_BALL = new ItemWrapper(337);
    public static ItemType SUGAR_CANE = new ItemWrapper(338);
    public static ItemType PAPER = new ItemWrapper(339);
    public static ItemType BOOK = new ItemWrapper(340);
    public static ItemType SLIME_BALL = new ItemWrapper(341);
    public static ItemType STORAGE_MINECART = new ItemWrapper(342);
    public static ItemType POWERED_MINECART = new ItemWrapper(343);
    public static ItemType EGG = new ItemWrapper(344);
    public static ItemType COMPASS = new ItemWrapper(345);
    public static ItemType FISHING_ROD = new ItemWrapper(346);
    public static ItemType WATCH = new ItemWrapper(347);
    public static ItemType GLOWSTONE_DUST = new ItemWrapper(348);
    public static ItemType RAW_FISH = new ItemWrapper(349);
    public static ItemType COOKED_FISH = new ItemWrapper(350);
    public static ItemType INK_SACK = new ItemWrapper(351);
    public static ItemType BONE = new ItemWrapper(352);
    public static ItemType SUGAR = new ItemWrapper(353);
    public static ItemType CAKE = new ItemWrapper(354);
    public static ItemType BED = new ItemWrapper(355);
    public static ItemType DIODE = new ItemWrapper(356);
    public static ItemType COOKIE = new ItemWrapper(357);
    public static ItemType MAP = new ItemWrapper(358);
    public static ItemType SHEARS = new ItemWrapper(359);
    public static ItemType MELON_SLICE = new ItemWrapper(360); // This is MELON in NMS/Items.java
    public static ItemType PUMPKIN_SEEDS = new ItemWrapper(361);
    public static ItemType MELON_SEEDS = new ItemWrapper(362);
    public static ItemType RAW_BEEF = new ItemWrapper(363);
    public static ItemType COOKED_BEEF = new ItemWrapper(364);
    public static ItemType RAW_CHICKEN = new ItemWrapper(365);
    public static ItemType COOKED_CHICKEN = new ItemWrapper(366);
    public static ItemType ROTTEN_FLESH = new ItemWrapper(367);
    public static ItemType ENDER_PEARL = new ItemWrapper(368);
    public static ItemType BLAZE_ROD = new ItemWrapper(369);
    public static ItemType GHAST_TEAR = new ItemWrapper(370);
    public static ItemType GOLD_NUGGET = new ItemWrapper(371);
    public static ItemType NETHER_STALK = new ItemWrapper(372);
    public static ItemType POTION = new ItemWrapper(373);
    public static ItemType GLASS_BOTTLE = new ItemWrapper(374);
    public static ItemType SPIDER_EYE = new ItemWrapper(375);
    public static ItemType FERMENTED_SPIDER_EYE = new ItemWrapper(376);
    public static ItemType BLAZE_POWDER = new ItemWrapper(377);
    public static ItemType MAGMA_CREAM = new ItemWrapper(378);
    public static ItemType BREWING_STAND = new ItemWrapper(379);
    public static ItemType CAULDRON = new ItemWrapper(380);
    public static ItemType EYE_OF_ENDER = new ItemWrapper(381);
    public static ItemType SPECKLED_MELON = new ItemWrapper(382);
    public static ItemType MONSTER_EGG = new ItemWrapper(383);
    public static ItemType RECORD_1 = new ItemWrapper(2256);
    public static ItemType RECORD_2 = new ItemWrapper(2257);
    public static ItemType RECORD_3 = new ItemWrapper(2258);
    public static ItemType RECORD_4 = new ItemWrapper(2259);
    public static ItemType RECORD_5 = new ItemWrapper(2260);
    public static ItemType RECORD_6 = new ItemWrapper(2261);
    public static ItemType RECORD_7 = new ItemWrapper(2262);
    public static ItemType RECORD_8 = new ItemWrapper(2263);
    public static ItemType RECORD_9 = new ItemWrapper(2264);
    public static ItemType RECORD_10 = new ItemWrapper(2265);
    public static ItemType RECORD_11 = new ItemWrapper(2266);

    private static final int MAX_ITEM_TYPES = 32000;
    private static final ItemType[] types = new ItemType[MAX_ITEM_TYPES];
    private static final Map<String, ItemType> aliases = new HashMap<String, ItemType>(MAX_ITEM_TYPES);
    private static boolean acceptingRegs = true;

    /**
     * Attempts to register a given ItemType.
     *
     * @param type Type to register.
     * @throws IllegalArgumentException Thrown if type is null.
     * @throws IllegalArgumentException Thrown is a ItemType is already registered with the same ID as the passed type.
     */
    public static void registerItem(ItemType type) {
        if (type == null) {
            throw new IllegalArgumentException("Cannot register a null type");
        } else if (types[type.getId()] != null) {
            throw new IllegalArgumentException("An ItemType with the id " + type.getId() + " already exists!");
        } else if (!acceptingRegs) {
            throw new IllegalStateException("Item type registrations are not being accepted at this time");
        }

        types[type.getId()] = type;
    }

    /**
     * Stops this class from accepting any further ItemType registrations.
     */
    public static void stopAcceptingRegistrations() {
        acceptingRegs = false;
    }

    /**
     * Checks if this class is accepting new ItemType registrations.
     *
     * @return True if you can call {@link #registerBlock(org.bukkit.types.item.ItemType)}.
     */
    public static boolean isAcceptingRegistrations() {
        return acceptingRegs;
    }

    /**
     * Gets an ItemType with the given ID.
     * <p>
     * This may return null if no ItemType is registered with the given ID.
     *
     * @param id ID to retrieve.
     * @return ItemType with the given ID, or null.
     */
    public static ItemType get(int id) {
        return (id < 0 || id >= MAX_ITEM_TYPES) ? null : types[id];
    }

    /**
     * Gets a ItemType with the given name or alias.
     * <p>
     * This may return null if no ItemType is registered with the given name.
     *
     * @param name Name of the item to retrieve.
     * @return ItemType with the given ID, or null.
     */
    public static ItemType get(String name) {
        return aliases.get(name);
    }
}

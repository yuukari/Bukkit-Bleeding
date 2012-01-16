package org.bukkit.types.item;

import java.util.HashMap;
import java.util.Map;

/**
 * Represent the default {@link ItemType}s that may be found in the server
 */
public final class Items {
    public static ItemType IRON_SPADE = new ItemType.Wrapper(256);
    public static ItemType IRON_PICKAXE = new ItemType.Wrapper(257);
    public static ItemType IRON_AXE = new ItemType.Wrapper(258);
    public static ItemType FLINT_AND_STEEL = new ItemType.Wrapper(259);
    public static Food APPLE = new Food.Wrapper(260);
    public static ItemType BOW = new ItemType.Wrapper(261);
    public static ItemType ARROW = new ItemType.Wrapper(262);
    public static ItemType COAL = new ItemType.Wrapper(263);
    public static ItemType DIAMOND = new ItemType.Wrapper(264);
    public static ItemType IRON_INGOT = new ItemType.Wrapper(265);
    public static ItemType GOLD_INGOT = new ItemType.Wrapper(266);
    public static Weapon IRON_SWORD = new Weapon.Wrapper(267);
    public static Weapon WOOD_SWORD = new Weapon.Wrapper(268);
    public static ItemType WOOD_SPADE = new ItemType.Wrapper(269);
    public static ItemType WOOD_PICKAXE = new ItemType.Wrapper(270);
    public static ItemType WOOD_AXE = new ItemType.Wrapper(271);
    public static Weapon STONE_SWORD = new Weapon.Wrapper(272);
    public static ItemType STONE_SPADE = new ItemType.Wrapper(273);
    public static ItemType STONE_PICKAXE = new ItemType.Wrapper(274);
    public static ItemType STONE_AXE = new ItemType.Wrapper(275);
    public static Weapon DIAMOND_SWORD = new Weapon.Wrapper(276);
    public static ItemType DIAMOND_SPADE = new ItemType.Wrapper(277);
    public static ItemType DIAMOND_PICKAXE = new ItemType.Wrapper(278);
    public static ItemType DIAMOND_AXE = new ItemType.Wrapper(279);
    public static ItemType STICK = new ItemType.Wrapper(280);
    public static ItemType BOWL = new ItemType.Wrapper(281);
    public static Food MUSHROOM_SOUP = new Food.Wrapper(282);
    public static Weapon GOLD_SWORD = new Weapon.Wrapper(283);
    public static ItemType GOLD_SPADE = new ItemType.Wrapper(284);
    public static ItemType GOLD_PICKAXE = new ItemType.Wrapper(285);
    public static ItemType GOLD_AXE = new ItemType.Wrapper(286);
    public static ItemType STRING = new ItemType.Wrapper(287);
    public static ItemType FEATHER = new ItemType.Wrapper(288);
    public static ItemType SULPHUR = new ItemType.Wrapper(289);
    public static ItemType WOOD_HOE = new ItemType.Wrapper(290);
    public static ItemType STONE_HOE = new ItemType.Wrapper(291);
    public static ItemType IRON_HOE = new ItemType.Wrapper(292);
    public static ItemType DIAMOND_HOE = new ItemType.Wrapper(293);
    public static ItemType GOLD_HOE = new ItemType.Wrapper(294);
    public static ItemType SEEDS = new ItemType.Wrapper(295);
    public static ItemType WHEAT = new ItemType.Wrapper(296);
    public static Food BREAD = new Food.Wrapper(297);
    public static ItemType LEATHER_HELMET = new ItemType.Wrapper(298);
    public static ItemType LEATHER_CHESTPLATE = new ItemType.Wrapper(299);
    public static ItemType LEATHER_LEGGINGS = new ItemType.Wrapper(300);
    public static ItemType LEATHER_BOOTS = new ItemType.Wrapper(301);
    public static ItemType CHAINMAIL_HELMET = new ItemType.Wrapper(302);
    public static ItemType CHAINMAIL_CHESTPLATE = new ItemType.Wrapper(303);
    public static ItemType CHAINMAIL_LEGGINGS = new ItemType.Wrapper(304);
    public static ItemType CHAINMAIL_BOOTS = new ItemType.Wrapper(304);
    public static ItemType IRON_HELMET = new ItemType.Wrapper(306);
    public static ItemType IRON_CHESTPLATE = new ItemType.Wrapper(307);
    public static ItemType IRON_LEGGINGS = new ItemType.Wrapper(308);
    public static ItemType IRON_BOOTS = new ItemType.Wrapper(309);
    public static ItemType DIAMOND_HELMET = new ItemType.Wrapper(310);
    public static ItemType DIAMOND_CHESTPLATE = new ItemType.Wrapper(311);
    public static ItemType DIAMOND_LEGGINGS = new ItemType.Wrapper(312);
    public static ItemType DIAMOND_BOOTS = new ItemType.Wrapper(313);
    public static ItemType GOLD_HELMET = new ItemType.Wrapper(314);
    public static ItemType GOLD_CHESTPLATE = new ItemType.Wrapper(315);
    public static ItemType GOLD_LEGGINGS = new ItemType.Wrapper(316);
    public static ItemType GOLD_BOOTS = new ItemType.Wrapper(317);
    public static ItemType FLINT = new ItemType.Wrapper(318);
    public static Food PORK = new Food.Wrapper(319);
    public static Food GRILLED_PORK = new Food.Wrapper(320);
    public static ItemType PAINTING = new ItemType.Wrapper(321);
    public static ItemType GOLDEN_APPLE = new ItemType.Wrapper(322);
    public static ItemType SIGN = new ItemType.Wrapper(323);
    public static ItemType WOOD_DOOR = new ItemType.Wrapper(324);
    public static ItemType BUCKET = new ItemType.Wrapper(325);
    public static ItemType WATER_BUCKET = new ItemType.Wrapper(326);
    public static ItemType LAVA_BUCKET = new ItemType.Wrapper(327);
    public static ItemType MINECART = new ItemType.Wrapper(328);
    public static ItemType SADDLE = new ItemType.Wrapper(329);
    public static ItemType IRON_DOOR = new ItemType.Wrapper(330);
    public static ItemType REDSTONE = new ItemType.Wrapper(331);
    public static ItemType SNOW_BALL = new ItemType.Wrapper(332);
    public static ItemType BOAT = new ItemType.Wrapper(333);
    public static ItemType LEATHER = new ItemType.Wrapper(334);
    public static ItemType MILK_BUCKET = new ItemType.Wrapper(335);
    public static ItemType CLAY_BRICK = new ItemType.Wrapper(336);
    public static ItemType CLAY_BALL = new ItemType.Wrapper(337);
    public static ItemType SUGAR_CANE = new ItemType.Wrapper(338);
    public static ItemType PAPER = new ItemType.Wrapper(339);
    public static ItemType BOOK = new ItemType.Wrapper(340);
    public static ItemType SLIME_BALL = new ItemType.Wrapper(341);
    public static ItemType STORAGE_MINECART = new ItemType.Wrapper(342);
    public static ItemType POWERED_MINECART = new ItemType.Wrapper(343);
    public static ItemType EGG = new ItemType.Wrapper(344);
    public static ItemType COMPASS = new ItemType.Wrapper(345);
    public static ItemType FISHING_ROD = new ItemType.Wrapper(346);
    public static ItemType WATCH = new ItemType.Wrapper(347);
    public static ItemType GLOWSTONE_DUST = new ItemType.Wrapper(348);
    public static Food RAW_FISH = new Food.Wrapper(349);
    public static Food COOKED_FISH = new Food.Wrapper(350);
    public static ItemType INK_SACK = new ItemType.Wrapper(351);
    public static ItemType BONE = new ItemType.Wrapper(352);
    public static ItemType SUGAR = new ItemType.Wrapper(353);
    public static ItemType CAKE = new ItemType.Wrapper(354);
    public static ItemType BED = new ItemType.Wrapper(355);
    public static ItemType DIODE = new ItemType.Wrapper(356);
    public static Food COOKIE = new Food.Wrapper(357);
    public static ItemType MAP = new ItemType.Wrapper(358);
    public static ItemType SHEARS = new ItemType.Wrapper(359);
    public static Food MELON_SLICE = new Food.Wrapper(360); // This is MELON in NMS/Items.java
    public static ItemType PUMPKIN_SEEDS = new ItemType.Wrapper(361);
    public static ItemType MELON_SEEDS = new ItemType.Wrapper(362);
    public static Food RAW_BEEF = new Food.Wrapper(363);
    public static Food COOKED_BEEF = new Food.Wrapper(364);
    public static Food RAW_CHICKEN = new Food.Wrapper(365);
    public static Food COOKED_CHICKEN = new Food.Wrapper(366);
    public static Food ROTTEN_FLESH = new Food.Wrapper(367);
    public static ItemType ENDER_PEARL = new ItemType.Wrapper(368);
    public static ItemType BLAZE_ROD = new ItemType.Wrapper(369);
    public static ItemType GHAST_TEAR = new ItemType.Wrapper(370);
    public static ItemType GOLD_NUGGET = new ItemType.Wrapper(371);
    public static ItemType NETHER_STALK = new ItemType.Wrapper(372);
    public static ItemType POTION = new ItemType.Wrapper(373);
    public static ItemType GLASS_BOTTLE = new ItemType.Wrapper(374);
    public static ItemType SPIDER_EYE = new ItemType.Wrapper(375);
    public static ItemType FERMENTED_SPIDER_EYE = new ItemType.Wrapper(376);
    public static ItemType BLAZE_POWDER = new ItemType.Wrapper(377);
    public static ItemType MAGMA_CREAM = new ItemType.Wrapper(378);
    public static ItemType BREWING_STAND = new ItemType.Wrapper(379);
    public static ItemType CAULDRON = new ItemType.Wrapper(380);
    public static ItemType EYE_OF_ENDER = new ItemType.Wrapper(381);
    public static ItemType SPECKLED_MELON = new ItemType.Wrapper(382);
    public static ItemType MONSTER_EGG = new ItemType.Wrapper(383);
    public static ItemType RECORD_1 = new ItemType.Wrapper(2256);
    public static ItemType RECORD_2 = new ItemType.Wrapper(2257);
    public static ItemType RECORD_3 = new ItemType.Wrapper(2258);
    public static ItemType RECORD_4 = new ItemType.Wrapper(2259);
    public static ItemType RECORD_5 = new ItemType.Wrapper(2260);
    public static ItemType RECORD_6 = new ItemType.Wrapper(2261);
    public static ItemType RECORD_7 = new ItemType.Wrapper(2262);
    public static ItemType RECORD_8 = new ItemType.Wrapper(2263);
    public static ItemType RECORD_9 = new ItemType.Wrapper(2264);
    public static ItemType RECORD_10 = new ItemType.Wrapper(2265);
    public static ItemType RECORD_11 = new ItemType.Wrapper(2266);

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

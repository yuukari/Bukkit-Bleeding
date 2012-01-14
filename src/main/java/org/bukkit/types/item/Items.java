package org.bukkit.types.item;

import java.util.HashMap;
import java.util.Map;

/**
 * Represent the default {@link ItemType}s that may be found in the server
 */
public final class Items {
    public static final BlockItem STONE = new BlockItem.Wrapper(1);
    public static final BlockItem GRASS = new BlockItem.Wrapper(2);
    public static final BlockItem DIRT = new BlockItem.Wrapper(3);
    public static final BlockItem COBBLESTONE = new BlockItem.Wrapper(4);
    public static final BlockItem WOOD = new BlockItem.Wrapper(5);
    public static final BlockItem SAPLING = new BlockItem.Wrapper(6);
    public static final BlockItem BEDROCK = new BlockItem.Wrapper(7);
    public static final BlockItem WATER = new BlockItem.Wrapper(8);
    public static final BlockItem STATIONARY_WATER = new BlockItem.Wrapper(9);
    public static final BlockItem LAVA = new BlockItem.Wrapper(10);
    public static final BlockItem STATIONARY_LAVA = new BlockItem.Wrapper(11);
    public static final BlockItem SAND = new BlockItem.Wrapper(12);
    public static final BlockItem GRAVEL = new BlockItem.Wrapper(13);
    public static final BlockItem GOLD_ORE = new BlockItem.Wrapper(14);
    public static final BlockItem IRON_ORE = new BlockItem.Wrapper(15);
    public static final BlockItem COAL_ORE = new BlockItem.Wrapper(16);
    public static final BlockItem LOG = new BlockItem.Wrapper(17);
    public static final BlockItem LEAVES = new BlockItem.Wrapper(18);
    public static final BlockItem SPONGE = new BlockItem.Wrapper(19);
    public static final BlockItem GLASS = new BlockItem.Wrapper(20);
    public static final BlockItem LAPIS_ORE = new BlockItem.Wrapper(21);
    public static final BlockItem LAPIS_BLOCK = new BlockItem.Wrapper(22);
    public static final BlockItem DISPENSER = new BlockItem.Wrapper(23);
    public static final BlockItem SANDSTONE = new BlockItem.Wrapper(24);
    public static final BlockItem NOTE_BLOCK = new BlockItem.Wrapper(25);
    public static final BlockItem BED_BLOCK = new BlockItem.Wrapper(26); // This is BED in NMS/Block.java
    public static final BlockItem GOLDEN_RAIL = new BlockItem.Wrapper(27);
    public static final BlockItem DETECTOR_RAIL = new BlockItem.Wrapper(28);
    public static final BlockItem PISTON_STICKY = new BlockItem.Wrapper(29);
    public static final BlockItem WEB = new BlockItem.Wrapper(30);
    public static final BlockItem LONG_GRASS = new BlockItem.Wrapper(31);
    public static final BlockItem DEAD_BUSH = new BlockItem.Wrapper(32);
    public static final BlockItem PISTON = new BlockItem.Wrapper(33);
    public static final BlockItem PISTON_EXTENSION = new BlockItem.Wrapper(34);
    public static final BlockItem WOOL = new BlockItem.Wrapper(35);
    public static final BlockItem PISTON_MOVING = new BlockItem.Wrapper(36);
    public static final BlockItem YELLOW_FLOWER = new BlockItem.Wrapper(37);
    public static final BlockItem RED_ROSE = new BlockItem.Wrapper(38);
    public static final BlockItem BROWN_MUSHROOM = new BlockItem.Wrapper(39);
    public static final BlockItem RED_MUSHROOM = new BlockItem.Wrapper(40);
    public static final BlockItem GOLD_BLOCK = new BlockItem.Wrapper(41);
    public static final BlockItem IRON_BLOCK = new BlockItem.Wrapper(42);
    public static final BlockItem DOUBLE_STEP = new BlockItem.Wrapper(43);
    public static final BlockItem STEP = new BlockItem.Wrapper(44);
    public static final BlockItem BRICK = new BlockItem.Wrapper(45);
    public static final BlockItem TNT = new BlockItem.Wrapper(46);
    public static final BlockItem BOOKSHELF = new BlockItem.Wrapper(47);
    public static final BlockItem MOSSY_COBBLESTONE = new BlockItem.Wrapper(48);
    public static final BlockItem OBSIDIAN = new BlockItem.Wrapper(49);
    public static final BlockItem TORCH = new BlockItem.Wrapper(50);
    public static final BlockItem FIRE = new BlockItem.Wrapper(51);
    public static final BlockItem MOB_SPAWNER = new BlockItem.Wrapper(52);
    public static final BlockItem WOOD_STAIRS = new BlockItem.Wrapper(53);
    public static final BlockItem CHEST = new BlockItem.Wrapper(54);
    public static final BlockItem REDSTONE_WIRE = new BlockItem.Wrapper(55);
    public static final BlockItem DIAMOND_ORE = new BlockItem.Wrapper(56);
    public static final BlockItem DIAMOND_BLOCK = new BlockItem.Wrapper(57);
    public static final BlockItem WORKBENCH = new BlockItem.Wrapper(58);
    public static final BlockItem CROPS = new BlockItem.Wrapper(59);
    public static final BlockItem SOIL = new BlockItem.Wrapper(60);
    public static final BlockItem FURNACE = new BlockItem.Wrapper(61);
    public static final BlockItem BURNING_FURNACE = new BlockItem.Wrapper(62);
    public static final BlockItem SIGN_POST = new BlockItem.Wrapper(63);
    public static final BlockItem WOODEN_DOOR = new BlockItem.Wrapper(64);
    public static final BlockItem LADDER = new BlockItem.Wrapper(65);
    public static final BlockItem RAILS = new BlockItem.Wrapper(66);
    public static final BlockItem COBBLESTONE_STAIRS = new BlockItem.Wrapper(67);
    public static final BlockItem WALL_SIGN = new BlockItem.Wrapper(68);
    public static final BlockItem LEVER = new BlockItem.Wrapper(69);
    public static final BlockItem STONE_PLATE = new BlockItem.Wrapper(70);
    public static final BlockItem IRON_DOOR_BLOCK = new BlockItem.Wrapper(71);
    public static final BlockItem WOOD_PLATE = new BlockItem.Wrapper(72);
    public static final BlockItem REDSTONE_ORE = new BlockItem.Wrapper(73);
    public static final BlockItem GLOWING_REDSTONE_ORE = new BlockItem.Wrapper(74);
    public static final BlockItem REDSTONE_TORCH_OFF = new BlockItem.Wrapper(75);
    public static final BlockItem REDSTONE_TORCH_ON = new BlockItem.Wrapper(76);
    public static final BlockItem STONE_BUTTON = new BlockItem.Wrapper(77);
    public static final BlockItem SNOW = new BlockItem.Wrapper(78);
    public static final BlockItem ICE = new BlockItem.Wrapper(79);
    public static final BlockItem SNOW_BLOCK = new BlockItem.Wrapper(80);
    public static final BlockItem CACTUS = new BlockItem.Wrapper(81);
    public static final BlockItem CLAY = new BlockItem.Wrapper(82);
    public static final BlockItem SUGAR_CANE_BLOCK = new BlockItem.Wrapper(83);
    public static final BlockItem JUKEBOX = new BlockItem.Wrapper(84);
    public static final BlockItem FENCE = new BlockItem.Wrapper(85);
    public static final BlockItem PUMPKIN = new BlockItem.Wrapper(86);
    public static final BlockItem NETHERRACK = new BlockItem.Wrapper(87);
    public static final BlockItem SOUL_SAND = new BlockItem.Wrapper(88);
    public static final BlockItem GLOWSTONE = new BlockItem.Wrapper(89);
    public static final BlockItem PORTAL = new BlockItem.Wrapper(90);
    public static final BlockItem JACK_O_LANTERN = new BlockItem.Wrapper(91);
    public static final BlockItem CAKE_BLOCK = new BlockItem.Wrapper(92);
    public static final BlockItem DIODE_OFF = new BlockItem.Wrapper(93);
    public static final BlockItem DIODE_ON = new BlockItem.Wrapper(94);
    public static final BlockItem LOCKED_CHEST = new BlockItem.Wrapper(95);
    public static final BlockItem TRAP_DOOR = new BlockItem.Wrapper(96);
    public static final BlockItem MONSTER_EGGS = new BlockItem.Wrapper(97);
    public static final BlockItem SMOOTH_BRICK = new BlockItem.Wrapper(98);
    public static final BlockItem BIG_MUSHROOM_1 = new BlockItem.Wrapper(99);
    public static final BlockItem BIG_MUSHROOM_2 = new BlockItem.Wrapper(100);
    public static final BlockItem IRON_FENCE = new BlockItem.Wrapper(101);
    public static final BlockItem THIN_GLASS = new BlockItem.Wrapper(102);
    public static final BlockItem MELON = new BlockItem.Wrapper(103);
    public static final BlockItem PUMPKIN_STEM = new BlockItem.Wrapper(104);
    public static final BlockItem MELON_STEM = new BlockItem.Wrapper(105);
    public static final BlockItem VINE = new BlockItem.Wrapper(106);
    public static final BlockItem FENCE_GATE = new BlockItem.Wrapper(107);
    public static final BlockItem BRICK_STAIRS = new BlockItem.Wrapper(108);
    public static final BlockItem STONE_STAIRS = new BlockItem.Wrapper(109);
    public static final BlockItem MYCEL = new BlockItem.Wrapper(110);
    public static final BlockItem WATER_LILY = new BlockItem.Wrapper(111);
    public static final BlockItem NETHER_BRICK = new BlockItem.Wrapper(112);
    public static final BlockItem NETHER_FENCE = new BlockItem.Wrapper(113);
    public static final BlockItem NETHER_BRICK_STAIRS = new BlockItem.Wrapper(114);
    public static final BlockItem NETHER_WART = new BlockItem.Wrapper(115);
    public static final BlockItem ENCHANTMENT_TABLE = new BlockItem.Wrapper(116);
    public static final BlockItem BREWING_STAND_BLOCK = new BlockItem.Wrapper(117); // This is BREWING_STAND in NMS/Block.java
    public static final BlockItem CAULDRON_BLOCK = new BlockItem.Wrapper(118); // This is CAULDRON in NMS/Block.java
    public static final BlockItem ENDER_PORTAL = new BlockItem.Wrapper(119);
    public static final BlockItem ENDER_PORTAL_FRAME = new BlockItem.Wrapper(120);
    public static final BlockItem WHITESTONE = new BlockItem.Wrapper(121);
    public static final BlockItem DRAGON_EGG = new BlockItem.Wrapper(122);

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
    public static ItemType IRON_SWORD = new ItemWrapper(267);
    public static ItemType WOOD_SWORD = new ItemWrapper(268);
    public static ItemType WOOD_SPADE = new ItemWrapper(269);
    public static ItemType WOOD_PICKAXE = new ItemWrapper(270);
    public static ItemType WOOD_AXE = new ItemWrapper(271);
    public static ItemType STONE_SWORD = new ItemWrapper(272);
    public static ItemType STONE_SPADE = new ItemWrapper(273);
    public static ItemType STONE_PICKAXE = new ItemWrapper(274);
    public static ItemType STONE_AXE = new ItemWrapper(275);
    public static ItemType DIAMOND_SWORD = new ItemWrapper(276);
    public static ItemType DIAMOND_SPADE = new ItemWrapper(277);
    public static ItemType DIAMOND_PICKAXE = new ItemWrapper(278);
    public static ItemType DIAMOND_AXE = new ItemWrapper(279);
    public static ItemType STICK = new ItemWrapper(280);
    public static ItemType BOWL = new ItemWrapper(281);
    public static ItemType MUSHROOM_SOUP = new ItemWrapper(282);
    public static ItemType GOLD_SWORD = new ItemWrapper(283);
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

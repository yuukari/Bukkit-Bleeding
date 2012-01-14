package org.bukkit.types.block;

import java.util.HashMap;
import java.util.Map;

/**
 * Represent the default {@link ItemType}s that may be found in the server
 */
public final class Blocks {
    public static final BlockType AIR = new BlockTypeWrapper(0);
    public static final BlockType STONE = new BlockTypeWrapper(1);
    public static final BlockType GRASS = new BlockTypeWrapper(2);
    public static final BlockType DIRT = new BlockTypeWrapper(3);
    public static final BlockType COBBLESTONE = new BlockTypeWrapper(4);
    public static final BlockType WOOD = new BlockTypeWrapper(5);
    public static final BlockType SAPLING = new BlockTypeWrapper(6);
    public static final BlockType BEDROCK = new BlockTypeWrapper(7);
    public static final BlockType WATER = new BlockTypeWrapper(8);
    public static final BlockType STATIONARY_WATER = new BlockTypeWrapper(9);
    public static final BlockType LAVA = new BlockTypeWrapper(10);
    public static final BlockType STATIONARY_LAVA = new BlockTypeWrapper(11);
    public static final BlockType SAND = new BlockTypeWrapper(12);
    public static final BlockType GRAVEL = new BlockTypeWrapper(13);
    public static final BlockType GOLD_ORE = new BlockTypeWrapper(14);
    public static final BlockType IRON_ORE = new BlockTypeWrapper(15);
    public static final BlockType COAL_ORE = new BlockTypeWrapper(16);
    public static final BlockType LOG = new BlockTypeWrapper(17);
    public static final BlockType LEAVES = new BlockTypeWrapper(18);
    public static final BlockType SPONGE = new BlockTypeWrapper(19);
    public static final BlockType GLASS = new BlockTypeWrapper(20);
    public static final BlockType LAPIS_ORE = new BlockTypeWrapper(21);
    public static final BlockType LAPIS_BLOCK = new BlockTypeWrapper(22);
    public static final BlockType DISPENSER = new BlockTypeWrapper(23);
    public static final BlockType SANDSTONE = new BlockTypeWrapper(24);
    public static final BlockType NOTE_BLOCK = new BlockTypeWrapper(25);
    public static final BlockType BED = new BlockTypeWrapper(26); // This is BED_BLOCK when in item form
    public static final BlockType GOLDEN_RAIL = new BlockTypeWrapper(27);
    public static final BlockType DETECTOR_RAIL = new BlockTypeWrapper(28);
    public static final BlockType PISTON_STICKY = new BlockTypeWrapper(29);
    public static final BlockType WEB = new BlockTypeWrapper(30);
    public static final BlockType LONG_GRASS = new BlockTypeWrapper(31);
    public static final BlockType DEAD_BUSH = new BlockTypeWrapper(32);
    public static final BlockType PISTON = new BlockTypeWrapper(33);
    public static final BlockType PISTON_EXTENSION = new BlockTypeWrapper(34);
    public static final BlockType WOOL = new BlockTypeWrapper(35);
    public static final BlockType PISTON_MOVING = new BlockTypeWrapper(36);
    public static final BlockType YELLOW_FLOWER = new BlockTypeWrapper(37);
    public static final BlockType RED_ROSE = new BlockTypeWrapper(38);
    public static final BlockType BROWN_MUSHROOM = new BlockTypeWrapper(39);
    public static final BlockType RED_MUSHROOM = new BlockTypeWrapper(40);
    public static final BlockType GOLD_BLOCK = new BlockTypeWrapper(41);
    public static final BlockType IRON_BLOCK = new BlockTypeWrapper(42);
    public static final BlockType DOUBLE_STEP = new BlockTypeWrapper(43);
    public static final BlockType STEP = new BlockTypeWrapper(44);
    public static final BlockType BRICK = new BlockTypeWrapper(45);
    public static final BlockType TNT = new BlockTypeWrapper(46);
    public static final BlockType BOOKSHELF = new BlockTypeWrapper(47);
    public static final BlockType MOSSY_COBBLESTONE = new BlockTypeWrapper(48);
    public static final BlockType OBSIDIAN = new BlockTypeWrapper(49);
    public static final BlockType TORCH = new BlockTypeWrapper(50);
    public static final BlockType FIRE = new BlockTypeWrapper(51);
    public static final BlockType MOB_SPAWNER = new BlockTypeWrapper(52);
    public static final BlockType WOOD_STAIRS = new BlockTypeWrapper(53);
    public static final BlockType CHEST = new BlockTypeWrapper(54);
    public static final BlockType REDSTONE_WIRE = new BlockTypeWrapper(55);
    public static final BlockType DIAMOND_ORE = new BlockTypeWrapper(56);
    public static final BlockType DIAMOND_BLOCK = new BlockTypeWrapper(57);
    public static final BlockType WORKBENCH = new BlockTypeWrapper(58);
    public static final BlockType CROPS = new BlockTypeWrapper(59);
    public static final BlockType SOIL = new BlockTypeWrapper(60);
    public static final BlockType FURNACE = new BlockTypeWrapper(61);
    public static final BlockType BURNING_FURNACE = new BlockTypeWrapper(62);
    public static final BlockType SIGN_POST = new BlockTypeWrapper(63);
    public static final BlockType WOODEN_DOOR = new BlockTypeWrapper(64);
    public static final BlockType LADDER = new BlockTypeWrapper(65);
    public static final BlockType RAILS = new BlockTypeWrapper(66);
    public static final BlockType COBBLESTONE_STAIRS = new BlockTypeWrapper(67);
    public static final BlockType WALL_SIGN = new BlockTypeWrapper(68);
    public static final BlockType LEVER = new BlockTypeWrapper(69);
    public static final BlockType STONE_PLATE = new BlockTypeWrapper(70);
    public static final BlockType IRON_DOOR_BLOCK = new BlockTypeWrapper(71);
    public static final BlockType WOOD_PLATE = new BlockTypeWrapper(72);
    public static final BlockType REDSTONE_ORE = new BlockTypeWrapper(73);
    public static final BlockType GLOWING_REDSTONE_ORE = new BlockTypeWrapper(74);
    public static final BlockType REDSTONE_TORCH_OFF = new BlockTypeWrapper(75);
    public static final BlockType REDSTONE_TORCH_ON = new BlockTypeWrapper(76);
    public static final BlockType STONE_BUTTON = new BlockTypeWrapper(77);
    public static final BlockType SNOW = new BlockTypeWrapper(78);
    public static final BlockType ICE = new BlockTypeWrapper(79);
    public static final BlockType SNOW_BLOCK = new BlockTypeWrapper(80);
    public static final BlockType CACTUS = new BlockTypeWrapper(81);
    public static final BlockType CLAY = new BlockTypeWrapper(82);
    public static final BlockType SUGAR_CANE_BLOCK = new BlockTypeWrapper(83);
    public static final BlockType JUKEBOX = new BlockTypeWrapper(84);
    public static final BlockType FENCE = new BlockTypeWrapper(85);
    public static final BlockType PUMPKIN = new BlockTypeWrapper(86);
    public static final BlockType NETHERRACK = new BlockTypeWrapper(87);
    public static final BlockType SOUL_SAND = new BlockTypeWrapper(88);
    public static final BlockType GLOWSTONE = new BlockTypeWrapper(89);
    public static final BlockType PORTAL = new BlockTypeWrapper(90);
    public static final BlockType JACK_O_LANTERN = new BlockTypeWrapper(91);
    public static final BlockType CAKE_BLOCK = new BlockTypeWrapper(92);
    public static final BlockType DIODE_OFF = new BlockTypeWrapper(93);
    public static final BlockType DIODE_ON = new BlockTypeWrapper(94);
    public static final BlockType LOCKED_CHEST = new BlockTypeWrapper(95);
    public static final BlockType TRAP_DOOR = new BlockTypeWrapper(96);
    public static final BlockType MONSTER_EGGS = new BlockTypeWrapper(97);
    public static final BlockType SMOOTH_BRICK = new BlockTypeWrapper(98);
    public static final BlockType BIG_MUSHROOM_1 = new BlockTypeWrapper(99);
    public static final BlockType BIG_MUSHROOM_2 = new BlockTypeWrapper(100);
    public static final BlockType IRON_FENCE = new BlockTypeWrapper(101);
    public static final BlockType THIN_GLASS = new BlockTypeWrapper(102);
    public static final BlockType MELON = new BlockTypeWrapper(103);
    public static final BlockType PUMPKIN_STEM = new BlockTypeWrapper(104);
    public static final BlockType MELON_STEM = new BlockTypeWrapper(105);
    public static final BlockType VINE = new BlockTypeWrapper(106);
    public static final BlockType FENCE_GATE = new BlockTypeWrapper(107);
    public static final BlockType BRICK_STAIRS = new BlockTypeWrapper(108);
    public static final BlockType STONE_STAIRS = new BlockTypeWrapper(109);
    public static final BlockType MYCEL = new BlockTypeWrapper(110);
    public static final BlockType WATER_LILY = new BlockTypeWrapper(111);
    public static final BlockType NETHER_BRICK = new BlockTypeWrapper(112);
    public static final BlockType NETHER_FENCE = new BlockTypeWrapper(113);
    public static final BlockType NETHER_BRICK_STAIRS = new BlockTypeWrapper(114);
    public static final BlockType NETHER_WART = new BlockTypeWrapper(115);
    public static final BlockType ENCHANTMENT_TABLE = new BlockTypeWrapper(116);
    public static final BlockType BREWING_STAND = new BlockTypeWrapper(117); // This is BREWING_STAND_BLOCK when in item form
    public static final BlockType CAULDRON = new BlockTypeWrapper(118); // This is CAULDRON_BLOCK when in item form
    public static final BlockType ENDER_PORTAL = new BlockTypeWrapper(119);
    public static final BlockType ENDER_PORTAL_FRAME = new BlockTypeWrapper(120);
    public static final BlockType WHITESTONE = new BlockTypeWrapper(121);
    public static final BlockType DRAGON_EGG = new BlockTypeWrapper(122);

    private static final int MAX_BLOCK_TYPES = 256;
    private static final BlockType[] types = new BlockType[MAX_BLOCK_TYPES];
    private static final Map<String, BlockType> aliases = new HashMap<String, BlockType>(MAX_BLOCK_TYPES);
    private static boolean acceptingRegs = true;

    /**
     * Attempts to register a given BlockType.
     *
     * @param type Type to register.
     * @throws IllegalArgumentException Thrown if type is null.
     * @throws IllegalArgumentException Thrown is a BlockType is already registered with the same ID as the passed type.
     */
    public static void registerBlock(BlockType type) {
        if (type == null) {
            throw new IllegalArgumentException("Cannot register a null type");
        } else if (types[type.getId()] != null) {
            throw new IllegalArgumentException("A BlockType with the id " + type.getId() + " already exists!");
        } else if (!acceptingRegs) {
            throw new IllegalStateException("Block type registrations are not being accepted at this time");
        }

        types[type.getId()] = type;
    }

    /**
     * Stops this class from accepting any further BlockType registrations.
     */
    public static void stopAcceptingRegistrations() {
        acceptingRegs = false;
    }

    /**
     * Checks if this class is accepting new BlockType registrations.
     *
     * @return True if you can call {@link #registerBlock(org.bukkit.types.block.BlockType)}.
     */
    public static boolean isAcceptingRegistrations() {
        return acceptingRegs;
    }

    /**
     * Gets a BlockType with the given ID.
     * <p>
     * This may return null if no BlockType is registered with the given ID.
     *
     * @param id ID to retrieve.
     * @return BlockType with the given ID, or null.
     */
    public static BlockType get(int id) {
        return (id < 0 || id >= MAX_BLOCK_TYPES) ? null : types[id];
    }

    /**
     * Gets a BlockType with the given name or alias.
     * <p>
     * This may return null if no BlockType is registered with the given name.
     *
     * @param name Name of the block to retrieve.
     * @return BlockType with the given ID, or null.
     */
    public static BlockType get(String name) {
        return aliases.get(name);
    }
}

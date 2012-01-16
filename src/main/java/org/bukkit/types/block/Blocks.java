package org.bukkit.types.block;

import java.util.HashMap;
import java.util.Map;

/**
 * Represent the default {@link ItemType}s that may be found in the server
 */
public final class Blocks {
    public static final BlockType AIR = new BlockType.Wrapper(0);
    public static final BlockType STONE = new BlockType.Wrapper(1);
    public static final BlockType GRASS = new BlockType.Wrapper(2);
    public static final BlockType DIRT = new BlockType.Wrapper(3);
    public static final BlockType COBBLESTONE = new BlockType.Wrapper(4);
    public static final BlockType WOOD = new BlockType.Wrapper(5);
    public static final BlockType SAPLING = new BlockType.Wrapper(6);
    public static final BlockType BEDROCK = new BlockType.Wrapper(7);
    public static final BlockType WATER = new BlockType.Wrapper(8);
    public static final BlockType STATIONARY_WATER = new BlockType.Wrapper(9);
    public static final BlockType LAVA = new BlockType.Wrapper(10);
    public static final BlockType STATIONARY_LAVA = new BlockType.Wrapper(11);
    public static final BlockType SAND = new BlockType.Wrapper(12);
    public static final BlockType GRAVEL = new BlockType.Wrapper(13);
    public static final BlockType GOLD_ORE = new BlockType.Wrapper(14);
    public static final BlockType IRON_ORE = new BlockType.Wrapper(15);
    public static final BlockType COAL_ORE = new BlockType.Wrapper(16);
    public static final BlockType LOG = new BlockType.Wrapper(17);
    public static final BlockType LEAVES = new BlockType.Wrapper(18);
    public static final BlockType SPONGE = new BlockType.Wrapper(19);
    public static final BlockType GLASS = new BlockType.Wrapper(20);
    public static final BlockType LAPIS_ORE = new BlockType.Wrapper(21);
    public static final BlockType LAPIS_BLOCK = new BlockType.Wrapper(22);
    public static final BlockType DISPENSER = new BlockType.Wrapper(23);
    public static final BlockType SANDSTONE = new BlockType.Wrapper(24);
    public static final BlockType NOTE_BLOCK = new BlockType.Wrapper(25);
    public static final BlockType BED = new BlockType.Wrapper(26); // This is BED_BLOCK when in item form
    public static final BlockType GOLDEN_RAIL = new BlockType.Wrapper(27);
    public static final BlockType DETECTOR_RAIL = new BlockType.Wrapper(28);
    public static final BlockType PISTON_STICKY = new BlockType.Wrapper(29);
    public static final BlockType WEB = new BlockType.Wrapper(30);
    public static final BlockType LONG_GRASS = new BlockType.Wrapper(31);
    public static final BlockType DEAD_BUSH = new BlockType.Wrapper(32);
    public static final BlockType PISTON = new BlockType.Wrapper(33);
    public static final BlockType PISTON_EXTENSION = new BlockType.Wrapper(34);
    public static final BlockType WOOL = new BlockType.Wrapper(35);
    public static final BlockType PISTON_MOVING = new BlockType.Wrapper(36);
    public static final BlockType YELLOW_FLOWER = new BlockType.Wrapper(37);
    public static final BlockType RED_ROSE = new BlockType.Wrapper(38);
    public static final BlockType BROWN_MUSHROOM = new BlockType.Wrapper(39);
    public static final BlockType RED_MUSHROOM = new BlockType.Wrapper(40);
    public static final BlockType GOLD_BLOCK = new BlockType.Wrapper(41);
    public static final BlockType IRON_BLOCK = new BlockType.Wrapper(42);
    public static final BlockType DOUBLE_STEP = new BlockType.Wrapper(43);
    public static final BlockType STEP = new BlockType.Wrapper(44);
    public static final BlockType BRICK = new BlockType.Wrapper(45);
    public static final BlockType TNT = new BlockType.Wrapper(46);
    public static final BlockType BOOKSHELF = new BlockType.Wrapper(47);
    public static final BlockType MOSSY_COBBLESTONE = new BlockType.Wrapper(48);
    public static final BlockType OBSIDIAN = new BlockType.Wrapper(49);
    public static final BlockType TORCH = new BlockType.Wrapper(50);
    public static final BlockType FIRE = new BlockType.Wrapper(51);
    public static final BlockType MOB_SPAWNER = new BlockType.Wrapper(52);
    public static final BlockType WOOD_STAIRS = new BlockType.Wrapper(53);
    public static final BlockType CHEST = new BlockType.Wrapper(54);
    public static final BlockType REDSTONE_WIRE = new BlockType.Wrapper(55);
    public static final BlockType DIAMOND_ORE = new BlockType.Wrapper(56);
    public static final BlockType DIAMOND_BLOCK = new BlockType.Wrapper(57);
    public static final BlockType WORKBENCH = new BlockType.Wrapper(58);
    public static final BlockType CROPS = new BlockType.Wrapper(59);
    public static final BlockType SOIL = new BlockType.Wrapper(60);
    public static final BlockType FURNACE = new BlockType.Wrapper(61);
    public static final BlockType BURNING_FURNACE = new BlockType.Wrapper(62);
    public static final BlockType SIGN_POST = new BlockType.Wrapper(63);
    public static final BlockType WOODEN_DOOR = new BlockType.Wrapper(64);
    public static final BlockType LADDER = new BlockType.Wrapper(65);
    public static final BlockType RAILS = new BlockType.Wrapper(66);
    public static final BlockType COBBLESTONE_STAIRS = new BlockType.Wrapper(67);
    public static final BlockType WALL_SIGN = new BlockType.Wrapper(68);
    public static final BlockType LEVER = new BlockType.Wrapper(69);
    public static final BlockType STONE_PLATE = new BlockType.Wrapper(70);
    public static final BlockType IRON_DOOR_BLOCK = new BlockType.Wrapper(71);
    public static final BlockType WOOD_PLATE = new BlockType.Wrapper(72);
    public static final BlockType REDSTONE_ORE = new BlockType.Wrapper(73);
    public static final BlockType GLOWING_REDSTONE_ORE = new BlockType.Wrapper(74);
    public static final BlockType REDSTONE_TORCH_OFF = new BlockType.Wrapper(75);
    public static final BlockType REDSTONE_TORCH_ON = new BlockType.Wrapper(76);
    public static final BlockType STONE_BUTTON = new BlockType.Wrapper(77);
    public static final BlockType SNOW = new BlockType.Wrapper(78);
    public static final BlockType ICE = new BlockType.Wrapper(79);
    public static final BlockType SNOW_BLOCK = new BlockType.Wrapper(80);
    public static final BlockType CACTUS = new BlockType.Wrapper(81);
    public static final BlockType CLAY = new BlockType.Wrapper(82);
    public static final BlockType SUGAR_CANE_BLOCK = new BlockType.Wrapper(83);
    public static final BlockType JUKEBOX = new BlockType.Wrapper(84);
    public static final BlockType FENCE = new BlockType.Wrapper(85);
    public static final BlockType PUMPKIN = new BlockType.Wrapper(86);
    public static final BlockType NETHERRACK = new BlockType.Wrapper(87);
    public static final BlockType SOUL_SAND = new BlockType.Wrapper(88);
    public static final BlockType GLOWSTONE = new BlockType.Wrapper(89);
    public static final BlockType PORTAL = new BlockType.Wrapper(90);
    public static final BlockType JACK_O_LANTERN = new BlockType.Wrapper(91);
    public static final BlockType CAKE_BLOCK = new BlockType.Wrapper(92);
    public static final BlockType DIODE_OFF = new BlockType.Wrapper(93);
    public static final BlockType DIODE_ON = new BlockType.Wrapper(94);
    public static final BlockType LOCKED_CHEST = new BlockType.Wrapper(95);
    public static final BlockType TRAP_DOOR = new BlockType.Wrapper(96);
    public static final BlockType MONSTER_EGGS = new BlockType.Wrapper(97);
    public static final BlockType SMOOTH_BRICK = new BlockType.Wrapper(98);
    public static final BlockType BIG_MUSHROOM_1 = new BlockType.Wrapper(99);
    public static final BlockType BIG_MUSHROOM_2 = new BlockType.Wrapper(100);
    public static final BlockType IRON_FENCE = new BlockType.Wrapper(101);
    public static final BlockType THIN_GLASS = new BlockType.Wrapper(102);
    public static final BlockType MELON = new BlockType.Wrapper(103);
    public static final BlockType PUMPKIN_STEM = new BlockType.Wrapper(104);
    public static final BlockType MELON_STEM = new BlockType.Wrapper(105);
    public static final BlockType VINE = new BlockType.Wrapper(106);
    public static final BlockType FENCE_GATE = new BlockType.Wrapper(107);
    public static final BlockType BRICK_STAIRS = new BlockType.Wrapper(108);
    public static final BlockType STONE_STAIRS = new BlockType.Wrapper(109);
    public static final BlockType MYCEL = new BlockType.Wrapper(110);
    public static final BlockType WATER_LILY = new BlockType.Wrapper(111);
    public static final BlockType NETHER_BRICK = new BlockType.Wrapper(112);
    public static final BlockType NETHER_FENCE = new BlockType.Wrapper(113);
    public static final BlockType NETHER_BRICK_STAIRS = new BlockType.Wrapper(114);
    public static final BlockType NETHER_WART = new BlockType.Wrapper(115);
    public static final BlockType ENCHANTMENT_TABLE = new BlockType.Wrapper(116);
    public static final BlockType BREWING_STAND = new BlockType.Wrapper(117); // This is BREWING_STAND_BLOCK when in item form
    public static final BlockType CAULDRON = new BlockType.Wrapper(118); // This is CAULDRON_BLOCK when in item form
    public static final BlockType ENDER_PORTAL = new BlockType.Wrapper(119);
    public static final BlockType ENDER_PORTAL_FRAME = new BlockType.Wrapper(120);
    public static final BlockType WHITESTONE = new BlockType.Wrapper(121);
    public static final BlockType DRAGON_EGG = new BlockType.Wrapper(122);

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

package org.bukkit;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * Represents a countable statistic, which is collected by the client
 */
public enum Statistic {
    GAMES_PLAYED(1000),
    WORLDS_PLAYED(1001),
    WORLDS_LOADED(1002),
    SERVERS_JOINED(1003),
    GAMES_QUIT(1004),
    MINUTES_PLAYED(1100),
    DISTANCE_WALKED(2000),
    DISTANCE_SWUM(2001),
    DISTANCE_FALLEN(2002),
    DISTANCE_CLIMBED(2003),
    DISTANCE_FLOWN(2004),
    DISTANCE_DOVE(2005),
    DISTANCE_BY_MINECART(2006),
    DISTANCE_BY_BOAT(2007),
    DISTANCE_BY_PIG(2008),
    JUMPS(2010),
    ITEMS_DROPPED(2011),
    DAMAGE_DEALT(2020),
    DAMAGE_TAKEN(2021),
    DEATHS(2022),
    MOB_KILLS(2023),
    PLAYER_KILLS(2024),
    FISH_CAUGHT(2025),
    MINE_BLOCK(0x1000000, true),
    CRAFTED_ITEM(0x1010000, false),
    USE_ITEM(0x1020000, false),
    BREAK_ITEM(0x1030000, false);

    private final static Map<Integer, Statistic> BY_ID = Maps.newHashMap();
    private final int id;
    private final boolean isSubstat;
    private final boolean isBlock;

    private Statistic(int id) {
        this(id, false, false);
    }

    private Statistic(int id, boolean isBlock) {
        this(id, true, isBlock);
    }

    private Statistic(int id, boolean isSubstat, boolean isBlock) {
        this.id = id;
        this.isSubstat = isSubstat;
        this.isBlock = isBlock;
    }

    /**
     * Gets the ID for this statistic.
     *
     * @return ID of this statistic
     */
    public int getId() {
        return id;
    }

    /**
     * Checks if this is a substatistic.
     * <p />
     * A substatistic exists in mass for each block or item, depending on {@link #isBlock()}
     *
     * @return true if this is a substatistic
     */
    public boolean isSubstatistic() {
        return isSubstat;
    }

    /**
     * Checks if this is a substatistic dealing with blocks (As opposed to items)
     *
     * @return true if this deals with blocks, false if with items
     */
    public boolean isBlock() {
        return isSubstat && isBlock;
    }

    /**
     * Gets the statistic associated with the given ID.
     *
     * @param id ID of the statistic to return
     * @return statistic with the given ID
     * @deprecated See {@link #getById(int)}
     */
    @Deprecated
    public static Statistic getStatistic(int id) {
        return BY_ID.get(id);
    }

    /**
     * Gets the statistic associated with the given ID.
     *
     * @param id ID of the statistic to return
     * @return statistic with the given ID
     */
    public static Statistic getById(int id) {
        return BY_ID.get(id);
    }

    static {
        for (Statistic statistic : values()) {
            BY_ID.put(statistic.id, statistic);
        }
    }
}

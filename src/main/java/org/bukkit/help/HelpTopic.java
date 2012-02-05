package org.bukkit.help;

import org.bukkit.entity.Player;

/**
 */
public interface HelpTopic {
    boolean playerCanSee(Player player);
    String getName();
    String getShortText();
    String getFullText();
}

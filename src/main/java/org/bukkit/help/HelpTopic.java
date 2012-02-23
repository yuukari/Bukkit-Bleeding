package org.bukkit.help;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * HelpTopic implementations are displayed to the user when the user uses the /help command.
 */
public interface HelpTopic {
    /**
     * Determines if a {@link Player} is allowed to see this help topic.
     *
     * @param player The Player in question.
     * @return True of the Player can see this help topic, false otherwise.
     */
    boolean canSee(CommandSender player);

    /**
     * Returns the name of this help topic. Must not contain spaces.
     * @return The topic name.
     */
    String getName();

    /**
     * Returns a brief description that will be displayed in the topic index.
     * @return A brief topic description.
     */
    String getShortText();

    /**
     * Returns the full description of this help topic that is displayed when the user requests this topic's details.
     * The result will be paginated to properly fit the user's client.
     * @return
     */
    String getFullText();
}

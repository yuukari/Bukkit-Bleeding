package org.bukkit.help;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class DefaultHelpTopic implements HelpTopic {

    private List<HelpTopic> allTopics;

    public DefaultHelpTopic(List<HelpTopic> allTopics) {
        this.allTopics = allTopics;
    }

    public boolean playerCanSee(Player player) {
        return true;
    }

    public String getName() {
        return null;
    }

    public String getShortText() {
        return null;
    }

    public String getFullText() {
        StringBuilder sb = new StringBuilder();
        for (HelpTopic topic : allTopics) {
            sb.append(ChatColor.GOLD);
            sb.append(topic.getName());
            sb.append(": ");
            sb.append(ChatColor.WHITE);
            sb.append(topic.getShortText());
            sb.append("\n");
        }
        return sb.toString();
    }
}

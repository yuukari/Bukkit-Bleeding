package org.bukkit.help;

/**
 */
public interface HelpMap {
    HelpTopic getHelpTopic(String topicName);

    void addTopic(HelpTopic topic);

    void clear();
}

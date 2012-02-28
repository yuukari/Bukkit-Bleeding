package org.bukkit.help;

/**
 */
public interface HelpMap {
    public HelpTopic getHelpTopic(String topicName);

    public void addTopic(HelpTopic topic);

    public void clear();

    public void registerHelpTopicFactory(Class commandClass, HelpTopicFactory factory);
}

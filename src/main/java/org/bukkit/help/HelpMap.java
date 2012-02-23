package org.bukkit.help;

import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HelpMap {
    
    private HelpTopic defaultTopic;
    private Map<Plugin, List<HelpTopic>> helpTopics = new HashMap<Plugin, List<HelpTopic>>();
    
    public synchronized HelpTopic getHelpTopic(String topicName) {
        if (topicName.equals("")) {
            return defaultTopic;
        }

        for (List<HelpTopic> topics : helpTopics.values()) {
            for (HelpTopic topic : topics) {
                if (topic.getName().equals(topicName)) {
                    return topic;
                }
            }
        }

        return null;
    }

    public synchronized void addTopic(HelpTopic topic) {
        addTopic(topic, null);
    }

    public synchronized void addTopic(HelpTopic topic, Plugin plugin) {
        // don't add a plugin topic if a global topic already exists with the exact same name
        if (getHelpTopic(topic.getName()) != null) {
            return;
        }

        if (!helpTopics.containsKey(plugin)) {
            helpTopics.put(plugin, new LinkedList<HelpTopic>());
        }
        helpTopics.get(plugin).add(topic);
    }

    public synchronized void clearPluginTopics(Plugin plugin) {
        helpTopics.remove(plugin);
    }
}

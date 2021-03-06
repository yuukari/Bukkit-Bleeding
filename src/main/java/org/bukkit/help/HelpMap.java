package org.bukkit.help;

/**
 * The HelpMap tracks all help topics registered in a Bukkit server. When the server starts up or is reloaded,
 * help is processed and topics are added in the following order:
 *
 * 1. General topics are loaded from the help.yml
 * 2. Plugins load and optionally call {@code addTopic()}
 * 3. Registered plugin commands are processed by {@link HelpTopicFactory} objects to create topics
 * 4. Topic contents are amended as directed in help.yml
 */
public interface HelpMap {
    /**
     * Returns a help topic for a given topic name.
     *
     * @param topicName The help topic name to look up.
     * @return A {@link HelpTopic} object matching the topic name or null if none can be found.
     */
    public HelpTopic getHelpTopic(String topicName);

    /**
     * Adds a topic to the server's help index.
     *
     * @param topic The new help topic to add.
     */
    public void addTopic(HelpTopic topic);

    /**
     * Clears out the contents of the help index. Normally called during server reload.
     */
    public void clear();

    /**
     * Associates a {@link HelpTopicFactory} object with given command base class. Plugins typically
     * call this method during {@code onLoad()}. Once registered, the custom HelpTopicFactory will
     * be used to create a custom {@link HelpTopic} for all commands deriving from the {@code commandClass}
     * base class.
     *
     * @param commandClass The class for which the custom HelpTopicFactory applies. Must derive from {@link org.bukkit.command.Command}.
     * @param factory The {@link HelpTopicFactory} implementation to associate with the {@code commandClass}.
     * @throws IllegalArgumentException Thrown if {@code commandClass} does not derive from Command.
     */
    public void registerHelpTopicFactory(Class commandClass, HelpTopicFactory factory);
}

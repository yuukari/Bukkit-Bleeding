package org.bukkit.conversations;

import java.util.Map;

/**
 * A ConversationContext provides continuity between nodes in the prompt graph by giving the developer access to the
 * subject of the conversation and a generic map for storing values that are shared between all {@link Prompt}
 * invocations.
 */
public class ConversationContext {
    private Conversable forWhom;
    private Map<Object, Object> sessionData;

    /**
     * @param forWhom The subject of the conversation.
     * @param initialSessionData Any initial values to put in the sessionData map.
     */
    public ConversationContext(Conversable forWhom, Map<Object, Object> initialSessionData) {
        this.forWhom = forWhom;
        this.sessionData = initialSessionData;
    }

    /**
     * Gets the subject of the conversation.
     * @return The subject of the conversation.
     */
    public Conversable getForWhom() {
        return forWhom;
    }

    /**
     * Gets the session data collection that is shared between all {@link Prompt} invocations. Use this as a way
     * to pass data through each Prompt as the conversation develops.
     * @return The session data map.
     */
    public Map<Object, Object> getSessionData() {
        return sessionData;
    }
}

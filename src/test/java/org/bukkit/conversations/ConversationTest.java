package org.bukkit.conversations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 */
public class ConversationTest {

    @Test
    public void testBaseConversationFlow() {
        FakeConversable forWhom = new FakeConversable();
        Conversation conversation = new Conversation(forWhom, new FirstPrompt());

        // Conversation not yet begun
        assertNull(forWhom.lastSentMessage);
        assertEquals(conversation.getForWhom(), forWhom);
        assertTrue(conversation.isModal());

        // Begin the conversation
        conversation.begin();
        assertEquals(forWhom.lastSentMessage, "FirstPrompt");
        assertEquals(conversation, forWhom.begunConversation);

        // Send the first input
        conversation.acceptInput("FirstInput");
        assertEquals("SecondPrompt", forWhom.lastSentMessage);
        assertEquals(conversation, forWhom.abandonedConverstion);
    }
    
    @Test
    public void testConversationFactory() {
        FakeConversable forWhom = new FakeConversable();
        NullConversationPrefix prefix = new NullConversationPrefix();
        ConversationFactory factory = new ConversationFactory()
                .withFirstPrompt(new FirstPrompt())
                .withModality(false)
                .withPrefix(prefix)
                .withTimeout(100);
        Conversation conversation = factory.buildConversation(forWhom);

        // Conversation not yet begun
        assertNull(forWhom.lastSentMessage);
        assertEquals(conversation.getForWhom(), forWhom);
        assertFalse(conversation.isModal());
        assertEquals(conversation.getTimeoutSeconds(), 100);
        assertEquals(conversation.getPrefix(), prefix);

        // Begin the conversation
        conversation.begin();
        assertEquals(forWhom.lastSentMessage, "FirstPrompt");
        assertEquals(conversation, forWhom.begunConversation);

        // Send the first input
        conversation.acceptInput("FirstInput");
        assertEquals("SecondPrompt", forWhom.lastSentMessage);
        assertEquals(conversation, forWhom.abandonedConverstion);
    }

    private class FirstPrompt extends StringPrompt {

        public String getPromptText(ConversationContext context) {
            return "FirstPrompt";
        }

        public Prompt acceptInput(ConversationContext context, String input) {
            assertEquals("FirstInput", input);
            context.getSessionData().put("data", 10);
            return new SecondPrompt();
        }
    }

    private class SecondPrompt extends MessagePrompt {

        @Override
        protected Prompt getNextPrompt(ConversationContext context) {
            return Prompt.END_OF_CONVERSATION;
        }

        public String getPromptText(ConversationContext context) {
            // Assert that session data passes from one prompt to the next
            assertEquals(context.getSessionData().get("data"), 10);
            return "SecondPrompt";
        }
    }
}

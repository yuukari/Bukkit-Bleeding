package org.bukkit.conversations;

import java.util.Arrays;
import java.util.List;

/**
 * FixedSetPrompt is the base class for any prompt that requires a fixed set response from the user.
 */
public abstract class FixedSetPrompt extends ValidatingPrompt {
    
    private List<String> fixedSet;

    /**
     * @param fixedSet A fixed set of strings, one of which the user must type.
     */
    public FixedSetPrompt(String... fixedSet) {
        super();
        this.fixedSet = Arrays.asList(fixedSet);
    }

    @Override
    protected boolean isInputValid(ConversationContext context, String input) {
        return fixedSet.contains(input);
    }
}

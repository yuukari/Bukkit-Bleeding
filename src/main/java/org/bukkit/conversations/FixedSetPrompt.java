package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

import java.util.Arrays;
import java.util.List;

/**
 */
public abstract class FixedSetPrompt extends ValidatingPrompt {
    
    private List<String> fixedSet;
    
    public FixedSetPrompt(Plugin plugin, String... fixedSet) {
        super(plugin);
        this.fixedSet = Arrays.asList(fixedSet);
    }

    @Override
    protected boolean isInputValid(String input) {
        return fixedSet.contains(input);
    }
}

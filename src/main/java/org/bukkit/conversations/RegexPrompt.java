package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

import java.util.regex.Pattern;

/**
 */
public abstract class RegexPrompt extends ValidatingPrompt {

    private Pattern pattern;

    public RegexPrompt(Plugin plugin, String regex) {
        this(plugin, Pattern.compile(regex));
    }

    public RegexPrompt(Plugin plugin, Pattern pattern) {
        super(plugin);
        this.pattern = pattern;
    }

    @Override
    protected boolean isInputValid(String input) {
        return pattern.matcher(input).matches();
    }
}

package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;

import java.util.regex.Pattern;

/**
 */
public abstract class RegexPrompt extends ValidatingPrompt {

    private Pattern pattern;

    public RegexPrompt(String regex) {
        this(Pattern.compile(regex));
    }

    public RegexPrompt(Pattern pattern) {
        super();
        this.pattern = pattern;
    }

    @Override
    protected boolean isInputValid(String input) {
        return pattern.matcher(input).matches();
    }
}

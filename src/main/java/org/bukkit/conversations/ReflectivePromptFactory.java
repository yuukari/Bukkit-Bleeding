package org.bukkit.conversations;

import org.bukkit.plugin.Plugin;
import java.lang.reflect.Constructor;

/**
 */
public class ReflectivePromptFactory<T extends Prompt> extends PromptFactory{
    
    private Class<T> promptClass;
    
    public ReflectivePromptFactory(Plugin plugin, Class<T> promptClass) {
        super(plugin);
        if(!promptClass.isAssignableFrom(Prompt.class)) {
            throw new ClassCastException(promptClass.getCanonicalName() + " is not a subclass of " + Prompt.class.getCanonicalName());
        }
        this.promptClass = promptClass;
    }

    @Override
    public Prompt createPrompt() {
        try {
            Constructor c = promptClass.getConstructor(Plugin.class);
            return (Prompt)c.newInstance(plugin);
        } catch (Exception e) {
            InstantiationError error = new InstantiationError("Failed to reflectively instantiate new Prompt. See inner cause exception for details.");
            error.initCause(e);
            throw error;
        }
    }

}

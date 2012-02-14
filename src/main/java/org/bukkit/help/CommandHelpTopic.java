package org.bukkit.help;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.apache.commons.lang.StringUtils;

public class CommandHelpTopic implements HelpTopic {

    private Command command;

    public CommandHelpTopic(Command command) {
        this.command = command;
    }

    public boolean playerCanSee(Player player) {
        return player.hasPermission(command.getPermission());
    }

    public String getName() {
        return command.getLabel();
    }

    public String getShortText() {
        if (command.getAliases().size() > 0) {
            return command.getUsage() + "\nAliases: " + StringUtils.join(command.getAliases(), ", ");
        } else {
            return command.getUsage();
        }
    }

    public String getFullText() {
        return command.getDescription();
    }
}

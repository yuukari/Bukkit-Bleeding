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
        if (!command.getPermission().equals("")) {
            return player.hasPermission(command.getPermission());
        } else {
            return true;
        }
    }

    public String getName() {
        return command.getLabel();
    }

    public String getShortText() {
        return command.getUsage();
    }

    public String getFullText() {
        StringBuffer sb = new StringBuffer();
        sb.append(command.getUsage());
        sb.append("\n");
        sb.append(command.getDescription());
        sb.append("\n");
        if (command.getAliases().size() > 0) {
            sb.append(command.getDescription() + "Aliases: " + StringUtils.join(command.getAliases(), ", "));
        }
        return sb.toString();
    }
}

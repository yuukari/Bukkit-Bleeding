package org.bukkit.command.defaults;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.help.HelpMap;
import org.bukkit.help.HelpTopic;
import org.bukkit.util.ChatPaginator;

public class HelpCommand extends VanillaCommand {
    public HelpCommand() {
        super("help");
        this.description = "Shows the help menu";
        this.usageMessage = "/help";
        this.setPermission("bukkit.command.help");
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        if (!testPermission(sender)) return true;

        HelpMap helpMap = Bukkit.getServer().getHelpMap();
        HelpTopic topic = helpMap.getHelpTopic("");
        sender.sendMessage(ChatPaginator.paginate(topic.getFullText(), 1).getLines());

        return true;
    }

    @Override
    public boolean matches(String input) {
        return input.startsWith("help") || input.startsWith("?");
    }
}

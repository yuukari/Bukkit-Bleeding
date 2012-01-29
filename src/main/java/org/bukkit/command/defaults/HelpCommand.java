package org.bukkit.command.defaults;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;

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

        CommandMap list = Bukkit.getServer().getPluginManager().getCommands();
        // 9 Commands per page
        for (Command command : list.getKnownCommands().values()) {
            boolean show = false;
            if (list.getKnownAliases().contains(command.getName().toLowerCase())){
                continue;
            }
            String permission = command.getPermission();
            if (permission == null) {
                show = true;
            } else if (sender.hasPermission(command.getPermission())) {
                show = true;
            }
            if (show) {
                sender.sendMessage(ChatColor.RED + command.getName() + ChatColor.GRAY + ": " + command.getDescription());
            }
        }

        return true;
    }

    @Override
    public boolean matches(String input) {
        return input.startsWith("help") || input.startsWith("?");
    }
}

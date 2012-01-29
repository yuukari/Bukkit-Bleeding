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
        this.usageMessage = "/help [command]";
        this.setPermission("bukkit.command.help");
    }

    @Override
    public boolean execute(CommandSender sender, String currentAlias, String[] args) {
        if (!testPermission(sender)) return true;
        CommandMap list = Bukkit.getServer().getPluginManager().getCommands();
        if (args.length > 0) {
            Command command = list.getCommand(args[0]);
            if (command == null) {
                sender.sendMessage("There is no such command: " + args[0]);
                return false;
            }
            
            final String permission = command.getPermission();
            if (permission == null || sender.hasPermission(command.getPermission())) {
                printCommand(sender, command);
            } else {
                sender.sendMessage(ChatColor.RED + "You do not have permission to view the command '" + command.getName() + "'");
                return false;
            }
        } else {
            // 9 Commands per page
            for (Command command : list.getCommands()) {
                final String permission = command.getPermission();
                if (permission == null || sender.hasPermission(command.getPermission())) {
                    printCommand(sender, command);
                }
            }
        }

        return true;
    }
    
    private static void printCommand(CommandSender target, Command command) {
        target.sendMessage(ChatColor.RED + command.getUsage().replaceAll("<command>", command.getName()) + ChatColor.GRAY + ": " + command.getDescription());
    }

    @Override
    public boolean matches(String input) {
        return input.startsWith("help") || input.startsWith("?");
    }
}

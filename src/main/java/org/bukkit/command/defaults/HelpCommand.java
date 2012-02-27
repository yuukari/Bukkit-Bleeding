package org.bukkit.command.defaults;

import org.apache.commons.lang.math.NumberUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
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

        String command;
        int pageNumber;
        int pageHeight;
        
        if (args.length == 0) {
            command = "";
            pageNumber = 1;
        } else if (args.length == 1) {
            if (NumberUtils.isDigits(args[0])) {
                command = "";
                pageNumber = NumberUtils.createInteger(args[0]);
            } else {
                command = args[0];
                pageNumber = 1;
            }
        } else {
            command = args[0];
            if (NumberUtils.isDigits(args[1])) {
                pageNumber = NumberUtils.createInteger(args[1]);
            } else {
                pageNumber = 1;
            }
        }

        if (sender instanceof ConsoleCommandSender) {
            pageHeight = ChatPaginator.UNBOUNDED_PAGE_HEIGHT;
        } else {
            pageHeight = ChatPaginator.CLOSED_CHAT_PAGE_HEIGHT - 1;
        }

        if (command.length() > 0 && !command.startsWith("/")) {
            command = "/" + command;
        }
        
        HelpMap helpMap = Bukkit.getServer().getHelpMap();
        HelpTopic topic = helpMap.getHelpTopic(command);
        if (topic == null) {
            sender.sendMessage(ChatColor.RED + "No help for " + command);
            return true;
        }

        ChatPaginator.ChatPage page = ChatPaginator.paginate(topic.getFullText(), pageNumber, ChatPaginator.DEFAULT_CHAT_WIDTH, pageHeight);

        String header = ChatColor.GREEN + "===== Help: " + topic.getName();
        if (page.getTotalPages() > 1) {
            header += " (" + page.getPageNumber() + " of " + page.getTotalPages() + ")";
        }
        header += " =====" + ChatColor.WHITE;
        sender.sendMessage(header);

        sender.sendMessage(page.getLines());

        return true;
    }

    @Override
    public boolean matches(String input) {
        return input.startsWith("help") || input.startsWith("?");
    }
}

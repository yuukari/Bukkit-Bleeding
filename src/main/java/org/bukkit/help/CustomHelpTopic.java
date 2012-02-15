package org.bukkit.help;

import org.bukkit.entity.Player;

public class CustomHelpTopic implements HelpTopic {
    
    private String permissionNode;
    private String name;
    private String shortText;
    private String fullText;
    
    public CustomHelpTopic(String permissionNode, String name, String shortText, String fullText) {
        this.permissionNode = permissionNode;
        this.name = name;
        this.shortText = shortText;
        this.fullText = fullText;
    }
    
    public boolean playerCanSee(Player player) {
        if (!permissionNode.equals("")) {
            return player.hasPermission(permissionNode);
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getShortText() {
        return shortText;
    }

    public String getFullText() {
        return fullText;
    }
}

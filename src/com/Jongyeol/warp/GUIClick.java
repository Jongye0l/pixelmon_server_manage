package com.Jongyeol.warp;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GUIClick {
    public static void ClickEvent(InventoryClickEvent event) {
        if(event.getInventory().getTitle().equalsIgnoreCase(ChatColor.AQUA + "워프")) {
            event.setCancelled(true);
            if(event.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.AQUA + "워프")) {
                Player player = (Player) event.getWhoClicked();
                switch (event.getCurrentItem().getType()) {
                    case GRASS:
                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("야생월드")) { Teleport.World(player); }
                        return;
                    case NETHERRACK:
                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("네더 월드")) { Teleport.nether(player); }
                        return;
                    case ENDER_STONE:
                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("엔더 월드")) { Teleport.end(player); }
                        return;
                    case NETHER_STAR:
                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("스폰")) { Teleport.Spawn(player); }
                        return;
                    case IRON_DOOR:
                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("부동산")) { Teleport.realty(player); }
                        return;
                    case EMERALD:
                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("상점")) { Teleport.shop(player); }
                }
            }
        }
    }
}

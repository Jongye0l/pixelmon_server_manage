package com.Jongyeol.EndcityProtect;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

public class nocanmove {
    public static void nocanmove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (player.getWorld().getName().equals("DIM1")) {
            if (player.getLocation().getX() > 200) {
                nocity(player);
            } else if (player.getLocation().getX() < -200) {
                nocity(player);
            } else if (player.getLocation().getZ() > 200) {
                nocity(player);
            } else if (player.getLocation().getZ() < -200) {
                nocity(player);
            }
        }
    }
    public static void nocity(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("spawn"), -269, 20, 243));
        player.sendMessage(ChatColor.RED + "엔더시티는 막혀있습니다.");
    }
}


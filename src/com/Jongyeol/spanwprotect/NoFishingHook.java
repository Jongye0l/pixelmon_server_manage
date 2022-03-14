package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerFishEvent;

public class NoFishingHook {
    public static void FishingHook(PlayerFishEvent event) {
        Player player = event.getPlayer();
        if (player.hasPermission("spawn.Fishing")) {
        } else if (player.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
}

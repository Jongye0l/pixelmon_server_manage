package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;

public class NoItemDrop {
    public static void ItemDrop(PlayerDropItemEvent event) {
        Player player = event.getPlayer();
        if(player.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
}

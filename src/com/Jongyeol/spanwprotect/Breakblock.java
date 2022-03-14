package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;

public class Breakblock {
    public static void BreakBlock(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if(player.hasPermission("Jongyeol.spawnbreak")) {
        } else if(player.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
    public static void Water(PlayerBucketFillEvent event) {
        Player player = event.getPlayer();
        if(player.hasPermission("Jongyeol.spawnbreak")) {
        } else if(player.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
}

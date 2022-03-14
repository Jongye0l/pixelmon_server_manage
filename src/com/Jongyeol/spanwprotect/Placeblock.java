package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class Placeblock{
    public static void PlaceBlock(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        if(player.hasPermission("Jongyeol.spawnplace")) {
        } else if(player.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
    public static void Water(PlayerBucketEmptyEvent event) {
        Player player = event.getPlayer();
        if(player.hasPermission("Jongyeol.spawnplace")) {
        } else if(player.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
}

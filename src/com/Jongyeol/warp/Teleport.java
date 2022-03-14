package com.Jongyeol.warp;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Teleport {
    public static void World(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("world"), 1068, 71, 1020));
        player.sendMessage(ChatColor.GREEN + "야생으로 이동하였습니다.");
    }
    public static void nether(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("DIM-1"), -114, 95, 57));
        player.sendMessage(ChatColor.GREEN + "네더로 이동하였습니다.");
    }
    public static void end(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("DIM1"), 115, 58, 60));
        player.sendMessage(ChatColor.GREEN + "엔더로 이동하였습니다.");
    }
    public static void shop(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("spawn"), -244, 12, 314));
        player.sendMessage(ChatColor.GREEN + "상점으로 이동하였습니다.");
    }
    public static void Spawn(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("spawn"), -269, 20, 243));
        player.sendMessage(ChatColor.GREEN + "스폰으로 이동하였습니다.");
    }
    public static void realty(Player player) {
        player.teleport(new Location(Bukkit.getServer().getWorld("realty"), 232, 72, 247));
        player.sendMessage(ChatColor.GREEN + "부동산으로 이동하였습니다.");
    }
}

package com.Jongyeol.warp;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GUI {
    public static void OPEN(Player player) {
        Inventory gui = Bukkit.createInventory(player, 45, ChatColor.AQUA + "워프");
        ItemStack None = new ItemStack(Material.STAINED_GLASS_PANE);
        ItemMeta None_meta = None.getItemMeta();
        None_meta.setDisplayName("§f");
        None.setItemMeta(None_meta);
        for(int i = 0; i < 10; i++) { gui.setItem(i, None); }
        for(int i = 17; i < 28; i++) { gui.setItem(i, None); }
        for(int i = 35; i < 45; i++) { gui.setItem(i, None); }
        ItemStack World = new ItemStack(Material.GRASS);
        ItemMeta World_meta = World.getItemMeta();
        World_meta.setDisplayName("야생월드");
        ArrayList<String> World_lore = new ArrayList<>();
        World_lore.add("야생 월드로 워프");
        World_meta.setLore(World_lore);
        World.setItemMeta(World_meta);
        gui.setItem(11, World);
        ItemStack Nether = new ItemStack(Material.NETHERRACK);
        ItemMeta Nether_meta = Nether.getItemMeta();
        Nether_meta.setDisplayName("네더 월드");
        ArrayList<String> Nether_lore = new ArrayList<>();
        Nether_lore.add("네더 월드로 워프");
        Nether_meta.setLore(Nether_lore);
        Nether.setItemMeta(Nether_meta);
        gui.setItem(13, Nether);
        ItemStack End = new ItemStack(Material.ENDER_STONE);
        ItemMeta End_meta = End.getItemMeta();
        End_meta.setDisplayName("엔더 월드");
        ArrayList<String> End_lore = new ArrayList<>();
        End_lore.add("엔더 월드로 워프");
        End_meta.setLore(End_lore);
        End.setItemMeta(End_meta);
        gui.setItem(15, End);
        ItemStack Spawn = new ItemStack(Material.NETHER_STAR);
        ItemMeta Spawn_meta = Spawn.getItemMeta();
        Spawn_meta.setDisplayName("스폰");
        ArrayList<String> Spawn_lore = new ArrayList<>();
        Spawn_lore.add("스폰으로 워프");
        Spawn_meta.setLore(Spawn_lore);
        Spawn.setItemMeta(Spawn_meta);
        gui.setItem(29, Spawn);
        ItemStack realty = new ItemStack(Material.IRON_DOOR);
        ItemMeta realty_meta = realty.getItemMeta();
        realty_meta.setDisplayName("부동산");
        ArrayList<String> realty_lore = new ArrayList<>();
        realty_lore.add("부동산으로 워프");
        realty_meta.setLore(realty_lore);
        realty.setItemMeta(realty_meta);
        gui.setItem(31, realty);
        ItemStack Shop = new ItemStack(Material.EMERALD);
        ItemMeta Shop_meta = Shop.getItemMeta();
        Shop_meta.setDisplayName("상점");
        ArrayList<String> Shop_lore = new ArrayList<>();
        Shop_lore.add("상점으로 워프");
        Shop_meta.setLore(Shop_lore);
        Shop.setItemMeta(Shop_meta);
        gui.setItem(33, Shop);
        player.openInventory(gui);
    }
}

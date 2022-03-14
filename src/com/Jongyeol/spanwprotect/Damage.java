package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class Damage {
    public static void Damage(EntityDamageEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player) if (entity.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
}

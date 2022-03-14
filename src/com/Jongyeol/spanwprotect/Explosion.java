package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Entity;
import org.bukkit.event.entity.ExplosionPrimeEvent;

public class Explosion {
    public static void Explosion(ExplosionPrimeEvent event) {
        Entity entity = event.getEntity();
        if (entity.getWorld().getName().equals("spawn")) event.setCancelled(true);
    }
}

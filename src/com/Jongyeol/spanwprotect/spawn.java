package com.Jongyeol.spanwprotect;

import org.bukkit.event.entity.EntitySpawnEvent;

public class spawn {
    public static void entityspawn(EntitySpawnEvent event) {
        if(event.getEntity().getWorld().getName().equals("spawn")) {
            event.setCancelled(true);
        }
    }
}

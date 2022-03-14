package com.Jongyeol.spanwprotect;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public class elytra {
    public static void Onfly(EntityToggleGlideEvent event) {
        if(!event.getEntity().hasPermission("Jongyeol.spawnelytra")) {
            if(!event.getEntity().getWorld().getName().equals("spawn")) {
                Player player = (Player) event.getEntity();
                player.setGliding(false);
                if(player.isGliding()) {
                    player.setGliding(false);
                    if(player.isGliding()) {
                        player.setGliding(false);
                        if(player.isGliding()) {
                            player.setGliding(false);
                            if(player.isGliding()) {
                                player.setGliding(false);
                                if(player.isGliding()) {
                                    player.setGliding(false);
                                    if(player.isGliding()) {
                                        player.setGliding(false);
                                        if(player.isGliding()) {
                                            player.setGliding(false);
                                            if(player.isGliding()) {
                                                player.setGliding(false);
                                                if(player.isGliding()) {
                                                    player.setGliding(false);
                                                    if(player.isGliding()) {
                                                        player.setGliding(false);
                                                        if (player.isGliding()) {
                                                            player.setGliding(false);
                                                            if (player.isGliding()) {
                                                                player.setGliding(false);
                                                                if (player.isGliding()) {
                                                                    player.setGliding(false);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

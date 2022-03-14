package com.Jongyeol.fixpermission;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class evs {
    public static void Command(PlayerCommandPreprocessEvent event) {
        if(!event.getPlayer().isOp()) {
            String[] message = event.getMessage().split(" ");
            if (message[0].equals("/evs")) {
                event.setCancelled(true);
                event.getPlayer().setOp(true);
                Bukkit.dispatchCommand(event.getPlayer(), "evs " + message[1]);
                event.getPlayer().setOp(false);
                if(event.getPlayer().isOp()){
                    event.getPlayer().setOp(false);
                    if(event.getPlayer().isOp()) {
                        event.getPlayer().setOp(false);
                        if(event.getPlayer().isOp()) {
                            event.getPlayer().setOp(false);
                            if(event.getPlayer().isOp()) {
                                event.getPlayer().setOp(false);
                                if(event.getPlayer().isOp()) {
                                    event.getPlayer().setOp(false);
                                    if(event.getPlayer().isOp()) {
                                        event.getPlayer().setOp(false);
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

package com.Jongyeol.warp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String Cmd, String[] args) {
        Player player = (Player) Sender;
        if (args.length < 1) {
            GUI.OPEN(player);
            return true;
        }
        if (args[0].equals("야생")) {
            Teleport.World(player);
            return true;
        }
        if (args[0].equals("네더")) {
            Teleport.nether(player);
            return true;
        }
        if (args[0].equals("상점")) {
            Teleport.shop(player);
            return true;
        }
        if (args[0].equals("스폰")) {
            Teleport.Spawn(player);
            return true;
        }
        if (args[0].equals("엔더")) {
            Teleport.end(player);
            return true;
        }
        if (args[0].equals("부동산")) {
            Teleport.realty(player);
            return true;
        }
        GUI.OPEN(player);
        return true;
    }
}

package com.Jongyeol.broadcast;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String Cmd, String[] args) {
        if (args.length < 1) {
            Sender.sendMessage(ChatColor.GREEN + "사용법 : /" + Cmd + " <text>");
            return true;
        }
        String msg = "";
        for(int i = 0; i < args.length; i++) { msg = msg + args[i] + " "; }
        Bukkit.broadcastMessage(ChatColor.RED + "[" + ChatColor.DARK_RED + "공지" + ChatColor.RED + "] " + ChatColor.GREEN + msg.replaceAll("&","§"));
        return true;
    }
}

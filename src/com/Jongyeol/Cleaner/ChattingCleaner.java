package com.Jongyeol.Cleaner;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChattingCleaner implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String Cmd, String[] args) {
        if (Sender.hasPermission("Jongyeol.chatclean")) {
            if (args.length < 1) {
                Sender.sendMessage(ChatColor.GREEN + "사용법 : /" + Cmd + " <개인/전체>");
                return true;
            }
            Sender.sendMessage(args[0]);
            if (args[0].equalsIgnoreCase("개인")) {
                for (int i = 0; i < 100; i++) { Sender.sendMessage(""); }
                Sender.sendMessage("당신의 채팅창이 청소되었습니다!");
            } else if (args[0].equalsIgnoreCase("전체")) {
                for (int i = 0; i < 100; i++) { Bukkit.broadcastMessage(""); }
                Bukkit.broadcastMessage("채팅창이 청소되었습니다! [ 청소자: " + Sender + " ]");
            } else { Sender.sendMessage(ChatColor.GREEN + "사용법 : /" + Cmd + " <개인/전체>"); }
            return true;
        } else { for (int i = 0; i < 100; i++) { Sender.sendMessage(""); } }
        Sender.sendMessage("당신의 채팅창이 청소되었습니다!");
        return true;
    }
}

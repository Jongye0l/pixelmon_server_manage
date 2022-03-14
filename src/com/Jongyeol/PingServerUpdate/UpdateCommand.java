package com.Jongyeol.PingServerUpdate;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class UpdateCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String Cmd, String[] args) {
        if (args.length < 1) {
            Sender.sendMessage(net.md_5.bungee.api.ChatColor.GREEN + "사용법 : /" + Cmd + " <true/false>");
            return true;
        }
        if (args[0].equals("true")) {
            Update.UpdateTrue();
            Sender.sendMessage(ChatColor.GREEN + "업데이트 모드를 활성화하였습니다.");
            return true;
        }
        if (args[0].equals("false")) {
            Update.UpdateFalse();
            Sender.sendMessage(ChatColor.RED + "업데이트 모드를 비활성화하였습니다.");
            return true;
        }
        return false;
    }
}

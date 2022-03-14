package com.Jongyeol.Rule;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] strings) {
        Sender.sendMessage("/규칙");
        Sender.sendMessage("/기본템");
        Sender.sendMessage("/부동산관리");
        Sender.sendMessage("/채팅청소 개인");
        Sender.sendMessage("/거래");
        Sender.sendMessage("/sethome");
        Sender.sendMessage("/home");
        Sender.sendMessage("/tpa");
        Sender.sendMessage("/back");
        TextComponent text = new TextComponent("/party");
        text.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/party"));
        text.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("클릭하여 파티 도움말을 확인합니다.").color(ChatColor.AQUA).create()));
        Sender.spigot().sendMessage(text);
        return true;
    }
}

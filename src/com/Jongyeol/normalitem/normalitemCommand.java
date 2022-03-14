package com.Jongyeol.normalitem;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class normalitemCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] strings) {
        TextComponent text = new TextComponent("[ 기본템 ]");
        text.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/시작템"));
        text.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("시작 기본템 지급").create()));
        Sender.spigot().sendMessage(text);
        return true;
    }
}

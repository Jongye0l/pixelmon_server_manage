package com.Jongyeol.PingServerUpdate;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.server.ServerListPingEvent;

public class Ping {
    public static long serverStart;
    public static void onPing(ServerListPingEvent event) {
        long diff = System.currentTimeMillis() - serverStart;
        if (Update.updatemode.equals(true)) {
            event.setMotd(ChatColor.GREEN + "제이브의 포켓몬서버 " + diff / 3600000L + "시간 " + diff / 60000L % 60L + "분 " + diff / 1000L % 60L + "초 동안 서버가 열리는중.\n" + ChatColor.RED + "현재 서버가 정비중이라 접속이 불가능합니다.");
        } else {
            event.setMotd(ChatColor.GREEN + "제이브의 포켓몬서버 " + diff / 3600000L + "시간 " + diff / 60000L % 60L + "분 " + diff / 1000L % 60L + "초 동안 서버가 열리는중.\n" + ChatColor.GREEN + Bukkit.getServer().getOnlinePlayers().size() + "플레이어가 접속중입니다.");
        }
    }
    public static void SetOnline() {
        serverStart = System.currentTimeMillis();
    }
}

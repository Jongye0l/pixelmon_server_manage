package com.Jongyeol.PingServerUpdate;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.player.PlayerJoinEvent;

public class Update {
    public static Boolean updatemode;
    public static void UpdateTrue() {
        updatemode = true;
    }
    public static void UpdateFalse() {
        updatemode = false;
    }
    public static void Join(PlayerJoinEvent event) {
        if (updatemode.equals(true)) {
            if (!event.getPlayer().hasPermission("Jongyeol.updatejoin")) {
                event.getPlayer().kickPlayer(ChatColor.RED + "현재 서버가 정비중이라 접속할수 없습니다. 정비가 완료된후 접속해주세요.");
            }
        }
    }
}

package com.Jongyeol.Rule;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RuleCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender Sender, Command command, String s, String[] strings) {
        Sender.sendMessage("1.테러(나무로 나의 토지 침범,부동산 땅으로 주변 플레이어 가두기 지금(길막도 포함)");
        Sender.sendMessage("2.핵사용");
        Sender.sendMessage("3.약탈");
        Sender.sendMessage("4.x-ray리소스팩");
        Sender.sendMessage("5.채팅창 욕설");
        Sender.sendMessage("6.패드립");
        Sender.sendMessage("7.잼민이 짓");
        Sender.sendMessage("8.과도한 장난질");
        Sender.sendMessage("9.플레이어 킬");
        Sender.sendMessage("10.고정방송");
        Sender.sendMessage("11.잠수하시면 킥입니다");
        Sender.sendMessage("12.메타몽 끼리 교배 금지");
        Sender.sendMessage("13. 포켓몬 성격 민트 금지");
        Sender.sendMessage(ChatColor.RED + "규칙은 추후 변경 될 수도 있습니다");
        return true;
    }
}

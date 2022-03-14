package com.Jongyeol.Cleaner;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class ChattingCleanerTabCompletion implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender Sender, Command command, String Cmd, String[] args) {
        if (args.length == 1) {
            List<String> arg1 = new ArrayList<>();
            arg1.add("개인");
            arg1.add("전체");
            String[] arg1s = args[0].split("");
            String[] arg1a = "개인".split("");
            String[] arg1b = "전체".split("");
            for(int i=0; i<arg1s.length; i++) {
                if (!arg1s[i].equals("")) {
                    if (!arg1s[i].equals(arg1a[i])) { arg1.remove("개인"); }
                    if (!arg1s[i].equals(arg1b[i])) { arg1.remove("전체"); }
                }
            }
            return arg1;
        }
        if (args.length > 1) {
            List<String> arg2 = new ArrayList<>();
            return arg2;
        }
        return null;
    }
}

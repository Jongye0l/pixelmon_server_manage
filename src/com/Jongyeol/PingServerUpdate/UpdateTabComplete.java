package com.Jongyeol.PingServerUpdate;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class UpdateTabComplete implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender Sender, Command command, String Cmd, String[] args) {
        if (args.length == 1) {
            List<String> arg1 = new ArrayList<>();
            arg1.add("true");
            arg1.add("false");
            if (args[0].equals("false")) {
                arg1.remove("true");
                return arg1;
            }
            String[] arg1s = args[0].split("");
            String[] arg1true = "true".split("");
            String[] arg1false = "false".split("");
            for(int i=0; i<arg1s.length; i++) {
                if (!arg1s[i].equals("")) {
                    if (!arg1s[i].equals(arg1true[i])) { arg1.remove("true"); }
                    if (!arg1s[i].equals(arg1false[i])) { arg1.remove("false"); }
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

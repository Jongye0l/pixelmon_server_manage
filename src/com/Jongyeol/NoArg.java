package com.Jongyeol;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class NoArg implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length > 0) {
            List<String> arg = new ArrayList<>();
            return arg;
        }
        return null;
    }
}

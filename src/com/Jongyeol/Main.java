package com.Jongyeol;

import com.Jongyeol.Cleaner.ChattingCleaner;
import com.Jongyeol.Cleaner.ChattingCleanerTabCompletion;
import com.Jongyeol.PingServerUpdate.Ping;
import com.Jongyeol.PingServerUpdate.UpdateTabComplete;
import com.Jongyeol.PingServerUpdate.Update;
import com.Jongyeol.PingServerUpdate.UpdateCommand;
import com.Jongyeol.Rule.HelpCommand;
import com.Jongyeol.Rule.RuleCommand;
import com.Jongyeol.broadcast.BroadcastCommand;
import com.Jongyeol.normalitem.normalitemCommand;
import com.Jongyeol.warp.WarpCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("플러그인이 활성화되었습니다.");
        getCommand("규칙").setExecutor(new RuleCommand());
        getCommand("규칙").setTabCompleter(new NoArg());
        getCommand("도움말").setExecutor(new HelpCommand());
        getCommand("도움말").setTabCompleter(new NoArg());
        getCommand("기본템").setExecutor(new normalitemCommand());
        getCommand("기본템").setTabCompleter(new NoArg());
        getCommand("채팅청소").setExecutor(new ChattingCleaner());
        getCommand("채팅청소").setTabCompleter(new ChattingCleanerTabCompletion());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        getCommand("broadcast").setTabCompleter(new NoArg());
        getCommand("update").setExecutor(new UpdateCommand());
        getCommand("update").setTabCompleter(new UpdateTabComplete());
        getCommand("워프").setExecutor(new WarpCommand());
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        Ping.SetOnline();
        Update.UpdateFalse();
    }
    @Override
    public void onDisable() { getLogger().info("플러그인이 비활성화 되었습니다."); }
}

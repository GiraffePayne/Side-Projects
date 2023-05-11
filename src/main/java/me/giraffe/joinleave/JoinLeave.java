package me.giraffe.joinleave;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class JoinLeave extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new JoinLeaveListenber(), this);
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        saveConfig();
    }
}

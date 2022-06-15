package com.mitsos.main;

import com.mitsos.commands.Command;
import com.mitsos.commands.armorstats;
import com.mitsos.events.Armors;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mitsos extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Mitsos Toggled");
        Bukkit.getPluginManager().registerEvents(new Armors(), this);
        getCommand("gibarmor").setExecutor(new Command());
        getCommand("armorinfo").setExecutor(new armorstats());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Mitsos goes to sleep...");
    }
}

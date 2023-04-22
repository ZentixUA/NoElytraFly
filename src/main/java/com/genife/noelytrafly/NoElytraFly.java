package com.genife.noelytrafly;

import com.genife.noelytrafly.Listeners.FlyListener;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoElytraFly extends JavaPlugin {
    public static String DISABLED_MESSAGE;

    @Override
    public void onEnable() {
        // Настраиваем конфиг
        FileConfiguration config = getConfig();

        config.addDefault("DisabledMessage", "§cЭлитры отключены!");
        config.options().copyDefaults(true);
        saveConfig();

        DISABLED_MESSAGE = config.getString("DisabledMessage");

        getServer().getPluginManager().registerEvents(new FlyListener(), this);
    }
}

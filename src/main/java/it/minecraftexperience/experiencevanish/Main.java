package it.minecraftexperience.experiencevanish;

import it.minecraftexperience.experiencevanish.utils.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Logging
        PluginLogger.log("DISABLED", "\n\n"+
                "  ______                      _                  __      __         _     _     \n"+
                " |  ____|                    (_)                 \\ \\    / /        (_)   | |    \n"+
                " | |__  __  ___ __   ___ _ __ _  ___ _ __   ___ __\\ \\  / /_ _ _ __  _ ___| |__  \n"+
                " |  __| \\ \\/ / '_ \\ / _ \\ '__| |/ _ \\ '_ \\ / __/ _ \\ \\/ / _` | '_ \\| / __| '_ \\ \n"+
                " | |____ >  <| |_) |  __/ |  | |  __/ | | | (_|  __/\\  / (_| | | | | \\__ \\ | | |\n"+
                " |______/_/\\_\\ .__/ \\___|_|  |_|\\___|_| |_|\\___\\___| \\/ \\__,_|_| |_|_|___/_| |_|\n"+
                "             | |                                                                \n"+
                "             |_|                                                                "+
                "\n\n"
        );
        PluginLogger.log("INFO", "Plugin version: v" + this.getDescription().getVersion());
        PluginLogger.log("INFO", "Vanish plugin for MinecraftExperience | Kingdoms");
        PluginLogger.log("INFO", "Made by tommaso.benatti#0001 : Sodio#2005");
        PluginLogger.log("INFO", "Plugin successfully loaded!");

        // config
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

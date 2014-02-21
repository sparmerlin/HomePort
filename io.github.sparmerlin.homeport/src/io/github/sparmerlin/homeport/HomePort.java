package io.github.sparmerlin.homeport;

import org.bukkit.plugin.java.JavaPlugin;

public final class HomePort extends JavaPlugin{

    @Override
    public void onEnable(){
    	getCommand("getfeather").setExecutor(new Commands(this));
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);   	
    }
 
    @Override
    public void onDisable() {
    }
}

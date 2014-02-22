package io.github.sparmerlin.homeport;

import io.github.sparmerlin.homeport.commands.Commands;
import io.github.sparmerlin.homeport.listeners.PlayerListener;

import org.bukkit.plugin.java.JavaPlugin;

public final class HomePort extends JavaPlugin{
//Welcome to our beta source code.
    @Override
    public void onEnable(){
    	getCommand("getfeather").setExecutor(new Commands(this));
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);   	
    }
 
    @Override
    public void onDisable() {
    }
}

package io.github.sparmerlin.homeport;

import io.github.sparmerlin.homeport.commands.GetFeather;
import io.github.sparmerlin.homeport.commands.Help;
import io.github.sparmerlin.homeport.listeners.PlayerListener;

import org.bukkit.plugin.java.JavaPlugin;

public final class HomePort extends JavaPlugin{
//Welcome to our source code.
    @Override
    public void onEnable(){
    	getCommand("getfeather").setExecutor(new GetFeather(this));
    	getCommand("homeporthelp").setExecutor(new Help(this));
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);   	
    }
 
    @Override
    public void onDisable() {
    }
}

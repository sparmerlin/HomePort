package io.github.sparmerlin.homeport;

import io.github.sparmerlin.homeport.commands.GetFeather;
import io.github.sparmerlin.homeport.commands.Help;
import io.github.sparmerlin.homeport.commands.SetSpawn;
import io.github.sparmerlin.homeport.commands.Spawn;
import io.github.sparmerlin.homeport.listeners.PlayerListener;

import org.bukkit.plugin.java.JavaPlugin;

public final class HomePort extends JavaPlugin{
//Welcome to our beta source code.
    @Override
    public void onEnable(){
    	getCommand("getfeather").setExecutor(new GetFeather(this));
    	getCommand("homeporthelp").setExecutor(new Help(this));
    	getCommand("hpspawn").setExecutor(new Spawn(this));
    	getCommand("hpsetspawn").setExecutor(new SetSpawn(this));
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);   	
    }
 
    @Override
    public void onDisable() {
    }
}

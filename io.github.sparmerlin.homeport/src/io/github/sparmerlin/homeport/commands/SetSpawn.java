package io.github.sparmerlin.homeport.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import io.github.sparmerlin.homeport.HomePort;

public class SetSpawn implements CommandExecutor {

		private HomePort plugin;
		 
		public SetSpawn(HomePort plugin) {
			this.plugin = plugin;
		}
		
		//Sets the Spawn Location.
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player player = (Player) sender;
			if (cmd.getName().equalsIgnoreCase("hpsetspawn")) {
				if (sender instanceof Player) {
					player.getWorld().setSpawnLocation(
					player.getLocation().getBlockX(), 
					player.getLocation().getBlockY(), 
					player.getLocation().getBlockZ());
					player.sendMessage(ChatColor.GOLD + "New world spawn is set to this location!");
					
				} else {
					sender.sendMessage("You must be a player to set the spawn.");
				}
			}
			return false;
		}
}
package io.github.sparmerlin.homeport.commands;

import io.github.sparmerlin.homeport.HomePort;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {

			private HomePort plugin;
			 
			public Spawn(HomePort plugin) {
				this.plugin = plugin;
			}
			
			//Sets the Spawn Location.
			public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
				Player player = (Player) sender;
				if (cmd.getName().equalsIgnoreCase("hpspawn")) {
					if (sender instanceof Player) {
						player.teleport(player.getWorld().getSpawnLocation());
						
					} else {
						sender.sendMessage("You must be a player to teleport to the spawn.");
					}
				}
				return false;
			}
	}
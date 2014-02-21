package io.github.sparmerlin.homeport.commands;

import io.github.sparmerlin.homeport.HomePort;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {

	private HomePort plugin;
	 
	public Commands(HomePort plugin) {
		this.plugin = plugin;
	}
	
	
	//Gives player a feather.
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("getfeather")) {
			if (sender instanceof Player) {
			Player player = (Player) sender;
			ChatColor blue = ChatColor.BLUE;
			if (player.getInventory().contains(Material.FEATHER)){
				player.sendMessage(blue + "You already have a feather!");
					} else {
						player.sendMessage(blue + "Shift and right click with the feather to return to spawn.");
						player.getInventory().addItem(new ItemStack(Material.FEATHER, 1));
					}
			}
		}
		return false;
	}
}


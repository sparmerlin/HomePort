package io.github.sparmerlin.homeport.commands;

import io.github.sparmerlin.homeport.HomePort;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {

	private HomePort plugin;
	 
	public Help(HomePort plugin) {
		this.plugin = plugin;
	}
	
	
	//Displays help message.
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args0) {
		if (cmd.getName().equalsIgnoreCase("homeporthelp")) {
			if (sender instanceof Player) {
			Player player = (Player) sender;
			ChatColor blue = ChatColor.BLUE;
			player.sendMessage(blue + "Right click while crouching and holding a feather to return to bed/spawn.");
			}
		}
		return false;
	}
}
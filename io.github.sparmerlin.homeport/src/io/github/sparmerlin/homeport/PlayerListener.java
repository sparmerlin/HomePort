package io.github.sparmerlin.homeport;


import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerListener implements Listener {
    
    
/** If the player is sneaking and right clicks with a feather.
 * Teleport them to their bed or if no bed exists, to the spawn.
 */
    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event){
        Player p = event.getPlayer();
     ChatColor blue = ChatColor.BLUE;
        if(p.getItemInHand().getType() == Material.FEATHER)
        	if (p.isSneaking()){
        		if (p.getBedSpawnLocation() != null) {
            		p.teleport(p.getBedSpawnLocation());
        			p.getInventory().removeItem(new ItemStack(Material.FEATHER, 1));
            		p.playEffect(p.getLocation(),Effect.MOBSPAWNER_FLAMES, 1);
            		p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 10));
            		p.playSound(p.getLocation(), (Sound.AMBIENCE_THUNDER), 1, 1);
            		p.sendMessage(blue + "You have returned to your bed!");
        		} else {
        			p.teleport(p.getWorld().getSpawnLocation());
        			p.getInventory().removeItem(new ItemStack(Material.FEATHER, 1));
            		p.playEffect(p.getLocation(),Effect.MOBSPAWNER_FLAMES, 1);
            		p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 50, 10));
            		p.playSound(p.getLocation(), (Sound.AMBIENCE_THUNDER), 1, 1);
            		p.sendMessage(blue + "You have returned to spawn!");
        		}
        	}
    }
}
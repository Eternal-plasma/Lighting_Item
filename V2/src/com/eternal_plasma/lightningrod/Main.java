package com.eternal_plasma.lightningrod;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler

    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();

    if(player.hasPermission("lig.strike")){
        if (player.getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD ) {
            player.getWorld().strikeLightning(player.getTargetBlock(null, 200).getLocation());

        }

    }
    else if (player.getInventory().getItemInMainHand().getType() == Material.BLAZE_ROD && !player.hasPermission("lig.strike" )){
        player.sendMessage(ChatColor.RED+ "strike denied");
        }
 }
}
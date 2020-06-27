package com.eternal_plasma.lightningitem;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler

    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();


        if (player.getInventory().getItemInMainHand().getType() == Material.STICK) {
            player.getWorld().strikeLightning(player.getTargetBlock(null, 200).getLocation());

        }

    }
}
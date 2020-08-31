package com.eternal_plasma.lightningrod.events;

import com.eternal_plasma.lightningrod.items.itemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class RodEvents implements Listener
{
    @EventHandler

    public static void onRightClick(PlayerInteractEvent event)
    {
            if (event.getItem() != null)
            {
                Player player = event.getPlayer();
              if(event.getItem().getItemMeta().equals(itemManager.rod.getItemMeta()) && player.hasPermission("lig.strike"))
                    {
                        player.getWorld().strikeLightning(player.getTargetBlock(null, 100).getLocation());
                    }
            }

    }

}

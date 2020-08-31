package com.eternal_plasma.lightningrod.commands;

import com.eternal_plasma.lightningrod.items.itemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            return true;
        }
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("giverod")&& player.hasPermission("lig.strike"))
            {
            player.getInventory().addItem(itemManager.rod);
            }


        return true;
    }
}

package com.eternal_plasma.lightningrod;

import com.eternal_plasma.lightningrod.commands.RodCommand;
import com.eternal_plasma.lightningrod.events.RodEvents;
import com.eternal_plasma.lightningrod.items.itemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        itemManager.INIT();
        getServer().getPluginManager().registerEvents(new RodEvents(),this);
        getCommand("giverod").setExecutor(new RodCommand());
    }
    public void onDisable()
    {


    }
}

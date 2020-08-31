package com.eternal_plasma.lightningrod.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class itemManager
{
    public static ItemStack rod;
    public static void INIT()
    {
        createRod();
    }


    private static void createRod()
    {
        ItemStack item = new ItemStack(Material.BLAZE_ROD,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Lightning Rod");
        List<String> lore = new ArrayList<>();
        lore.add("FEEL THE POWER");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        rod = item;
    }

}

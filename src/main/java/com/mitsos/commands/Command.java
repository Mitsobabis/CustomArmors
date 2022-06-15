package com.mitsos.commands;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if(sender.isOp() || sender.hasPermission("mitsos.staff")) {
            ItemStack SpeedArmor = new ItemStack(Material.DIAMOND_CHESTPLATE);
            if (sender instanceof Player) {
                ((Player) sender).getWorld().dropItemNaturally(((Player) sender).getLocation(), SpeedArmor);
                if(!SpeedArmor.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL) && !SpeedArmor.getItemMeta().hasEnchant(Enchantment.DURABILITY)){
                    SpeedArmor.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    SpeedArmor.addEnchantment(Enchantment.DURABILITY, 5);
                    SpeedArmor.getItemMeta().setDisplayName(Color.RED + "SpeederChest");
                }
                sender.sendMessage(ChatColor.GREEN + "You just received a " + ChatColor.RESET + SpeedArmor.getItemMeta().getDisplayName());
            }else{
                sender.sendMessage(ChatColor.RED + "You can't do this from here");
            }
        }else{
            sender.sendMessage(ChatColor.DARK_RED + "You need to have 'mitsos.staff' permission or be an operator of the server.");
        }
        return true;
    }
}


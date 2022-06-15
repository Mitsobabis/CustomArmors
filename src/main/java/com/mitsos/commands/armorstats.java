package com.mitsos.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class armorstats implements CommandExecutor {
    public int protectability = 0;
    public int durability = 0;
    public boolean mending = false;
    public String message = "No";
    public List<String> list = Arrays.asList("","","","","","","","");
    public int index = 0;

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (sender instanceof Player) {
            ItemStack helmet = ((Player) sender).getInventory().getHelmet();
            ItemStack chestplate = ((Player) sender).getInventory().getChestplate();
            ItemStack leggings = ((Player) sender).getInventory().getLeggings();
            ItemStack boots = ((Player) sender).getInventory().getBoots();

            String shelmet = "helmet";
            String schestplate = "chestplate";
            String sleggings = "leggings";
            String sboots = "boots";

            if(args.length == 0){
                sender.sendMessage(ChatColor.RED + "Please provide a method");
            }else{
                if(args[1].equals(shelmet)){
                    if(helmet.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)){
                       int lvl = helmet.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                       if(lvl == 1) protectability = protectability + 20;
                       else if(lvl == 2) protectability = protectability + 40;
                       else if(lvl == 3) protectability = protectability + 60;
                       else if(lvl == 4) protectability = protectability + 80;
                       else if(lvl >= 5) protectability = protectability + 100;
                       index = index + 1;
                       list.set(index, " Protection: " + lvl);
                    }else if(helmet.getItemMeta().hasEnchant(Enchantment.DURABILITY)){
                        int lvl = helmet.getItemMeta().getEnchantLevel(Enchantment.DURABILITY);
                        if(lvl == 1) durability = 25;
                        else if(lvl == 2) durability = 50;
                        else if(lvl == 3) durability = 75;
                        else if(lvl >= 4) durability = 100;
                        index = index + 1;
                        list.set(index, " Unbreaking: " + lvl);
                    }else if(helmet.getItemMeta().hasEnchant(Enchantment.MENDING)){
                        mending = true;
                        message = "Yes";
                        index = index + 1;
                        list.set(index, " Mending");
                    }else if(helmet.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)){
                        int lvl = helmet.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Blast Protection: " + lvl);
                    }else if(helmet.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL)){
                        int lvl = helmet.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL);
                        if(lvl == 1) protectability = protectability + 25;
                        else if(lvl == 2) protectability = protectability + 50;
                        else if(lvl == 3) protectability = protectability + 75;
                        else if(lvl >= 4) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Feather Falling: " + lvl);
                    }else if(helmet.getItemMeta().hasEnchant(Enchantment.PROTECTION_FIRE)){
                        int lvl = helmet.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FIRE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Fire Protection: " + lvl);
                    }else if(helmet.getItemMeta().hasEnchant(Enchantment.PROTECTION_PROJECTILE)){
                        int lvl = helmet.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_PROJECTILE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Projectile Protection: " + lvl);
                    }

                    sender.sendMessage(ChatColor.YELLOW + "Statistics of your helmet");
                    sender.sendMessage(ChatColor.GREEN + "  Protectability: " + ChatColor.DARK_GREEN + protectability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Durability: " + ChatColor.DARK_GREEN + durability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Mending: " + ChatColor.DARK_GREEN + message);
                    sender.sendMessage(ChatColor.YELLOW + "Enchantments (that determine protectability and durability values)");
                    sender.sendMessage(ChatColor.GREEN + "  " + list.toString());
                }else if(args[1].equals(schestplate)){
                    if(chestplate.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)){
                        int lvl = chestplate.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                    }else if(chestplate.getItemMeta().hasEnchant(Enchantment.DURABILITY)){
                        int lvl = chestplate.getItemMeta().getEnchantLevel(Enchantment.DURABILITY);
                        if(lvl == 1) durability = 25;
                        else if(lvl == 2) durability = 50;
                        else if(lvl == 3) durability = 75;
                        else if(lvl >= 4) durability = 100;
                    }else if(chestplate.getItemMeta().hasEnchant(Enchantment.MENDING)){
                        mending = true;
                        message = "Yes";
                    }else if(chestplate.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)){
                        int lvl = chestplate.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Blast Protection: " + lvl);
                    }else if(chestplate.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL)){
                        int lvl = chestplate.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL);
                        if(lvl == 1) protectability = protectability + 25;
                        else if(lvl == 2) protectability = protectability + 50;
                        else if(lvl == 3) protectability = protectability + 75;
                        else if(lvl >= 4) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Feather Falling: " + lvl);
                    }else if(chestplate.getItemMeta().hasEnchant(Enchantment.PROTECTION_FIRE)){
                        int lvl = chestplate.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FIRE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Fire Protection: " + lvl);
                    }else if(chestplate.getItemMeta().hasEnchant(Enchantment.PROTECTION_PROJECTILE)){
                        int lvl = chestplate.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_PROJECTILE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Projectile Protection: " + lvl);
                    }
                    sender.sendMessage(ChatColor.YELLOW + "Statistics of your chestplate");
                    sender.sendMessage(ChatColor.GREEN + "  Protectability: " + ChatColor.DARK_GREEN + protectability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Durability: " + ChatColor.DARK_GREEN + durability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Mending: " + ChatColor.DARK_GREEN + message);
                    sender.sendMessage(ChatColor.YELLOW + "Enchantments (that determine protectability and durability values)");
                    sender.sendMessage(ChatColor.GREEN + "  " + list.toString());
                }else if(args[1].equals(sleggings)){
                    if(leggings.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)){
                        int lvl = leggings.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                    }else if(leggings.getItemMeta().hasEnchant(Enchantment.DURABILITY)){
                        int lvl = leggings.getItemMeta().getEnchantLevel(Enchantment.DURABILITY);
                        if(lvl == 1) durability = 25;
                        else if(lvl == 2) durability = 50;
                        else if(lvl == 3) durability = 75;
                        else if(lvl >= 4) durability = 100;
                    }else if(leggings.getItemMeta().hasEnchant(Enchantment.MENDING)){
                        mending = true;
                        message = "Yes";
                    }else if(leggings.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)){
                        int lvl = leggings.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Blast Protection: " + lvl);
                    }else if(leggings.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL)){
                        int lvl = leggings.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL);
                        if(lvl == 1) protectability = protectability + 25;
                        else if(lvl == 2) protectability = protectability + 50;
                        else if(lvl == 3) protectability = protectability + 75;
                        else if(lvl >= 4) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Feather Falling: " + lvl);
                    }else if(leggings.getItemMeta().hasEnchant(Enchantment.PROTECTION_FIRE)){
                        int lvl = leggings.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FIRE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Fire Protection: " + lvl);
                    }else if(leggings.getItemMeta().hasEnchant(Enchantment.PROTECTION_PROJECTILE)){
                        int lvl = leggings.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_PROJECTILE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Projectile Protection: " + lvl);
                    }
                    sender.sendMessage(ChatColor.YELLOW + "Statistics of your leggings");
                    sender.sendMessage(ChatColor.GREEN + "  Protectability: " + ChatColor.DARK_GREEN + protectability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Durability: " + ChatColor.DARK_GREEN + durability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Mending: " + ChatColor.DARK_GREEN + message);
                    sender.sendMessage(ChatColor.YELLOW + "Enchantments (that determine protectability and durability values)");
                    sender.sendMessage(ChatColor.GREEN + "  " + list.toString());
                }else if(args[1].equals(sboots)){
                    if(boots.getItemMeta().hasEnchant(Enchantment.PROTECTION_ENVIRONMENTAL)){
                        int lvl = boots.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_ENVIRONMENTAL);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                    }else if(boots.getItemMeta().hasEnchant(Enchantment.DURABILITY)){
                        int lvl = boots.getItemMeta().getEnchantLevel(Enchantment.DURABILITY);
                        if(lvl == 1) durability = 25;
                        else if(lvl == 2) durability = 50;
                        else if(lvl == 3) durability = 75;
                        else if(lvl >= 4) durability = 100;
                    }else if(boots.getItemMeta().hasEnchant(Enchantment.MENDING)){
                        mending = true;
                        message = "Yes";
                    }else if(boots.getItemMeta().hasEnchant(Enchantment.PROTECTION_EXPLOSIONS)){
                        int lvl = boots.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_EXPLOSIONS);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Blast Protection: " + lvl);
                    }else if(boots.getItemMeta().hasEnchant(Enchantment.PROTECTION_FALL)){
                        int lvl = boots.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FALL);
                        if(lvl == 1) protectability = protectability + 25;
                        else if(lvl == 2) protectability = protectability + 50;
                        else if(lvl == 3) protectability = protectability + 75;
                        else if(lvl >= 4) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Feather Falling: " + lvl);
                    }else if(boots.getItemMeta().hasEnchant(Enchantment.PROTECTION_FIRE)){
                        int lvl = boots.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_FIRE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Fire Protection: " + lvl);
                    }else if(boots.getItemMeta().hasEnchant(Enchantment.PROTECTION_PROJECTILE)){
                        int lvl = boots.getItemMeta().getEnchantLevel(Enchantment.PROTECTION_PROJECTILE);
                        if(lvl == 1) protectability = protectability + 20;
                        else if(lvl == 2) protectability = protectability + 40;
                        else if(lvl == 3) protectability = protectability + 60;
                        else if(lvl == 4) protectability = protectability + 80;
                        else if(lvl >= 5) protectability = protectability + 100;
                        index = index + 1;
                        list.set(index, " Projectile Protection: " + lvl);
                    }
                    sender.sendMessage(ChatColor.YELLOW + "Statistics of your boots");
                    sender.sendMessage(ChatColor.GREEN + "  Protectability: " + ChatColor.DARK_GREEN + protectability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Durability: " + ChatColor.DARK_GREEN + durability + "%");
                    sender.sendMessage(ChatColor.GREEN + "  Mending: " + ChatColor.DARK_GREEN + message);
                    sender.sendMessage(ChatColor.YELLOW + "Enchantments (that determine protectability and durability values)");
                    sender.sendMessage(ChatColor.GREEN + "  " + list.toString());
                }

            }
        }
        return true;
    }

}
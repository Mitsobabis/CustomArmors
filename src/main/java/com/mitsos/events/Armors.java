package com.mitsos.events;

import com.codingforcookies.armorequip.ArmorEquipEvent;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.EventListener;
import java.util.Objects;

public class Armors implements EventListener, Listener {

    @EventHandler
    public void ArmorEvent(ArmorEquipEvent e){

        ItemStack NewArmor = e.getNewArmorPiece();
        ItemStack OldArmor = e.getOldArmorPiece();
        Player player = e.getPlayer();

        String name = Color.RED + "SpeederChest";

        if(NewArmor != null && NewArmor.getType() != Material.AIR && Objects.equals(NewArmor.getItemMeta().getDisplayName(), name)){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 2));
        }
        if(OldArmor != null && OldArmor.getType() != Material.AIR && Objects.equals(OldArmor.getItemMeta().getDisplayName(), name)){
            player.removePotionEffect(PotionEffectType.SPEED);
        }

    }
}



package com.gabezter4.hotel_manager.Generators;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.gabezter4.hotel_manager.main.hotel_time;

public class CubegeneraterProtect {

	
	hotel_time plugin;
	
	public CubegeneraterProtect(hotel_time instance){
		plugin = instance;
	}
	
	int blockCounter = 0;
	public void protectArea(Player player, Location l1, Location l2){
		int mix, max, miy, may, miz, maz;
		
		if(l1.getBlockX() < l2.getBlockX()){
			mix = l1.getBlockX();
			max = l2.getBlockX();
		}else{
			mix = l2.getBlockX();
			max = l1.getBlockX();
		}		
		if(l1.getBlockY() < l2.getBlockY()){
			miy = l1.getBlockY();
			may = l2.getBlockY();
		}else{
			miy = l2.getBlockY();
			may = l1.getBlockY();
		}
		if(l1.getBlockZ() < l2.getBlockZ()){
			miz = l1.getBlockZ();
			maz = l2.getBlockZ();
		}else{
			miz = l2.getBlockZ();
			maz = l1.getBlockZ();
		}
		
		for(int x = mix; x<max; x++){
			for(int y = miy; y<may; y++){
				for(int z = miz; z<maz; z++){
					Location location = new Location(player.getWorld(), x, y,z);
					plugin.protectedBlocks.add(location);
					blockCounter++;
				}
			}
		}
		String s = Material.getMaterial(plugin.ID).name();
		plugin.m.capitaliseFristLetter(s);
		plugin.m.sendMessage(player,blockCounter + " Blocks Have Been Protected!");
		blockCounter = 0;
	}
}

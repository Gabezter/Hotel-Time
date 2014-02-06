package com.gabezter4.hotel_manager.Generators;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.material.Step;

import com.gabezter4.hotel_manager.main.hotel_time;

public class Hotel_Generater {
	
	
	hotel_time plugin;
	
	public Hotel_Generater(hotel_time instance){
		plugin = instance;
	}
	
	int blockCounter = 0;
	int y = 1;
	
	public void generateCube(Player player, Location l1, Location l2){
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
					Location loc = new Location(player.getWorld(), x, y,z);
					
					//Cobblestone
					loc.setX(loc.getX() + 1);
					loc.setX(loc.getX() + 2);
					loc.setX(loc.getX() + 3);
					loc.setX(loc.getX() + 4);
					loc.setX(loc.getX() + 5);
					loc.setX(loc.getX() + 6);
					loc.setX(loc.getX() + 7);
					loc.setX(loc.getX() + 8);
					loc.setX(loc.getX() + 9);
					loc.setX(loc.getX() + 10);
					loc.setX(loc.getX() + 11);
					loc.setX(loc.getX() + 12);
					loc.setX(loc.getX() + 13);
					loc.setX(loc.getX() + 14);
					

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					y=2;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=3;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=4;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=5;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=6;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=7;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					y=8;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=9;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=10;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=11;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=12;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=13;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					y=14;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=15;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=16;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=17;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=18;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=19;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					y=20;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=21;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=22;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);
					
					y=23;
					
					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14) + y);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14) + y);

					if(y==23){y=1;}
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 1);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 1);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 2);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 2);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 3);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 3);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 4);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 4);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 5);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 5);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 6);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 6);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 7);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 7);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 8);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 8);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 9);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 9);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 10);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 10);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 11);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 11);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 12);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 12);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 13);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 13);
					
					loc.setZ(loc.getZ() + (loc.getX() + 1) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 14);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 14);
					World w = loc.getWorld();
					Block b = w.getBlockAt(loc);
					b.setType(Material.COBBLESTONE);	
					
					//Doors
					Location loc1 = new Location(player.getWorld(), x, y,z);
					loc1.setY(loc1.getY() + (loc1.getZ() + (loc1.getX() + 1) + 7) + 1);
					loc1.setY(loc1.getY() + (loc1.getZ() + (loc1.getX() + 1) + 8) + 1);
					World w1 = loc1.getWorld();
					Block b1 = w1.getBlockAt(loc1);
					b1.setType(Material.WOOD_DOOR);
					
					//Steps
					Location loc2 = new Location(player.getWorld(), x, y,z);
					loc2.setZ(loc2.getZ() + 7);
					loc2.setZ(loc2.getZ() + 8);
					World w2 = loc2.getWorld();
					Block b2 = w2.getBlockAt(loc2);
					b2.setType(Material.STEP);

				}
			}
		}
		String s = Material.getMaterial(plugin.ID).name();
		plugin.m.capitaliseFristLetter(s);
		plugin.m.sendMessage(player, "Hotel Has Be Created.");
		blockCounter = 0;
	}}
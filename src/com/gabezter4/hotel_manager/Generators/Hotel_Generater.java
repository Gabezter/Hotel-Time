package com.gabezter4.hotel_manager.Generators;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.gabezter4.hotel_manager.main.hotel_time;

public class Hotel_Generater {

	hotel_time plugin;

	public Hotel_Generater(hotel_time instance) {
		plugin = instance;
	}

	int blockCounter = 0;
	int y = 1;

	public void generateCube(Player player, Location loc, Location loc1,
			Location loc2) {
		int mix, max, miy, may, miz, maz;

		mix = loc.getBlockX();
		miy = loc.getBlockY();
		miz = loc.getBlockZ();

		max = mix + 14;
		may = miy + 23;
		maz = miz + 14;

		for (int x1 = mix; x1 < max; x1++) {
			for (int y1 = miy; y1 < may; y1++) {
				for (int z1 = miz; z1 < maz; z1++) {
					loc = new Location(player.getWorld(), x1, y1, z1);
					World w = loc.getWorld();
					Block b = w.getBlockAt(loc);
					loc1 = new Location(player.getWorld(), x1, y1, z1);
					World w1 = loc1.getWorld();
					Block b1 = w1.getBlockAt(loc1);
					loc2 = new Location(player.getWorld(), x1, y1, z1);
					World w2 = loc2.getWorld();
					Block b2 = w2.getBlockAt(loc2);

					// Cobblestone
					loc.setX(loc.getX() + 1);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 2);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 3);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 4);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 5);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 6);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 7);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 8);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 9);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 10);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 11);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 12);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 13);
					b.setType(Material.COBBLESTONE);
					loc.setX(loc.getX() + 14);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 2;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 3;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 4;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 5;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 6;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 7;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 8;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 9;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 10;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 11;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 12;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 13;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 14;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 15;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 16;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 17;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 18;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 19;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 20;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 21;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 22;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					y = 23;

					loc.setY(loc.getY() + (loc.getX() + 1) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 2) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 3) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 4) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 5) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 6) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 7) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 8) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 9) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 10) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 11) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 12) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 13) + y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getX() + 14) + y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 7)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 8)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 1)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 2)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 3)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 4)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 5)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 6)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 9)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 10)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 11)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 12)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 13)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 1) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 2) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 3) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 4) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 5) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 6) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 7) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 8) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 9) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 10) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 11) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 12) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 13) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);
					loc.setY(loc.getY() + (loc.getZ() + (loc.getX() + 14) + 14)
							+ y);
					b.setType(Material.COBBLESTONE);

					if (y == 23) {
						y = 1;
					}

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 1);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 1);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 2);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 2);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 3);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 3);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 4);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 4);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 5);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 5);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 6);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 6);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 7);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 7);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 8);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 8);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 9);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 9);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 10);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 10);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 11);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 11);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 12);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 12);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 13);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 13);
					b.setType(Material.COBBLESTONE);

					loc.setZ(loc.getZ() + (loc.getX() + 1) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 2) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 3) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 4) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 5) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 6) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 7) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 8) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 9) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 10) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 11) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 12) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 13) + 14);
					b.setType(Material.COBBLESTONE);
					loc.setZ(loc.getZ() + (loc.getX() + 14) + 14);
					b.setType(Material.COBBLESTONE);

					// Doors
					loc1.setY(loc1.getY()
							+ (loc1.getZ() + (loc1.getX() + 1) + 7) + 1);
					b1.setType(Material.WOOD_DOOR);
					loc1.setY(loc1.getY()
							+ (loc1.getZ() + (loc1.getX() + 1) + 8) + 1);
					b1.setType(Material.WOOD_DOOR);

					// Steps
					loc2.setZ(loc2.getZ() + 7);
					b2.setType(Material.STEP);
					loc2.setZ(loc2.getZ() + 8);
					b2.setType(Material.STEP);

				}
			}
		}
		String s = Material.getMaterial(plugin.ID).name();
		plugin.m.capitaliseFristLetter(s);
		plugin.m.sendMessage(player, "Hotel Has Be Created.");
		blockCounter = 0;
	}
}
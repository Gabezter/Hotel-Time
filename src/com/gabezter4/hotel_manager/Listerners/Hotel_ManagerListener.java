package com.gabezter4.hotel_manager.Listerners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.gabezter4.hotel_manager.main.hotel_time;

public class Hotel_ManagerListener implements Listener {
	
	hotel_time plugin;
	
	public Hotel_ManagerListener(hotel_time instance){
		plugin = instance;
	}

	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		Player player = event.getPlayer();
		if(event.getAction()==Action.LEFT_CLICK_BLOCK && event.getPlayer().getItemInHand().getType() == Material.FIRE){
			try{
				plugin.l1 = event.getClickedBlock().getLocation();
				plugin.m.sendMessage(player, "Postion 1:" + plugin.m.showBlockCoords(plugin.l1));
				event.setCancelled(true);
			}catch(Exception e) {
				plugin.m.sendMessage(player, "Plugin Failed To Create Waypoint!");
				plugin.m.sendConsole("Plugin Failed To Create WayPoint");
			}	
		}
		if(event.getAction() == Action.RIGHT_CLICK_BLOCK && player.getItemInHand().getType() == Material.FIRE){
			try{
				plugin.l1 = event.getClickedBlock().getLocation();
				plugin.m.sendMessage(player, "Postion 2:" + plugin.m.showBlockCoords(plugin.l2));
				event.setCancelled(true);
			}catch(Exception e) {
				plugin.m.sendMessage(player, "Plugin Failed To Create Waypoint!");
				plugin.m.sendConsole("Plugin Failed To Create WayPoint");
			}
		}
		if(plugin.protectedBlocks.contains(event.getClickedBlock().getLocation())){
			event.setCancelled(true);
		}
	}
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		Location loc = event.getPlayer().getLocation();
		loc.setX(loc.getX() + 1);
		loc.setX(loc.getX() + 2);
		loc.setX(loc.getX() + 3);
		loc.setY(loc.getY() + (loc.getX() + 1) + 1);
		World w = loc.getWorld();
		Block b = w.getBlockAt(loc);
		b.setTypeId(4);
		
	}
	
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event){
		if(plugin.protectedBlocks.contains(event.getBlock())){
			event.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event){
		if(plugin.protectedBlocks.contains(event.getBlock())){
			event.setCancelled(true);
		}
	}
}

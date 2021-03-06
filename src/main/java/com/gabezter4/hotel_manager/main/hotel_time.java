package com.gabezter4.hotel_manager.main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.gabezter4.hotel_manager.Generators.CubegeneraterProtect;
import com.gabezter4.hotel_manager.Generators.Hotel_Generater;
import com.gabezter4.hotel_manager.Listerners.Hotel_ManagerListener;

public final class hotel_time extends JavaPlugin {

	public final Logger logger = Logger.getLogger("Minecraft");

	public final Hotel_ManagerListener hml = new Hotel_ManagerListener(this);
	public final CubegeneraterProtect cgp = new CubegeneraterProtect(this);
	public final Methods m = new Methods();
	public final Hotel_Generater hg = new Hotel_Generater(this);

	Player player;

	public ArrayList<Location> protectedBlocks = new ArrayList<Location>();
	public Location l1 = null;
	public Location l2 = null;

	public int ID = 0;

	public File warning = null;
	public FileConfiguration nw = null;

	public File config = null;
	public FileConfiguration nc = null;
	public boolean pos1 = false;
	public boolean pos2 = false;

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(hml, this);
		this.warning = new File(this.getDataFolder(), "hotel.yml");
		this.nw = YamlConfiguration.loadConfiguration(warning);
		this.config = new File(this.getDataFolder(), "config.yml");
		this.nc = YamlConfiguration.loadConfiguration(config);

		if (!config.exists()) {
			this.getLogger().info("Gernerating the config.yml file...");
			nc.addDefault("Allow Hotel Kicking", "false");
			nc.options().copyDefaults(true);
			try {
				nc.save(config);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!warning.exists()) {
			this.getLogger().info("Gernerating the hotels.yml file...");
			nw.addDefault("Hotels", "");
			nw.options().copyDefaults(true);
			try {
				nw.save(warning);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void onDisable() {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("hotel")) { // If the player typed
													// /hotel create then do the
													// following...

			sender.sendMessage(ChatColor.DARK_GREEN
					+ "This is the Main Command. Do /hotel help for the help page.");
			sender.sendMessage(ChatColor.GREEN + "Version 0.1.0");
			sender.sendMessage(ChatColor.RED
					+ "Website: dev.bukkit.org/bukkit-plugins/Hotel_Time");
			if (args[1].equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.DARK_GREEN
						+ "|-------------------------------Hotel-Time Help Page------------------------------|");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel - Main command.                                                           |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel help - Displays this page.                                                |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel checkin - Checks you in to the hotel that you name.                       |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel checkout - Checks you out of the hotel that you are in.                   |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel ahelp - Displays the help page for admins.                                |");
				sender.sendMessage(ChatColor.DARK_GREEN
						+ "|------------------------------End of the Help Page-------------------------------|");
				return true;
			}
			if (args[1].equalsIgnoreCase("ahelp")) {
				sender.sendMessage(ChatColor.DARK_GREEN
						+ "|------------------------------Hotel-Time Admin Help Page-----------------------------|");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel - Main command.                                                               |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel ahelp - Displays this page.                                                   |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel help - Displays the help page for players.                                    |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel checkin - Checks you in to the hotel that you name.                           |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel checkout - Checks you out of the hotel that you are in.                       |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel kick - Kicks a player out of the hotel they are in.                           |");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel set building - Creates the building of the hotel with the world edit commands.|");
				sender.sendMessage(ChatColor.DARK_RED
						+ "|/hotel set room - Creates a room of the hotel with the world edit commands.          |");
				sender.sendMessage(ChatColor.DARK_GREEN
						+ "|--------------------------------End of the Help Page---------------------------------|");
				return true;
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("hotel kick")) {
			if (nc.get("Allow Hotel Kicking", false) != null) {
				sender.sendMessage(ChatColor.AQUA
						+ "Kicking people from the hotel is not allowed!!");
			} else if (nc.get("Allow Hotel Kicking", true) != null) {
				sender.sendMessage(ChatColor.AQUA + args[1]
						+ " has been kicked from the hotel!!");
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("hotel config")) {
			if (args[1].equalsIgnoreCase("Allow_Kicking")) {
				if (args[2].equalsIgnoreCase("true")) {
					getConfig().set("Allow Hotel Kicking", true);
					sender.sendMessage(ChatColor.AQUA
							+ "Kicking from Hotels is now allowed!!");
					try {
						nc.save(config);
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				} else if (args[2].equalsIgnoreCase("false")) {
					getConfig().set("Allow Hotel Kicking", false);
					sender.sendMessage(ChatColor.AQUA
							+ "Kicking from Hotels is now not allowed!!");
					try {
						nc.save(config);
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				}
			}
		}
		String b = ".building";
		String r = ".room.";
		String o = ".occupied";
		String t = "true";
		String f = "false";
		if (cmd.getName().equalsIgnoreCase("hotel set")) {
			if (args[1].equalsIgnoreCase("room")) {
				if (nw.getString(args[2] + b + "1" + r, "1") != null) {
					if (nw.getString(args[2] + b + "1" + r, "2") != null) {
						if (nw.getString(args[2] + b + "1" + r, "3") != null) {
							if (nw.getString(args[2] + b + "1" + r, "4") != null) {
								if (nw.getString(args[2] + b + "1" + r, "5") != null) {
									if (nw.getString(args[2] + b + "1" + r, "6") != null) {
										if (nw.getString(args[2] + b + "1" + r,
												"7") != null) {
											if (nw.getString(args[2] + b + "1"
													+ r, "8") != null) {
												if (nw.getString(args[2] + b
														+ "1" + r, "9") != null) {
													if (nw.getString(args[2]
															+ b + "1" + r, "10") != null) {
														sender.sendMessage(ChatColor.RED
																+ "Only 10 rooms are allowed per building.");
													} else if (nw.getString(
															args[2] + b + "1"
																	+ r, "10") == null) {
														nw.set(args[2] + b
																+ "1" + r, "10");
														nw.set(args[2] + b
																+ "1" + r
																+ "10.corner1",
																this.m.showBlockCoords(this.l1));
														nw.set(args[2] + b
																+ "1" + r
																+ "10.corner2",
																this.m.showBlockCoords(this.l2));
														sender.sendMessage(ChatColor.AQUA
																+ "Room Count: 10/10");
													}
												} else if (nw.getString(args[2]
														+ b + "1" + r, "9") == null) {
													nw.set(args[2] + b + "1"
															+ r, "9");
													nw.set(args[2] + b + "1"
															+ r + "9.corner1",
															this.m.showBlockCoords(this.l1));
													nw.set(args[2] + b + "1"
															+ r + "9.corner2",
															this.m.showBlockCoords(this.l2));
													sender.sendMessage(ChatColor.AQUA
															+ "Room Count: 9/10");
												}
											} else if (nw.getString(args[2] + b
													+ "1" + r, "8") == null) {
												nw.set(args[2] + b + "1" + r,
														"8");
												nw.set(args[2] + b + "1" + r
														+ "8.corner1",
														this.m.showBlockCoords(this.l1));
												nw.set(args[2] + b + "1" + r
														+ "8.corner2",
														this.m.showBlockCoords(this.l2));
												sender.sendMessage(ChatColor.AQUA
														+ "Room Count: 8/10");
											}
										} else if (nw.getString(args[2] + b
												+ "1" + r, "7") == null) {
											nw.set(args[2] + b + "1" + r, "7");
											nw.set(args[2] + b + "1" + r
													+ "7.corner1", this.m
													.showBlockCoords(this.l1));
											nw.set(args[2] + b + "1" + r
													+ "7.corner2", this.m
													.showBlockCoords(this.l2));
											sender.sendMessage(ChatColor.AQUA
													+ "Room Count: 7/10");
										}
									} else if (nw.getString(args[2] + b + "1"
											+ r, "6") == null) {
										nw.set(args[2] + b + "1" + r, "6");
										nw.set(args[2] + b + "1" + r
												+ "6.corner1",
												this.m.showBlockCoords(this.l1));
										nw.set(args[2] + b + "1" + r
												+ "6.corner2",
												this.m.showBlockCoords(this.l2));
										sender.sendMessage(ChatColor.AQUA
												+ "Room Count: 6/10");
									}
								} else if (nw.getString(args[2] + b + "1" + r,
										"5") == null) {
									nw.set(args[2] + b + "1" + r, "5");
									nw.set(args[2] + b + "1" + r + "5.corner1",
											this.m.showBlockCoords(this.l1));
									nw.set(args[2] + b + "1" + r + "5.corner2",
											this.m.showBlockCoords(this.l2));
									sender.sendMessage(ChatColor.AQUA
											+ "Room Count: 5/10");
								}
							} else if (nw.getString(args[2] + b + "1" + r, "4") == null) {
								nw.set(args[2] + b + "1" + r, "4");
								nw.set(args[2] + b + "1" + r + "4.corner1",
										this.m.showBlockCoords(this.l1));
								nw.set(args[2] + b + "1" + r + "4.corner2",
										this.m.showBlockCoords(this.l2));
								sender.sendMessage(ChatColor.AQUA
										+ "Room Count: 4/10");
							}
						} else if (nw.getString(args[2] + b + "1" + r, "3") == null) {
							nw.set(args[2] + b + "1" + r, "3");
							nw.set(args[2] + b + "1" + r + "3.corner1",
									this.m.showBlockCoords(this.l1));
							nw.set(args[2] + b + "1" + r + "3.corner2",
									this.m.showBlockCoords(this.l2));
							sender.sendMessage(ChatColor.AQUA
									+ "Room Count: 3/10");
						}
					} else if (nw.getString(args[2] + b + "1" + r, "2") == null) {
						nw.set(args[2] + b + "1" + r, "2");
						nw.set(args[2] + b + "1" + r + "2.corner1",
								this.m.showBlockCoords(this.l1));
						nw.set(args[2] + b + "1" + r + "2.corner2",
								this.m.showBlockCoords(this.l2));
						sender.sendMessage(ChatColor.AQUA + "Room Count: 2/10");
					}
				} else if (nw.getString(args[2] + b + "1" + r, "1") == null) {
					nw.set(args[2] + b + "1" + r, "1");
					nw.set(args[2] + b + "1" + r + "1.corner1",
							this.m.showBlockCoords(this.l1));
					nw.set(args[2] + b + "1" + r + "1.corner2",
							this.m.showBlockCoords(this.l2));
					sender.sendMessage(ChatColor.AQUA + "Room Count: 1/10");
				}
				try {
					nw.save(warning);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return true;
			} else if (args[1].equalsIgnoreCase("building")) {
				if (pos1 == true && pos2 == true) {
					if (nw.getString(args[2] + b + "1") != null) {
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "Only One Building is allowed Currently.");
					} else {
						nw.set(args[2] + b, "1");
						nw.set(args[2] + b, "Pos1");
						nw.set(args[2] + b + "Pos1", "x");
						nw.set(args[2] + b + "Pos1" + ".X", l1.getBlockX());
						nw.set(args[2] + b + "Pos1", "Y");
						nw.set(args[2] + b + "Pos1" + ".Y", l1.getBlockY());
						nw.set(args[2] + b + "Pos1", "Z");
						nw.set(args[2] + b + "Pos1" + ".Z", l1.getBlockZ());
						nw.set(args[2] + b, "Pos2");
						nw.set(args[2] + b + "Pos2", "x");
						nw.set(args[2] + b + "Pos2" + ".X", l2.getBlockX());
						nw.set(args[2] + b + "Pos2", "Y");
						nw.set(args[2] + b + "Pos2" + ".Y", l2.getBlockY());
						nw.set(args[2] + b + "Pos2", "Z");
						nw.set(args[2] + b + "Pos2" + ".Z", l2.getBlockZ());
					}
					try {
						nw.save(warning);
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				}
			}
		}
		if (cmd.getName().equalsIgnoreCase("hotel create")) {
			nw.set("Hotels", args[1]);
			sender.sendMessage(ChatColor.RED + "The Hotel " + ChatColor.BLUE
					+ args[1] + ChatColor.RED + " has been created.");
			try {
				nw.save(warning);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("hotel checkout")) {
			String player = ((Player) sender).getName();
			if (args[1].equalsIgnoreCase(nw.getString(args[1]))) {
				if (nw.getString(args[1] + b + "1" + r + "1" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "1" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "1" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "1" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "2" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "2" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "2" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "2" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "3" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "3" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "3" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "3" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "4" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "4" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "4" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "4" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "5" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "5" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "5" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "5" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "6" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "6" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "6" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "6" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "7" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "7" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "7" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "7" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "8" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "8" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "8" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "8" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "9" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "9" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "9" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "9" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				} else if (nw.getString(args[1] + b + "1" + r + "10" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "10" + o + ".by",
							player) != null) {
						nw.set(args[1] + b + "1" + r + "10" + o + ".by", null);
						nw.set(args[1] + b + "1" + r + "10" + o, f);
						sender.sendMessage(ChatColor.DARK_AQUA
								+ "You are now CheckOut.");
					}
				}
				sender.sendMessage(ChatColor.RED + "You are not in" + args[1]);
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("hotel checkin")) {
			if (args[1].equalsIgnoreCase(nw.getString(args[1]))) {
				if (nw.getString(args[1] + b + "1" + r + "1" + o, t) != null) {
					if (nw.getString(args[1] + b + "1" + r + "2" + o, t) != null) {
						if (nw.getString(args[1] + b + "1" + r + "3" + o, t) != null) {
							if (nw.getString(args[1] + b + "1" + r + "4" + o, t) != null) {
								if (nw.getString(args[1] + b + "1" + r + "5"
										+ o, t) != null) {
									if (nw.getString(args[1] + b + "1" + r
											+ "6" + o, t) != null) {
										if (nw.getString(args[1] + b + "1" + r
												+ "7" + o, t) != null) {
											if (nw.getString(args[1] + b + "1"
													+ r + "8" + o, t) != null) {
												if (nw.getString(args[1] + b
														+ "1" + r + "9" + o, t) != null) {
													if (nw.getString(args[1]
															+ b + "1" + r
															+ "10" + o, t) != null) {
														sender.sendMessage(ChatColor.DARK_RED
																+ "No Rooms are open.");
													} else if (nw.getString(
															args[1] + b + "1"
																	+ r + "10"
																	+ o, f) != null) {
														nw.set(args[1] + b
																+ "1" + r
																+ "10" + o, t);
														nw.set(args[1] + b
																+ "1" + r
																+ "10" + o
																+ ".by", sender);
													}
												} else if (nw.getString(args[1]
														+ r + "9" + o, f) != null) {
													nw.set(args[1] + b + "1"
															+ r + "9" + o, t);
													nw.set(args[1] + b + "1"
															+ r + "9" + o
															+ ".by", sender);
												}
											} else if (nw.getString(args[1] + b
													+ "1" + r + "8" + o, f) != null) {
												nw.set(args[1] + b + "1" + r
														+ "8" + o, t);
												nw.set(args[1] + b + "1" + r
														+ "8" + o + ".by",
														sender);
											}
										} else if (nw.getString(args[1] + b
												+ "1" + r + "7" + o, f) != null) {
											nw.set(args[1] + b + "1" + r + "7"
													+ o, t);
											nw.set(args[1] + b + "1" + r + "7"
													+ o + ".by", sender);
										}
									} else if (nw.getString(args[1] + b + "1"
											+ r + "6" + o, f) != null) {
										nw.set(args[1] + b + "1" + r + "6" + o,
												t);
										nw.set(args[1] + b + "1" + r + "6" + o
												+ ".by", sender);
									}
								} else if (nw.getString(args[1] + b + "1" + r
										+ "5" + o, f) != null) {
									nw.set(args[1] + b + "1" + r + "5" + o, t);
									nw.set(args[1] + b + "1" + r + "5" + o
											+ ".by", sender);
								}
							} else if (nw.getString(args[1] + b + "1" + r + "4"
									+ o, f) != null) {
								nw.set(args[1] + b + "1" + r + "4" + o, t);
								nw.set(args[1] + b + "1" + r + "4" + o + ".by",
										sender);
							}
						} else if (nw.getString(
								args[1] + b + "1" + r + "3" + o, f) != null) {
							nw.set(args[1] + b + "1" + r + "3" + o, t);
							nw.set(args[1] + b + "1" + r + "3" + o + ".by",
									sender);
						}
					} else if (nw.getString(args[1] + b + "1" + r + "2" + o, f) != null) {
						nw.set(args[1] + b + "1" + r + "2" + o, t);
						nw.set(args[1] + b + "1" + r + "2" + o + ".by", sender);
					} else if (nw.getString(args[1] + b + "1" + r + "1" + o, f) != null) {
						nw.set(args[1] + b + "1" + r + "1" + o, t);
						nw.set(args[1] + b + "1" + r + "1" + o + ".by", sender);
					}
				}

				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "No Such Hotel Found");
				sender.sendMessage(ChatColor.RED + "You tried to checkin to: "
						+ args[1]);
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("hotel generate")) {
			Location l = ((Player) sender).getLocation();
			sender.sendMessage(ChatColor.WHITE + "null");
			hg.generateCube((Player) sender, l, l, l);
			return true;
		}
		return false;
	}
}
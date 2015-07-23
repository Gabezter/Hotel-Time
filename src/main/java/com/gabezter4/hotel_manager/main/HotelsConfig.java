package com.gabezter4.hotel_manager.main;

/*
* Copyright (C) 2012
*
* Permission is hereby granted, free of charge, to any person obtaining a copy 
* of this software and associated documentation files (the "Software"), to deal 
* in the Software without restriction, including without limitation the rights 
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
* copies of the Software, and to permit persons to whom the Software is 
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS
* OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.IN NO EVENT SHALL THE 
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE 
* SOFTWARE.
*/
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
 
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
 
public class HotelsConfig {
 
    private final String fileName;
    private final JavaPlugin plugin;
    
    private File HotelFile;
    private FileConfiguration fileConfiguration;
 
    public HotelsConfig(JavaPlugin plugin, String fileName) {
        if (plugin == null)
            throw new IllegalArgumentException("plugin cannot be null");
        if (!plugin.isInitialized())
            throw new IllegalArgumentException("plugin must be initiaized");
        this.plugin = plugin;
        this.fileName = fileName;
        File dataFolder = plugin.getDataFolder();
        if (dataFolder == null)
            throw new IllegalStateException();
        this.HotelFile = new File(plugin.getDataFolder(), fileName);
    }
 
    public void reloadHotel() {        
        fileConfiguration = YamlConfiguration.loadConfiguration(HotelFile);
 
        // Look for defaults in the jar
        InputStream defConfigStream = plugin.getResource(fileName);
        if (defConfigStream != null) {
            YamlConfiguration defConfig = YamlConfiguration.loadConfiguration(defConfigStream);
            fileConfiguration.setDefaults(defConfig);
        }
    }
 
    public FileConfiguration getHotel() {
        if (fileConfiguration == null) {
            this.reloadHotel();
        }
        return fileConfiguration;
    }
 
    public void saveHotel() {
        if (fileConfiguration == null || HotelFile == null) {
            return;
        } else {
            try {
                getHotel().save(HotelFile);
            } catch (IOException ex) {
                plugin.getLogger().log(Level.SEVERE, "Could not save Hotel to " + HotelFile, ex);
            }
        }
    }
    
    public void saveDefaultHotel() {
        if (!HotelFile.exists()) {            
            this.plugin.saveResource(fileName, false);
        }
    }
 
}

package com.rdsguild.mods.proxies;

import java.io.File;

import com.rdsguild.mods.Config;
import com.rdsguild.mods.world.ModDimensions;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	//Config Instance
	public static Configuration config;
	
	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "vtweaked.cfg"));
		Config.readConfig();
		
		ModDimensions.init();
	}
	
	public void init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged()) {
			config.save();
		}
	}
}

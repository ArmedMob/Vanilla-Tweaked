package com.rdsguild.mods.proxies;

import java.io.File;

import com.rdsguild.mods.Config;
import com.rdsguild.mods.Main;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	//Config Instance
	public static Configuration config;	
	
	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "vtweaked.cfg"));
		Config.readConfig();	
	
		
	}
	
	public void init(FMLInitializationEvent e) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiProxy());
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged()) {
			config.save();
		}
	}	

	public void registerItemRenderer(Item item, int meta, String id) {
		// TODO Auto-generated method stub
		
	}
}

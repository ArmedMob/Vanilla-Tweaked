package com.rdsguild.mods;

import org.apache.logging.log4j.Level;

import com.rdsguild.mods.proxies.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

	// Config Categories
	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_DIMENSIONS = "dimensions";
	
	
	// The values below you can access elsewhere in your mod:
	public static boolean isThisAGoodTutorial =true;
	public static String yourRealName = "John";
	public static int dimensionId = 100;
	
	// Call this from CommonProxy.preInit(). It will create our config it if does not exist or read it if it does exist.
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			cfg.load();
			initGeneralConfig(cfg);	
			initDimensionConfig(cfg);
		} catch (Exception e1) {
			Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}
	
	private static void initGeneralConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General Configuration");
		// cfg.getBoolean() will get the value in the config if it is already specified there. If not it will create the value.
		isThisAGoodTutorial = cfg.getBoolean("goodTutorial", CATEGORY_GENERAL, isThisAGoodTutorial, "Set to false if you don't like this tutorial");
		yourRealName = cfg.getString("realName", CATEGORY_GENERAL, yourRealName, "Set your real name here");
	}
	
	private static void initDimensionConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_DIMENSIONS, "Dimension Configuration");
		dimensionId = cfg.getInt("dimensionId", CATEGORY_DIMENSIONS, dimensionId, -1000, 1000, "The Id to use for the dimension");
	}
}

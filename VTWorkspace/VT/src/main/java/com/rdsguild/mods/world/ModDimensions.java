package com.rdsguild.mods.world;

import com.rdsguild.mods.Config;
import com.rdsguild.mods.References;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {

	public static DimensionType testDimensionType;
	
	public static void init() {
		registerDimensionTypes();
		registerDimensions();
	}
	
	private static void registerDimensionTypes() {
		testDimensionType = DimensionType.register(References.MODID, "_test", Config.dimensionId, TestWorldProvider.class, false);
	}
	
	private static void registerDimensions() {
		DimensionManager.registerDimension(Config.dimensionId, testDimensionType);
	}
}

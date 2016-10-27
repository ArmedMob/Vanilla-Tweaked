package com.rdsguild.mods.world;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTMapGen {

	public static void registerMapGen() {
		
	}
	
	public static void registerWorldGenerators() {
		GameRegistry.registerWorldGenerator(new WorldGenOres(), 0);
	}
}

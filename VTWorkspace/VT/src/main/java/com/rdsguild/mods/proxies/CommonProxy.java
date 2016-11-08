package com.rdsguild.mods.proxies;

import com.rdsguild.mods.VTLootTables;
import com.rdsguild.mods.VTRecipes;
import com.rdsguild.mods.blocks.VTBlocks;
import com.rdsguild.mods.entities.CustomDataHandler;
import com.rdsguild.mods.items.VTItems;
import com.rdsguild.mods.world.VTWorldGen;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public abstract class CommonProxy {

	public void preInit() {
		//Registration Of Custom Data Handler MANA
		CustomDataHandler.register();
		
		VTBlocks.init();
		VTItems.init();	
		VTRecipes.init();
		GameRegistry.registerWorldGenerator(new VTWorldGen(), 3);
	}
	
	public void init() {
		
		//Used To Register The VTLootTables.java class
		MinecraftForge.EVENT_BUS.register(new VTLootTables());
	}
	
	public void postInit() {
		
	}
	
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);
	
	abstract public boolean isDedicatedServer();
	
	public void registerItemRenderer(Item item, int meta, String id) {		
		
	}
}

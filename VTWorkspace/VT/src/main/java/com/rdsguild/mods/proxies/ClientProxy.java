package com.rdsguild.mods.proxies;

import com.rdsguild.mods.References;
import com.rdsguild.mods.blocks.VTBlocks;
import com.rdsguild.mods.blocks.ores.VTOreBlocks;
import com.rdsguild.mods.items.VTItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(References.MODID + ":" + id, "inventory"));
	}
	
	@Override 
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		
		MinecraftForge.EVENT_BUS.register(this);
				
		VTItems.init();
		VTBlocks.init();
		VTOreBlocks.init();		
	}
}

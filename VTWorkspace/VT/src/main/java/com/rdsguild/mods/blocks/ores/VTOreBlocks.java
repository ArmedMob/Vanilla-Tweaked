package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.blocks.BaseBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTOreBlocks {

	public static CopperOreBlock oreCopper;
	
	public static void init() {
		oreCopper = register(new CopperOreBlock("oreCopper").setCreativeTab(Main.instance.tab));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if (block instanceof BaseBlock) {
			((BaseBlock)block).registerItemModel(itemBlock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}

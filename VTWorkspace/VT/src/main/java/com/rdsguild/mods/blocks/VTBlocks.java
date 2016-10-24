package com.rdsguild.mods.blocks;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTBlocks {

	public static BaseBlock blockCopper;
	
	public static void init() {
		blockCopper = new BaseBlock(VTItems.Copper, "blockCopper").setCreativeTab(Main.instance.tab);
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

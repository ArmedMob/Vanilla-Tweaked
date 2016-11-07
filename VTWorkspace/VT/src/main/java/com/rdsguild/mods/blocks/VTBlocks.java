package com.rdsguild.mods.blocks;

import com.rdsguild.mods.items.IItemModelProvider;
import com.rdsguild.mods.items.IItemOreDict;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTBlocks {

	public static BlockOre oreCopper;
	public static BlockOre oreT2oopy;
	public static BlockBase blockT2oopy;
	
	public static void init() {
		
		oreCopper = register(new BlockOre("oreCopper", "oreCopper").setCreativeTab(CreativeTabs.MATERIALS));
		oreT2oopy = register(new BlockOre("oreT2oopy", "oreT2oopy").setCreativeTab(CreativeTabs.MATERIALS));
		blockT2oopy = register(new BlockBase(Material.IRON, "blockT2oopy").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		
		GameRegistry.register(block);
		
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);
		}
		
		if (block instanceof IItemModelProvider) {			
			((IItemModelProvider)block).registerItemModel(itemBlock);
		}
		
		if (block instanceof IItemOreDict) {
			((IItemOreDict)block).initOreDict();
		}
		
		if (itemBlock instanceof IItemOreDict) {
			((IItemOreDict)itemBlock).initOreDict();
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}

package com.rdsguild.mods.blocks;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.ItemModelProvider;
import com.rdsguild.mods.items.ItemOreDict;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTBlocks {

	public static BaseBlock blockBoron;	
	public static BaseBlock blockColumium;
	public static BaseBlock blockErbium;
	public static BaseBlock blockEuropium;
	public static BaseBlock blockLanthanum;	
	public static BaseBlock blockLithium;
	public static BaseBlock blockMolybdenum;
	public static BaseBlock blockNeodymium;	
	public static BaseBlock blockNickelSilver;
	public static BaseBlock blockSamarium;	
	public static BaseBlock blockTantalum;
	public static BaseBlock blockTitanium;
	public static BaseBlock blockTriMetal;	
	
	public static void init() {
		blockBoron = register(new BaseBlock(VTItems.Boron, "blockBoron").setCreativeTab(Main.instance.tab));
		blockColumium = register(new BaseBlock(VTItems.Columium, "blockColumium").setCreativeTab(Main.instance.tab));
		blockErbium = register(new BaseBlock(VTItems.Erbium, "blockErbium").setCreativeTab(Main.instance.tab));
		blockEuropium = register(new BaseBlock(VTItems.Europium, "blockEuropium").setCreativeTab(Main.instance.tab));
		blockLanthanum = register(new BaseBlock(VTItems.Lanthanum, "blockLanthanum").setCreativeTab(Main.instance.tab));
		blockLithium = register(new BaseBlock(VTItems.Lithium, "blockLithium").setCreativeTab(Main.instance.tab));
		blockMolybdenum = register(new BaseBlock(VTItems.Molybdenum, "blockMolybdenum").setCreativeTab(Main.instance.tab));
		blockNeodymium = register(new BaseBlock(VTItems.Neodymium, "blockNeodymium").setCreativeTab(Main.instance.tab));
		blockNickelSilver = register(new BaseBlock(VTItems.NickelSilver, "blockNickelSilver").setCreativeTab(Main.instance.tab));
		blockSamarium = register(new BaseBlock(VTItems.Samarium, "blockSamarium").setCreativeTab(Main.instance.tab));
		blockTantalum = register(new BaseBlock(VTItems.Tantalum, "blockTantalum").setCreativeTab(Main.instance.tab));
		blockTitanium = register(new BaseBlock(VTItems.Titanium, "blockTitanium").setCreativeTab(Main.instance.tab));
		blockTriMetal = register(new BaseBlock(VTItems.TriMetal, "blockTriMetal").setCreativeTab(Main.instance.tab));		
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if (block instanceof ItemModelProvider) {
			((ItemModelProvider)block).registerItemModel(itemBlock);
		}
		if (block instanceof ItemOreDict) {
			((ItemOreDict)block).initOreDict();
		}
		if (itemBlock instanceof ItemOreDict) {
			((ItemOreDict)itemBlock).initOreDict();
		}
		
		return block;
	}	
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}

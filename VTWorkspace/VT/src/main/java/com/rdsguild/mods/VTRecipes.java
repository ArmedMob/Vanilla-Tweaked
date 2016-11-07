package com.rdsguild.mods;

import com.rdsguild.mods.blocks.VTBlocks;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class VTRecipes {

	public static void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(VTItems.bootsT2oopy, "   ", "XGX", "X X", 'X', "ingotT2oopy", 'G', "gemT2oopy"));
		GameRegistry.addRecipe(new ShapedOreRecipe(VTItems.leggingsT2oopy, "XXX", "XGX", "X X", 'X', "ingotT2oopy", 'G', "gemT2oopy"));
		GameRegistry.addRecipe(new ShapedOreRecipe(VTItems.chestplateT2oopy, "X X", "XGX", "XXX", 'X', "ingotT2oopy", 'G', "gemT2oopy"));
		GameRegistry.addRecipe(new ShapedOreRecipe(VTItems.helmetT2oopy, "XXX", "XGX", "   ", 'X', "ingotT2oopy", 'G', "gemT2oopy"));
		GameRegistry.addRecipe(new ShapedOreRecipe(VTBlocks.blockT2oopy, "XXX", "XXX", "XXX", 'X', "gemT2oopy"));
		GameRegistry.addRecipe(new ShapedOreRecipe(VTItems.gemT2oopy, " X ", "X X", " X ", 'X', "ingotT2oopy"));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotT2oopy, 4),  VTItems.gemT2oopy);
		GameRegistry.addSmelting(VTBlocks.oreT2oopy, new ItemStack(VTItems.ingotT2oopy, 2), 0.1235f);
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.gemT2oopy, 9), VTBlocks.blockT2oopy);
		
	}
}

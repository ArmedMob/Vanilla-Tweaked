package com.rdsguild.mods;

import com.rdsguild.mods.blocks.VTBlocks;
import com.rdsguild.mods.blocks.ores.VTOreBlocks;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTRecipies {

	public static void init() {
		
		// Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetBoron, 2), new ItemStack(VTItems.ingotBoron));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotBoron), new ItemStack(VTItems.nuggetBoron), new ItemStack(VTItems.nuggetBoron));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotBoron, 9), new ItemStack(VTBlocks.blockBoron));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetColumium, 2), new ItemStack(VTItems.ingotColumium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotColumium), new ItemStack(VTItems.nuggetColumium), new ItemStack(VTItems.nuggetColumium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotColumium, 9), new ItemStack(VTBlocks.blockColumium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetErbium, 2), new ItemStack(VTItems.ingotErbium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotErbium), new ItemStack(VTItems.nuggetErbium), new ItemStack(VTItems.nuggetErbium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotErbium, 9), new ItemStack(VTBlocks.blockErbium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetEuropium, 2), new ItemStack(VTItems.ingotEuropium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotEuropium), new ItemStack(VTItems.nuggetEuropium), new ItemStack(VTItems.nuggetEuropium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotEuropium, 9), new ItemStack(VTBlocks.blockEuropium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetLanthanum, 2), new ItemStack(VTItems.ingotLanthanum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotLanthanum), new ItemStack(VTItems.nuggetLanthanum), new ItemStack(VTItems.nuggetLanthanum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotLanthanum, 9), new ItemStack(VTBlocks.blockLanthanum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetLithium, 2), new ItemStack(VTItems.ingotLithium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotLithium), new ItemStack(VTItems.nuggetLithium), new ItemStack(VTItems.nuggetLithium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotLithium, 9), new ItemStack(VTBlocks.blockLithium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetMolybdenum, 2), new ItemStack(VTItems.ingotMolybdenum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotMolybdenum), new ItemStack(VTItems.nuggetMolybdenum), new ItemStack(VTItems.nuggetMolybdenum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotMolybdenum, 9), new ItemStack(VTBlocks.blockMolybdenum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetNeodymium, 2), new ItemStack(VTItems.ingotNeodymium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotNeodymium), new ItemStack(VTItems.nuggetNeodymium), new ItemStack(VTItems.nuggetNeodymium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotNeodymium, 9), new ItemStack(VTBlocks.blockNeodymium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetNickelSilver, 2), new ItemStack(VTItems.ingotNickelSilver));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotNickelSilver), new ItemStack(VTItems.nuggetNickelSilver), new ItemStack(VTItems.nuggetNickelSilver));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotNickelSilver, 9), new ItemStack(VTBlocks.blockNickelSilver));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetSamarium, 2), new ItemStack(VTItems.ingotSamarium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotSamarium), new ItemStack(VTItems.nuggetSamarium), new ItemStack(VTItems.nuggetSamarium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotSamarium, 9), new ItemStack(VTBlocks.blockSamarium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetTantalum, 2), new ItemStack(VTItems.ingotTantalum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotTantalum), new ItemStack(VTItems.nuggetTantalum), new ItemStack(VTItems.nuggetTantalum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotTantalum, 9), new ItemStack(VTBlocks.blockTantalum));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetTitanium, 2), new ItemStack(VTItems.ingotTitanium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotTitanium), new ItemStack(VTItems.nuggetTitanium), new ItemStack(VTItems.nuggetTitanium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotTitanium, 9), new ItemStack(VTBlocks.blockTitanium));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.nuggetTriMetal, 2), new ItemStack(VTItems.ingotTriMetal));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotTriMetal), new ItemStack(VTItems.nuggetTriMetal), new ItemStack(VTItems.nuggetTriMetal));
		GameRegistry.addShapelessRecipe(new ItemStack(VTItems.ingotTriMetal, 9), new ItemStack(VTBlocks.blockTriMetal));
		
		
		// Shaped
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockBoron), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotBoron));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockColumium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotColumium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockErbium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotErbium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockEuropium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotEuropium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockLanthanum), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotLanthanum));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockLithium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotLithium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockMolybdenum), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotMolybdenum));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockNeodymium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.nuggetNeodymium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockNickelSilver), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotNickelSilver));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockSamarium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotSamarium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockTantalum), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotTantalum));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockTitanium), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotTitanium));
		GameRegistry.addShapedRecipe(new ItemStack(VTBlocks.blockTriMetal), "XXX", "XXX", "XXX", 'X', new ItemStack(VTItems.ingotTriMetal));
		
		// Smelting
		GameRegistry.addSmelting(VTOreBlocks.oreBoron, new ItemStack(VTItems.ingotBoron), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreColumium, new ItemStack(VTItems.ingotColumium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreErbium, new ItemStack(VTItems.ingotErbium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreEuropium, new ItemStack(VTItems.ingotEuropium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreLanthanum, new ItemStack(VTItems.ingotLanthanum), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreLithium, new ItemStack(VTItems.ingotLithium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreMolybdenum, new ItemStack(VTItems.ingotMolybdenum), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreNeodymium, new ItemStack(VTItems.ingotNeodymium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreNickelSilver, new ItemStack(VTItems.ingotNickelSilver), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreSamarium, new ItemStack(VTItems.ingotSamarium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreTantalum, new ItemStack(VTItems.ingotTantalum), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreTitanium, new ItemStack(VTItems.ingotTitanium), 0.5F);
		GameRegistry.addSmelting(VTOreBlocks.oreTriMetal, new ItemStack(VTItems.ingotTriMetal), 0.5F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustBoron), new ItemStack(VTItems.ingotBoron), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustColumium), new ItemStack(VTItems.ingotColumium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustErbium), new ItemStack(VTItems.ingotErbium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustEuropium), new ItemStack(VTItems.ingotEuropium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustLanthanum), new ItemStack(VTItems.ingotLanthanum), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustLithium), new ItemStack(VTItems.ingotLithium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustMolybdenum), new ItemStack(VTItems.ingotMolybdenum), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustNeodymium), new ItemStack(VTItems.ingotNeodymium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustNickelSilver), new ItemStack(VTItems.ingotNickelSilver), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustSamarium), new ItemStack(VTItems.ingotSamarium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustTantalum), new ItemStack(VTItems.ingotTantalum), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustTitanium), new ItemStack(VTItems.ingotTitanium), 0.025F);
		GameRegistry.addSmelting(new ItemStack(VTItems.dustTriMetal), new ItemStack(VTItems.ingotTriMetal), 0.025F);
	}
}

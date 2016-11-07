package com.rdsguild.mods.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTItems {

	
	public static ItemOre ingotCopper;
	public static ItemOre ingotTin;
	public static ItemOre ingotAluminum;
	public static ItemOre ingotAluminumBrass;
	public static ItemOre ingotCobalt;
	public static ItemOre ingotAlumite;
	public static ItemOre ingotAridite;
	public static ItemOre ingotGlowstone;
	public static ItemOre ingotDiamond;
	public static ItemOre ingotZinc;
	public static ItemOre ingotT2oopy;
	public static ItemOre gemT2oopy;
	public static ItemBase bootsT2oopy;
	public static ItemBase leggingsT2oopy;
	public static ItemBase chestplateT2oopy;
	public static ItemBase helmetT2oopy;
	
	public static void init() {
		
		ingotAluminum = (ItemOre) register(new ItemOre("ingotAluminum", "ingotAluminum").setCreativeTab(CreativeTabs.MATERIALS));
		ingotAluminumBrass = (ItemOre) register(new ItemOre("ingotAluminumBrass", "ingotAluminumBrass").setCreativeTab(CreativeTabs.MATERIALS));
		ingotAlumite = (ItemOre) register(new ItemOre("ingotAlumite", "ingotAlumite").setCreativeTab(CreativeTabs.MATERIALS));
		ingotAridite = (ItemOre) register(new ItemOre("ingotAridite", "ingotAridite").setCreativeTab(CreativeTabs.MATERIALS));
		ingotCobalt = (ItemOre) register(new ItemOre("ingotCobalt", "ingotCobalt").setCreativeTab(CreativeTabs.MATERIALS));
		ingotCopper = (ItemOre) register(new ItemOre("ingotCopper", "ingotCopper").setCreativeTab(CreativeTabs.MATERIALS));
		ingotDiamond = (ItemOre) register(new ItemOre("ingotDiamond", "ingotDiamond").setCreativeTab(CreativeTabs.MATERIALS));
		ingotGlowstone = (ItemOre) register(new ItemOre("ingotGlowstone", "ingotGlowstone").setCreativeTab(CreativeTabs.MATERIALS));		
		ingotTin = (ItemOre) register(new ItemOre("ingotTin", "ingotTin").setCreativeTab(CreativeTabs.MATERIALS));	
		ingotZinc = (ItemOre) register(new ItemOre("ingotZinc", "ingotZinc").setCreativeTab(CreativeTabs.MATERIALS));
		
		//t2oopy's magical stuff
		ingotT2oopy = (ItemOre) register(new ItemOre("ingotT2oopy", "ingotT2oopy").setCreativeTab(CreativeTabs.MATERIALS));
		gemT2oopy = (ItemOre) register(new ItemOre("gemT2oopy", "gemT2oopy").setCreativeTab(CreativeTabs.MATERIALS));
		bootsT2oopy = (ItemBase) register(new ItemBase("bootsT2oopy").setCreativeTab(CreativeTabs.COMBAT));
		leggingsT2oopy = (ItemBase) register(new ItemBase("leggingsT2oopy").setCreativeTab(CreativeTabs.COMBAT));
		chestplateT2oopy = (ItemBase) register(new ItemBase("chestplateT2oopy").setCreativeTab(CreativeTabs.COMBAT));
		helmetT2oopy = (ItemBase) register(new ItemBase("helmetT2oopy").setCreativeTab(CreativeTabs.COMBAT));
		
	}
	
	private static <T extends Item> T register(T item) {
		
		GameRegistry.register(item);
		
		if (item instanceof IItemModelProvider) {
			((IItemModelProvider)item).registerItemModel(item);
		}
		
		if (item instanceof IItemOreDict) {
			((IItemOreDict)item).initOreDict();
		}
		
		return item;
	}
}

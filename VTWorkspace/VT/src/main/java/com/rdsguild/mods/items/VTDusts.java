package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTDusts {

	public static BaseItem dustErbium;
	public static BaseItem dustEuropium;
	public static BaseItem dustLanthanum;
	public static BaseItem dustNeodymium;
	public static BaseItem dustSamarium;	
	public static BaseItem dustTitanium;	
	public static BaseItem dustTantalum;
	public static BaseItem dustColumium;
	public static BaseItem dustMolybdenum;	
	public static BaseItem dustTriMetal;
	public static BaseItem dustNickelSilver;	
	public static BaseItem dustLithium;	
	public static BaseItem dustBoron;
	
	public static void init() {
		
		dustErbium = register(new BaseItem("dustErbium").setCreativeTab(Main.instance.tab));
		dustEuropium = register(new BaseItem("dustEuropium").setCreativeTab(Main.instance.tab));
		dustLanthanum = register(new BaseItem("dustLanthanum").setCreativeTab(Main.instance.tab));
		dustNeodymium = register(new BaseItem("dustNeodymium").setCreativeTab(Main.instance.tab));
		dustSamarium = register(new BaseItem("dustSamarium").setCreativeTab(Main.instance.tab));		
		dustTitanium = register(new BaseItem("dustTitanium").setCreativeTab(Main.instance.tab));
		dustTantalum = register(new BaseItem("dustTantalum").setCreativeTab(Main.instance.tab));
		dustColumium = register(new BaseItem("dustColumium").setCreativeTab(Main.instance.tab));
		dustMolybdenum = register(new BaseItem("dustMolybdenum").setCreativeTab(Main.instance.tab));		
		dustTriMetal = register(new BaseItem("dustTriMetal").setCreativeTab(Main.instance.tab));
		dustNickelSilver = register(new BaseItem("dustNickelSilver").setCreativeTab(Main.instance.tab));		
		dustLithium = register(new BaseItem("dustLithium").setCreativeTab(Main.instance.tab));		
		dustBoron = register(new BaseItem("dustBoron").setCreativeTab(Main.instance.tab));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}
		
		return item;
	}
}

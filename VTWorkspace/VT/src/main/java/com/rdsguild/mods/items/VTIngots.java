package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTIngots {

	public static BaseItem ingotErbium;
	public static BaseItem ingotEuropium;
	public static BaseItem ingotLanthanum;
	public static BaseItem ingotNeodymium;
	public static BaseItem ingotSamarium;	
	public static BaseItem ingotTitanium;	
	public static BaseItem ingotTantalum;
	public static BaseItem ingotColumium;
	public static BaseItem ingotMolybdenum;	
	public static BaseItem ingotTriMetal;
	public static BaseItem ingotNickelSilver;	
	public static BaseItem ingotLithium;	
	public static BaseItem ingotBoron;
	
	public static void init() {
		
		ingotErbium = register(new BaseItem("ingotErbium").setCreativeTab(Main.instance.tab));
		ingotEuropium = register(new BaseItem("ingotEuropium").setCreativeTab(Main.instance.tab));
		ingotLanthanum = register(new BaseItem("ingotLanthanum").setCreativeTab(Main.instance.tab));
		ingotNeodymium = register(new BaseItem("ingotNeodymium").setCreativeTab(Main.instance.tab));
		ingotSamarium = register(new BaseItem("ingotSamarium").setCreativeTab(Main.instance.tab));		
		ingotTitanium = register(new BaseItem("ingotTitanium").setCreativeTab(Main.instance.tab));
		ingotTantalum = register(new BaseItem("ingotTantalum").setCreativeTab(Main.instance.tab));
		ingotColumium = register(new BaseItem("ingotColumium").setCreativeTab(Main.instance.tab));
		ingotMolybdenum = register(new BaseItem("ingotMolybdenum").setCreativeTab(Main.instance.tab));		
		ingotTriMetal = register(new BaseItem("ingotTriMetal").setCreativeTab(Main.instance.tab));
		ingotNickelSilver = register(new BaseItem("ingotNickelSilver").setCreativeTab(Main.instance.tab));		
		ingotLithium = register(new BaseItem("ingotLithium").setCreativeTab(Main.instance.tab));		
		ingotBoron = register(new BaseItem("ingotBoron").setCreativeTab(Main.instance.tab));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}
		
		return item;
	}
}

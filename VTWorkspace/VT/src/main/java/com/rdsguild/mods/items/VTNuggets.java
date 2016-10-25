package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTNuggets {

	public static BaseItem nuggetErbium;
	public static BaseItem nuggetEuropium;
	public static BaseItem nuggetLanthanum;
	public static BaseItem nuggetNeodymium;
	public static BaseItem nuggetSamarium;	
	public static BaseItem nuggetTitanium;	
	public static BaseItem nuggetTantalum;
	public static BaseItem nuggetColumium;
	public static BaseItem nuggetMolybdenum;	
	public static BaseItem nuggetTriMetal;
	public static BaseItem nuggetNickelSilver;	
	public static BaseItem nuggetLithium;	
	public static BaseItem nuggetBoron;
	
	public static void init() {
		
		nuggetErbium = register(new BaseItem("nuggetErbium").setCreativeTab(Main.instance.tab));
		nuggetEuropium = register(new BaseItem("nuggetEuropium").setCreativeTab(Main.instance.tab));
		nuggetLanthanum = register(new BaseItem("nuggetLanthanum").setCreativeTab(Main.instance.tab));
		nuggetNeodymium = register(new BaseItem("nuggetNeodymium").setCreativeTab(Main.instance.tab));
		nuggetSamarium = register(new BaseItem("nuggetSamarium").setCreativeTab(Main.instance.tab));		
		nuggetTitanium = register(new BaseItem("nuggetTitanium").setCreativeTab(Main.instance.tab));
		nuggetTantalum = register(new BaseItem("nuggetTantalum").setCreativeTab(Main.instance.tab));
		nuggetColumium = register(new BaseItem("nuggetColumium").setCreativeTab(Main.instance.tab));
		nuggetMolybdenum = register(new BaseItem("nuggetMolybdenum").setCreativeTab(Main.instance.tab));		
		nuggetTriMetal = register(new BaseItem("nuggetTriMetal").setCreativeTab(Main.instance.tab));
		nuggetNickelSilver = register(new BaseItem("nuggetNickelSilver").setCreativeTab(Main.instance.tab));		
		nuggetLithium = register(new BaseItem("nuggetLithium").setCreativeTab(Main.instance.tab));		
		nuggetBoron = register(new BaseItem("nuggetBoron").setCreativeTab(Main.instance.tab));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}
		
		return item;
	}
}

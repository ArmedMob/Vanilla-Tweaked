package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.BaseItem;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTSword extends ItemSword {

	public VTSword(ToolMaterial material, String name) {		
		super(material);
		this.canRepair = true;
		this.hasSubtypes = true;
		setMaxStackSize(1);
		setRegistryName(name);
		setUnlocalizedName(name);		
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, this.getUnlocalizedName());
	}
	
	@Override
	public VTSword setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	public static VTSword swordBoron;
	public static VTSword swordColumium;
	public static VTSword swordErbium;
	public static VTSword swordEuropium;
	public static VTSword swordLanthanum;
	public static VTSword swordLithium;
	public static VTSword swordMolybdenum;
	public static VTSword swordNeodymium;
	public static VTSword swordNickelSilver;
	public static VTSword swordSamarium;
	public static VTSword swordTantalum;
	public static VTSword swordTitanium;
	public static VTSword swordTriMetal;
	
	public static void init() {
		swordBoron = register(new VTSword(VTItems.toolBoron, "swordBoron").setCreativeTab(Main.instance.tab));
		swordColumium = register(new VTSword(VTItems.toolColumium, "swordColumium").setCreativeTab(Main.instance.tab));
		swordErbium = register(new VTSword(VTItems.toolErbium, "swordErbium").setCreativeTab(Main.instance.tab));
		swordEuropium = register(new VTSword(VTItems.toolEuropium, "swordEuropium").setCreativeTab(Main.instance.tab));
		swordLanthanum = register(new VTSword(VTItems.toolLanthanum, "swordLanthanum").setCreativeTab(Main.instance.tab));
		swordLithium = register(new VTSword(VTItems.toolLithium, "swordLithium").setCreativeTab(Main.instance.tab));
		swordMolybdenum = register(new VTSword(VTItems.toolMolybdenum, "swordMolybdenum").setCreativeTab(Main.instance.tab));
		swordNeodymium = register(new VTSword(VTItems.toolNeodymium, "swordNeodymium").setCreativeTab(Main.instance.tab));
		swordNickelSilver = register(new VTSword(VTItems.toolNickelSilver, "swordNickelSilver").setCreativeTab(Main.instance.tab));
		swordSamarium = register(new VTSword(VTItems.toolSamarium, "swordSamarium").setCreativeTab(Main.instance.tab));
		swordTantalum = register(new VTSword(VTItems.toolTantalum, "swordTantalum").setCreativeTab(Main.instance.tab));
		swordTitanium = register(new VTSword(VTItems.toolTitanium, "swordTitanium").setCreativeTab(Main.instance.tab));
		swordTriMetal = register(new VTSword(VTItems.toolTriMetal, "swordTriMetal").setCreativeTab(Main.instance.tab));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}
		
		return item;
	}
}

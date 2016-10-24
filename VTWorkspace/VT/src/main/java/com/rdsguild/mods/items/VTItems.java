package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTItems {

	public static BaseItem ingotCopper;
	public static BaseItem ingotTin;
	public static BaseItem ingotAluminum;
	public static BaseItem ingotErbium;
	public static BaseItem ingotEuropium;
	public static BaseItem ingotLanthanum;
	public static BaseItem ingotNeodymium;
	public static BaseItem ingotSamarium;
	public static BaseItem ingotBronze;
	public static BaseItem ingotSteel;
	public static BaseItem ingotCobalt;
	public static BaseItem ingotTitanium;
	public static BaseItem ingotNickel;
	public static BaseItem ingotTantalum;
	public static BaseItem ingotColumium;
	public static BaseItem ingotMolybdenum;
	public static BaseItem ingotSilver;
	public static BaseItem ingotTriMetal;
	public static BaseItem ingotNickelSilver;
	public static BaseItem ingotZinc;
	public static BaseItem ingotLithium;
	public static BaseItem ingotLead;
	public static BaseItem ingotSilicon;
	public static BaseItem ingotBoron;
	
	@SuppressWarnings("unused")
	private boolean requiresNoTool = true;
	protected VTItems setRequiresTool()
    {
        this.requiresNoTool = false;
        return this;
    }
	public static Material Copper = (new Material(MapColor.IRON));
	
	public static void init() {
		
		ingotCopper = register(new BaseItem("ingotCopper")).setCreativeTab(Main.instance.tab);
		ingotTin = register(new BaseItem("ingotTin").setCreativeTab(Main.instance.tab));
		ingotAluminum = register(new BaseItem("ingotAluminum").setCreativeTab(Main.instance.tab));
		ingotErbium = register(new BaseItem("ingotErbium").setCreativeTab(Main.instance.tab));
		ingotEuropium = register(new BaseItem("ingotEuropium").setCreativeTab(Main.instance.tab));
		ingotLanthanum = register(new BaseItem("ingotLanthanum").setCreativeTab(Main.instance.tab));
		ingotNeodymium = register(new BaseItem("ingotNeodymium").setCreativeTab(Main.instance.tab));
		ingotSamarium = register(new BaseItem("ingotSamarium").setCreativeTab(Main.instance.tab));
		ingotBronze = register(new BaseItem("ingotBronze").setCreativeTab(Main.instance.tab));
		ingotSteel = register(new BaseItem("ingotSteel").setCreativeTab(Main.instance.tab));
		ingotCobalt = register(new BaseItem("ingotCobalt").setCreativeTab(Main.instance.tab));
		ingotTitanium = register(new BaseItem("ingotTitanium").setCreativeTab(Main.instance.tab));
		ingotTantalum = register(new BaseItem("ingotTantalum").setCreativeTab(Main.instance.tab));
		ingotColumium = register(new BaseItem("ingotColumium").setCreativeTab(Main.instance.tab));
		ingotMolybdenum = register(new BaseItem("ingotMolybdenum").setCreativeTab(Main.instance.tab));
		ingotSilver = register(new BaseItem("ingotSilver").setCreativeTab(Main.instance.tab));
		ingotTriMetal = register(new BaseItem("ingotTriMetal").setCreativeTab(Main.instance.tab));
		ingotNickelSilver = register(new BaseItem("ingotNickelSilver").setCreativeTab(Main.instance.tab));
		ingotZinc = register(new BaseItem("ingotZinc").setCreativeTab(Main.instance.tab));
		ingotLithium = register(new BaseItem("ingotLithium").setCreativeTab(Main.instance.tab));
		ingotLead = register(new BaseItem("ingotLead").setCreativeTab(Main.instance.tab));
		ingotSilicon = register(new BaseItem("ingotSilicon").setCreativeTab(Main.instance.tab));
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

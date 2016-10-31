package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.References;
import com.rdsguild.mods.items.tools.VTAxe;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(References.MODID)
public class VTItems {	
		
	// Materials
	public static Material Erbium = (new Material(MapColor.IRON));
	public static Material Europium = (new Material(MapColor.IRON));
	public static Material Lanthanum = (new Material(MapColor.IRON));
	public static Material Neodymium = (new Material(MapColor.IRON));
	public static Material Samarium = (new Material(MapColor.IRON));	
	public static Material Titanium = (new Material(MapColor.IRON));
	public static Material Columium = (new Material(MapColor.IRON));
	public static Material Molybdenum = (new Material(MapColor.IRON));	
	public static Material TriMetal = (new Material(MapColor.IRON));
	public static Material NickelSilver = (new Material(MapColor.IRON));	
	public static Material Lithium = (new Material(MapColor.IRON));	
	public static Material Boron = (new Material(MapColor.IRON));
	public static Material Tantalum = (new Material(MapColor.IRON));
	
	// Tool Materials
	public static class ToolMaterials {
		public static final ToolMaterial toolErbium = EnumHelper.addToolMaterial("toolErbium", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolEuropium = EnumHelper.addToolMaterial("toolEuropium", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolLanthanum = EnumHelper.addToolMaterial("toolLanthanum", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolNeodymium = EnumHelper.addToolMaterial("toolNeodymium", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolSamarium = EnumHelper.addToolMaterial("toolSamarium", 3, 1500, 15, 2500, 30);	
		public static final ToolMaterial toolTitanium = EnumHelper.addToolMaterial("toolTitanium", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolColumium = EnumHelper.addToolMaterial("toolColumium", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolMolybdenum = EnumHelper.addToolMaterial("toolMolybdenum", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolTriMetal = EnumHelper.addToolMaterial("toolTriMetal", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolNickelSilver = EnumHelper.addToolMaterial("toolNickelSilver", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolLithium = EnumHelper.addToolMaterial("toolLithium", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolBoron = EnumHelper.addToolMaterial("toolBoron", 3, 1500, 15, 2500, 30);
		public static final ToolMaterial toolTantalum = EnumHelper.addToolMaterial("toolTantalum", 3, 1500, 15, 2500, 30);
	}
	
	// Armor Materials
	public static ArmorMaterial armorErbium = EnumHelper.addArmorMaterial("armorErbium", "armorErbium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorEuropium = EnumHelper.addArmorMaterial("armorEuropium", "armorEuropium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorLanthanum = EnumHelper.addArmorMaterial("armorLanthanum", "armorLanthanum", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorNeodymium = EnumHelper.addArmorMaterial("armorNeodymium", "armorNeodymium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorSamarium = EnumHelper.addArmorMaterial("armorSamarium", "armorSamarium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);	
	public static ArmorMaterial armorTitanium = EnumHelper.addArmorMaterial("armorTitanium", "armorTitanium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorColumium = EnumHelper.addArmorMaterial("armorColumium", "armorColumium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorMolybdenum = EnumHelper.addArmorMaterial("armorMolybdenum", "armorMolybdenum", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorTriMetal = EnumHelper.addArmorMaterial("armorTriMetal", "armorTriMetal", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorNickelSilver = EnumHelper.addArmorMaterial("armorNickelSilver", "armorNickelSilver", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);	
	public static ArmorMaterial armorLithium = EnumHelper.addArmorMaterial("armorLithium", "armorLithium", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorBoron = EnumHelper.addArmorMaterial("armorBoron", "armorBoron", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	public static ArmorMaterial armorTantalum = EnumHelper.addArmorMaterial("armorTantalum", "armorTantalum", 1500, new int[]{2, 5, 6, 2} , 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 10.0F);
	
	// VTIngots
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
	
	// VTDusts
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
	
	// VTNuggets
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
	
	// Axes
	public static VTAxe axeBoron;
	
	public static void init() {			
		//ToolMaterial
		ToolMaterials.toolBoron.setRepairItem(new ItemStack(VTItems.ingotBoron));
		ToolMaterials.toolColumium.setRepairItem(new ItemStack(VTItems.ingotColumium));
		ToolMaterials.toolErbium.setRepairItem(new ItemStack(VTItems.ingotErbium));
		ToolMaterials.toolEuropium.setRepairItem(new ItemStack(VTItems.ingotEuropium));
		ToolMaterials.toolLanthanum.setRepairItem(new ItemStack(VTItems.ingotLanthanum));
		ToolMaterials.toolLithium.setRepairItem(new ItemStack(VTItems.ingotLithium));
		ToolMaterials.toolMolybdenum.setRepairItem(new ItemStack(VTItems.ingotMolybdenum));
		ToolMaterials.toolNeodymium.setRepairItem(new ItemStack(VTItems.ingotNeodymium));
		ToolMaterials.toolNickelSilver.setRepairItem(new ItemStack(VTItems.ingotNickelSilver));
		ToolMaterials.toolSamarium.setRepairItem(new ItemStack(VTItems.ingotSamarium));
		ToolMaterials.toolTantalum.setRepairItem(new ItemStack(VTItems.ingotTantalum));
		ToolMaterials.toolTitanium.setRepairItem(new ItemStack(VTItems.ingotTitanium));
		ToolMaterials.toolTriMetal.setRepairItem(new ItemStack(VTItems.ingotTriMetal));
		
		// VTIngots
		ingotErbium = register(new BaseItem("ingotErbium", "ingotErbium").setCreativeTab(Main.instance.tab));
		ingotEuropium = register(new BaseItem("ingotEuropium", "ingotEuropium").setCreativeTab(Main.instance.tab));
		ingotLanthanum = register(new BaseItem("ingotLanthanum", "ingotLanthanum").setCreativeTab(Main.instance.tab));
		ingotNeodymium = register(new BaseItem("ingotNeodymium", "ingotNeodymium").setCreativeTab(Main.instance.tab));
		ingotSamarium = register(new BaseItem("ingotSamarium", "ingotSamarium").setCreativeTab(Main.instance.tab));		
		ingotTitanium = register(new BaseItem("ingotTitanium", "ingotTitanium").setCreativeTab(Main.instance.tab));
		ingotTantalum = register(new BaseItem("ingotTantalum", "ingotTantalum").setCreativeTab(Main.instance.tab));
		ingotColumium = register(new BaseItem("ingotColumium", "ingotColumium").setCreativeTab(Main.instance.tab));
		ingotMolybdenum = register(new BaseItem("ingotMolybdenum", "ingotMalybdenum").setCreativeTab(Main.instance.tab));		
		ingotTriMetal = register(new BaseItem("ingotTriMetal", "ingotTriMetal").setCreativeTab(Main.instance.tab));
		ingotNickelSilver = register(new BaseItem("ingotNickelSilver", "ingotNickelSilver").setCreativeTab(Main.instance.tab));		
		ingotLithium = register(new BaseItem("ingotLithium", "ingotLithium").setCreativeTab(Main.instance.tab));		
		ingotBoron = register(new BaseItem("ingotBoron", "ingotBoron").setCreativeTab(Main.instance.tab));
		
		// VTDusts
		dustErbium = register(new BaseItem("dustErbium", "dustErbium").setCreativeTab(Main.instance.tab));
		dustEuropium = register(new BaseItem("dustEuropium", "dustEuropium").setCreativeTab(Main.instance.tab));
		dustLanthanum = register(new BaseItem("dustLanthanum", "dustLanthanum").setCreativeTab(Main.instance.tab));
		dustNeodymium = register(new BaseItem("dustNeodymium", "dustNeodymium").setCreativeTab(Main.instance.tab));
		dustSamarium = register(new BaseItem("dustSamarium", "dustSamarium").setCreativeTab(Main.instance.tab));		
		dustTitanium = register(new BaseItem("dustTitanium", "dustTitanium").setCreativeTab(Main.instance.tab));
		dustTantalum = register(new BaseItem("dustTantalum", "dustTantalum").setCreativeTab(Main.instance.tab));
		dustColumium = register(new BaseItem("dustColumium", "dustColumium").setCreativeTab(Main.instance.tab));
		dustMolybdenum = register(new BaseItem("dustMolybdenum", "dustMolybdenum").setCreativeTab(Main.instance.tab));		
		dustTriMetal = register(new BaseItem("dustTriMetal", "dustTriMetal").setCreativeTab(Main.instance.tab));
		dustNickelSilver = register(new BaseItem("dustNickelSilver", "dustNickelSilver").setCreativeTab(Main.instance.tab));		
		dustLithium = register(new BaseItem("dustLithium", "dustLithium").setCreativeTab(Main.instance.tab));		
		dustBoron = register(new BaseItem("dustBoron", "dustBoron").setCreativeTab(Main.instance.tab));
		
		// VTNuggets
		nuggetErbium = register(new BaseItem("nuggetErbium", "nuggetErbium").setCreativeTab(Main.instance.tab));
		nuggetEuropium = register(new BaseItem("nuggetEuropium", "nuggetEuropium").setCreativeTab(Main.instance.tab));
		nuggetLanthanum = register(new BaseItem("nuggetLanthanum", "nuggetLanthanum").setCreativeTab(Main.instance.tab));
		nuggetNeodymium = register(new BaseItem("nuggetNeodymium", "nuggetNeodymium").setCreativeTab(Main.instance.tab));
		nuggetSamarium = register(new BaseItem("nuggetSamarium", "nuggetSamarium").setCreativeTab(Main.instance.tab));		
		nuggetTitanium = register(new BaseItem("nuggetTitanium", "nuggetTitanium").setCreativeTab(Main.instance.tab));
		nuggetTantalum = register(new BaseItem("nuggetTantalum", "nuggetTantalum").setCreativeTab(Main.instance.tab));
		nuggetColumium = register(new BaseItem("nuggetColumium", "nuggetColumium").setCreativeTab(Main.instance.tab));
		nuggetMolybdenum = register(new BaseItem("nuggetMolybdenum", "nuggetMolybdenum").setCreativeTab(Main.instance.tab));		
		nuggetTriMetal = register(new BaseItem("nuggetTriMetal", "nuggetTriMetal").setCreativeTab(Main.instance.tab));
		nuggetNickelSilver = register(new BaseItem("nuggetNickelSilver", "nuggetNickelSilver").setCreativeTab(Main.instance.tab));		
		nuggetLithium = register(new BaseItem("nuggetLithium", "nuggetLithium").setCreativeTab(Main.instance.tab));		
		nuggetBoron = register(new BaseItem("nuggetBoron", "nuggetBoron").setCreativeTab(Main.instance.tab));
		
		// Axes
		axeBoron = register(new VTAxe(VTItems.ToolMaterials.toolBoron, "axeBoron"));
	}
		
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}
		
		return item;
	}
}

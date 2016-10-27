package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.References;
import com.rdsguild.mods.items.tools.VTAxe;
import com.rdsguild.mods.items.tools.VTHoe;
import com.rdsguild.mods.items.tools.VTPickaxe;
import com.rdsguild.mods.items.tools.VTSpade;
import com.rdsguild.mods.items.tools.VTSword;

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
	public static VTAxe axeColumium;
	public static VTAxe axeErbium;
	public static VTAxe axeEuropium;
	public static VTAxe axeLanthanum;
	public static VTAxe axeLithium;
	public static VTAxe axeMolybdenum;
	public static VTAxe axeNeodymium;
	public static VTAxe axeNickelSilver;
	public static VTAxe axeSamarium;
	public static VTAxe axeTantalum;
	public static VTAxe axeTitanium;
	public static VTAxe axeTriMetal;
	
	// Swords
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
		
		// VTDusts
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
		
		// VTNuggets
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
		
		// Axes
		axeBoron = register(new VTAxe(ToolMaterials.toolBoron, "axeBoron")); 
		axeColumium = register(new VTAxe(ToolMaterials.toolColumium, "axeColumium"));
		axeErbium = register(new VTAxe(ToolMaterials.toolErbium, "axeErbium"));
		axeEuropium = register(new VTAxe(ToolMaterials.toolEuropium, "axeEuropium"));
		axeLanthanum = register(new VTAxe(ToolMaterials.toolLanthanum, "axeLanthanum"));
		axeLithium = register(new VTAxe(ToolMaterials.toolLithium, "axeLithium"));
		axeMolybdenum = register(new VTAxe(ToolMaterials.toolMolybdenum, "axeMolybdenum"));
		axeNeodymium = register(new VTAxe(ToolMaterials.toolNeodymium, "axeNeodymium"));
		axeNickelSilver = register(new VTAxe(ToolMaterials.toolNickelSilver, "axeNickelSilver"));
		axeSamarium = register(new VTAxe(ToolMaterials.toolSamarium, "axeSamarium"));
		axeTantalum = register(new VTAxe(ToolMaterials.toolTantalum, "axeTantalum"));
		axeTitanium = register(new VTAxe(ToolMaterials.toolTitanium, "axeTitanium"));
		axeTriMetal = register(new VTAxe(ToolMaterials.toolTriMetal, "axeTriMetal"));
		
		// Swords
		swordBoron = register(new VTSword(ToolMaterials.toolBoron, "swordBoron"));
		swordColumium = register(new VTSword(ToolMaterials.toolColumium, "swordColumium"));
		swordErbium = register(new VTSword(ToolMaterials.toolErbium, "swordErbium"));
		swordEuropium = register(new VTSword(ToolMaterials.toolEuropium, "swordEuropium"));
		swordLanthanum = register(new VTSword(ToolMaterials.toolLanthanum, "swordLanthanum"));
		swordLithium = register(new VTSword(ToolMaterials.toolLithium, "swordLithium"));
		swordMolybdenum = register(new VTSword(ToolMaterials.toolMolybdenum, "swordMolybdenum"));
		swordNeodymium = register(new VTSword(ToolMaterials.toolNeodymium, "swordNeodymium"));
		swordNickelSilver = register(new VTSword(ToolMaterials.toolNickelSilver, "swordNickelSilver"));
		swordSamarium = register(new VTSword(ToolMaterials.toolSamarium, "swordSamarium"));
		swordTantalum = register(new VTSword(ToolMaterials.toolTantalum, "swordTantalum"));
		swordTitanium = register(new VTSword(ToolMaterials.toolTitanium, "swordTitanium"));
		swordTriMetal = register(new VTSword(ToolMaterials.toolTriMetal, "swordTriMetal"));
	}
		
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}
		
		if (item instanceof VTAxe) {
			((VTAxe)item).registerItemModel(item);
		}
		
		if (item instanceof VTSword) {
			((VTSword)item).registerItemModel(item);
		}
		
		if (item instanceof VTHoe) {
			((VTHoe)item).registerItemModel(item);
		}
		
		if (item instanceof VTSpade) {
			((VTSpade)item).registerItemModel(item);
		}
		
		if (item instanceof VTPickaxe) {
			((VTPickaxe)item).registerItemModel(item);
		}
		
		return item;
	}
}

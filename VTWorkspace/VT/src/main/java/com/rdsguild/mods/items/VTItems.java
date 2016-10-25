package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTItems {	
	
	@SuppressWarnings("unused")
	private boolean requiresNoTool = true;
	protected VTItems setRequiresTool()
    {
        this.requiresNoTool = false;
        return this;
    }
	
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
	
	
	// Tool Materials
	public static ToolMaterial toolErbium = EnumHelper.addToolMaterial("toolErbium", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolEuropium = EnumHelper.addToolMaterial("toolEuropium", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolLanthanum = EnumHelper.addToolMaterial("toolLanthanum", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolNeodymium = EnumHelper.addToolMaterial("toolNeodymium", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolSamarium = EnumHelper.addToolMaterial("toolSamarium", 3, 1500, 15, 2500, 30);	
	public static ToolMaterial toolTitanium = EnumHelper.addToolMaterial("toolTitanium", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolColumium = EnumHelper.addToolMaterial("toolColumium", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolMolybdenum = EnumHelper.addToolMaterial("toolMolybdenum", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolTriMetal = EnumHelper.addToolMaterial("toolTriMetal", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolNickelSilver = EnumHelper.addToolMaterial("toolNickelSilver", 3, 1500, 15, 2500, 30);	
	public static ToolMaterial toolLithium = EnumHelper.addToolMaterial("toolLithium", 3, 1500, 15, 2500, 30);
	public static ToolMaterial toolBoron = EnumHelper.addToolMaterial("toolBoron", 3, 1500, 15, 2500, 30);
	
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
		
	public static void init() {			
				
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if (item instanceof BaseItem) {
			((BaseItem)item).registerItemModel();
		}
		
		return item;
	}
}

package com.rdsguild.mods;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Reference {

	// Mod Information
	public static final String MODID = "vtweaked";
	public static final String NAME = "Vanilla Tweaked";
	public static final String VERSION = "0.0.1";
	
	// Proxies
	public static final String CLIENT_PROXY_CLASS = "com.rdsguild.mods.proxies.ClientOnlyProxy";
	public static final String SERVER_PROXY_CLASS = "com.rdsguild.mods.proxies.DedicatedServerProxy";
	
	// Materials
	public static final Material t2oopyMaterial = (new Material(MapColor.PURPLE));	
	
	// Tool Materials
	
	// Armor Materials
	public static final ItemArmor.ArmorMaterial t2oopyArmorMaterial = EnumHelper.addArmorMaterial("T2OOPYArmorMaterial", Reference.MODID + ":t2oopy", 80, new int[] {6, 12, 16, 6}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f);
}

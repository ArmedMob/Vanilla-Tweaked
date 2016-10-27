package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.BaseItem;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTSword extends ItemSword {

	private String name;
	
	public VTSword(ToolMaterial material, String name) {		
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.setMaxDamage(material.getMaxUses());		
		this.name = name;		
	}		
	
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}

package com.rdsguild.mods.items;

import com.rdsguild.mods.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item implements ItemModelProvider {

	protected String name;
	
	public BaseItem(String name, String itemName) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}	
	
	@Override
	public BaseItem setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
		
	}
}

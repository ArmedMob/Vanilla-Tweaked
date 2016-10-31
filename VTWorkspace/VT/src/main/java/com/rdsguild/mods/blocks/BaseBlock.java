package com.rdsguild.mods.blocks;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseBlock extends Block implements ItemModelProvider {

	protected String name;
	
	public BaseBlock(Material material, String name) {
		super(material);
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}	
	
	@Override
	public BaseBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(item, 0, name);
		
	}
}

package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import com.rdsguild.mods.items.ItemModelProvider;

public class VTAxe extends ItemAxe implements ItemModelProvider {
	
	private String name;
	
	public VTAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);		
		this.name = name;
		setCreativeTab(Main.instance.tab);
	}	

	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}

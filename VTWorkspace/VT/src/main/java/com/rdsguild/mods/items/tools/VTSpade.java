package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class VTSpade extends ItemSpade implements ItemModelProvider {

	protected String name;
	
	public VTSpade(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.name = name;	
		setCreativeTab(Main.instance.tab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}

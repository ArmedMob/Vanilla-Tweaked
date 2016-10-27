package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class VTPickaxe extends ItemPickaxe implements ItemModelProvider {

	protected String name;
	
	public VTPickaxe(ToolMaterial material, String name) {
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

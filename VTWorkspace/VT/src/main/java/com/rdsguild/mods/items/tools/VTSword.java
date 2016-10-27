package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class VTSword extends ItemSword implements ItemModelProvider {

	private String name;
	
	public VTSword(ToolMaterial material, String name) {		
		super(material);
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

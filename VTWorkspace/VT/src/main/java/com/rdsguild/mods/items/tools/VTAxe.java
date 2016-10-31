package com.rdsguild.mods.items.tools;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.items.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

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
	
	@Override
	 public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        if(toRepair.getItem().equals(this.toolMaterial.getRepairItemStack()) && repair.getItem().equals(this.getUnlocalizedName()))
        	return true;
        else
        	return false;
        			
    }
}

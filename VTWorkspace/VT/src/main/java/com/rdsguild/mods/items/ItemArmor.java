package com.rdsguild.mods.items;

import com.rdsguild.mods.VTweaked;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemArmor extends net.minecraft.item.ItemArmor implements IItemModelProvider {

	private String name;
	
	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}	

	@Override
	public void registerItemModel(Item item) {
		// TODO Auto-generated method stub
		VTweaked.proxy.registerItemRenderer(this, 0, name);
	}
}

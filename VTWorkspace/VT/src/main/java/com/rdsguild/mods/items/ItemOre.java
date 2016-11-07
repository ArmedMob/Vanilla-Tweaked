package com.rdsguild.mods.items;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemBase implements IItemOreDict {

	private String oreName;
	
	public ItemOre(String name, String oreName) {
		
		super(name);
		
		this.oreName = oreName;
	}
	
	@Override
	public void initOreDict() {
		
		OreDictionary.registerOre(oreName, this);
	}
}

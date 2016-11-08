package com.rdsguild.mods.blocks;

import com.rdsguild.mods.items.IItemOreDict;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockBase implements IItemOreDict {

	private String oreName;
	
	public BlockOre(String name, String oreName, MapColor color) {
		
		super(Material.ROCK, name, color);
		
		this.oreName = oreName;		
	}	

	@Override 
	public void initOreDict() {
		
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public BlockOre setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
	}
}

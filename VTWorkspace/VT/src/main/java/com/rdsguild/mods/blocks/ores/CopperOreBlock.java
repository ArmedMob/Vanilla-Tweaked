package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.blocks.BaseBlock;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOreBlock extends BaseBlock {

	public CopperOreBlock(String name) {
		super(Material.ROCK, name);
		
		setHardness(3f);
		setResistance(5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public CopperOreBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

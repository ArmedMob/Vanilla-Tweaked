package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.blocks.BaseBlock;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class TriMetalOreBlock extends BaseBlock {

	public TriMetalOreBlock(String name, String oreName) {
		super(VTItems.TriMetal, name);
		
		setHardness(3f);
		setResistance(5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public TriMetalOreBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

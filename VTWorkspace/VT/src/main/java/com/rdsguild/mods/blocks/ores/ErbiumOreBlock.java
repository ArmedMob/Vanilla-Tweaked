package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.blocks.BaseBlock;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class ErbiumOreBlock extends BaseBlock {

	public ErbiumOreBlock(String name, String oreName) {
		super(VTItems.Erbium, name);
		
		setHardness(3f);
		setResistance(5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public ErbiumOreBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

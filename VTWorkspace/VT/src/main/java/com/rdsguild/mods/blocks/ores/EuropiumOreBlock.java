package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.blocks.BaseBlock;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class EuropiumOreBlock extends BaseBlock {

	public EuropiumOreBlock(String name, String oreName) {
		super(VTItems.Europium, name);
		
		setHardness(3f);
		setResistance(5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public EuropiumOreBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

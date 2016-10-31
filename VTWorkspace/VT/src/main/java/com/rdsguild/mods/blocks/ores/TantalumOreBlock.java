package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.blocks.BaseBlock;
import com.rdsguild.mods.items.VTItems;

import net.minecraft.block.SoundType;
import net.minecraft.creativetab.CreativeTabs;

public class TantalumOreBlock extends BaseBlock {

	public TantalumOreBlock(String name, String oreName) {
		super(VTItems.Titanium, name);
		
		setHardness(3f);
		setResistance(5f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public TantalumOreBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

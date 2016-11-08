package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.Reference;
import com.rdsguild.mods.blocks.BlockBase;
import com.rdsguild.mods.items.IItemOreDict;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class T2oopyBlockNetherOre extends BlockBase implements IItemOreDict {

	private String oreName;	
	
	public T2oopyBlockNetherOre(String name, String oreName) {		
	
		super(Reference.t2oopyMaterial, name, MapColor.PURPLE);
		
		this.oreName = oreName;
		
		this.setResistance(150.0f);
		this.setHardness(4.0f);
		this.setHarvestLevel("pickaxe", 3);
		this.setSoundType(SoundType.STONE);
	}
	
	public MapColor getMapColor(IBlockState state)
    {
        return MapColor.PURPLE;
    }
	
	@Override 
	public void initOreDict() {
		
		OreDictionary.registerOre(oreName, this);
	}
	
	@Override
	public T2oopyBlockNetherOre setCreativeTab(CreativeTabs tab) {
		
		super.setCreativeTab(tab);
		return this;
	}	
}

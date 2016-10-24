package com.rdsguild.mods.blocks.ores;

import com.rdsguild.mods.Main;
import com.rdsguild.mods.blocks.BaseBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VTOreBlocks {

	public static CopperOreBlock oreCopper;
	public static AluminumOreBlock oreAluminum;
	public static BoronOreBlock oreBoron;
	public static BronzeOreBlock oreBronze;
	public static CobaltOreBlock oreCobalt;
	public static ColumiumOreBlock oreColumium;
	public static ErbiumOreBlock oreErbium;
	public static EuropiumOreBlock oreEuropium;
	public static LanthanumOreBlock oreLanthanum;
	public static LeadOreBlock oreLead;
	public static LithiumOreBlock oreLithium;
	public static MolybdenumOreBlock oreMolybdenum;
	public static NeodymiumOreBlock oreNeodymium;
	public static NickelOreBlock oreNickel;
	public static NickelSilverOreBlock oreNickelSilver;
	public static SamariumOreBlock oreSamarium;
	public static SiliconOreBlock oreSilicon;
	public static SilverOreBlock oreSilver;
	public static SteelOreBlock oreSteel;
	public static TinOreBlock oreTin;
	public static TitaniumOreBlock oreTitanium;
	public static TriMetalOreBlock oreTriMetal;
	public static ZincOreBlock oreZinc;
	
	public static void init() {
		oreCopper = register(new CopperOreBlock("oreCopper").setCreativeTab(Main.instance.tab));
		oreAluminum = register(new AluminumOreBlock("oreAluminum").setCreativeTab(Main.instance.tab));
		oreBoron = register(new BoronOreBlock("oreBoron").setCreativeTab(Main.instance.tab));
		oreBronze = register(new BronzeOreBlock("oreBronze").setCreativeTab(Main.instance.tab));
		oreCobalt = register(new CobaltOreBlock("oreCobalt").setCreativeTab(Main.instance.tab));
		oreColumium = register(new ColumiumOreBlock("oreColumium").setCreativeTab(Main.instance.tab));
		oreErbium = register(new ErbiumOreBlock("oreErbium").setCreativeTab(Main.instance.tab));
		oreEuropium = register(new EuropiumOreBlock("oreEuropium").setCreativeTab(Main.instance.tab));
		oreLanthanum = register(new LanthanumOreBlock("oreLanthanum").setCreativeTab(Main.instance.tab));
		oreLead = register(new LeadOreBlock("oreLead").setCreativeTab(Main.instance.tab));
		oreLithium = register(new LithiumOreBlock("oreLithium").setCreativeTab(Main.instance.tab));
		oreMolybdenum = register(new MolybdenumOreBlock("oreMolybdenum").setCreativeTab(Main.instance.tab));
		oreNeodymium = register(new NeodymiumOreBlock("oreNeodymium").setCreativeTab(Main.instance.tab));
		oreNickel = register(new NickelOreBlock("oreNickel").setCreativeTab(Main.instance.tab));
		oreNickelSilver = register(new NickelSilverOreBlock("oreNickelSilver").setCreativeTab(Main.instance.tab));
		oreSamarium = register(new SamariumOreBlock("oreSamarium").setCreativeTab(Main.instance.tab));
		oreSilicon = register(new SiliconOreBlock("oreSilicon").setCreativeTab(Main.instance.tab));
		oreSilver = register(new SilverOreBlock("oreSilver").setCreativeTab(Main.instance.tab));
		oreSteel = register(new SteelOreBlock("oreSteel").setCreativeTab(Main.instance.tab));
		oreTin = register(new TinOreBlock("oreTin").setCreativeTab(Main.instance.tab));
		oreTitanium = register(new TitaniumOreBlock("oreTitanium").setCreativeTab(Main.instance.tab));
		oreTriMetal = register(new TriMetalOreBlock("oreTriMetal").setCreativeTab(Main.instance.tab));
		oreZinc = register(new ZincOreBlock("oreZinc").setCreativeTab(Main.instance.tab));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if (block instanceof BaseBlock) {
			((BaseBlock)block).registerItemModel(itemBlock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}

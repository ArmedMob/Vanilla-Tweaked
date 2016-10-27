package com.rdsguild.mods.world;

import java.util.Random;

import com.rdsguild.mods.blocks.ores.VTOreBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOres implements IWorldGenerator {

	private final WorldGenMinable oreGenBoron;
	private final WorldGenMinable oreGenColumium;
	private final WorldGenMinable oreGenErbium;
	private final WorldGenMinable oreGenEuropium;
	private final WorldGenMinable oreGenLanthanum;
	private final WorldGenMinable oreGenLithium;
	private final WorldGenMinable oreGenMolybdenum;
	private final WorldGenMinable oreGenNeodymium;
	private final WorldGenMinable oreGenNickelSilver;
	private final WorldGenMinable oreGenSamarium;
	private final WorldGenMinable oreGenTantalum;
	private final WorldGenMinable oreGenTitanium;
	private final WorldGenMinable oreGenTriMetal;
	private final WorldGenMinable oreGenNether;
	private final WorldGenMinable oreGenEnd;	
	
	public WorldGenOres() {
		
		oreGenBoron = new WorldGenMinable(VTOreBlocks.oreBoron.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));	
		oreGenColumium = new WorldGenMinable(VTOreBlocks.oreColumium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenErbium = new WorldGenMinable(VTOreBlocks.oreErbium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenEuropium = new WorldGenMinable(VTOreBlocks.oreEuropium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenLanthanum = new WorldGenMinable(VTOreBlocks.oreLanthanum.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenLithium = new WorldGenMinable(VTOreBlocks.oreLithium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenMolybdenum = new WorldGenMinable(VTOreBlocks.oreMolybdenum.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenNeodymium = new WorldGenMinable(VTOreBlocks.oreNeodymium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenNickelSilver = new WorldGenMinable(VTOreBlocks.oreNickelSilver.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenSamarium = new WorldGenMinable(VTOreBlocks.oreSamarium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenTantalum = new WorldGenMinable(VTOreBlocks.oreTantalum.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenTriMetal = new WorldGenMinable(VTOreBlocks.oreTriMetal.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenTitanium = new WorldGenMinable(VTOreBlocks.oreTitanium.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		oreGenNether = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.NETHERRACK));
		oreGenEnd = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		final BlockPos chunkPos = new BlockPos(chunkX * 16, 0, chunkZ * 16);
		
		switch (world.provider.getDimensionType()) {
		case OVERWORLD:
			for (int i = 0; i < 16; i++) {
				oreGenBoron.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenColumium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenErbium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenEuropium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenLanthanum.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenLithium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenMolybdenum.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenNeodymium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenNickelSilver.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenSamarium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenTantalum.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenTitanium.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(16) + 16, random.nextInt(16)));
				oreGenTriMetal.generate(world, random, chunkPos.add(random.nextInt(2), random.nextInt(8) + 8, random.nextInt(16)));
			}
			break;
		case NETHER:
			for (int i = 0; i < 16; i++) {
				oreGenNether.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(108) + 10, random.nextInt(16)));
			}
			break;
		case THE_END:
			for (int i = 0; i < 16; i++) {
				oreGenEnd.generate(world, random, chunkPos.add(random.nextInt(16), random.nextInt(128), random.nextInt(16)));
			}
			break;
		}
	}
}

package com.rdsguild.mods.world;

import java.util.Random;

import com.rdsguild.mods.blocks.VTBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class VTWorldGen implements IWorldGenerator {

	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		if (world.provider.getDimension() == 0) { // the overworld
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		if (world.provider.getDimension() == 1) { // the end
			generateEnd(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
		
		if (world.provider.getDimension() == -1) { // the nether
			generateNether(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		generateOre(VTBlocks.oreT2oopy.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 1 + random.nextInt(4), 6);
	}
	
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(VTBlocks.netherOreT2oopy.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, 1 + random.nextInt(4), 6);
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chance) {
		
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chance; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}		
	}
}

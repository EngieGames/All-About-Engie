package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.init.AllaboutengieModBlocks;

public class Nothing4GeneratedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVEMODE) == true) {
			world.setBlock(BlockPos.containing(x, y, z), AllaboutengieModBlocks.THANKS_FOR_PLAYING_5.get().defaultBlockState(), 3);
			world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 20);
		} else {
			world.setBlock(BlockPos.containing(x, y, z), AllaboutengieModBlocks.THANKS_FOR_PLAYING_4.get().defaultBlockState(), 3);
			world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), 20);
		}
	}
}

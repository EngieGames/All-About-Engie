package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.AllaboutengieMod;

public class SpikeBlockTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		AllaboutengieMod.queueServerWork(400, () -> {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}

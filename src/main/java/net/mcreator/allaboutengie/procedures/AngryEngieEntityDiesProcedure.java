package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AngryEngieEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount == 125) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_PLUSH.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount == 250) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.GOLDEN_ANGRY_ENGIE_PLUSH.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount == 375) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.DIAMOND_ANGRY_ENGIE_PLUSH.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount == 500) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AllaboutengieModItems.NETHERITE_ANGRY_ENGIE_PLUSH.get()));
				entityToSpawn.setPickUpDelay(10);
				entityToSpawn.setUnlimitedLifetime();
				_level.addFreshEntity(entityToSpawn);
			}
		}
		AllaboutengieMod.queueServerWork(5, () -> {
			{
				double _setval = (entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).AngryEngieKillCount + 1;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.AngryEngieKillCount = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		});
	}
}

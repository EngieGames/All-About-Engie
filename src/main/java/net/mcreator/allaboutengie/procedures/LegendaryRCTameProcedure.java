package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModEntities;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;

public class LegendaryRCTameProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!world.isClientSide()) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKIE) {
				if (Math.random() >= 0.8) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new LegendarySharkoTamedEntity(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED.get(), _level);
						entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (!entity.level.isClientSide())
						entity.discard();
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.COOKIE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				} else {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.COOKIE);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
				if (AllaboutengieModVariables.MapVariables.get(world).SharkoRetryState == true) {
					if (sourceentity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You're currently on cooldown for the sharkos."), true);
				} else if (AllaboutengieModVariables.MapVariables.get(world).SharkoRetryState == false) {
					if (Math.random() < 0.05) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.HEART, x, y, z, 15, 1, 1, 1, 1);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new LegendarySharkoTamedEntity(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED.get(), _level);
							entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
							entityToSpawn.setYBodyRot(entity.getYRot());
							entityToSpawn.setYHeadRot(entity.getYRot());
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
						if (!entity.level.isClientSide())
							entity.discard();
					} else {
						AllaboutengieModVariables.MapVariables.get(world).SharkoRetryState = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				}
			}
		}
	}
}

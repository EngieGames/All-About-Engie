package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.entity.YellowLightningEntity;
import net.mcreator.allaboutengie.entity.NormalEntity;
import net.mcreator.allaboutengie.entity.MOABEntity;
import net.mcreator.allaboutengie.entity.BlueBurstEntity;

public class MissileTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof YellowLightningEntity) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join YellowLightning @e[type=allaboutengie:yellow_lightning]");
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("YellowLightningTimeBeforeExplosion") >= 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 5, 5, 5, 5, 1);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 5, Explosion.BlockInteraction.BREAK);
				entity.getPersistentData().putDouble("YellowLightningTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof BlueBurstEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join BlueBurst @e[type=allaboutengie:blue_burst]");
				}
			}
			entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("BlueBurstTimeBeforeExplosion") >= 3) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 10, 10, 10, 10, 1);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.BREAK);
				entity.getPersistentData().putDouble("BlueBurstTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof NormalEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "team join Normal @e[type=allaboutengie:normal]");
				}
			}
			entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("NormalTimeBeforeExplosion") >= 6) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 15, 15, 15, 15, 1);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 15, Explosion.BlockInteraction.BREAK);
				entity.getPersistentData().putDouble("NormalTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		} else if (entity instanceof MOABEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 999999, 255, false, false));
			entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") + 0.05));
			if (entity.getPersistentData().getDouble("MoabTimeBeforeExplosion") >= 16) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, (float) 0.5, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 20, 10, 10, 10, 1);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 20, Explosion.BlockInteraction.BREAK);
				entity.getPersistentData().putDouble("MoabTimeBeforeExplosion", 0);
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}

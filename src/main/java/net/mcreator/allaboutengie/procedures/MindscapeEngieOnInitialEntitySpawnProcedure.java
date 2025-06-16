package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;
import net.mcreator.allaboutengie.init.AllaboutengieModBlocks;

public class MindscapeEngieOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() > 0.05) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			if (Mth.nextDouble(RandomSource.create(), 1, 45) == 1) {
				if (Math.random() <= 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_GEM.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() > 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENGIE_BLOCK.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 2) {
				if (Math.random() <= 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() > 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 3) {
				if (Math.random() <= 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() > 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 4) {
				if (Math.random() <= 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() > 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 5) {
				if (Math.random() <= 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() > 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 6) {
				if (Math.random() <= 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIE_ESSENCE.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if (Math.random() > 0.5) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(AllaboutengieModBlocks.MONSTROSITY_ENGIE_BLOCK.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 7) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ITEMS_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 8) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.MOBS_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 9) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.EXTRAS_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 10) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.SHARKOS_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 11) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.DIMENSIONS_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 12) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENRAGED_ZOMBIES_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 13) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ALL_ABOUT_ENGIE_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 14) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.ENGIE_PLAQUE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) == 15) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AllaboutengieModItems.BYE_BYE_THERE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if (Mth.nextDouble(RandomSource.create(), 1, 45) >= 16) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}

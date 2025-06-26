package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EngieBlessingBlockBreakingProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem().isCorrectToolForDrops((world.getBlockState(new BlockPos(x, y, z)))) == true) {
			if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index0 = 0; index0 < 1; index0++) {
							EngieBlessingBlockBreaking05Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index1 = 0; index1 < 2; index1++) {
							EngieBlessingBlockBreaking05Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index2 = 0; index2 < 3; index2++) {
							EngieBlessingBlockBreaking05Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking05Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index3 = 0; index3 < 1; index3++) {
							EngieBlessingBlockBreaking10Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index4 = 0; index4 < 2; index4++) {
							EngieBlessingBlockBreaking10Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index5 = 0; index5 < 3; index5++) {
							EngieBlessingBlockBreaking10Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking10Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index6 = 0; index6 < 1; index6++) {
							EngieBlessingBlockBreaking15Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index7 = 0; index7 < 2; index7++) {
							EngieBlessingBlockBreaking15Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index8 = 0; index8 < 3; index8++) {
							EngieBlessingBlockBreaking15Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking15Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 4) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index9 = 0; index9 < 1; index9++) {
							EngieBlessingBlockBreaking20Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index10 = 0; index10 < 2; index10++) {
							EngieBlessingBlockBreaking20Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index11 = 0; index11 < 3; index11++) {
							EngieBlessingBlockBreaking20Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking20Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 5) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index12 = 0; index12 < 1; index12++) {
							EngieBlessingBlockBreaking25Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index13 = 0; index13 < 2; index13++) {
							EngieBlessingBlockBreaking25Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index14 = 0; index14 < 3; index14++) {
							EngieBlessingBlockBreaking25Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking25Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 6) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index15 = 0; index15 < 1; index15++) {
							EngieBlessingBlockBreaking30Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index16 = 0; index16 < 2; index16++) {
							EngieBlessingBlockBreaking30Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index17 = 0; index17 < 3; index17++) {
							EngieBlessingBlockBreaking30Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking30Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 7) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index18 = 0; index18 < 1; index18++) {
							EngieBlessingBlockBreaking35Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index19 = 0; index19 < 2; index19++) {
							EngieBlessingBlockBreaking35Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index20 = 0; index20 < 3; index20++) {
							EngieBlessingBlockBreaking35Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking35Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 8) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index21 = 0; index21 < 1; index21++) {
							EngieBlessingBlockBreaking40Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index22 = 0; index22 < 2; index22++) {
							EngieBlessingBlockBreaking40Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index23 = 0; index23 < 3; index23++) {
							EngieBlessingBlockBreaking40Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking40Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 9) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index24 = 0; index24 < 1; index24++) {
							EngieBlessingBlockBreaking45Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index25 = 0; index25 < 2; index25++) {
							EngieBlessingBlockBreaking45Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index26 = 0; index26 < 3; index26++) {
							EngieBlessingBlockBreaking45Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking45Procedure.execute(world, x, y, z);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(AllaboutengieModEnchantments.ENGIES_BLESSING.get(), (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 10) {
					if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 1) {
						for (int index27 = 0; index27 < 1; index27++) {
							EngieBlessingBlockBreaking50Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 2) {
						for (int index28 = 0; index28 < 2; index28++) {
							EngieBlessingBlockBreaking50Procedure.execute(world, x, y, z);
						}
					} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) == 3) {
						for (int index29 = 0; index29 < 3; index29++) {
							EngieBlessingBlockBreaking50Procedure.execute(world, x, y, z);
						}
					} else {
						EngieBlessingBlockBreaking50Procedure.execute(world, x, y, z);
					}
				}
			}
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DETECTIVEMODE = GameRules.register("detectiveFindEngie", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}

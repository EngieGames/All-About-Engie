package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import java.util.Iterator;

public class BigBanObtainProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
			if ((entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
					&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_challenge_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_challenge_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		} else {
			if ((entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:big_ban_obtain"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
	}
}

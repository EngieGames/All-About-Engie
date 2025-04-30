package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class HaveFunLadProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == false) {
			if (!(entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world"))).isDone())) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
			{
				boolean _setval = false;
				entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.GoodLuck = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == true) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).GoodLuck == false) {
				if (!(entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
						&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:new_world"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				AllaboutengieMod.queueServerWork(20, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"Hello \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\". If you're looking for the challenge version of this, you can run \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"/challengeready\",\"bold\":true,\"color\":\"gold\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"/challengeready\"}},{\"text\":\" to start it. Otherwise, you can have fun and ignore this message.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				});
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tag @s add AAEChallengeUnready");
					}
				}
				{
					boolean _setval = true;
					entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.GoodLuck = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

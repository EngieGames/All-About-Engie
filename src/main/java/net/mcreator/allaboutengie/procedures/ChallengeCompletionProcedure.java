package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Iterator;

public class ChallengeCompletionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"I-\",\"bold\":true,\"color\":\"gray\"}");
			}
		}
		AllaboutengieMod.queueServerWork(120, () -> {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Have no words...\",\"bold\":true,\"color\":\"gray\"}");
				}
			}
			AllaboutengieMod.queueServerWork(80, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								"tellraw @a [\"\",{\"text\":\"Well... You might as well just take the \",\"bold\":true,\"color\":\"gray\"},{\"text\":\"advancement\",\"bold\":true,\"color\":\"dark_purple\"},{\"text\":\" and go now...\",\"bold\":true,\"color\":\"gray\"}]");
					}
				}
				AllaboutengieMod.queueServerWork(160, () -> {
					if (world.players().size() > 1) {
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "advancement grant @a only allaboutengie:challenge_destroyed_2");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @a");
							}
						}
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12600000");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).BYEBYE = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:enraged_coin 1000");
							}
						}
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:challenge_destroyed"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect clear @a");
							}
						}
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12600000");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).BYEBYE = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				});
			});
		});
	}
}

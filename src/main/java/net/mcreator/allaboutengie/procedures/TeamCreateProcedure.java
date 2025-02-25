package net.mcreator.allaboutengie.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.AllaboutengieMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TeamCreateProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team add AAE_Dev \"AAE Developer\"");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_Dev color dark_red");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_Dev prefix [{\"text\":\"[\",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"All \",\"color\":\"green\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"About \",\"color\":\"yellow\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Engie \",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Developer\",\"color\":\"dark_red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"] \",\"color\":\"red\"}]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team add AAE_IdeaGiver \"AAE Idea Giver\"");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_IdeaGiver color dark_blue");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_IdeaGiver prefix [{\"text\":\"[\",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"All \",\"color\":\"green\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"About \",\"color\":\"yellow\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Engie \",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Idea Giver\",\"color\":\"dark_blue\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"] \",\"color\":\"red\"}]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team add AAE_Tester \"AAE Tester\"");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_Tester color dark_green");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_Tester prefix [{\"text\":\"[\",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"All \",\"color\":\"green\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"About \",\"color\":\"yellow\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Engie \",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Tester\",\"color\":\"dark_green\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"] \",\"color\":\"red\"}]");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team add AAE_CC \"AAE Content Creator\"");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_CC color gold");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"team modify AAE_CC prefix [{\"text\":\"[\",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"All \",\"color\":\"green\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"About \",\"color\":\"yellow\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Engie \",\"color\":\"red\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"Content Creator\",\"color\":\"gold\",\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[{\"text\":\"\",\"color\":\"red\"}]}},{\"text\":\"] \",\"color\":\"red\"}]");
		AllaboutengieMod.queueServerWork(2, () -> {
			if ((entity.getDisplayName().getString()).equals("Dev")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"team join AAE_Dev Dev");
			}
			if ((entity.getDisplayName().getString()).equals("DevEngie")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"team join AAE_Dev DevEngie");
			}
			if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"team join AAE_CC EngieGamesOnTTV");
			}
			if ((entity.getDisplayName().getString()).equals("Hellhound_Blood")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"team join AAE_IdeaGiver Hellhound_Blood");
			}
			if ((entity.getDisplayName().getString()).equals("GremilingPlayz")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"team join AAE_IdeaGiver GremilingPlayz");
			}
			if ((entity.getDisplayName().getString()).equals("Dragons23")) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"team join AAE_Tester Dragons23");
			}
		});
	}
}

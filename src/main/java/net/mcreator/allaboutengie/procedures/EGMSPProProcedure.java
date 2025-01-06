package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class EGMSPProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("DevEngie")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity DevEngie run gamemode spectator");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egms, egma for other modes"), true);
		} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity DevEngie run gamemode spectator");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egms, egma for other modes"), true);
		} else if ((entity.getDisplayName().getString()).equals("Dev")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity Dev run gamemode spectator");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egms, egma for other modes"), true);
		} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute if entity Dev run gamemode spectator");
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("egmc, egms, egma for other modes"), true);
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Sorry! This command is limited to just DevEngie."), true);
		}
	}
}

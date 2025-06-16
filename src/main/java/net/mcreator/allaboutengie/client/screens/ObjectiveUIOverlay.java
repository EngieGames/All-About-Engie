
package net.mcreator.allaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.procedures.TheEndCheckProcedure;
import net.mcreator.allaboutengie.procedures.SuperDoomsDayCheckProcedure;
import net.mcreator.allaboutengie.procedures.ObjectiveOverlayCheckProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayCheckProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class ObjectiveUIOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (ObjectiveOverlayCheckProcedure.execute(entity)) {
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.allaboutengie.objective_ui.label_u26a0_new_objective_u26a0"), posX + -69, posY + -120, -256);
			if (DoomsDayCheckProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.allaboutengie.objective_ui.label_the_end_is_near_survive_the_end"), posX + -116, posY + -111, -1);
			if (SuperDoomsDayCheckProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.allaboutengie.objective_ui.label_the_end_is_near_the_full_wrath"), posX + -164, posY + -111, -1);
			if (SuperDoomsDayCheckProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.allaboutengie.objective_ui.label_ultimate_disaster_super_doomsda"), posX + -89, posY + -101, -1);
			if (TheEndCheckProcedure.execute(world))
				Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.allaboutengie.objective_ui.label_theres_no_disaster_theres_no"), posX + -157, posY + -111, -4978150);
		}
	}
}


package net.mcreator.allaboutengie.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.procedures.DoomsDayDeadOverlayCheckProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayDeadCheckProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayAliveOverlayCheckProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayAliveDeathCountDisplayOverlayIngameProcedure;
import net.mcreator.allaboutengie.procedures.DoomsDayAliveCheckProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DoomsDayAliveDeathCountOverlay {
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
		if (DoomsDayAliveDeathCountDisplayOverlayIngameProcedure.execute(world)) {
			if (DoomsDayAliveOverlayCheckProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDayAliveCheckProcedure.execute(entity), posX + -213, posY + -120, -16711936);
			if (DoomsDayDeadOverlayCheckProcedure.execute(entity))
				Minecraft.getInstance().font.draw(event.getPoseStack(),

						DoomsDayDeadCheckProcedure.execute(entity), posX + -213, posY + -120, -65536);
		}
	}
}

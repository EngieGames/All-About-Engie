
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.allaboutengie.client.renderer.TobyRenderer;
import net.mcreator.allaboutengie.client.renderer.TobyLayRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.QuizzetRenderer;
import net.mcreator.allaboutengie.client.renderer.ProtogenRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.MadEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.EnragedEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareLayRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2TamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2Renderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2LayRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieGamesRenderer;
import net.mcreator.allaboutengie.client.renderer.EngiRenderer;
import net.mcreator.allaboutengie.client.renderer.EngiFRRenderer;
import net.mcreator.allaboutengie.client.renderer.CreatorRenderer;
import net.mcreator.allaboutengie.client.renderer.AngryEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.AngryCreatorRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoLayRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllaboutengieModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE.get(), EngiRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MAD_ENGIE.get(), MadEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ANGRY_ENGIE.get(), AngryEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_ENGIE.get(), EnragedEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.OUTRAGED_ENGIE.get(), AngryCreatorRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGI_FR.get(), EngiFRRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CREATOR.get(), CreatorRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_GAMES.get(), EngieGamesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.QUIZZET.get(), QuizzetRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO.get(), SharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO.get(), AlbinoSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO.get(), RareSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO.get(), LegendarySharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO.get(), MythicSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO.get(), ExoticSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO.get(), EngieSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE.get(), EngieSharkoRareRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2.get(), EngieSharkoRare2Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_LAY.get(), SharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_LAY.get(), RareSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_LAY.get(), MythicSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_LAY.get(), EngieSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_LAY.get(), EngieSharkoRareLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_LAY.get(), EngieSharkoRare2LayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_TAMED.get(), SharkTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_TAMED.get(), RareSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRareTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED.get(), EngieSharkoRare2TamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY.get(), TobyRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY_LAY.get(), TobyLayRenderer::new);
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.allaboutengie.client.renderer.UncommonEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.TobyZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.TobyZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.TobySleepRenderer;
import net.mcreator.allaboutengie.client.renderer.TobyRenderer;
import net.mcreator.allaboutengie.client.renderer.TobyLayRenderer;
import net.mcreator.allaboutengie.client.renderer.TigerZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.TigerZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.TigerSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.TigerRenderer;
import net.mcreator.allaboutengie.client.renderer.TigerLayRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.SharkTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.RareSharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.RareEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.QuizzetRenderer;
import net.mcreator.allaboutengie.client.renderer.ProtogenRenderer;
import net.mcreator.allaboutengie.client.renderer.PBEZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.PBEZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.PBESleepRenderer;
import net.mcreator.allaboutengie.client.renderer.PBERenderer;
import net.mcreator.allaboutengie.client.renderer.PBELayRenderer;
import net.mcreator.allaboutengie.client.renderer.OutragedEngieSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicSharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.MythicEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.MonstrosityEngieSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.MonstrosityEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.MarshalZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.MarshalZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.MarshalSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.MarshalRenderer;
import net.mcreator.allaboutengie.client.renderer.MarshalLayRenderer;
import net.mcreator.allaboutengie.client.renderer.MadEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.LouisZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.LouisZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.LouisSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.LouisRenderer;
import net.mcreator.allaboutengie.client.renderer.LouisLayRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendarySharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.LegendaryEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticSharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.ExoticEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicSharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EpicEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNTRenderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT9Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT8Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT7Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT6Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT5Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT4Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT3Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedTNT2Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeedRenderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed9Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed8Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed7Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed6Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed5Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed4Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed3Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedSpeed2Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormalRenderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal9Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal8Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal7Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal6Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal5Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal4Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal3Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedNormal2Renderer;
import net.mcreator.allaboutengie.client.renderer.EnragedEngieSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.EnragedEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareLayRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRareAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2ZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2TamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2TamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2TamedRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2TamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2SleepRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2SleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2Renderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2LayRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2LayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoRare2AprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieSharkoAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.EngieGamesRenderer;
import net.mcreator.allaboutengie.client.renderer.EngiRenderer;
import net.mcreator.allaboutengie.client.renderer.EngiFRRenderer;
import net.mcreator.allaboutengie.client.renderer.CreatorRenderer;
import net.mcreator.allaboutengie.client.renderer.CommonEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.CBEZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.CBEZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.CBESleepRenderer;
import net.mcreator.allaboutengie.client.renderer.CBERenderer;
import net.mcreator.allaboutengie.client.renderer.CBELayRenderer;
import net.mcreator.allaboutengie.client.renderer.BuddyZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.BuddyZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.BuddySleepRenderer;
import net.mcreator.allaboutengie.client.renderer.BuddyRenderer;
import net.mcreator.allaboutengie.client.renderer.BuddyLayRenderer;
import net.mcreator.allaboutengie.client.renderer.Bothan2netZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.Bothan2netZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.Bothan2netSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.Bothan2netRenderer;
import net.mcreator.allaboutengie.client.renderer.Bothan2netLayRenderer;
import net.mcreator.allaboutengie.client.renderer.BiblicallyAccurateEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.AtlasZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.AtlasZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.AtlasSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.AtlasRenderer;
import net.mcreator.allaboutengie.client.renderer.AtlasLayRenderer;
import net.mcreator.allaboutengie.client.renderer.ApolloZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.ApolloZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.ApolloSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.ApolloRenderer;
import net.mcreator.allaboutengie.client.renderer.ApolloLayRenderer;
import net.mcreator.allaboutengie.client.renderer.AngryEngieSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.AngryEngieRenderer;
import net.mcreator.allaboutengie.client.renderer.AngryCreatorRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoTamedZoomiesTiredRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoTamedZoomiesRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoTamedRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoTamedAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoSleepRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoSleepAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoLayRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoLayAprilFoolsRenderer;
import net.mcreator.allaboutengie.client.renderer.AlbinoSharkoAprilFoolsRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AllaboutengieModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE.get(), EngiRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGI_FR.get(), EngiFRRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CREATOR.get(), CreatorRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PROTOGEN.get(), ProtogenRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_GAMES.get(), EngieGamesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.QUIZZET.get(), QuizzetRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BIBLICALLY_ACCURATE_ENGIE.get(), BiblicallyAccurateEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.COMMON_ENGIE.get(), CommonEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MAD_ENGIE.get(), MadEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.UNCOMMON_ENGIE.get(), UncommonEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_ENGIE.get(), RareEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_ENGIE.get(), EpicEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_ENGIE.get(), LegendaryEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_ENGIE.get(), MythicEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_ENGIE.get(), ExoticEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ANGRY_ENGIE.get(), AngryEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_ENGIE.get(), EnragedEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.OUTRAGED_ENGIE.get(), AngryCreatorRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MONSTROSITY_ENGIE.get(), MonstrosityEngieRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ANGRY_ENGIE_SHARKO.get(), AngryEngieSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_ENGIE_SHARKO.get(), EnragedEngieSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.OUTRAGED_ENGIE_SHARKO.get(), OutragedEngieSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MONSTROSITY_ENGIE_SHARKO.get(), MonstrosityEngieSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO.get(), SharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO.get(), AlbinoSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO.get(), RareSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO.get(), EpicSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO.get(), LegendarySharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO.get(), MythicSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO.get(), ExoticSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO.get(), EngieSharkoRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE.get(), EngieSharkoRareRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2.get(), EngieSharkoRare2Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_APRIL_FOOLS.get(), SharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_APRIL_FOOLS.get(), AlbinoSharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_APRIL_FOOLS.get(), RareSharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_APRIL_FOOLS.get(), EpicSharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_APRIL_FOOLS.get(), LegendarySharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_APRIL_FOOLS.get(), MythicSharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_APRIL_FOOLS.get(), ExoticSharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_APRIL_FOOLS.get(), EngieSharkoAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_APRIL_FOOLS.get(), EngieSharkoRareAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_APRIL_FOOLS.get(), EngieSharkoRare2AprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY.get(), TobyRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_LAY.get(), SharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_LAY.get(), RareSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_LAY.get(), MythicSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_LAY.get(), EngieSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_LAY.get(), EngieSharkoRareLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_LAY.get(), EngieSharkoRare2LayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY_LAY.get(), TobyLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MARSHAL.get(), MarshalRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MARSHAL_LAY.get(), MarshalLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TIGER.get(), TigerRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TIGER_LAY.get(), TigerLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LOUIS.get(), LouisRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LOUIS_LAY.get(), LouisLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY_ZOOMIES.get(), TobyZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MARSHAL_ZOOMIES.get(), MarshalZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TIGER_ZOOMIES.get(), TigerZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LOUIS_ZOOMIES.get(), LouisZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_ZOOMIES_TIRED.get(), EngieSharkoRare2ZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY_ZOOMIES_TIRED.get(), TobyZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MARSHAL_ZOOMIES_TIRED.get(), MarshalZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TIGER_ZOOMIES_TIRED.get(), TigerZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LOUIS_ZOOMIES_TIRED.get(), LouisZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_TAMED_ZOOMIES_TIRED.get(), SharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_TAMED_ZOOMIES_TIRED.get(), AlbinoSharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_TAMED_ZOOMIES_TIRED.get(), RareSharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED_ZOOMIES_TIRED.get(), LegendarySharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), MythicSharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), ExoticSharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_TAMED_ZOOMIES_TIRED.get(), EngieSharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED_ZOOMIES_TIRED.get(), EngieSharkoRareTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES_TIRED.get(), EngieSharkoRare2TamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TOBY_SLEEP.get(), TobySleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MARSHAL_SLEEP.get(), MarshalSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.TIGER_SLEEP.get(), TigerSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LOUIS_SLEEP.get(), LouisSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_SLEEP.get(), SharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_SLEEP.get(), AlbinoSharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_SLEEP.get(), RareSharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_SLEEP.get(), LegendarySharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_SLEEP.get(), MythicSharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_SLEEP.get(), ExoticSharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_SLEEP.get(), EngieSharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_SLEEP.get(), EngieSharkoRareSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_SLEEP.get(), EngieSharkoRare2SleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BUDDY.get(), BuddyRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BUDDY_LAY.get(), BuddyLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BUDDY_ZOOMIES.get(), BuddyZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BUDDY_ZOOMIES_TIRED.get(), BuddyZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BUDDY_SLEEP.get(), BuddySleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.APOLLO.get(), ApolloRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.APOLLO_LAY.get(), ApolloLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.APOLLO_ZOOMIES.get(), ApolloZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.APOLLO_ZOOMIES_TIRED.get(), ApolloZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.APOLLO_SLEEP.get(), ApolloSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ATLAS.get(), AtlasRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ATLAS_LAY.get(), AtlasLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ATLAS_ZOOMIES.get(), AtlasZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ATLAS_ZOOMIES_TIRED.get(), AtlasZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ATLAS_SLEEP.get(), AtlasSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CBE.get(), CBERenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CBE_LAY.get(), CBELayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CBE_ZOOMIES.get(), CBEZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CBE_SLEEP.get(), CBESleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.CBE_ZOOMIES_TIRED.get(), CBEZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PBE.get(), PBERenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PBE_LAY.get(), PBELayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PBE_ZOOMIES.get(), PBEZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PBE_SLEEP.get(), PBESleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.PBE_ZOOMIES_TIRED.get(), PBEZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BOTHAN_2NET.get(), Bothan2netRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BOTHAN_2NET_LAY.get(), Bothan2netLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BOTHAN_2NET_ZOOMIES.get(), Bothan2netZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BOTHAN_2NET_ZOOMIES_TIRED.get(), Bothan2netZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.BOTHAN_2NET_SLEEP.get(), Bothan2netSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_LAY.get(), EpicSharkoLayRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), EpicSharkoTamedZoomiesTiredRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_SLEEP.get(), EpicSharkoSleepRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_LAY_APRIL_FOOLS.get(), SharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_LAY_APRIL_FOOLS.get(), AlbinoSharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_LAY_APRIL_FOOLS.get(), RareSharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_LAY_APRIL_FOOLS.get(), LegendarySharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_LAY_APRIL_FOOLS.get(), MythicSharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_LAY_APRIL_FOOLS.get(), ExoticSharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_LAY_APRIL_FOOLS.get(), EngieSharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_LAY_APRIL_FOOLS.get(), EngieSharkoRareLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_LAY_APRIL_FOOLS.get(), EngieSharkoRare2LayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_SLEEP_APRIL_FOOLS.get(), SharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_SLEEP_APRIL_FOOLS.get(), AlbinoSharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_SLEEP_APRIL_FOOLS.get(), RareSharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_SLEEP_APRIL_FOOLS.get(), LegendarySharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_SLEEP_APRIL_FOOLS.get(), MythicSharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_SLEEP_APRIL_FOOLS.get(), ExoticSharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_SLEEP_APRIL_FOOLS.get(), EngieSharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_SLEEP_APRIL_FOOLS.get(), EngieSharkoRareSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_SLEEP_APRIL_FOOLS.get(), EngieSharkoRare2SleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_LAY_APRIL_FOOLS.get(), EpicSharkoLayAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_SLEEP_APRIL_FOOLS.get(), EpicSharkoSleepAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL.get(), EnragedNormalRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_2.get(), EnragedNormal2Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_3.get(), EnragedNormal3Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_4.get(), EnragedNormal4Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_5.get(), EnragedNormal5Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_6.get(), EnragedNormal6Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_7.get(), EnragedNormal7Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_8.get(), EnragedNormal8Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_NORMAL_9.get(), EnragedNormal9Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT.get(), EnragedTNTRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_2.get(), EnragedTNT2Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_3.get(), EnragedTNT3Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_4.get(), EnragedTNT4Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_5.get(), EnragedTNT5Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_6.get(), EnragedTNT6Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_7.get(), EnragedTNT7Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_8.get(), EnragedTNT8Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_TNT_9.get(), EnragedTNT9Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED.get(), EnragedSpeedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_2.get(), EnragedSpeed2Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_3.get(), EnragedSpeed3Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_4.get(), EnragedSpeed4Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_5.get(), EnragedSpeed5Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_6.get(), EnragedSpeed6Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_7.get(), EnragedSpeed7Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_8.get(), EnragedSpeed8Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENRAGED_SPEED_9.get(), EnragedSpeed9Renderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_TAMED.get(), SharkTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_TAMED.get(), RareSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRareTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED.get(), EngieSharkoRare2TamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_TAMED_ZOOMIES.get(), SharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_TAMED_ZOOMIES.get(), AlbinoSharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_TAMED_ZOOMIES.get(), RareSharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED_ZOOMIES.get(), LegendarySharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED_ZOOMIES.get(), MythicSharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED_ZOOMIES.get(), ExoticSharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_TAMED_ZOOMIES.get(), EngieSharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED_ZOOMIES.get(), EngieSharkoRareTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES.get(), EngieSharkoRare2TamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_TAMED.get(), EpicSharkoTamedRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_TAMED_ZOOMIES.get(), EpicSharkoTamedZoomiesRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.SHARKO_TAMED_APRIL_FOOLS.get(), SharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ALBINO_SHARKO_TAMED_APRIL_FOOLS.get(), AlbinoSharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.RARE_SHARKO_TAMED_APRIL_FOOLS.get(), RareSharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED_APRIL_FOOLS.get(), LegendarySharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED_APRIL_FOOLS.get(), MythicSharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED_APRIL_FOOLS.get(), ExoticSharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_TAMED_APRIL_FOOLS.get(), EngieSharkoTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED_APRIL_FOOLS.get(), EngieSharkoRareTamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED_APRIL_FOOLS.get(), EngieSharkoRare2TamedAprilFoolsRenderer::new);
		event.registerEntityRenderer(AllaboutengieModEntities.EPIC_SHARKO_TAMED_APRIL_FOOLS.get(), EpicSharkoTamedAprilFoolsRenderer::new);
	}
}

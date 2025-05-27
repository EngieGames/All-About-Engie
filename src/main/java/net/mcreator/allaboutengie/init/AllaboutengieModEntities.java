
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.entity.YellowLightningEntity;
import net.mcreator.allaboutengie.entity.UncommonEngieEntity;
import net.mcreator.allaboutengie.entity.TobyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TobyZoomiesEntity;
import net.mcreator.allaboutengie.entity.TobySleepEntity;
import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.TigerZoomiesEntity;
import net.mcreator.allaboutengie.entity.TigerSleepEntity;
import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.entity.TigerEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoLayEntity;
import net.mcreator.allaboutengie.entity.SharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.SharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.RareSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.RareEngieEntity;
import net.mcreator.allaboutengie.entity.QuizzetEntity;
import net.mcreator.allaboutengie.entity.PureInsanityEntity;
import net.mcreator.allaboutengie.entity.ProtogenEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBESleepEntity;
import net.mcreator.allaboutengie.entity.PBELayEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.OutragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.OutragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.NormalEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.MythicEngieEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.MonstrosityEngieEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalSleepEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.MOABEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.LegendaryEngieEntity;
import net.mcreator.allaboutengie.entity.InsanityEntity;
import net.mcreator.allaboutengie.entity.HeWhoGamesHostileEntity;
import net.mcreator.allaboutengie.entity.HeWhoGamesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.ExoticEngieEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoEntity;
import net.mcreator.allaboutengie.entity.EpicSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EpicEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedTNTEntity;
import net.mcreator.allaboutengie.entity.EnragedTNT9Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT8Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT7Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT6Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT5Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT4Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT3Entity;
import net.mcreator.allaboutengie.entity.EnragedTNT2Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.EnragedSpeed9Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed8Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed7Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed6Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed5Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed4Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed3Entity;
import net.mcreator.allaboutengie.entity.EnragedSpeed2Entity;
import net.mcreator.allaboutengie.entity.EnragedNormalEntity;
import net.mcreator.allaboutengie.entity.EnragedNormal9Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal8Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal7Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal6Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal5Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal4Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal3Entity;
import net.mcreator.allaboutengie.entity.EnragedNormal2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle3Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.EnragedEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2AprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.EngieGamesEntity;
import net.mcreator.allaboutengie.entity.EngiFREntity;
import net.mcreator.allaboutengie.entity.EngiEntity;
import net.mcreator.allaboutengie.entity.CreatorEntity;
import net.mcreator.allaboutengie.entity.CosmoSleepEntity;
import net.mcreator.allaboutengie.entity.CosmoLayEntity;
import net.mcreator.allaboutengie.entity.CosmoEntity;
import net.mcreator.allaboutengie.entity.CommonEngieEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.CBESleepEntity;
import net.mcreator.allaboutengie.entity.CBELayEntity;
import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.BuddyZoomiesEntity;
import net.mcreator.allaboutengie.entity.BuddySleepEntity;
import net.mcreator.allaboutengie.entity.BuddyLayEntity;
import net.mcreator.allaboutengie.entity.BuddyEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.Bothan2netZoomiesEntity;
import net.mcreator.allaboutengie.entity.Bothan2netSleepEntity;
import net.mcreator.allaboutengie.entity.Bothan2netLayEntity;
import net.mcreator.allaboutengie.entity.Bothan2netEntity;
import net.mcreator.allaboutengie.entity.BlueBurstEntity;
import net.mcreator.allaboutengie.entity.BigSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigSharkoEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigRareSharkoEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigMythicSharkoEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigLegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEpicSharkoEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.BigAlbinoSharkoEntity;
import net.mcreator.allaboutengie.entity.BiblicallyAccurateEngieEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AtlasZoomiesEntity;
import net.mcreator.allaboutengie.entity.AtlasSleepEntity;
import net.mcreator.allaboutengie.entity.AtlasLayEntity;
import net.mcreator.allaboutengie.entity.AtlasEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ApolloZoomiesEntity;
import net.mcreator.allaboutengie.entity.ApolloSleepEntity;
import net.mcreator.allaboutengie.entity.ApolloLayEntity;
import net.mcreator.allaboutengie.entity.ApolloEntity;
import net.mcreator.allaboutengie.entity.AngryEngieStyle2Entity;
import net.mcreator.allaboutengie.entity.AngryEngieSharkoEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoAprilFoolsEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<EntityType<EngiEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EngiFREntity>> ENGI_FR = register("engi_fr",
			EntityType.Builder.<EngiFREntity>of(EngiFREntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiFREntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<CreatorEntity>> CREATOR = register("creator",
			EntityType.Builder.<CreatorEntity>of(CreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreatorEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EngieGamesEntity>> ENGIE_GAMES = register("engie_games",
			EntityType.Builder.<EngieGamesEntity>of(EngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuizzetEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BiblicallyAccurateEngieEntity>> BIBLICALLY_ACCURATE_ENGIE = register("biblically_accurate_engie",
			EntityType.Builder.<BiblicallyAccurateEngieEntity>of(BiblicallyAccurateEngieEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3)
					.setCustomClientFactory(BiblicallyAccurateEngieEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendaryEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticEngieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryEngieStyle2Entity>> ANGRY_ENGIE_STYLE_2 = register("angry_engie_style_2",
			EntityType.Builder.<AngryEngieStyle2Entity>of(AngryEngieStyle2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieStyle2Entity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EnragedEngieStyle2Entity>> ENRAGED_ENGIE_STYLE_2 = register("enraged_engie_style_2",
			EntityType.Builder.<EnragedEngieStyle2Entity>of(EnragedEngieStyle2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieStyle2Entity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EnragedEngieStyle3Entity>> ENRAGED_ENGIE_STYLE_3 = register("enraged_engie_style_3",
			EntityType.Builder.<EnragedEngieStyle3Entity>of(EnragedEngieStyle3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieStyle3Entity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryCreatorEntity>> OUTRAGED_ENGIE = register("outraged_engie",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<OutragedEngieStyle2Entity>> OUTRAGED_ENGIE_STYLE_2 = register("outraged_engie_style_2",
			EntityType.Builder.<OutragedEngieStyle2Entity>of(OutragedEngieStyle2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OutragedEngieStyle2Entity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MonstrosityEngieEntity>> MONSTROSITY_ENGIE = register("monstrosity_engie", EntityType.Builder.<MonstrosityEngieEntity>of(MonstrosityEngieEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MonstrosityEngieEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryEngieSharkoEntity>> ANGRY_ENGIE_SHARKO = register("angry_engie_sharko",
			EntityType.Builder.<AngryEngieSharkoEntity>of(AngryEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EnragedEngieSharkoEntity>> ENRAGED_ENGIE_SHARKO = register("enraged_engie_sharko",
			EntityType.Builder.<EnragedEngieSharkoEntity>of(EnragedEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<OutragedEngieSharkoEntity>> OUTRAGED_ENGIE_SHARKO = register("outraged_engie_sharko",
			EntityType.Builder.<OutragedEngieSharkoEntity>of(OutragedEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OutragedEngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MonstrosityEngieSharkoEntity>> MONSTROSITY_ENGIE_SHARKO = register("monstrosity_engie_sharko",
			EntityType.Builder.<MonstrosityEngieSharkoEntity>of(MonstrosityEngieSharkoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MonstrosityEngieSharkoEntity::new).fireImmune().sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<InsanityEntity>> INSANITY = register("insanity",
			EntityType.Builder.<InsanityEntity>of(InsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(InsanityEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoEntity>> ALBINO_SHARKO = register("albino_sharko",
			EntityType.Builder.<AlbinoSharkoEntity>of(AlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoEntity>> EPIC_SHARKO = register("epic_sharko",
			EntityType.Builder.<EpicSharkoEntity>of(EpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoEntity>> LEGENDARY_SHARKO = register("legendary_sharko",
			EntityType.Builder.<LegendarySharkoEntity>of(LegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoEntity>> MYTHIC_SHARKO = register("mythic_sharko",
			EntityType.Builder.<MythicSharkoEntity>of(MythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoEntity>> EXOTIC_SHARKO = register("exotic_sharko",
			EntityType.Builder.<ExoticSharkoEntity>of(ExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoEntity>> ENGIE_SHARKO = register("engie_sharko",
			EntityType.Builder.<EngieSharkoEntity>of(EngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRareEntity>> ENGIE_SHARKO_RARE = register("engie_sharko_rare",
			EntityType.Builder.<EngieSharkoRareEntity>of(EngieSharkoRareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRareEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2Entity>> ENGIE_SHARKO_RARE_2 = register("engie_sharko_rare_2",
			EntityType.Builder.<EngieSharkoRare2Entity>of(EngieSharkoRare2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRare2Entity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoAprilFoolsEntity>> SHARKO_APRIL_FOOLS = register("sharko_april_fools",
			EntityType.Builder.<SharkoAprilFoolsEntity>of(SharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoAprilFoolsEntity>> ALBINO_SHARKO_APRIL_FOOLS = register("albino_sharko_april_fools",
			EntityType.Builder.<AlbinoSharkoAprilFoolsEntity>of(AlbinoSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoAprilFoolsEntity>> RARE_SHARKO_APRIL_FOOLS = register("rare_sharko_april_fools",
			EntityType.Builder.<RareSharkoAprilFoolsEntity>of(RareSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoAprilFoolsEntity>> EPIC_SHARKO_APRIL_FOOLS = register("epic_sharko_april_fools",
			EntityType.Builder.<EpicSharkoAprilFoolsEntity>of(EpicSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EpicSharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoAprilFoolsEntity>> LEGENDARY_SHARKO_APRIL_FOOLS = register("legendary_sharko_april_fools",
			EntityType.Builder.<LegendarySharkoAprilFoolsEntity>of(LegendarySharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoAprilFoolsEntity>> MYTHIC_SHARKO_APRIL_FOOLS = register("mythic_sharko_april_fools",
			EntityType.Builder.<MythicSharkoAprilFoolsEntity>of(MythicSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoAprilFoolsEntity>> EXOTIC_SHARKO_APRIL_FOOLS = register("exotic_sharko_april_fools",
			EntityType.Builder.<ExoticSharkoAprilFoolsEntity>of(ExoticSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoAprilFoolsEntity>> ENGIE_SHARKO_APRIL_FOOLS = register("engie_sharko_april_fools",
			EntityType.Builder.<EngieSharkoAprilFoolsEntity>of(EngieSharkoAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRareAprilFoolsEntity>> ENGIE_SHARKO_RARE_APRIL_FOOLS = register("engie_sharko_rare_april_fools",
			EntityType.Builder.<EngieSharkoRareAprilFoolsEntity>of(EngieSharkoRareAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2AprilFoolsEntity>> ENGIE_SHARKO_RARE_2_APRIL_FOOLS = register("engie_sharko_rare_2_april_fools",
			EntityType.Builder.<EngieSharkoRare2AprilFoolsEntity>of(EngieSharkoRare2AprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2AprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<TobyEntity>> TOBY = register("toby",
			EntityType.Builder.<TobyEntity>of(TobyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobyEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoLayEntity>> SHARKO_LAY = register("sharko_lay",
			EntityType.Builder.<SharkoLayEntity>of(SharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoLayEntity>> ALBINO_SHARKO_LAY = register("albino_sharko_lay",
			EntityType.Builder.<AlbinoSharkoLayEntity>of(AlbinoSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoLayEntity>> RARE_SHARKO_LAY = register("rare_sharko_lay",
			EntityType.Builder.<RareSharkoLayEntity>of(RareSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoLayEntity>> LEGENDARY_SHARKO_LAY = register("legendary_sharko_lay",
			EntityType.Builder.<LegendarySharkoLayEntity>of(LegendarySharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendarySharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoLayEntity>> MYTHIC_SHARKO_LAY = register("mythic_sharko_lay",
			EntityType.Builder.<MythicSharkoLayEntity>of(MythicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoLayEntity>> EXOTIC_SHARKO_LAY = register("exotic_sharko_lay",
			EntityType.Builder.<ExoticSharkoLayEntity>of(ExoticSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoLayEntity>> ENGIE_SHARKO_LAY = register("engie_sharko_lay",
			EntityType.Builder.<EngieSharkoLayEntity>of(EngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRareLayEntity>> ENGIE_SHARKO_RARE_LAY = register("engie_sharko_rare_lay",
			EntityType.Builder.<EngieSharkoRareLayEntity>of(EngieSharkoRareLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRareLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRare2LayEntity>> ENGIE_SHARKO_RARE_2_LAY = register("engie_sharko_rare_2_lay",
			EntityType.Builder.<EngieSharkoRare2LayEntity>of(EngieSharkoRare2LayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoRare2LayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TobyLayEntity>> TOBY_LAY = register("toby_lay",
			EntityType.Builder.<TobyLayEntity>of(TobyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobyLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MarshalEntity>> MARSHAL = register("marshal",
			EntityType.Builder.<MarshalEntity>of(MarshalEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarshalEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MarshalLayEntity>> MARSHAL_LAY = register("marshal_lay",
			EntityType.Builder.<MarshalLayEntity>of(MarshalLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarshalLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TigerEntity>> TIGER = register("tiger",
			EntityType.Builder.<TigerEntity>of(TigerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<TigerLayEntity>> TIGER_LAY = register("tiger_lay",
			EntityType.Builder.<TigerLayEntity>of(TigerLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LouisEntity>> LOUIS = register("louis",
			EntityType.Builder.<LouisEntity>of(LouisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LouisEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LouisLayEntity>> LOUIS_LAY = register("louis_lay",
			EntityType.Builder.<LouisLayEntity>of(LouisLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LouisLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TobyZoomiesEntity>> TOBY_ZOOMIES = register("toby_zoomies",
			EntityType.Builder.<TobyZoomiesEntity>of(TobyZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobyZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MarshalZoomiesEntity>> MARSHAL_ZOOMIES = register("marshal_zoomies",
			EntityType.Builder.<MarshalZoomiesEntity>of(MarshalZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarshalZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<TigerZoomiesEntity>> TIGER_ZOOMIES = register("tiger_zoomies",
			EntityType.Builder.<TigerZoomiesEntity>of(TigerZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LouisZoomiesEntity>> LOUIS_ZOOMIES = register("louis_zoomies",
			EntityType.Builder.<LouisZoomiesEntity>of(LouisZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LouisZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2ZoomiesTiredEntity>> ENGIE_SHARKO_RARE_2_ZOOMIES_TIRED = register("engie_sharko_rare_2_zoomies_tired",
			EntityType.Builder.<EngieSharkoRare2ZoomiesTiredEntity>of(EngieSharkoRare2ZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2ZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TobyZoomiesTiredEntity>> TOBY_ZOOMIES_TIRED = register("toby_zoomies_tired",
			EntityType.Builder.<TobyZoomiesTiredEntity>of(TobyZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobyZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MarshalZoomiesTiredEntity>> MARSHAL_ZOOMIES_TIRED = register("marshal_zoomies_tired",
			EntityType.Builder.<MarshalZoomiesTiredEntity>of(MarshalZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarshalZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TigerZoomiesTiredEntity>> TIGER_ZOOMIES_TIRED = register("tiger_zoomies_tired",
			EntityType.Builder.<TigerZoomiesTiredEntity>of(TigerZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LouisZoomiesTiredEntity>> LOUIS_ZOOMIES_TIRED = register("louis_zoomies_tired",
			EntityType.Builder.<LouisZoomiesTiredEntity>of(LouisZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LouisZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<SharkoTamedZoomiesTiredEntity>> SHARKO_TAMED_ZOOMIES_TIRED = register("sharko_tamed_zoomies_tired",
			EntityType.Builder.<SharkoTamedZoomiesTiredEntity>of(SharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoTamedZoomiesTiredEntity>> ALBINO_SHARKO_TAMED_ZOOMIES_TIRED = register("albino_sharko_tamed_zoomies_tired",
			EntityType.Builder.<AlbinoSharkoTamedZoomiesTiredEntity>of(AlbinoSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoTamedZoomiesTiredEntity>> RARE_SHARKO_TAMED_ZOOMIES_TIRED = register("rare_sharko_tamed_zoomies_tired",
			EntityType.Builder.<RareSharkoTamedZoomiesTiredEntity>of(RareSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoTamedZoomiesTiredEntity>> LEGENDARY_SHARKO_TAMED_ZOOMIES_TIRED = register("legendary_sharko_tamed_zoomies_tired",
			EntityType.Builder.<LegendarySharkoTamedZoomiesTiredEntity>of(LegendarySharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoTamedZoomiesTiredEntity>> MYTHIC_SHARKO_TAMED_ZOOMIES_TIRED = register("mythic_sharko_tamed_zoomies_tired",
			EntityType.Builder.<MythicSharkoTamedZoomiesTiredEntity>of(MythicSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoTamedZoomiesTiredEntity>> EXOTIC_SHARKO_TAMED_ZOOMIES_TIRED = register("exotic_sharko_tamed_zoomies_tired",
			EntityType.Builder.<ExoticSharkoTamedZoomiesTiredEntity>of(ExoticSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoTamedZoomiesTiredEntity>> ENGIE_SHARKO_TAMED_ZOOMIES_TIRED = register("engie_sharko_tamed_zoomies_tired",
			EntityType.Builder.<EngieSharkoTamedZoomiesTiredEntity>of(EngieSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRareTamedZoomiesTiredEntity>> ENGIE_SHARKO_RARE_TAMED_ZOOMIES_TIRED = register("engie_sharko_rare_tamed_zoomies_tired",
			EntityType.Builder.<EngieSharkoRareTamedZoomiesTiredEntity>of(EngieSharkoRareTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRare2TamedZoomiesTiredEntity>> ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES_TIRED = register("engie_sharko_rare_2_tamed_zoomies_tired",
			EntityType.Builder.<EngieSharkoRare2TamedZoomiesTiredEntity>of(EngieSharkoRare2TamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2TamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TobySleepEntity>> TOBY_SLEEP = register("toby_sleep",
			EntityType.Builder.<TobySleepEntity>of(TobySleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobySleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MarshalSleepEntity>> MARSHAL_SLEEP = register("marshal_sleep",
			EntityType.Builder.<MarshalSleepEntity>of(MarshalSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MarshalSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<TigerSleepEntity>> TIGER_SLEEP = register("tiger_sleep",
			EntityType.Builder.<TigerSleepEntity>of(TigerSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TigerSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LouisSleepEntity>> LOUIS_SLEEP = register("louis_sleep",
			EntityType.Builder.<LouisSleepEntity>of(LouisSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LouisSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<SharkoSleepEntity>> SHARKO_SLEEP = register("sharko_sleep",
			EntityType.Builder.<SharkoSleepEntity>of(SharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoSleepEntity>> ALBINO_SHARKO_SLEEP = register("albino_sharko_sleep",
			EntityType.Builder.<AlbinoSharkoSleepEntity>of(AlbinoSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoSleepEntity>> RARE_SHARKO_SLEEP = register("rare_sharko_sleep",
			EntityType.Builder.<RareSharkoSleepEntity>of(RareSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoSleepEntity>> LEGENDARY_SHARKO_SLEEP = register("legendary_sharko_sleep",
			EntityType.Builder.<LegendarySharkoSleepEntity>of(LegendarySharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoSleepEntity>> MYTHIC_SHARKO_SLEEP = register("mythic_sharko_sleep",
			EntityType.Builder.<MythicSharkoSleepEntity>of(MythicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoSleepEntity>> EXOTIC_SHARKO_SLEEP = register("exotic_sharko_sleep",
			EntityType.Builder.<ExoticSharkoSleepEntity>of(ExoticSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoSleepEntity>> ENGIE_SHARKO_SLEEP = register("engie_sharko_sleep",
			EntityType.Builder.<EngieSharkoSleepEntity>of(EngieSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRareSleepEntity>> ENGIE_SHARKO_RARE_SLEEP = register("engie_sharko_rare_sleep",
			EntityType.Builder.<EngieSharkoRareSleepEntity>of(EngieSharkoRareSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRare2SleepEntity>> ENGIE_SHARKO_RARE_2_SLEEP = register("engie_sharko_rare_2_sleep",
			EntityType.Builder.<EngieSharkoRare2SleepEntity>of(EngieSharkoRare2SleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2SleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<BuddyEntity>> BUDDY = register("buddy",
			EntityType.Builder.<BuddyEntity>of(BuddyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BuddyEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<BuddyLayEntity>> BUDDY_LAY = register("buddy_lay",
			EntityType.Builder.<BuddyLayEntity>of(BuddyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BuddyLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<BuddyZoomiesEntity>> BUDDY_ZOOMIES = register("buddy_zoomies",
			EntityType.Builder.<BuddyZoomiesEntity>of(BuddyZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BuddyZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<BuddyZoomiesTiredEntity>> BUDDY_ZOOMIES_TIRED = register("buddy_zoomies_tired",
			EntityType.Builder.<BuddyZoomiesTiredEntity>of(BuddyZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BuddyZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<BuddySleepEntity>> BUDDY_SLEEP = register("buddy_sleep",
			EntityType.Builder.<BuddySleepEntity>of(BuddySleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BuddySleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ApolloEntity>> APOLLO = register("apollo",
			EntityType.Builder.<ApolloEntity>of(ApolloEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApolloEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ApolloLayEntity>> APOLLO_LAY = register("apollo_lay",
			EntityType.Builder.<ApolloLayEntity>of(ApolloLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApolloLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ApolloZoomiesEntity>> APOLLO_ZOOMIES = register("apollo_zoomies",
			EntityType.Builder.<ApolloZoomiesEntity>of(ApolloZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApolloZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ApolloZoomiesTiredEntity>> APOLLO_ZOOMIES_TIRED = register("apollo_zoomies_tired",
			EntityType.Builder.<ApolloZoomiesTiredEntity>of(ApolloZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApolloZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ApolloSleepEntity>> APOLLO_SLEEP = register("apollo_sleep",
			EntityType.Builder.<ApolloSleepEntity>of(ApolloSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ApolloSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AtlasEntity>> ATLAS = register("atlas",
			EntityType.Builder.<AtlasEntity>of(AtlasEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtlasEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AtlasLayEntity>> ATLAS_LAY = register("atlas_lay",
			EntityType.Builder.<AtlasLayEntity>of(AtlasLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtlasLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AtlasZoomiesEntity>> ATLAS_ZOOMIES = register("atlas_zoomies",
			EntityType.Builder.<AtlasZoomiesEntity>of(AtlasZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtlasZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AtlasZoomiesTiredEntity>> ATLAS_ZOOMIES_TIRED = register("atlas_zoomies_tired",
			EntityType.Builder.<AtlasZoomiesTiredEntity>of(AtlasZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtlasZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AtlasSleepEntity>> ATLAS_SLEEP = register("atlas_sleep",
			EntityType.Builder.<AtlasSleepEntity>of(AtlasSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AtlasSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<CBEEntity>> CBE = register("cbe",
			EntityType.Builder.<CBEEntity>of(CBEEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CBEEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<CBELayEntity>> CBE_LAY = register("cbe_lay",
			EntityType.Builder.<CBELayEntity>of(CBELayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CBELayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<CBEZoomiesEntity>> CBE_ZOOMIES = register("cbe_zoomies",
			EntityType.Builder.<CBEZoomiesEntity>of(CBEZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CBEZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<CBESleepEntity>> CBE_SLEEP = register("cbe_sleep",
			EntityType.Builder.<CBESleepEntity>of(CBESleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CBESleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<CBEZoomiesTiredEntity>> CBE_ZOOMIES_TIRED = register("cbe_zoomies_tired",
			EntityType.Builder.<CBEZoomiesTiredEntity>of(CBEZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CBEZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<PBEEntity>> PBE = register("pbe",
			EntityType.Builder.<PBEEntity>of(PBEEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PBEEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<PBELayEntity>> PBE_LAY = register("pbe_lay",
			EntityType.Builder.<PBELayEntity>of(PBELayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PBELayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<PBEZoomiesEntity>> PBE_ZOOMIES = register("pbe_zoomies",
			EntityType.Builder.<PBEZoomiesEntity>of(PBEZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PBEZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<PBESleepEntity>> PBE_SLEEP = register("pbe_sleep",
			EntityType.Builder.<PBESleepEntity>of(PBESleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PBESleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<PBEZoomiesTiredEntity>> PBE_ZOOMIES_TIRED = register("pbe_zoomies_tired",
			EntityType.Builder.<PBEZoomiesTiredEntity>of(PBEZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PBEZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<Bothan2netEntity>> BOTHAN_2NET = register("bothan_2net",
			EntityType.Builder.<Bothan2netEntity>of(Bothan2netEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Bothan2netEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<Bothan2netLayEntity>> BOTHAN_2NET_LAY = register("bothan_2net_lay",
			EntityType.Builder.<Bothan2netLayEntity>of(Bothan2netLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Bothan2netLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<Bothan2netZoomiesEntity>> BOTHAN_2NET_ZOOMIES = register("bothan_2net_zoomies",
			EntityType.Builder.<Bothan2netZoomiesEntity>of(Bothan2netZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Bothan2netZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<Bothan2netZoomiesTiredEntity>> BOTHAN_2NET_ZOOMIES_TIRED = register("bothan_2net_zoomies_tired",
			EntityType.Builder.<Bothan2netZoomiesTiredEntity>of(Bothan2netZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(Bothan2netZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<Bothan2netSleepEntity>> BOTHAN_2NET_SLEEP = register("bothan_2net_sleep",
			EntityType.Builder.<Bothan2netSleepEntity>of(Bothan2netSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Bothan2netSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EpicSharkoLayEntity>> EPIC_SHARKO_LAY = register("epic_sharko_lay",
			EntityType.Builder.<EpicSharkoLayEntity>of(EpicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicSharkoLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EpicSharkoTamedZoomiesTiredEntity>> EPIC_SHARKO_TAMED_ZOOMIES_TIRED = register("epic_sharko_tamed_zoomies_tired",
			EntityType.Builder.<EpicSharkoTamedZoomiesTiredEntity>of(EpicSharkoTamedZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EpicSharkoTamedZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EpicSharkoSleepEntity>> EPIC_SHARKO_SLEEP = register("epic_sharko_sleep",
			EntityType.Builder.<EpicSharkoSleepEntity>of(EpicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<SharkoLayAprilFoolsEntity>> SHARKO_LAY_APRIL_FOOLS = register("sharko_lay_april_fools",
			EntityType.Builder.<SharkoLayAprilFoolsEntity>of(SharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoLayAprilFoolsEntity>> ALBINO_SHARKO_LAY_APRIL_FOOLS = register("albino_sharko_lay_april_fools",
			EntityType.Builder.<AlbinoSharkoLayAprilFoolsEntity>of(AlbinoSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoLayAprilFoolsEntity>> RARE_SHARKO_LAY_APRIL_FOOLS = register("rare_sharko_lay_april_fools",
			EntityType.Builder.<RareSharkoLayAprilFoolsEntity>of(RareSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoLayAprilFoolsEntity>> LEGENDARY_SHARKO_LAY_APRIL_FOOLS = register("legendary_sharko_lay_april_fools",
			EntityType.Builder.<LegendarySharkoLayAprilFoolsEntity>of(LegendarySharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoLayAprilFoolsEntity>> MYTHIC_SHARKO_LAY_APRIL_FOOLS = register("mythic_sharko_lay_april_fools",
			EntityType.Builder.<MythicSharkoLayAprilFoolsEntity>of(MythicSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoLayAprilFoolsEntity>> EXOTIC_SHARKO_LAY_APRIL_FOOLS = register("exotic_sharko_lay_april_fools",
			EntityType.Builder.<ExoticSharkoLayAprilFoolsEntity>of(ExoticSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoLayAprilFoolsEntity>> ENGIE_SHARKO_LAY_APRIL_FOOLS = register("engie_sharko_lay_april_fools",
			EntityType.Builder.<EngieSharkoLayAprilFoolsEntity>of(EngieSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRareLayAprilFoolsEntity>> ENGIE_SHARKO_RARE_LAY_APRIL_FOOLS = register("engie_sharko_rare_lay_april_fools",
			EntityType.Builder.<EngieSharkoRareLayAprilFoolsEntity>of(EngieSharkoRareLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRare2LayAprilFoolsEntity>> ENGIE_SHARKO_RARE_2_LAY_APRIL_FOOLS = register("engie_sharko_rare_2_lay_april_fools",
			EntityType.Builder.<EngieSharkoRare2LayAprilFoolsEntity>of(EngieSharkoRare2LayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2LayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<SharkoSleepAprilFoolsEntity>> SHARKO_SLEEP_APRIL_FOOLS = register("sharko_sleep_april_fools",
			EntityType.Builder.<SharkoSleepAprilFoolsEntity>of(SharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoSleepAprilFoolsEntity>> ALBINO_SHARKO_SLEEP_APRIL_FOOLS = register("albino_sharko_sleep_april_fools",
			EntityType.Builder.<AlbinoSharkoSleepAprilFoolsEntity>of(AlbinoSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoSleepAprilFoolsEntity>> RARE_SHARKO_SLEEP_APRIL_FOOLS = register("rare_sharko_sleep_april_fools",
			EntityType.Builder.<RareSharkoSleepAprilFoolsEntity>of(RareSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoSleepAprilFoolsEntity>> LEGENDARY_SHARKO_SLEEP_APRIL_FOOLS = register("legendary_sharko_sleep_april_fools",
			EntityType.Builder.<LegendarySharkoSleepAprilFoolsEntity>of(LegendarySharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoSleepAprilFoolsEntity>> MYTHIC_SHARKO_SLEEP_APRIL_FOOLS = register("mythic_sharko_sleep_april_fools",
			EntityType.Builder.<MythicSharkoSleepAprilFoolsEntity>of(MythicSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoSleepAprilFoolsEntity>> EXOTIC_SHARKO_SLEEP_APRIL_FOOLS = register("exotic_sharko_sleep_april_fools",
			EntityType.Builder.<ExoticSharkoSleepAprilFoolsEntity>of(ExoticSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoSleepAprilFoolsEntity>> ENGIE_SHARKO_SLEEP_APRIL_FOOLS = register("engie_sharko_sleep_april_fools",
			EntityType.Builder.<EngieSharkoSleepAprilFoolsEntity>of(EngieSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRareSleepAprilFoolsEntity>> ENGIE_SHARKO_RARE_SLEEP_APRIL_FOOLS = register("engie_sharko_rare_sleep_april_fools",
			EntityType.Builder.<EngieSharkoRareSleepAprilFoolsEntity>of(EngieSharkoRareSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRare2SleepAprilFoolsEntity>> ENGIE_SHARKO_RARE_2_SLEEP_APRIL_FOOLS = register("engie_sharko_rare_2_sleep_april_fools",
			EntityType.Builder.<EngieSharkoRare2SleepAprilFoolsEntity>of(EngieSharkoRare2SleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2SleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EpicSharkoLayAprilFoolsEntity>> EPIC_SHARKO_LAY_APRIL_FOOLS = register("epic_sharko_lay_april_fools",
			EntityType.Builder.<EpicSharkoLayAprilFoolsEntity>of(EpicSharkoLayAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EpicSharkoLayAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EpicSharkoSleepAprilFoolsEntity>> EPIC_SHARKO_SLEEP_APRIL_FOOLS = register("epic_sharko_sleep_april_fools",
			EntityType.Builder.<EpicSharkoSleepAprilFoolsEntity>of(EpicSharkoSleepAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EpicSharkoSleepAprilFoolsEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<BigSharkoEntity>> BIG_SHARKO = register("big_sharko",
			EntityType.Builder.<BigSharkoEntity>of(BigSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigAlbinoSharkoEntity>> BIG_ALBINO_SHARKO = register("big_albino_sharko",
			EntityType.Builder.<BigAlbinoSharkoEntity>of(BigAlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigAlbinoSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigRareSharkoEntity>> BIG_RARE_SHARKO = register("big_rare_sharko",
			EntityType.Builder.<BigRareSharkoEntity>of(BigRareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEpicSharkoEntity>> BIG_EPIC_SHARKO = register("big_epic_sharko",
			EntityType.Builder.<BigEpicSharkoEntity>of(BigEpicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEpicSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigLegendarySharkoEntity>> BIG_LEGENDARY_SHARKO = register("big_legendary_sharko",
			EntityType.Builder.<BigLegendarySharkoEntity>of(BigLegendarySharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigLegendarySharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigMythicSharkoEntity>> BIG_MYTHIC_SHARKO = register("big_mythic_sharko",
			EntityType.Builder.<BigMythicSharkoEntity>of(BigMythicSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigMythicSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigExoticSharkoEntity>> BIG_EXOTIC_SHARKO = register("big_exotic_sharko",
			EntityType.Builder.<BigExoticSharkoEntity>of(BigExoticSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigExoticSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoEntity>> BIG_ENGIE_SHARKO = register("big_engie_sharko",
			EntityType.Builder.<BigEngieSharkoEntity>of(BigEngieSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoRareEntity>> BIG_ENGIE_SHARKO_RARE = register("big_engie_sharko_rare",
			EntityType.Builder.<BigEngieSharkoRareEntity>of(BigEngieSharkoRareEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoRareEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoRare2Entity>> BIG_ENGIE_SHARKO_RARE_2 = register("big_engie_sharko_rare_2",
			EntityType.Builder.<BigEngieSharkoRare2Entity>of(BigEngieSharkoRare2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoRare2Entity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigSharkoLayEntity>> BIG_SHARKO_LAY = register("big_sharko_lay",
			EntityType.Builder.<BigSharkoLayEntity>of(BigSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigAlbinoSharkoLayEntity>> BIG_ALBINO_SHARKO_LAY = register("big_albino_sharko_lay",
			EntityType.Builder.<BigAlbinoSharkoLayEntity>of(BigAlbinoSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigAlbinoSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigRareSharkoLayEntity>> BIG_RARE_SHARKO_LAY = register("big_rare_sharko_lay",
			EntityType.Builder.<BigRareSharkoLayEntity>of(BigRareSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigLegendarySharkoLayEntity>> BIG_LEGENDARY_SHARKO_LAY = register("big_legendary_sharko_lay",
			EntityType.Builder.<BigLegendarySharkoLayEntity>of(BigLegendarySharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigLegendarySharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigMythicSharkoLayEntity>> BIG_MYTHIC_SHARKO_LAY = register("big_mythic_sharko_lay",
			EntityType.Builder.<BigMythicSharkoLayEntity>of(BigMythicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigMythicSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigExoticSharkoLayEntity>> BIG_EXOTIC_SHARKO_LAY = register("big_exotic_sharko_lay",
			EntityType.Builder.<BigExoticSharkoLayEntity>of(BigExoticSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigExoticSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEngieSharkoLayEntity>> BIG_ENGIE_SHARKO_LAY = register("big_engie_sharko_lay",
			EntityType.Builder.<BigEngieSharkoLayEntity>of(BigEngieSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEngieSharkoRareLayEntity>> BIG_ENGIE_SHARKO_RARE_LAY = register("big_engie_sharko_rare_lay",
			EntityType.Builder.<BigEngieSharkoRareLayEntity>of(BigEngieSharkoRareLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigEngieSharkoRareLayEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<BigEngieSharkoRare2LayEntity>> BIG_ENGIE_SHARKO_RARE_2_LAY = register("big_engie_sharko_rare_2_lay",
			EntityType.Builder.<BigEngieSharkoRare2LayEntity>of(BigEngieSharkoRare2LayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigEngieSharkoRare2LayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigSharkoSleepEntity>> BIG_SHARKO_SLEEP = register("big_sharko_sleep",
			EntityType.Builder.<BigSharkoSleepEntity>of(BigSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigSharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigAlbinoSharkoSleepEntity>> BIG_ALBINO_SHARKO_SLEEP = register("big_albino_sharko_sleep",
			EntityType.Builder.<BigAlbinoSharkoSleepEntity>of(BigAlbinoSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigAlbinoSharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigRareSharkoSleepEntity>> BIG_RARE_SHARKO_SLEEP = register("big_rare_sharko_sleep",
			EntityType.Builder.<BigRareSharkoSleepEntity>of(BigRareSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareSharkoSleepEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<BigLegendarySharkoSleepEntity>> BIG_LEGENDARY_SHARKO_SLEEP = register("big_legendary_sharko_sleep",
			EntityType.Builder.<BigLegendarySharkoSleepEntity>of(BigLegendarySharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigLegendarySharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigMythicSharkoSleepEntity>> BIG_MYTHIC_SHARKO_SLEEP = register("big_mythic_sharko_sleep",
			EntityType.Builder.<BigMythicSharkoSleepEntity>of(BigMythicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigMythicSharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigExoticSharkoSleepEntity>> BIG_EXOTIC_SHARKO_SLEEP = register("big_exotic_sharko_sleep",
			EntityType.Builder.<BigExoticSharkoSleepEntity>of(BigExoticSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigExoticSharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEngieSharkoSleepEntity>> BIG_ENGIE_SHARKO_SLEEP = register("big_engie_sharko_sleep",
			EntityType.Builder.<BigEngieSharkoSleepEntity>of(BigEngieSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEngieSharkoRareSleepEntity>> BIG_ENGIE_SHARKO_RARE_SLEEP = register("big_engie_sharko_rare_sleep",
			EntityType.Builder.<BigEngieSharkoRareSleepEntity>of(BigEngieSharkoRareSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigEngieSharkoRareSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEngieSharkoRare2SleepEntity>> BIG_ENGIE_SHARKO_RARE_2_SLEEP = register("big_engie_sharko_rare_2_sleep",
			EntityType.Builder.<BigEngieSharkoRare2SleepEntity>of(BigEngieSharkoRare2SleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigEngieSharkoRare2SleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEpicSharkoLayEntity>> BIG_EPIC_SHARKO_LAY = register("big_epic_sharko_lay",
			EntityType.Builder.<BigEpicSharkoLayEntity>of(BigEpicSharkoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEpicSharkoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<BigEpicSharkoSleepEntity>> BIG_EPIC_SHARKO_SLEEP = register("big_epic_sharko_sleep",
			EntityType.Builder.<BigEpicSharkoSleepEntity>of(BigEpicSharkoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEpicSharkoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<CosmoSleepEntity>> COSMO_SLEEP = register("cosmo_sleep",
			EntityType.Builder.<CosmoSleepEntity>of(CosmoSleepEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmoSleepEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<CosmoLayEntity>> COSMO_LAY = register("cosmo_lay",
			EntityType.Builder.<CosmoLayEntity>of(CosmoLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmoLayEntity::new)

					.sized(1.4f, 1.2f));
	public static final RegistryObject<EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal2Entity>> ENRAGED_NORMAL_2 = register("enraged_normal_2",
			EntityType.Builder.<EnragedNormal2Entity>of(EnragedNormal2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal3Entity>> ENRAGED_NORMAL_3 = register("enraged_normal_3",
			EntityType.Builder.<EnragedNormal3Entity>of(EnragedNormal3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal4Entity>> ENRAGED_NORMAL_4 = register("enraged_normal_4",
			EntityType.Builder.<EnragedNormal4Entity>of(EnragedNormal4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal5Entity>> ENRAGED_NORMAL_5 = register("enraged_normal_5",
			EntityType.Builder.<EnragedNormal5Entity>of(EnragedNormal5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal6Entity>> ENRAGED_NORMAL_6 = register("enraged_normal_6",
			EntityType.Builder.<EnragedNormal6Entity>of(EnragedNormal6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal7Entity>> ENRAGED_NORMAL_7 = register("enraged_normal_7",
			EntityType.Builder.<EnragedNormal7Entity>of(EnragedNormal7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal8Entity>> ENRAGED_NORMAL_8 = register("enraged_normal_8",
			EntityType.Builder.<EnragedNormal8Entity>of(EnragedNormal8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedNormal9Entity>> ENRAGED_NORMAL_9 = register("enraged_normal_9",
			EntityType.Builder.<EnragedNormal9Entity>of(EnragedNormal9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormal9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNTEntity>> ENRAGED_TNT = register("enraged_tnt",
			EntityType.Builder.<EnragedTNTEntity>of(EnragedTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNTEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT2Entity>> ENRAGED_TNT_2 = register("enraged_tnt_2",
			EntityType.Builder.<EnragedTNT2Entity>of(EnragedTNT2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT3Entity>> ENRAGED_TNT_3 = register("enraged_tnt_3",
			EntityType.Builder.<EnragedTNT3Entity>of(EnragedTNT3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT4Entity>> ENRAGED_TNT_4 = register("enraged_tnt_4",
			EntityType.Builder.<EnragedTNT4Entity>of(EnragedTNT4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT5Entity>> ENRAGED_TNT_5 = register("enraged_tnt_5",
			EntityType.Builder.<EnragedTNT5Entity>of(EnragedTNT5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT6Entity>> ENRAGED_TNT_6 = register("enraged_tnt_6",
			EntityType.Builder.<EnragedTNT6Entity>of(EnragedTNT6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT7Entity>> ENRAGED_TNT_7 = register("enraged_tnt_7",
			EntityType.Builder.<EnragedTNT7Entity>of(EnragedTNT7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT8Entity>> ENRAGED_TNT_8 = register("enraged_tnt_8",
			EntityType.Builder.<EnragedTNT8Entity>of(EnragedTNT8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedTNT9Entity>> ENRAGED_TNT_9 = register("enraged_tnt_9",
			EntityType.Builder.<EnragedTNT9Entity>of(EnragedTNT9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedTNT9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeedEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed2Entity>> ENRAGED_SPEED_2 = register("enraged_speed_2",
			EntityType.Builder.<EnragedSpeed2Entity>of(EnragedSpeed2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed3Entity>> ENRAGED_SPEED_3 = register("enraged_speed_3",
			EntityType.Builder.<EnragedSpeed3Entity>of(EnragedSpeed3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed3Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed4Entity>> ENRAGED_SPEED_4 = register("enraged_speed_4",
			EntityType.Builder.<EnragedSpeed4Entity>of(EnragedSpeed4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed5Entity>> ENRAGED_SPEED_5 = register("enraged_speed_5",
			EntityType.Builder.<EnragedSpeed5Entity>of(EnragedSpeed5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed5Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed6Entity>> ENRAGED_SPEED_6 = register("enraged_speed_6",
			EntityType.Builder.<EnragedSpeed6Entity>of(EnragedSpeed6Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed6Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed7Entity>> ENRAGED_SPEED_7 = register("enraged_speed_7",
			EntityType.Builder.<EnragedSpeed7Entity>of(EnragedSpeed7Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed7Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed8Entity>> ENRAGED_SPEED_8 = register("enraged_speed_8",
			EntityType.Builder.<EnragedSpeed8Entity>of(EnragedSpeed8Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed8Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnragedSpeed9Entity>> ENRAGED_SPEED_9 = register("enraged_speed_9",
			EntityType.Builder.<EnragedSpeed9Entity>of(EnragedSpeed9Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeed9Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeWhoGamesEntity>> HE_WHO_GAMES = register("he_who_games", EntityType.Builder.<HeWhoGamesEntity>of(HeWhoGamesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeWhoGamesEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HeWhoGamesHostileEntity>> HE_WHO_GAMES_HOSTILE = register("he_who_games_hostile", EntityType.Builder.<HeWhoGamesHostileEntity>of(HeWhoGamesHostileEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HeWhoGamesHostileEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SharkTamedEntity>> SHARKO_TAMED = register("sharko_tamed",
			EntityType.Builder.<SharkTamedEntity>of(SharkTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoTamedEntity>> ALBINO_SHARKO_TAMED = register("albino_sharko_tamed",
			EntityType.Builder.<AlbinoSharkoTamedEntity>of(AlbinoSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoTamedEntity>> RARE_SHARKO_TAMED = register("rare_sharko_tamed",
			EntityType.Builder.<RareSharkoTamedEntity>of(RareSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoTamedEntity>> LEGENDARY_SHARKO_TAMED = register("legendary_sharko_tamed",
			EntityType.Builder.<LegendarySharkoTamedEntity>of(LegendarySharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoTamedEntity>> MYTHIC_SHARKO_TAMED = register("mythic_sharko_tamed",
			EntityType.Builder.<MythicSharkoTamedEntity>of(MythicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoTamedEntity>> EXOTIC_SHARKO_TAMED = register("exotic_sharko_tamed",
			EntityType.Builder.<ExoticSharkoTamedEntity>of(ExoticSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoTamedEntity>> ENGIE_SHARKO_TAMED = register("engie_sharko_tamed",
			EntityType.Builder.<EngieSharkoTamedEntity>of(EngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRareTamedEntity>> ENGIE_SHARKO_RARE_TAMED = register("engie_sharko_rare_tamed",
			EntityType.Builder.<EngieSharkoRareTamedEntity>of(EngieSharkoRareTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2TamedEntity>> ENGIE_SHARKO_RARE_2_TAMED = register("engie_sharko_rare_2_tamed",
			EntityType.Builder.<EngieSharkoRare2TamedEntity>of(EngieSharkoRare2TamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2TamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoTamedZoomiesEntity>> SHARKO_TAMED_ZOOMIES = register("sharko_tamed_zoomies",
			EntityType.Builder.<SharkoTamedZoomiesEntity>of(SharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoTamedZoomiesEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AlbinoSharkoTamedZoomiesEntity>> ALBINO_SHARKO_TAMED_ZOOMIES = register("albino_sharko_tamed_zoomies",
			EntityType.Builder.<AlbinoSharkoTamedZoomiesEntity>of(AlbinoSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoTamedZoomiesEntity>> RARE_SHARKO_TAMED_ZOOMIES = register("rare_sharko_tamed_zoomies",
			EntityType.Builder.<RareSharkoTamedZoomiesEntity>of(RareSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoTamedZoomiesEntity>> LEGENDARY_SHARKO_TAMED_ZOOMIES = register("legendary_sharko_tamed_zoomies",
			EntityType.Builder.<LegendarySharkoTamedZoomiesEntity>of(LegendarySharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoTamedZoomiesEntity>> MYTHIC_SHARKO_TAMED_ZOOMIES = register("mythic_sharko_tamed_zoomies",
			EntityType.Builder.<MythicSharkoTamedZoomiesEntity>of(MythicSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoTamedZoomiesEntity>> EXOTIC_SHARKO_TAMED_ZOOMIES = register("exotic_sharko_tamed_zoomies",
			EntityType.Builder.<ExoticSharkoTamedZoomiesEntity>of(ExoticSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoTamedZoomiesEntity>> ENGIE_SHARKO_TAMED_ZOOMIES = register("engie_sharko_tamed_zoomies",
			EntityType.Builder.<EngieSharkoTamedZoomiesEntity>of(EngieSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRareTamedZoomiesEntity>> ENGIE_SHARKO_RARE_TAMED_ZOOMIES = register("engie_sharko_rare_tamed_zoomies",
			EntityType.Builder.<EngieSharkoRareTamedZoomiesEntity>of(EngieSharkoRareTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2TamedZoomiesEntity>> ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES = register("engie_sharko_rare_2_tamed_zoomies",
			EntityType.Builder.<EngieSharkoRare2TamedZoomiesEntity>of(EngieSharkoRare2TamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2TamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoTamedEntity>> EPIC_SHARKO_TAMED = register("epic_sharko_tamed",
			EntityType.Builder.<EpicSharkoTamedEntity>of(EpicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicSharkoTamedEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoTamedZoomiesEntity>> EPIC_SHARKO_TAMED_ZOOMIES = register("epic_sharko_tamed_zoomies",
			EntityType.Builder.<EpicSharkoTamedZoomiesEntity>of(EpicSharkoTamedZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EpicSharkoTamedZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<SharkoTamedAprilFoolsEntity>> SHARKO_TAMED_APRIL_FOOLS = register("sharko_tamed_april_fools",
			EntityType.Builder.<SharkoTamedAprilFoolsEntity>of(SharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoTamedAprilFoolsEntity>> ALBINO_SHARKO_TAMED_APRIL_FOOLS = register("albino_sharko_tamed_april_fools",
			EntityType.Builder.<AlbinoSharkoTamedAprilFoolsEntity>of(AlbinoSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoTamedAprilFoolsEntity>> RARE_SHARKO_TAMED_APRIL_FOOLS = register("rare_sharko_tamed_april_fools",
			EntityType.Builder.<RareSharkoTamedAprilFoolsEntity>of(RareSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoTamedAprilFoolsEntity>> LEGENDARY_SHARKO_TAMED_APRIL_FOOLS = register("legendary_sharko_tamed_april_fools",
			EntityType.Builder.<LegendarySharkoTamedAprilFoolsEntity>of(LegendarySharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoTamedAprilFoolsEntity>> MYTHIC_SHARKO_TAMED_APRIL_FOOLS = register("mythic_sharko_tamed_april_fools",
			EntityType.Builder.<MythicSharkoTamedAprilFoolsEntity>of(MythicSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoTamedAprilFoolsEntity>> EXOTIC_SHARKO_TAMED_APRIL_FOOLS = register("exotic_sharko_tamed_april_fools",
			EntityType.Builder.<ExoticSharkoTamedAprilFoolsEntity>of(ExoticSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoTamedAprilFoolsEntity>> ENGIE_SHARKO_TAMED_APRIL_FOOLS = register("engie_sharko_tamed_april_fools",
			EntityType.Builder.<EngieSharkoTamedAprilFoolsEntity>of(EngieSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRareTamedAprilFoolsEntity>> ENGIE_SHARKO_RARE_TAMED_APRIL_FOOLS = register("engie_sharko_rare_tamed_april_fools",
			EntityType.Builder.<EngieSharkoRareTamedAprilFoolsEntity>of(EngieSharkoRareTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2TamedAprilFoolsEntity>> ENGIE_SHARKO_RARE_2_TAMED_APRIL_FOOLS = register("engie_sharko_rare_2_tamed_april_fools",
			EntityType.Builder.<EngieSharkoRare2TamedAprilFoolsEntity>of(EngieSharkoRare2TamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2TamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EpicSharkoTamedAprilFoolsEntity>> EPIC_SHARKO_TAMED_APRIL_FOOLS = register("epic_sharko_tamed_april_fools",
			EntityType.Builder.<EpicSharkoTamedAprilFoolsEntity>of(EpicSharkoTamedAprilFoolsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EpicSharkoTamedAprilFoolsEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<BigSharkoTamedEntity>> BIG_SHARKO_TAMED = register("big_sharko_tamed",
			EntityType.Builder.<BigSharkoTamedEntity>of(BigSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigAlbinoSharkoTamedEntity>> BIG_ALBINO_SHARKO_TAMED = register("big_albino_sharko_tamed",
			EntityType.Builder.<BigAlbinoSharkoTamedEntity>of(BigAlbinoSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigAlbinoSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigRareSharkoTamedEntity>> BIG_RARE_SHARKO_TAMED = register("big_rare_sharko_tamed",
			EntityType.Builder.<BigRareSharkoTamedEntity>of(BigRareSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigRareSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigLegendarySharkoTamedEntity>> BIG_LEGENDARY_SHARKO_TAMED = register("big_legendary_sharko_tamed",
			EntityType.Builder.<BigLegendarySharkoTamedEntity>of(BigLegendarySharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigLegendarySharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigMythicSharkoTamedEntity>> BIG_MYTHIC_SHARKO_TAMED = register("big_mythic_sharko_tamed",
			EntityType.Builder.<BigMythicSharkoTamedEntity>of(BigMythicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigMythicSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigExoticSharkoTamedEntity>> BIG_EXOTIC_SHARKO_TAMED = register("big_exotic_sharko_tamed",
			EntityType.Builder.<BigExoticSharkoTamedEntity>of(BigExoticSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigExoticSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoTamedEntity>> BIG_ENGIE_SHARKO_TAMED = register("big_engie_sharko_tamed",
			EntityType.Builder.<BigEngieSharkoTamedEntity>of(BigEngieSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEngieSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoRareTamedEntity>> BIG_ENGIE_SHARKO_RARE_TAMED = register("big_engie_sharko_rare_tamed",
			EntityType.Builder.<BigEngieSharkoRareTamedEntity>of(BigEngieSharkoRareTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigEngieSharkoRareTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEngieSharkoRare2TamedEntity>> BIG_ENGIE_SHARKO_RARE_2_TAMED = register("big_engie_sharko_rare_2_tamed",
			EntityType.Builder.<BigEngieSharkoRare2TamedEntity>of(BigEngieSharkoRare2TamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(BigEngieSharkoRare2TamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<BigEpicSharkoTamedEntity>> BIG_EPIC_SHARKO_TAMED = register("big_epic_sharko_tamed",
			EntityType.Builder.<BigEpicSharkoTamedEntity>of(BigEpicSharkoTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigEpicSharkoTamedEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<CosmoEntity>> COSMO = register("cosmo",
			EntityType.Builder.<CosmoEntity>of(CosmoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CosmoEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<YellowLightningEntity>> YELLOW_LIGHTNING = register("yellow_lightning", EntityType.Builder.<YellowLightningEntity>of(YellowLightningEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YellowLightningEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<BlueBurstEntity>> BLUE_BURST = register("blue_burst",
			EntityType.Builder.<BlueBurstEntity>of(BlueBurstEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueBurstEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<NormalEntity>> NORMAL = register("normal",
			EntityType.Builder.<NormalEntity>of(NormalEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NormalEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<MOABEntity>> MOAB = register("moab",
			EntityType.Builder.<MOABEntity>of(MOABEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MOABEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PureInsanityEntity>> PURE_INSANITY = register("pure_insanity",
			EntityType.Builder.<PureInsanityEntity>of(PureInsanityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PureInsanityEntity::new)

					.sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EngiEntity.init();
			EngiFREntity.init();
			CreatorEntity.init();
			ProtogenEntity.init();
			EngieGamesEntity.init();
			QuizzetEntity.init();
			BiblicallyAccurateEngieEntity.init();
			CommonEngieEntity.init();
			MadEngieEntity.init();
			UncommonEngieEntity.init();
			RareEngieEntity.init();
			EpicEngieEntity.init();
			LegendaryEngieEntity.init();
			MythicEngieEntity.init();
			ExoticEngieEntity.init();
			AngryEngieEntity.init();
			AngryEngieStyle2Entity.init();
			EnragedEngieEntity.init();
			EnragedEngieStyle2Entity.init();
			EnragedEngieStyle3Entity.init();
			AngryCreatorEntity.init();
			OutragedEngieStyle2Entity.init();
			MonstrosityEngieEntity.init();
			AngryEngieSharkoEntity.init();
			EnragedEngieSharkoEntity.init();
			OutragedEngieSharkoEntity.init();
			MonstrosityEngieSharkoEntity.init();
			InsanityEntity.init();
			SharkoEntity.init();
			AlbinoSharkoEntity.init();
			RareSharkoEntity.init();
			EpicSharkoEntity.init();
			LegendarySharkoEntity.init();
			MythicSharkoEntity.init();
			ExoticSharkoEntity.init();
			EngieSharkoEntity.init();
			EngieSharkoRareEntity.init();
			EngieSharkoRare2Entity.init();
			SharkoAprilFoolsEntity.init();
			AlbinoSharkoAprilFoolsEntity.init();
			RareSharkoAprilFoolsEntity.init();
			EpicSharkoAprilFoolsEntity.init();
			LegendarySharkoAprilFoolsEntity.init();
			MythicSharkoAprilFoolsEntity.init();
			ExoticSharkoAprilFoolsEntity.init();
			EngieSharkoAprilFoolsEntity.init();
			EngieSharkoRareAprilFoolsEntity.init();
			EngieSharkoRare2AprilFoolsEntity.init();
			TobyEntity.init();
			SharkoLayEntity.init();
			AlbinoSharkoLayEntity.init();
			RareSharkoLayEntity.init();
			LegendarySharkoLayEntity.init();
			MythicSharkoLayEntity.init();
			ExoticSharkoLayEntity.init();
			EngieSharkoLayEntity.init();
			EngieSharkoRareLayEntity.init();
			EngieSharkoRare2LayEntity.init();
			TobyLayEntity.init();
			MarshalEntity.init();
			MarshalLayEntity.init();
			TigerEntity.init();
			TigerLayEntity.init();
			LouisEntity.init();
			LouisLayEntity.init();
			TobyZoomiesEntity.init();
			MarshalZoomiesEntity.init();
			TigerZoomiesEntity.init();
			LouisZoomiesEntity.init();
			EngieSharkoRare2ZoomiesTiredEntity.init();
			TobyZoomiesTiredEntity.init();
			MarshalZoomiesTiredEntity.init();
			TigerZoomiesTiredEntity.init();
			LouisZoomiesTiredEntity.init();
			SharkoTamedZoomiesTiredEntity.init();
			AlbinoSharkoTamedZoomiesTiredEntity.init();
			RareSharkoTamedZoomiesTiredEntity.init();
			LegendarySharkoTamedZoomiesTiredEntity.init();
			MythicSharkoTamedZoomiesTiredEntity.init();
			ExoticSharkoTamedZoomiesTiredEntity.init();
			EngieSharkoTamedZoomiesTiredEntity.init();
			EngieSharkoRareTamedZoomiesTiredEntity.init();
			EngieSharkoRare2TamedZoomiesTiredEntity.init();
			TobySleepEntity.init();
			MarshalSleepEntity.init();
			TigerSleepEntity.init();
			LouisSleepEntity.init();
			SharkoSleepEntity.init();
			AlbinoSharkoSleepEntity.init();
			RareSharkoSleepEntity.init();
			LegendarySharkoSleepEntity.init();
			MythicSharkoSleepEntity.init();
			ExoticSharkoSleepEntity.init();
			EngieSharkoSleepEntity.init();
			EngieSharkoRareSleepEntity.init();
			EngieSharkoRare2SleepEntity.init();
			BuddyEntity.init();
			BuddyLayEntity.init();
			BuddyZoomiesEntity.init();
			BuddyZoomiesTiredEntity.init();
			BuddySleepEntity.init();
			ApolloEntity.init();
			ApolloLayEntity.init();
			ApolloZoomiesEntity.init();
			ApolloZoomiesTiredEntity.init();
			ApolloSleepEntity.init();
			AtlasEntity.init();
			AtlasLayEntity.init();
			AtlasZoomiesEntity.init();
			AtlasZoomiesTiredEntity.init();
			AtlasSleepEntity.init();
			CBEEntity.init();
			CBELayEntity.init();
			CBEZoomiesEntity.init();
			CBESleepEntity.init();
			CBEZoomiesTiredEntity.init();
			PBEEntity.init();
			PBELayEntity.init();
			PBEZoomiesEntity.init();
			PBESleepEntity.init();
			PBEZoomiesTiredEntity.init();
			Bothan2netEntity.init();
			Bothan2netLayEntity.init();
			Bothan2netZoomiesEntity.init();
			Bothan2netZoomiesTiredEntity.init();
			Bothan2netSleepEntity.init();
			EpicSharkoLayEntity.init();
			EpicSharkoTamedZoomiesTiredEntity.init();
			EpicSharkoSleepEntity.init();
			SharkoLayAprilFoolsEntity.init();
			AlbinoSharkoLayAprilFoolsEntity.init();
			RareSharkoLayAprilFoolsEntity.init();
			LegendarySharkoLayAprilFoolsEntity.init();
			MythicSharkoLayAprilFoolsEntity.init();
			ExoticSharkoLayAprilFoolsEntity.init();
			EngieSharkoLayAprilFoolsEntity.init();
			EngieSharkoRareLayAprilFoolsEntity.init();
			EngieSharkoRare2LayAprilFoolsEntity.init();
			SharkoSleepAprilFoolsEntity.init();
			AlbinoSharkoSleepAprilFoolsEntity.init();
			RareSharkoSleepAprilFoolsEntity.init();
			LegendarySharkoSleepAprilFoolsEntity.init();
			MythicSharkoSleepAprilFoolsEntity.init();
			ExoticSharkoSleepAprilFoolsEntity.init();
			EngieSharkoSleepAprilFoolsEntity.init();
			EngieSharkoRareSleepAprilFoolsEntity.init();
			EngieSharkoRare2SleepAprilFoolsEntity.init();
			EpicSharkoLayAprilFoolsEntity.init();
			EpicSharkoSleepAprilFoolsEntity.init();
			BigSharkoEntity.init();
			BigAlbinoSharkoEntity.init();
			BigRareSharkoEntity.init();
			BigEpicSharkoEntity.init();
			BigLegendarySharkoEntity.init();
			BigMythicSharkoEntity.init();
			BigExoticSharkoEntity.init();
			BigEngieSharkoEntity.init();
			BigEngieSharkoRareEntity.init();
			BigEngieSharkoRare2Entity.init();
			BigSharkoLayEntity.init();
			BigAlbinoSharkoLayEntity.init();
			BigRareSharkoLayEntity.init();
			BigLegendarySharkoLayEntity.init();
			BigMythicSharkoLayEntity.init();
			BigExoticSharkoLayEntity.init();
			BigEngieSharkoLayEntity.init();
			BigEngieSharkoRareLayEntity.init();
			BigEngieSharkoRare2LayEntity.init();
			BigSharkoSleepEntity.init();
			BigAlbinoSharkoSleepEntity.init();
			BigRareSharkoSleepEntity.init();
			BigLegendarySharkoSleepEntity.init();
			BigMythicSharkoSleepEntity.init();
			BigExoticSharkoSleepEntity.init();
			BigEngieSharkoSleepEntity.init();
			BigEngieSharkoRareSleepEntity.init();
			BigEngieSharkoRare2SleepEntity.init();
			BigEpicSharkoLayEntity.init();
			BigEpicSharkoSleepEntity.init();
			CosmoSleepEntity.init();
			CosmoLayEntity.init();
			EnragedNormalEntity.init();
			EnragedNormal2Entity.init();
			EnragedNormal3Entity.init();
			EnragedNormal4Entity.init();
			EnragedNormal5Entity.init();
			EnragedNormal6Entity.init();
			EnragedNormal7Entity.init();
			EnragedNormal8Entity.init();
			EnragedNormal9Entity.init();
			EnragedTNTEntity.init();
			EnragedTNT2Entity.init();
			EnragedTNT3Entity.init();
			EnragedTNT4Entity.init();
			EnragedTNT5Entity.init();
			EnragedTNT6Entity.init();
			EnragedTNT7Entity.init();
			EnragedTNT8Entity.init();
			EnragedTNT9Entity.init();
			EnragedSpeedEntity.init();
			EnragedSpeed2Entity.init();
			EnragedSpeed3Entity.init();
			EnragedSpeed4Entity.init();
			EnragedSpeed5Entity.init();
			EnragedSpeed6Entity.init();
			EnragedSpeed7Entity.init();
			EnragedSpeed8Entity.init();
			EnragedSpeed9Entity.init();
			HeWhoGamesEntity.init();
			HeWhoGamesHostileEntity.init();
			SharkTamedEntity.init();
			AlbinoSharkoTamedEntity.init();
			RareSharkoTamedEntity.init();
			LegendarySharkoTamedEntity.init();
			MythicSharkoTamedEntity.init();
			ExoticSharkoTamedEntity.init();
			EngieSharkoTamedEntity.init();
			EngieSharkoRareTamedEntity.init();
			EngieSharkoRare2TamedEntity.init();
			SharkoTamedZoomiesEntity.init();
			AlbinoSharkoTamedZoomiesEntity.init();
			RareSharkoTamedZoomiesEntity.init();
			LegendarySharkoTamedZoomiesEntity.init();
			MythicSharkoTamedZoomiesEntity.init();
			ExoticSharkoTamedZoomiesEntity.init();
			EngieSharkoTamedZoomiesEntity.init();
			EngieSharkoRareTamedZoomiesEntity.init();
			EngieSharkoRare2TamedZoomiesEntity.init();
			EpicSharkoTamedEntity.init();
			EpicSharkoTamedZoomiesEntity.init();
			SharkoTamedAprilFoolsEntity.init();
			AlbinoSharkoTamedAprilFoolsEntity.init();
			RareSharkoTamedAprilFoolsEntity.init();
			LegendarySharkoTamedAprilFoolsEntity.init();
			MythicSharkoTamedAprilFoolsEntity.init();
			ExoticSharkoTamedAprilFoolsEntity.init();
			EngieSharkoTamedAprilFoolsEntity.init();
			EngieSharkoRareTamedAprilFoolsEntity.init();
			EngieSharkoRare2TamedAprilFoolsEntity.init();
			EpicSharkoTamedAprilFoolsEntity.init();
			BigSharkoTamedEntity.init();
			BigAlbinoSharkoTamedEntity.init();
			BigRareSharkoTamedEntity.init();
			BigLegendarySharkoTamedEntity.init();
			BigMythicSharkoTamedEntity.init();
			BigExoticSharkoTamedEntity.init();
			BigEngieSharkoTamedEntity.init();
			BigEngieSharkoRareTamedEntity.init();
			BigEngieSharkoRare2TamedEntity.init();
			BigEpicSharkoTamedEntity.init();
			CosmoEntity.init();
			YellowLightningEntity.init();
			BlueBurstEntity.init();
			NormalEntity.init();
			MOABEntity.init();
			PureInsanityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENGIE.get(), EngiEntity.createAttributes().build());
		event.put(ENGI_FR.get(), EngiFREntity.createAttributes().build());
		event.put(CREATOR.get(), CreatorEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(ENGIE_GAMES.get(), EngieGamesEntity.createAttributes().build());
		event.put(QUIZZET.get(), QuizzetEntity.createAttributes().build());
		event.put(BIBLICALLY_ACCURATE_ENGIE.get(), BiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(MAD_ENGIE.get(), MadEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE.get(), AngryEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_STYLE_2.get(), AngryEngieStyle2Entity.createAttributes().build());
		event.put(ENRAGED_ENGIE.get(), EnragedEngieEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_STYLE_2.get(), EnragedEngieStyle2Entity.createAttributes().build());
		event.put(ENRAGED_ENGIE_STYLE_3.get(), EnragedEngieStyle3Entity.createAttributes().build());
		event.put(OUTRAGED_ENGIE.get(), AngryCreatorEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE_STYLE_2.get(), OutragedEngieStyle2Entity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE.get(), MonstrosityEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE_SHARKO.get(), AngryEngieSharkoEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE_SHARKO.get(), EnragedEngieSharkoEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE_SHARKO.get(), OutragedEngieSharkoEntity.createAttributes().build());
		event.put(MONSTROSITY_ENGIE_SHARKO.get(), MonstrosityEngieSharkoEntity.createAttributes().build());
		event.put(INSANITY.get(), InsanityEntity.createAttributes().build());
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(ALBINO_SHARKO.get(), AlbinoSharkoEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(EPIC_SHARKO.get(), EpicSharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE.get(), EngieSharkoRareEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2.get(), EngieSharkoRare2Entity.createAttributes().build());
		event.put(SHARKO_APRIL_FOOLS.get(), SharkoAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_APRIL_FOOLS.get(), AlbinoSharkoAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_APRIL_FOOLS.get(), RareSharkoAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_APRIL_FOOLS.get(), EpicSharkoAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_APRIL_FOOLS.get(), LegendarySharkoAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_APRIL_FOOLS.get(), MythicSharkoAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_APRIL_FOOLS.get(), ExoticSharkoAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_APRIL_FOOLS.get(), EngieSharkoAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_APRIL_FOOLS.get(), EngieSharkoRareAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_APRIL_FOOLS.get(), EngieSharkoRare2AprilFoolsEntity.createAttributes().build());
		event.put(TOBY.get(), TobyEntity.createAttributes().build());
		event.put(SHARKO_LAY.get(), SharkoLayEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY.get(), RareSharkoLayEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY.get(), MythicSharkoLayEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY.get(), EngieSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_LAY.get(), EngieSharkoRareLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_LAY.get(), EngieSharkoRare2LayEntity.createAttributes().build());
		event.put(TOBY_LAY.get(), TobyLayEntity.createAttributes().build());
		event.put(MARSHAL.get(), MarshalEntity.createAttributes().build());
		event.put(MARSHAL_LAY.get(), MarshalLayEntity.createAttributes().build());
		event.put(TIGER.get(), TigerEntity.createAttributes().build());
		event.put(TIGER_LAY.get(), TigerLayEntity.createAttributes().build());
		event.put(LOUIS.get(), LouisEntity.createAttributes().build());
		event.put(LOUIS_LAY.get(), LouisLayEntity.createAttributes().build());
		event.put(TOBY_ZOOMIES.get(), TobyZoomiesEntity.createAttributes().build());
		event.put(MARSHAL_ZOOMIES.get(), MarshalZoomiesEntity.createAttributes().build());
		event.put(TIGER_ZOOMIES.get(), TigerZoomiesEntity.createAttributes().build());
		event.put(LOUIS_ZOOMIES.get(), LouisZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_ZOOMIES_TIRED.get(), EngieSharkoRare2ZoomiesTiredEntity.createAttributes().build());
		event.put(TOBY_ZOOMIES_TIRED.get(), TobyZoomiesTiredEntity.createAttributes().build());
		event.put(MARSHAL_ZOOMIES_TIRED.get(), MarshalZoomiesTiredEntity.createAttributes().build());
		event.put(TIGER_ZOOMIES_TIRED.get(), TigerZoomiesTiredEntity.createAttributes().build());
		event.put(LOUIS_ZOOMIES_TIRED.get(), LouisZoomiesTiredEntity.createAttributes().build());
		event.put(SHARKO_TAMED_ZOOMIES_TIRED.get(), SharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED_ZOOMIES_TIRED.get(), AlbinoSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED_ZOOMIES_TIRED.get(), RareSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED_ZOOMIES_TIRED.get(), LegendarySharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), MythicSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), ExoticSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED_ZOOMIES_TIRED.get(), EngieSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED_ZOOMIES_TIRED.get(), EngieSharkoRareTamedZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES_TIRED.get(), EngieSharkoRare2TamedZoomiesTiredEntity.createAttributes().build());
		event.put(TOBY_SLEEP.get(), TobySleepEntity.createAttributes().build());
		event.put(MARSHAL_SLEEP.get(), MarshalSleepEntity.createAttributes().build());
		event.put(TIGER_SLEEP.get(), TigerSleepEntity.createAttributes().build());
		event.put(LOUIS_SLEEP.get(), LouisSleepEntity.createAttributes().build());
		event.put(SHARKO_SLEEP.get(), SharkoSleepEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_SLEEP.get(), AlbinoSharkoSleepEntity.createAttributes().build());
		event.put(RARE_SHARKO_SLEEP.get(), RareSharkoSleepEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_SLEEP.get(), LegendarySharkoSleepEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_SLEEP.get(), MythicSharkoSleepEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_SLEEP.get(), ExoticSharkoSleepEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_SLEEP.get(), EngieSharkoSleepEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_SLEEP.get(), EngieSharkoRareSleepEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_SLEEP.get(), EngieSharkoRare2SleepEntity.createAttributes().build());
		event.put(BUDDY.get(), BuddyEntity.createAttributes().build());
		event.put(BUDDY_LAY.get(), BuddyLayEntity.createAttributes().build());
		event.put(BUDDY_ZOOMIES.get(), BuddyZoomiesEntity.createAttributes().build());
		event.put(BUDDY_ZOOMIES_TIRED.get(), BuddyZoomiesTiredEntity.createAttributes().build());
		event.put(BUDDY_SLEEP.get(), BuddySleepEntity.createAttributes().build());
		event.put(APOLLO.get(), ApolloEntity.createAttributes().build());
		event.put(APOLLO_LAY.get(), ApolloLayEntity.createAttributes().build());
		event.put(APOLLO_ZOOMIES.get(), ApolloZoomiesEntity.createAttributes().build());
		event.put(APOLLO_ZOOMIES_TIRED.get(), ApolloZoomiesTiredEntity.createAttributes().build());
		event.put(APOLLO_SLEEP.get(), ApolloSleepEntity.createAttributes().build());
		event.put(ATLAS.get(), AtlasEntity.createAttributes().build());
		event.put(ATLAS_LAY.get(), AtlasLayEntity.createAttributes().build());
		event.put(ATLAS_ZOOMIES.get(), AtlasZoomiesEntity.createAttributes().build());
		event.put(ATLAS_ZOOMIES_TIRED.get(), AtlasZoomiesTiredEntity.createAttributes().build());
		event.put(ATLAS_SLEEP.get(), AtlasSleepEntity.createAttributes().build());
		event.put(CBE.get(), CBEEntity.createAttributes().build());
		event.put(CBE_LAY.get(), CBELayEntity.createAttributes().build());
		event.put(CBE_ZOOMIES.get(), CBEZoomiesEntity.createAttributes().build());
		event.put(CBE_SLEEP.get(), CBESleepEntity.createAttributes().build());
		event.put(CBE_ZOOMIES_TIRED.get(), CBEZoomiesTiredEntity.createAttributes().build());
		event.put(PBE.get(), PBEEntity.createAttributes().build());
		event.put(PBE_LAY.get(), PBELayEntity.createAttributes().build());
		event.put(PBE_ZOOMIES.get(), PBEZoomiesEntity.createAttributes().build());
		event.put(PBE_SLEEP.get(), PBESleepEntity.createAttributes().build());
		event.put(PBE_ZOOMIES_TIRED.get(), PBEZoomiesTiredEntity.createAttributes().build());
		event.put(BOTHAN_2NET.get(), Bothan2netEntity.createAttributes().build());
		event.put(BOTHAN_2NET_LAY.get(), Bothan2netLayEntity.createAttributes().build());
		event.put(BOTHAN_2NET_ZOOMIES.get(), Bothan2netZoomiesEntity.createAttributes().build());
		event.put(BOTHAN_2NET_ZOOMIES_TIRED.get(), Bothan2netZoomiesTiredEntity.createAttributes().build());
		event.put(BOTHAN_2NET_SLEEP.get(), Bothan2netSleepEntity.createAttributes().build());
		event.put(EPIC_SHARKO_LAY.get(), EpicSharkoLayEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED_ZOOMIES_TIRED.get(), EpicSharkoTamedZoomiesTiredEntity.createAttributes().build());
		event.put(EPIC_SHARKO_SLEEP.get(), EpicSharkoSleepEntity.createAttributes().build());
		event.put(SHARKO_LAY_APRIL_FOOLS.get(), SharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY_APRIL_FOOLS.get(), AlbinoSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY_APRIL_FOOLS.get(), RareSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY_APRIL_FOOLS.get(), LegendarySharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY_APRIL_FOOLS.get(), MythicSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY_APRIL_FOOLS.get(), ExoticSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY_APRIL_FOOLS.get(), EngieSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_LAY_APRIL_FOOLS.get(), EngieSharkoRareLayAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_LAY_APRIL_FOOLS.get(), EngieSharkoRare2LayAprilFoolsEntity.createAttributes().build());
		event.put(SHARKO_SLEEP_APRIL_FOOLS.get(), SharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_SLEEP_APRIL_FOOLS.get(), AlbinoSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_SLEEP_APRIL_FOOLS.get(), RareSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_SLEEP_APRIL_FOOLS.get(), LegendarySharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_SLEEP_APRIL_FOOLS.get(), MythicSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_SLEEP_APRIL_FOOLS.get(), ExoticSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_SLEEP_APRIL_FOOLS.get(), EngieSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_SLEEP_APRIL_FOOLS.get(), EngieSharkoRareSleepAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_SLEEP_APRIL_FOOLS.get(), EngieSharkoRare2SleepAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_LAY_APRIL_FOOLS.get(), EpicSharkoLayAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_SLEEP_APRIL_FOOLS.get(), EpicSharkoSleepAprilFoolsEntity.createAttributes().build());
		event.put(BIG_SHARKO.get(), BigSharkoEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO.get(), BigAlbinoSharkoEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO.get(), BigRareSharkoEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO.get(), BigEpicSharkoEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO.get(), BigLegendarySharkoEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO.get(), BigMythicSharkoEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO.get(), BigExoticSharkoEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO.get(), BigEngieSharkoEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE.get(), BigEngieSharkoRareEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_2.get(), BigEngieSharkoRare2Entity.createAttributes().build());
		event.put(BIG_SHARKO_LAY.get(), BigSharkoLayEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO_LAY.get(), BigAlbinoSharkoLayEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO_LAY.get(), BigRareSharkoLayEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO_LAY.get(), BigLegendarySharkoLayEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO_LAY.get(), BigMythicSharkoLayEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO_LAY.get(), BigExoticSharkoLayEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_LAY.get(), BigEngieSharkoLayEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_LAY.get(), BigEngieSharkoRareLayEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_2_LAY.get(), BigEngieSharkoRare2LayEntity.createAttributes().build());
		event.put(BIG_SHARKO_SLEEP.get(), BigSharkoSleepEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO_SLEEP.get(), BigAlbinoSharkoSleepEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO_SLEEP.get(), BigRareSharkoSleepEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO_SLEEP.get(), BigLegendarySharkoSleepEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO_SLEEP.get(), BigMythicSharkoSleepEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO_SLEEP.get(), BigExoticSharkoSleepEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_SLEEP.get(), BigEngieSharkoSleepEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_SLEEP.get(), BigEngieSharkoRareSleepEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_2_SLEEP.get(), BigEngieSharkoRare2SleepEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO_LAY.get(), BigEpicSharkoLayEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO_SLEEP.get(), BigEpicSharkoSleepEntity.createAttributes().build());
		event.put(COSMO_SLEEP.get(), CosmoSleepEntity.createAttributes().build());
		event.put(COSMO_LAY.get(), CosmoLayEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL_2.get(), EnragedNormal2Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_3.get(), EnragedNormal3Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_4.get(), EnragedNormal4Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_5.get(), EnragedNormal5Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_6.get(), EnragedNormal6Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_7.get(), EnragedNormal7Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_8.get(), EnragedNormal8Entity.createAttributes().build());
		event.put(ENRAGED_NORMAL_9.get(), EnragedNormal9Entity.createAttributes().build());
		event.put(ENRAGED_TNT.get(), EnragedTNTEntity.createAttributes().build());
		event.put(ENRAGED_TNT_2.get(), EnragedTNT2Entity.createAttributes().build());
		event.put(ENRAGED_TNT_3.get(), EnragedTNT3Entity.createAttributes().build());
		event.put(ENRAGED_TNT_4.get(), EnragedTNT4Entity.createAttributes().build());
		event.put(ENRAGED_TNT_5.get(), EnragedTNT5Entity.createAttributes().build());
		event.put(ENRAGED_TNT_6.get(), EnragedTNT6Entity.createAttributes().build());
		event.put(ENRAGED_TNT_7.get(), EnragedTNT7Entity.createAttributes().build());
		event.put(ENRAGED_TNT_8.get(), EnragedTNT8Entity.createAttributes().build());
		event.put(ENRAGED_TNT_9.get(), EnragedTNT9Entity.createAttributes().build());
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(ENRAGED_SPEED_2.get(), EnragedSpeed2Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_3.get(), EnragedSpeed3Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_4.get(), EnragedSpeed4Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_5.get(), EnragedSpeed5Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_6.get(), EnragedSpeed6Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_7.get(), EnragedSpeed7Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_8.get(), EnragedSpeed8Entity.createAttributes().build());
		event.put(ENRAGED_SPEED_9.get(), EnragedSpeed9Entity.createAttributes().build());
		event.put(HE_WHO_GAMES.get(), HeWhoGamesEntity.createAttributes().build());
		event.put(HE_WHO_GAMES_HOSTILE.get(), HeWhoGamesHostileEntity.createAttributes().build());
		event.put(SHARKO_TAMED.get(), SharkTamedEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED.get(), RareSharkoTamedEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRareTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED.get(), EngieSharkoRare2TamedEntity.createAttributes().build());
		event.put(SHARKO_TAMED_ZOOMIES.get(), SharkoTamedZoomiesEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED_ZOOMIES.get(), AlbinoSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED_ZOOMIES.get(), RareSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED_ZOOMIES.get(), LegendarySharkoTamedZoomiesEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED_ZOOMIES.get(), MythicSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED_ZOOMIES.get(), ExoticSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED_ZOOMIES.get(), EngieSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED_ZOOMIES.get(), EngieSharkoRareTamedZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED_ZOOMIES.get(), EngieSharkoRare2TamedZoomiesEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED.get(), EpicSharkoTamedEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED_ZOOMIES.get(), EpicSharkoTamedZoomiesEntity.createAttributes().build());
		event.put(SHARKO_TAMED_APRIL_FOOLS.get(), SharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED_APRIL_FOOLS.get(), AlbinoSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED_APRIL_FOOLS.get(), RareSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED_APRIL_FOOLS.get(), LegendarySharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED_APRIL_FOOLS.get(), MythicSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED_APRIL_FOOLS.get(), ExoticSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED_APRIL_FOOLS.get(), EngieSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED_APRIL_FOOLS.get(), EngieSharkoRareTamedAprilFoolsEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED_APRIL_FOOLS.get(), EngieSharkoRare2TamedAprilFoolsEntity.createAttributes().build());
		event.put(EPIC_SHARKO_TAMED_APRIL_FOOLS.get(), EpicSharkoTamedAprilFoolsEntity.createAttributes().build());
		event.put(BIG_SHARKO_TAMED.get(), BigSharkoTamedEntity.createAttributes().build());
		event.put(BIG_ALBINO_SHARKO_TAMED.get(), BigAlbinoSharkoTamedEntity.createAttributes().build());
		event.put(BIG_RARE_SHARKO_TAMED.get(), BigRareSharkoTamedEntity.createAttributes().build());
		event.put(BIG_LEGENDARY_SHARKO_TAMED.get(), BigLegendarySharkoTamedEntity.createAttributes().build());
		event.put(BIG_MYTHIC_SHARKO_TAMED.get(), BigMythicSharkoTamedEntity.createAttributes().build());
		event.put(BIG_EXOTIC_SHARKO_TAMED.get(), BigExoticSharkoTamedEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_TAMED.get(), BigEngieSharkoTamedEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_TAMED.get(), BigEngieSharkoRareTamedEntity.createAttributes().build());
		event.put(BIG_ENGIE_SHARKO_RARE_2_TAMED.get(), BigEngieSharkoRare2TamedEntity.createAttributes().build());
		event.put(BIG_EPIC_SHARKO_TAMED.get(), BigEpicSharkoTamedEntity.createAttributes().build());
		event.put(COSMO.get(), CosmoEntity.createAttributes().build());
		event.put(YELLOW_LIGHTNING.get(), YellowLightningEntity.createAttributes().build());
		event.put(BLUE_BURST.get(), BlueBurstEntity.createAttributes().build());
		event.put(NORMAL.get(), NormalEntity.createAttributes().build());
		event.put(MOAB.get(), MOABEntity.createAttributes().build());
		event.put(PURE_INSANITY.get(), PureInsanityEntity.createAttributes().build());
	}
}

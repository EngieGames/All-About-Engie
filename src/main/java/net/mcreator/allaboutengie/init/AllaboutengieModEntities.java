
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
import net.mcreator.allaboutengie.entity.SharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.SharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.SharkoSleepEntity;
import net.mcreator.allaboutengie.entity.SharkoLayEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.RareEngieEntity;
import net.mcreator.allaboutengie.entity.QuizzetEntity;
import net.mcreator.allaboutengie.entity.ProtogenEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.entity.PBESleepEntity;
import net.mcreator.allaboutengie.entity.PBELayEntity;
import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicEngieEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.entity.MarshalSleepEntity;
import net.mcreator.allaboutengie.entity.MarshalLayEntity;
import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LouisZoomiesEntity;
import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.entity.LouisLayEntity;
import net.mcreator.allaboutengie.entity.LouisEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.LegendaryEngieEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticEngieEntity;
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
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2ZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieGamesEntity;
import net.mcreator.allaboutengie.entity.EngiFREntity;
import net.mcreator.allaboutengie.entity.EngiEntity;
import net.mcreator.allaboutengie.entity.CreatorEntity;
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
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesTiredEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedZoomiesEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<EntityType<EngiEntity>> ENGIE = register("engie",
			EntityType.Builder.<EngiEntity>of(EngiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MadEngieEntity>> MAD_ENGIE = register("mad_engie",
			EntityType.Builder.<MadEngieEntity>of(MadEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MadEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryEngieEntity>> ANGRY_ENGIE = register("angry_engie",
			EntityType.Builder.<AngryEngieEntity>of(AngryEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EnragedEngieEntity>> ENRAGED_ENGIE = register("enraged_engie",
			EntityType.Builder.<EnragedEngieEntity>of(EnragedEngieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<AngryCreatorEntity>> OUTRAGED_ENGIE = register("outraged_engie",
			EntityType.Builder.<AngryCreatorEntity>of(AngryCreatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryCreatorEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EngiFREntity>> ENGI_FR = register("engi_fr",
			EntityType.Builder.<EngiFREntity>of(EngiFREntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngiFREntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<CreatorEntity>> CREATOR = register("creator",
			EntityType.Builder.<CreatorEntity>of(CreatorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreatorEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EngieGamesEntity>> ENGIE_GAMES = register("engie_games",
			EntityType.Builder.<EngieGamesEntity>of(EngieGamesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieGamesEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuizzetEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEngieEntity::new)

					.sized(0.6f, 1.8f));
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
	public static final RegistryObject<EntityType<BiblicallyAccurateEngieEntity>> BIBLICALLY_ACCURATE_ENGIE = register("biblically_accurate_engie",
			EntityType.Builder.<BiblicallyAccurateEngieEntity>of(BiblicallyAccurateEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3)
					.setCustomClientFactory(BiblicallyAccurateEngieEntity::new).fireImmune().sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<SharkoEntity>> SHARKO = register("sharko",
			EntityType.Builder.<SharkoEntity>of(SharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoEntity>> ALBINO_SHARKO = register("albino_sharko",
			EntityType.Builder.<AlbinoSharkoEntity>of(AlbinoSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoEntity>> RARE_SHARKO = register("rare_sharko",
			EntityType.Builder.<RareSharkoEntity>of(RareSharkoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoEntity::new)

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
	public static final RegistryObject<EntityType<SharkoZoomiesEntity>> SHARKO_ZOOMIES = register("sharko_zoomies",
			EntityType.Builder.<SharkoZoomiesEntity>of(SharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<AlbinoSharkoZoomiesEntity>> ALBINO_SHARKO_ZOOMIES = register("albino_sharko_zoomies",
			EntityType.Builder.<AlbinoSharkoZoomiesEntity>of(AlbinoSharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AlbinoSharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<RareSharkoZoomiesEntity>> RARE_SHARKO_ZOOMIES = register("rare_sharko_zoomies",
			EntityType.Builder.<RareSharkoZoomiesEntity>of(RareSharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareSharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<LegendarySharkoZoomiesEntity>> LEGENDARY_SHARKO_ZOOMIES = register("legendary_sharko_zoomies",
			EntityType.Builder.<LegendarySharkoZoomiesEntity>of(LegendarySharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<MythicSharkoZoomiesEntity>> MYTHIC_SHARKO_ZOOMIES = register("mythic_sharko_zoomies",
			EntityType.Builder.<MythicSharkoZoomiesEntity>of(MythicSharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicSharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<ExoticSharkoZoomiesEntity>> EXOTIC_SHARKO_ZOOMIES = register("exotic_sharko_zoomies",
			EntityType.Builder.<ExoticSharkoZoomiesEntity>of(ExoticSharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticSharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoZoomiesEntity>> ENGIE_SHARKO_ZOOMIES = register("engie_sharko_zoomies",
			EntityType.Builder.<EngieSharkoZoomiesEntity>of(EngieSharkoZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EngieSharkoZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRareZoomiesEntity>> ENGIE_SHARKO_RARE_ZOOMIES = register("engie_sharko_rare_zoomies",
			EntityType.Builder.<EngieSharkoRareZoomiesEntity>of(EngieSharkoRareZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareZoomiesEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EngieSharkoRare2ZoomiesEntity>> ENGIE_SHARKO_RARE_2_ZOOMIES = register("engie_sharko_rare_2_zoomies",
			EntityType.Builder.<EngieSharkoRare2ZoomiesEntity>of(EngieSharkoRare2ZoomiesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRare2ZoomiesEntity::new)

					.sized(0.7f, 0.9f));
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
	public static final RegistryObject<EntityType<SharkoZoomiesTiredEntity>> SHARKO_ZOOMIES_TIRED = register("sharko_zoomies_tired",
			EntityType.Builder.<SharkoZoomiesTiredEntity>of(SharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<AlbinoSharkoZoomiesTiredEntity>> ALBINO_SHARKO_ZOOMIES_TIRED = register("albino_sharko_zoomies_tired",
			EntityType.Builder.<AlbinoSharkoZoomiesTiredEntity>of(AlbinoSharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(AlbinoSharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<RareSharkoZoomiesTiredEntity>> RARE_SHARKO_ZOOMIES_TIRED = register("rare_sharko_zoomies_tired",
			EntityType.Builder.<RareSharkoZoomiesTiredEntity>of(RareSharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(RareSharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<LegendarySharkoZoomiesTiredEntity>> LEGENDARY_SHARKO_ZOOMIES_TIRED = register("legendary_sharko_zoomies_tired",
			EntityType.Builder.<LegendarySharkoZoomiesTiredEntity>of(LegendarySharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(LegendarySharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<MythicSharkoZoomiesTiredEntity>> MYTHIC_SHARKO_ZOOMIES_TIRED = register("mythic_sharko_zoomies_tired",
			EntityType.Builder.<MythicSharkoZoomiesTiredEntity>of(MythicSharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(MythicSharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<ExoticSharkoZoomiesTiredEntity>> EXOTIC_SHARKO_ZOOMIES_TIRED = register("exotic_sharko_zoomies_tired",
			EntityType.Builder.<ExoticSharkoZoomiesTiredEntity>of(ExoticSharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(ExoticSharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoZoomiesTiredEntity>> ENGIE_SHARKO_ZOOMIES_TIRED = register("engie_sharko_zoomies_tired",
			EntityType.Builder.<EngieSharkoZoomiesTiredEntity>of(EngieSharkoZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
	public static final RegistryObject<EntityType<EngieSharkoRareZoomiesTiredEntity>> ENGIE_SHARKO_RARE_ZOOMIES_TIRED = register("engie_sharko_rare_zoomies_tired",
			EntityType.Builder.<EngieSharkoRareZoomiesTiredEntity>of(EngieSharkoRareZoomiesTiredEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(EngieSharkoRareZoomiesTiredEntity::new)

					.sized(0.7f, 0.6f));
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

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			EngiEntity.init();
			MadEngieEntity.init();
			AngryEngieEntity.init();
			EnragedEngieEntity.init();
			AngryCreatorEntity.init();
			EngiFREntity.init();
			CreatorEntity.init();
			EngieGamesEntity.init();
			ProtogenEntity.init();
			QuizzetEntity.init();
			CommonEngieEntity.init();
			UncommonEngieEntity.init();
			RareEngieEntity.init();
			EpicEngieEntity.init();
			LegendaryEngieEntity.init();
			MythicEngieEntity.init();
			ExoticEngieEntity.init();
			BiblicallyAccurateEngieEntity.init();
			SharkoEntity.init();
			AlbinoSharkoEntity.init();
			RareSharkoEntity.init();
			LegendarySharkoEntity.init();
			MythicSharkoEntity.init();
			ExoticSharkoEntity.init();
			EngieSharkoEntity.init();
			EngieSharkoRareEntity.init();
			EngieSharkoRare2Entity.init();
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
			SharkoZoomiesEntity.init();
			AlbinoSharkoZoomiesEntity.init();
			RareSharkoZoomiesEntity.init();
			LegendarySharkoZoomiesEntity.init();
			MythicSharkoZoomiesEntity.init();
			ExoticSharkoZoomiesEntity.init();
			EngieSharkoZoomiesEntity.init();
			EngieSharkoRareZoomiesEntity.init();
			EngieSharkoRare2ZoomiesEntity.init();
			TobyZoomiesEntity.init();
			MarshalZoomiesEntity.init();
			TigerZoomiesEntity.init();
			LouisZoomiesEntity.init();
			SharkoZoomiesTiredEntity.init();
			AlbinoSharkoZoomiesTiredEntity.init();
			RareSharkoZoomiesTiredEntity.init();
			LegendarySharkoZoomiesTiredEntity.init();
			MythicSharkoZoomiesTiredEntity.init();
			ExoticSharkoZoomiesTiredEntity.init();
			EngieSharkoZoomiesTiredEntity.init();
			EngieSharkoRareZoomiesTiredEntity.init();
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
			PBEEntity.init();
			PBELayEntity.init();
			PBEZoomiesEntity.init();
			PBESleepEntity.init();
			PBEZoomiesTiredEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENGIE.get(), EngiEntity.createAttributes().build());
		event.put(MAD_ENGIE.get(), MadEngieEntity.createAttributes().build());
		event.put(ANGRY_ENGIE.get(), AngryEngieEntity.createAttributes().build());
		event.put(ENRAGED_ENGIE.get(), EnragedEngieEntity.createAttributes().build());
		event.put(OUTRAGED_ENGIE.get(), AngryCreatorEntity.createAttributes().build());
		event.put(ENGI_FR.get(), EngiFREntity.createAttributes().build());
		event.put(CREATOR.get(), CreatorEntity.createAttributes().build());
		event.put(ENGIE_GAMES.get(), EngieGamesEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(QUIZZET.get(), QuizzetEntity.createAttributes().build());
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
		event.put(BIBLICALLY_ACCURATE_ENGIE.get(), BiblicallyAccurateEngieEntity.createAttributes().build());
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(ALBINO_SHARKO.get(), AlbinoSharkoEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE.get(), EngieSharkoRareEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2.get(), EngieSharkoRare2Entity.createAttributes().build());
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
		event.put(SHARKO_ZOOMIES.get(), SharkoZoomiesEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_ZOOMIES.get(), AlbinoSharkoZoomiesEntity.createAttributes().build());
		event.put(RARE_SHARKO_ZOOMIES.get(), RareSharkoZoomiesEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_ZOOMIES.get(), LegendarySharkoZoomiesEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_ZOOMIES.get(), MythicSharkoZoomiesEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_ZOOMIES.get(), ExoticSharkoZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_ZOOMIES.get(), EngieSharkoZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_ZOOMIES.get(), EngieSharkoRareZoomiesEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_ZOOMIES.get(), EngieSharkoRare2ZoomiesEntity.createAttributes().build());
		event.put(TOBY_ZOOMIES.get(), TobyZoomiesEntity.createAttributes().build());
		event.put(MARSHAL_ZOOMIES.get(), MarshalZoomiesEntity.createAttributes().build());
		event.put(TIGER_ZOOMIES.get(), TigerZoomiesEntity.createAttributes().build());
		event.put(LOUIS_ZOOMIES.get(), LouisZoomiesEntity.createAttributes().build());
		event.put(SHARKO_ZOOMIES_TIRED.get(), SharkoZoomiesTiredEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_ZOOMIES_TIRED.get(), AlbinoSharkoZoomiesTiredEntity.createAttributes().build());
		event.put(RARE_SHARKO_ZOOMIES_TIRED.get(), RareSharkoZoomiesTiredEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_ZOOMIES_TIRED.get(), LegendarySharkoZoomiesTiredEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_ZOOMIES_TIRED.get(), MythicSharkoZoomiesTiredEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_ZOOMIES_TIRED.get(), ExoticSharkoZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_ZOOMIES_TIRED.get(), EngieSharkoZoomiesTiredEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_ZOOMIES_TIRED.get(), EngieSharkoRareZoomiesTiredEntity.createAttributes().build());
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
		event.put(PBE.get(), PBEEntity.createAttributes().build());
		event.put(PBE_LAY.get(), PBELayEntity.createAttributes().build());
		event.put(PBE_ZOOMIES.get(), PBEZoomiesEntity.createAttributes().build());
		event.put(PBE_SLEEP.get(), PBESleepEntity.createAttributes().build());
		event.put(PBE_ZOOMIES_TIRED.get(), PBEZoomiesTiredEntity.createAttributes().build());
	}
}

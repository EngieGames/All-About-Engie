
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
import net.mcreator.allaboutengie.entity.TobyLayEntity;
import net.mcreator.allaboutengie.entity.TobyEntity;
import net.mcreator.allaboutengie.entity.SharkoLayEntity;
import net.mcreator.allaboutengie.entity.SharkoEntity;
import net.mcreator.allaboutengie.entity.SharkTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.RareSharkoLayEntity;
import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.entity.RareEngieEntity;
import net.mcreator.allaboutengie.entity.QuizzetEntity;
import net.mcreator.allaboutengie.entity.PurpleEnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.PurpleEnragedNormalEntity;
import net.mcreator.allaboutengie.entity.PurpleEnragedBoomEntity;
import net.mcreator.allaboutengie.entity.ProtogenEntity;
import net.mcreator.allaboutengie.entity.OrangeEnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.OrangeEnragedNormalEntity;
import net.mcreator.allaboutengie.entity.OrangeEnragedBoomEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoLayEntity;
import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.entity.MythicEngieEntity;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoLayEntity;
import net.mcreator.allaboutengie.entity.LegendarySharkoEntity;
import net.mcreator.allaboutengie.entity.LegendaryEngieEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoLayEntity;
import net.mcreator.allaboutengie.entity.ExoticSharkoEntity;
import net.mcreator.allaboutengie.entity.ExoticEngieEntity;
import net.mcreator.allaboutengie.entity.EpicEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.EnragedNormalEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedBoomEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRareEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2LayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.entity.EngieSharkoLayEntity;
import net.mcreator.allaboutengie.entity.EngieSharkoEntity;
import net.mcreator.allaboutengie.entity.EngieGamesGUIEntity;
import net.mcreator.allaboutengie.entity.EngieGamesEntity;
import net.mcreator.allaboutengie.entity.EngiFREntity;
import net.mcreator.allaboutengie.entity.EngiEntity;
import net.mcreator.allaboutengie.entity.CreatorEntity;
import net.mcreator.allaboutengie.entity.CommonEngieEntity;
import net.mcreator.allaboutengie.entity.BlueEnragedSpeedEntity;
import net.mcreator.allaboutengie.entity.BlueEnragedNormalEntity;
import net.mcreator.allaboutengie.entity.BlueEnragedBoomEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;
import net.mcreator.allaboutengie.entity.AlbinoSharkoTamedEntity;
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
	public static final RegistryObject<EntityType<CommonEngieEntity>> COMMON_ENGIE = register("common_engie",
			EntityType.Builder.<CommonEngieEntity>of(CommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<UncommonEngieEntity>> UNCOMMON_ENGIE = register("uncommon_engie",
			EntityType.Builder.<UncommonEngieEntity>of(UncommonEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UncommonEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<RareEngieEntity>> RARE_ENGIE = register("rare_engie",
			EntityType.Builder.<RareEngieEntity>of(RareEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RareEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EpicEngieEntity>> EPIC_ENGIE = register("epic_engie",
			EntityType.Builder.<EpicEngieEntity>of(EpicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EpicEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<LegendaryEngieEntity>> LEGENDARY_ENGIE = register("legendary_engie",
			EntityType.Builder.<LegendaryEngieEntity>of(LegendaryEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LegendaryEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<MythicEngieEntity>> MYTHIC_ENGIE = register("mythic_engie",
			EntityType.Builder.<MythicEngieEntity>of(MythicEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MythicEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ExoticEngieEntity>> EXOTIC_ENGIE = register("exotic_engie",
			EntityType.Builder.<ExoticEngieEntity>of(ExoticEngieEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExoticEngieEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ProtogenEntity>> PROTOGEN = register("protogen",
			EntityType.Builder.<ProtogenEntity>of(ProtogenEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ProtogenEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<QuizzetEntity>> QUIZZET = register("quizzet",
			EntityType.Builder.<QuizzetEntity>of(QuizzetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(QuizzetEntity::new)

					.sized(0.6f, 1.95f));
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

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<EnragedNormalEntity>> ENRAGED_NORMAL = register("enraged_normal",
			EntityType.Builder.<EnragedNormalEntity>of(EnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedNormalEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BlueEnragedNormalEntity>> BLUE_ENRAGED_NORMAL = register("blue_enraged_normal",
			EntityType.Builder.<BlueEnragedNormalEntity>of(BlueEnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueEnragedNormalEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<PurpleEnragedNormalEntity>> PURPLE_ENRAGED_NORMAL = register("purple_enraged_normal",
			EntityType.Builder.<PurpleEnragedNormalEntity>of(PurpleEnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleEnragedNormalEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<OrangeEnragedNormalEntity>> ORANGE_ENRAGED_NORMAL = register("orange_enraged_normal",
			EntityType.Builder.<OrangeEnragedNormalEntity>of(OrangeEnragedNormalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrangeEnragedNormalEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EnragedBoomEntity>> ENRAGED_BOOM = register("enraged_boom",
			EntityType.Builder.<EnragedBoomEntity>of(EnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedBoomEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BlueEnragedBoomEntity>> BLUE_ENRAGED_BOOM = register("blue_enraged_boom",
			EntityType.Builder.<BlueEnragedBoomEntity>of(BlueEnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueEnragedBoomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PurpleEnragedBoomEntity>> PURPLE_ENRAGED_BOOM = register("purple_enraged_boom",
			EntityType.Builder.<PurpleEnragedBoomEntity>of(PurpleEnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleEnragedBoomEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<OrangeEnragedBoomEntity>> ORANGE_ENRAGED_BOOM = register("orange_enraged_boom",
			EntityType.Builder.<OrangeEnragedBoomEntity>of(OrangeEnragedBoomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrangeEnragedBoomEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EnragedSpeedEntity>> ENRAGED_SPEED = register("enraged_speed",
			EntityType.Builder.<EnragedSpeedEntity>of(EnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EnragedSpeedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<BlueEnragedSpeedEntity>> BLUE_ENRAGED_SPEED = register("blue_enraged_speed",
			EntityType.Builder.<BlueEnragedSpeedEntity>of(BlueEnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueEnragedSpeedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<PurpleEnragedSpeedEntity>> PURPLE_ENRAGED_SPEED = register("purple_enraged_speed",
			EntityType.Builder.<PurpleEnragedSpeedEntity>of(PurpleEnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleEnragedSpeedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<OrangeEnragedSpeedEntity>> ORANGE_ENRAGED_SPEED = register("orange_enraged_speed",
			EntityType.Builder.<OrangeEnragedSpeedEntity>of(OrangeEnragedSpeedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrangeEnragedSpeedEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<EngieGamesGUIEntity>> ENGIE_GAMES_GUI = register("engie_games_gui", EntityType.Builder.<EngieGamesGUIEntity>of(EngieGamesGUIEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(EngieGamesGUIEntity::new).fireImmune().sized(0.6f, 1.95f));
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
	public static final RegistryObject<EntityType<TobyEntity>> TOBY = register("toby",
			EntityType.Builder.<TobyEntity>of(TobyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobyEntity::new)

					.sized(0.7f, 0.9f));
	public static final RegistryObject<EntityType<TobyLayEntity>> TOBY_LAY = register("toby_lay",
			EntityType.Builder.<TobyLayEntity>of(TobyLayEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TobyLayEntity::new)

					.sized(0.7f, 0.9f));

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
			CommonEngieEntity.init();
			UncommonEngieEntity.init();
			RareEngieEntity.init();
			EpicEngieEntity.init();
			LegendaryEngieEntity.init();
			MythicEngieEntity.init();
			ExoticEngieEntity.init();
			ProtogenEntity.init();
			QuizzetEntity.init();
			SharkoEntity.init();
			AlbinoSharkoEntity.init();
			RareSharkoEntity.init();
			LegendarySharkoEntity.init();
			MythicSharkoEntity.init();
			ExoticSharkoEntity.init();
			EngieSharkoEntity.init();
			EngieSharkoRareEntity.init();
			EngieSharkoRare2Entity.init();
			SharkoLayEntity.init();
			AlbinoSharkoLayEntity.init();
			RareSharkoLayEntity.init();
			LegendarySharkoLayEntity.init();
			MythicSharkoLayEntity.init();
			ExoticSharkoLayEntity.init();
			EngieSharkoLayEntity.init();
			EngieSharkoRareLayEntity.init();
			EngieSharkoRare2LayEntity.init();
			EnragedNormalEntity.init();
			BlueEnragedNormalEntity.init();
			PurpleEnragedNormalEntity.init();
			OrangeEnragedNormalEntity.init();
			EnragedBoomEntity.init();
			BlueEnragedBoomEntity.init();
			PurpleEnragedBoomEntity.init();
			OrangeEnragedBoomEntity.init();
			EnragedSpeedEntity.init();
			BlueEnragedSpeedEntity.init();
			PurpleEnragedSpeedEntity.init();
			OrangeEnragedSpeedEntity.init();
			EngieGamesGUIEntity.init();
			SharkTamedEntity.init();
			AlbinoSharkoTamedEntity.init();
			RareSharkoTamedEntity.init();
			LegendarySharkoTamedEntity.init();
			MythicSharkoTamedEntity.init();
			ExoticSharkoTamedEntity.init();
			EngieSharkoTamedEntity.init();
			EngieSharkoRareTamedEntity.init();
			EngieSharkoRare2TamedEntity.init();
			TobyEntity.init();
			TobyLayEntity.init();
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
		event.put(COMMON_ENGIE.get(), CommonEngieEntity.createAttributes().build());
		event.put(UNCOMMON_ENGIE.get(), UncommonEngieEntity.createAttributes().build());
		event.put(RARE_ENGIE.get(), RareEngieEntity.createAttributes().build());
		event.put(EPIC_ENGIE.get(), EpicEngieEntity.createAttributes().build());
		event.put(LEGENDARY_ENGIE.get(), LegendaryEngieEntity.createAttributes().build());
		event.put(MYTHIC_ENGIE.get(), MythicEngieEntity.createAttributes().build());
		event.put(EXOTIC_ENGIE.get(), ExoticEngieEntity.createAttributes().build());
		event.put(PROTOGEN.get(), ProtogenEntity.createAttributes().build());
		event.put(QUIZZET.get(), QuizzetEntity.createAttributes().build());
		event.put(SHARKO.get(), SharkoEntity.createAttributes().build());
		event.put(ALBINO_SHARKO.get(), AlbinoSharkoEntity.createAttributes().build());
		event.put(RARE_SHARKO.get(), RareSharkoEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO.get(), LegendarySharkoEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO.get(), MythicSharkoEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO.get(), ExoticSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO.get(), EngieSharkoEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE.get(), EngieSharkoRareEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2.get(), EngieSharkoRare2Entity.createAttributes().build());
		event.put(SHARKO_LAY.get(), SharkoLayEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_LAY.get(), AlbinoSharkoLayEntity.createAttributes().build());
		event.put(RARE_SHARKO_LAY.get(), RareSharkoLayEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_LAY.get(), LegendarySharkoLayEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_LAY.get(), MythicSharkoLayEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_LAY.get(), ExoticSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_LAY.get(), EngieSharkoLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_LAY.get(), EngieSharkoRareLayEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_LAY.get(), EngieSharkoRare2LayEntity.createAttributes().build());
		event.put(ENRAGED_NORMAL.get(), EnragedNormalEntity.createAttributes().build());
		event.put(BLUE_ENRAGED_NORMAL.get(), BlueEnragedNormalEntity.createAttributes().build());
		event.put(PURPLE_ENRAGED_NORMAL.get(), PurpleEnragedNormalEntity.createAttributes().build());
		event.put(ORANGE_ENRAGED_NORMAL.get(), OrangeEnragedNormalEntity.createAttributes().build());
		event.put(ENRAGED_BOOM.get(), EnragedBoomEntity.createAttributes().build());
		event.put(BLUE_ENRAGED_BOOM.get(), BlueEnragedBoomEntity.createAttributes().build());
		event.put(PURPLE_ENRAGED_BOOM.get(), PurpleEnragedBoomEntity.createAttributes().build());
		event.put(ORANGE_ENRAGED_BOOM.get(), OrangeEnragedBoomEntity.createAttributes().build());
		event.put(ENRAGED_SPEED.get(), EnragedSpeedEntity.createAttributes().build());
		event.put(BLUE_ENRAGED_SPEED.get(), BlueEnragedSpeedEntity.createAttributes().build());
		event.put(PURPLE_ENRAGED_SPEED.get(), PurpleEnragedSpeedEntity.createAttributes().build());
		event.put(ORANGE_ENRAGED_SPEED.get(), OrangeEnragedSpeedEntity.createAttributes().build());
		event.put(ENGIE_GAMES_GUI.get(), EngieGamesGUIEntity.createAttributes().build());
		event.put(SHARKO_TAMED.get(), SharkTamedEntity.createAttributes().build());
		event.put(ALBINO_SHARKO_TAMED.get(), AlbinoSharkoTamedEntity.createAttributes().build());
		event.put(RARE_SHARKO_TAMED.get(), RareSharkoTamedEntity.createAttributes().build());
		event.put(LEGENDARY_SHARKO_TAMED.get(), LegendarySharkoTamedEntity.createAttributes().build());
		event.put(MYTHIC_SHARKO_TAMED.get(), MythicSharkoTamedEntity.createAttributes().build());
		event.put(EXOTIC_SHARKO_TAMED.get(), ExoticSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_TAMED.get(), EngieSharkoTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_TAMED.get(), EngieSharkoRareTamedEntity.createAttributes().build());
		event.put(ENGIE_SHARKO_RARE_2_TAMED.get(), EngieSharkoRare2TamedEntity.createAttributes().build());
		event.put(TOBY.get(), TobyEntity.createAttributes().build());
		event.put(TOBY_LAY.get(), TobyLayEntity.createAttributes().build());
	}
}

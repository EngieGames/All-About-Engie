package net.mcreator.allaboutengie.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AllaboutengieModVariables {
	public static boolean decembercodeblock = true;
	public static boolean seasonautumn = false;
	public static boolean seasonspring = false;
	public static boolean seasonsummer = false;
	public static boolean seasonwinter = false;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		AllaboutengieMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		AllaboutengieMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.AngryEngieKillCount = original.AngryEngieKillCount;
			clone.browniescount = original.browniescount;
			clone.cheeseballcount = original.cheeseballcount;
			clone.coincount = original.coincount;
			clone.EnragedEngieKillCount = original.EnragedEngieKillCount;
			clone.HHGLookX = original.HHGLookX;
			clone.HHGLookY = original.HHGLookY;
			clone.HHGLookZ = original.HHGLookZ;
			clone.InsanityKillCount = original.InsanityKillCount;
			clone.lightningX = original.lightningX;
			clone.lightningY = original.lightningY;
			clone.lightningZ = original.lightningZ;
			clone.MadEngieKillCount = original.MadEngieKillCount;
			clone.OutragedEngieKillCount = original.OutragedEngieKillCount;
			clone.PlayerX = original.PlayerX;
			clone.PlayerY = original.PlayerY;
			clone.PlayerZ = original.PlayerZ;
			clone.coderedeemblock = original.coderedeemblock;
			clone.detecstart = original.detecstart;
			clone.GoodLuck = original.GoodLuck;
			clone.healthreductiondday = original.healthreductiondday;
			clone.multiplayertrophyobtained = original.multiplayertrophyobtained;
			clone.playerready = original.playerready;
			clone.solotrophyobtained = original.solotrophyobtained;
			clone.BlockDeathAliveCOunt = original.BlockDeathAliveCOunt;
			clone.timeoverlaytoggle = original.timeoverlaytoggle;
			clone.SharkoRideToggle = original.SharkoRideToggle;
			clone.TrueHardcoreLifeCount = original.TrueHardcoreLifeCount;
			if (!event.isWasDeath()) {
				clone.DoomsdayAlive = original.DoomsdayAlive;
				clone.firstplay = original.firstplay;
				clone.RespawnNormInstantHealth = original.RespawnNormInstantHealth;
				clone.RespawnTrueHardcoreGraceStart = original.RespawnTrueHardcoreGraceStart;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "allaboutengie_worldvars";
		public boolean yeah = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			yeah = nbt.getBoolean("yeah");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("yeah", yeah);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "allaboutengie_mapvars";
		public double challengeplayerreadyupcount = 0.0;
		public double DoomsDayAliveCount = 0.0;
		public double DoomsdayDeathCount = 0.0;
		public double DoomsdayRiskFailCount = 0.0;
		public double nightmare = 0.0;
		public double Risk = 0.0;
		public double risknumberattempts = 0.0;
		public double timebeforespecial = 0.0;
		public boolean Birthday = false;
		public boolean birthdaystart = false;
		public boolean BYEBYE = false;
		public boolean ChallengeToggle = false;
		public boolean darknesscooldown = false;
		public boolean ddaystart = false;
		public boolean DoomsdayDialogueStart = false;
		public boolean doomsdaymainsongstart = false;
		public boolean hewhowatches = false;
		public boolean HHGkilledtoggle = false;
		public boolean lightningcooldowndday = false;
		public boolean madlads = false;
		public boolean OHBOY = false;
		public boolean OHNO = false;
		public boolean riskcheckedstart = false;
		public boolean riskcooldown = true;
		public boolean SharkoLayCD = false;
		public boolean SharkoRetryState = false;
		public boolean SharkoSleepCD = false;
		public boolean WELCOMETOINSANITY = false;
		public boolean GOODBYE = false;
		public boolean DoomsdayEeriePlayOnce = false;
		public boolean DoomsDayStart = false;
		public boolean ddaytimenighttimerblock = false;
		public boolean ddaydialoguetimeblock = false;
		public boolean waittildoomsday = false;
		public double PlayerWorldCount = 0;
		public boolean sddaystart = false;
		public boolean sdoomsdaymainsongstart = false;
		public boolean SuperDoomsDayStart = false;
		public boolean waittilsdoomsday = false;
		public boolean sddaydialoguetimeblock = false;
		public boolean sddaytimenighttimerblock = false;
		public boolean SuperDoomsdayEeriePlayOnce = false;
		public boolean SDDAYToggle = false;
		public boolean timecheckstop = false;
		public boolean DayCooldownToggle = false;
		public boolean ddayspikecooldown = false;
		public boolean sddayspikecooldown = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			challengeplayerreadyupcount = nbt.getDouble("challengeplayerreadyupcount");
			DoomsDayAliveCount = nbt.getDouble("DoomsDayAliveCount");
			DoomsdayDeathCount = nbt.getDouble("DoomsdayDeathCount");
			DoomsdayRiskFailCount = nbt.getDouble("DoomsdayRiskFailCount");
			nightmare = nbt.getDouble("nightmare");
			Risk = nbt.getDouble("Risk");
			risknumberattempts = nbt.getDouble("risknumberattempts");
			timebeforespecial = nbt.getDouble("timebeforespecial");
			Birthday = nbt.getBoolean("Birthday");
			birthdaystart = nbt.getBoolean("birthdaystart");
			BYEBYE = nbt.getBoolean("BYEBYE");
			ChallengeToggle = nbt.getBoolean("ChallengeToggle");
			darknesscooldown = nbt.getBoolean("darknesscooldown");
			ddaystart = nbt.getBoolean("ddaystart");
			DoomsdayDialogueStart = nbt.getBoolean("DoomsdayDialogueStart");
			doomsdaymainsongstart = nbt.getBoolean("doomsdaymainsongstart");
			hewhowatches = nbt.getBoolean("hewhowatches");
			HHGkilledtoggle = nbt.getBoolean("HHGkilledtoggle");
			lightningcooldowndday = nbt.getBoolean("lightningcooldowndday");
			madlads = nbt.getBoolean("madlads");
			OHBOY = nbt.getBoolean("OHBOY");
			OHNO = nbt.getBoolean("OHNO");
			riskcheckedstart = nbt.getBoolean("riskcheckedstart");
			riskcooldown = nbt.getBoolean("riskcooldown");
			SharkoLayCD = nbt.getBoolean("SharkoLayCD");
			SharkoRetryState = nbt.getBoolean("SharkoRetryState");
			SharkoSleepCD = nbt.getBoolean("SharkoSleepCD");
			WELCOMETOINSANITY = nbt.getBoolean("WELCOMETOINSANITY");
			GOODBYE = nbt.getBoolean("GOODBYE");
			DoomsdayEeriePlayOnce = nbt.getBoolean("DoomsdayEeriePlayOnce");
			DoomsDayStart = nbt.getBoolean("DoomsDayStart");
			ddaytimenighttimerblock = nbt.getBoolean("ddaytimenighttimerblock");
			ddaydialoguetimeblock = nbt.getBoolean("ddaydialoguetimeblock");
			waittildoomsday = nbt.getBoolean("waittildoomsday");
			PlayerWorldCount = nbt.getDouble("PlayerWorldCount");
			sddaystart = nbt.getBoolean("sddaystart");
			sdoomsdaymainsongstart = nbt.getBoolean("sdoomsdaymainsongstart");
			SuperDoomsDayStart = nbt.getBoolean("SuperDoomsDayStart");
			waittilsdoomsday = nbt.getBoolean("waittilsdoomsday");
			sddaydialoguetimeblock = nbt.getBoolean("sddaydialoguetimeblock");
			sddaytimenighttimerblock = nbt.getBoolean("sddaytimenighttimerblock");
			SuperDoomsdayEeriePlayOnce = nbt.getBoolean("SuperDoomsdayEeriePlayOnce");
			SDDAYToggle = nbt.getBoolean("SDDAYToggle");
			timecheckstop = nbt.getBoolean("timecheckstop");
			DayCooldownToggle = nbt.getBoolean("DayCooldownToggle");
			ddayspikecooldown = nbt.getBoolean("ddayspikecooldown");
			sddayspikecooldown = nbt.getBoolean("sddayspikecooldown");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("challengeplayerreadyupcount", challengeplayerreadyupcount);
			nbt.putDouble("DoomsDayAliveCount", DoomsDayAliveCount);
			nbt.putDouble("DoomsdayDeathCount", DoomsdayDeathCount);
			nbt.putDouble("DoomsdayRiskFailCount", DoomsdayRiskFailCount);
			nbt.putDouble("nightmare", nightmare);
			nbt.putDouble("Risk", Risk);
			nbt.putDouble("risknumberattempts", risknumberattempts);
			nbt.putDouble("timebeforespecial", timebeforespecial);
			nbt.putBoolean("Birthday", Birthday);
			nbt.putBoolean("birthdaystart", birthdaystart);
			nbt.putBoolean("BYEBYE", BYEBYE);
			nbt.putBoolean("ChallengeToggle", ChallengeToggle);
			nbt.putBoolean("darknesscooldown", darknesscooldown);
			nbt.putBoolean("ddaystart", ddaystart);
			nbt.putBoolean("DoomsdayDialogueStart", DoomsdayDialogueStart);
			nbt.putBoolean("doomsdaymainsongstart", doomsdaymainsongstart);
			nbt.putBoolean("hewhowatches", hewhowatches);
			nbt.putBoolean("HHGkilledtoggle", HHGkilledtoggle);
			nbt.putBoolean("lightningcooldowndday", lightningcooldowndday);
			nbt.putBoolean("madlads", madlads);
			nbt.putBoolean("OHBOY", OHBOY);
			nbt.putBoolean("OHNO", OHNO);
			nbt.putBoolean("riskcheckedstart", riskcheckedstart);
			nbt.putBoolean("riskcooldown", riskcooldown);
			nbt.putBoolean("SharkoLayCD", SharkoLayCD);
			nbt.putBoolean("SharkoRetryState", SharkoRetryState);
			nbt.putBoolean("SharkoSleepCD", SharkoSleepCD);
			nbt.putBoolean("WELCOMETOINSANITY", WELCOMETOINSANITY);
			nbt.putBoolean("GOODBYE", GOODBYE);
			nbt.putBoolean("DoomsdayEeriePlayOnce", DoomsdayEeriePlayOnce);
			nbt.putBoolean("DoomsDayStart", DoomsDayStart);
			nbt.putBoolean("ddaytimenighttimerblock", ddaytimenighttimerblock);
			nbt.putBoolean("ddaydialoguetimeblock", ddaydialoguetimeblock);
			nbt.putBoolean("waittildoomsday", waittildoomsday);
			nbt.putDouble("PlayerWorldCount", PlayerWorldCount);
			nbt.putBoolean("sddaystart", sddaystart);
			nbt.putBoolean("sdoomsdaymainsongstart", sdoomsdaymainsongstart);
			nbt.putBoolean("SuperDoomsDayStart", SuperDoomsDayStart);
			nbt.putBoolean("waittilsdoomsday", waittilsdoomsday);
			nbt.putBoolean("sddaydialoguetimeblock", sddaydialoguetimeblock);
			nbt.putBoolean("sddaytimenighttimerblock", sddaytimenighttimerblock);
			nbt.putBoolean("SuperDoomsdayEeriePlayOnce", SuperDoomsdayEeriePlayOnce);
			nbt.putBoolean("SDDAYToggle", SDDAYToggle);
			nbt.putBoolean("timecheckstop", timecheckstop);
			nbt.putBoolean("DayCooldownToggle", DayCooldownToggle);
			nbt.putBoolean("ddayspikecooldown", ddayspikecooldown);
			nbt.putBoolean("sddayspikecooldown", sddayspikecooldown);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("allaboutengie", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double AngryEngieKillCount = 0.0;
		public double browniescount = 0.0;
		public double cheeseballcount = 0.0;
		public double coincount = 0.0;
		public double EnragedEngieKillCount = 0.0;
		public double HHGLookX = 0.0;
		public double HHGLookY = 0.0;
		public double HHGLookZ = 0.0;
		public double InsanityKillCount = 0.0;
		public double lightningX = 0.0;
		public double lightningY = 0.0;
		public double lightningZ = 0.0;
		public double MadEngieKillCount = 0.0;
		public double OutragedEngieKillCount = 0.0;
		public double PlayerX = 0.0;
		public double PlayerY = 0.0;
		public double PlayerZ = 0.0;
		public boolean coderedeemblock = false;
		public boolean detecstart = false;
		public boolean DoomsdayAlive = false;
		public boolean firstplay = false;
		public boolean GoodLuck = false;
		public boolean healthreductiondday = false;
		public boolean multiplayertrophyobtained = false;
		public boolean playerready = false;
		public boolean solotrophyobtained = false;
		public boolean BlockDeathAliveCOunt = false;
		public boolean timeoverlaytoggle = false;
		public boolean SharkoRideToggle = false;
		public double TrueHardcoreLifeCount = 10.0;
		public boolean RespawnNormInstantHealth = false;
		public boolean RespawnTrueHardcoreGraceStart = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("AngryEngieKillCount", AngryEngieKillCount);
			nbt.putDouble("browniescount", browniescount);
			nbt.putDouble("cheeseballcount", cheeseballcount);
			nbt.putDouble("coincount", coincount);
			nbt.putDouble("EnragedEngieKillCount", EnragedEngieKillCount);
			nbt.putDouble("HHGLookX", HHGLookX);
			nbt.putDouble("HHGLookY", HHGLookY);
			nbt.putDouble("HHGLookZ", HHGLookZ);
			nbt.putDouble("InsanityKillCount", InsanityKillCount);
			nbt.putDouble("lightningX", lightningX);
			nbt.putDouble("lightningY", lightningY);
			nbt.putDouble("lightningZ", lightningZ);
			nbt.putDouble("MadEngieKillCount", MadEngieKillCount);
			nbt.putDouble("OutragedEngieKillCount", OutragedEngieKillCount);
			nbt.putDouble("PlayerX", PlayerX);
			nbt.putDouble("PlayerY", PlayerY);
			nbt.putDouble("PlayerZ", PlayerZ);
			nbt.putBoolean("coderedeemblock", coderedeemblock);
			nbt.putBoolean("detecstart", detecstart);
			nbt.putBoolean("DoomsdayAlive", DoomsdayAlive);
			nbt.putBoolean("firstplay", firstplay);
			nbt.putBoolean("GoodLuck", GoodLuck);
			nbt.putBoolean("healthreductiondday", healthreductiondday);
			nbt.putBoolean("multiplayertrophyobtained", multiplayertrophyobtained);
			nbt.putBoolean("playerready", playerready);
			nbt.putBoolean("solotrophyobtained", solotrophyobtained);
			nbt.putBoolean("BlockDeathAliveCOunt", BlockDeathAliveCOunt);
			nbt.putBoolean("timeoverlaytoggle", timeoverlaytoggle);
			nbt.putBoolean("SharkoRideToggle", SharkoRideToggle);
			nbt.putDouble("TrueHardcoreLifeCount", TrueHardcoreLifeCount);
			nbt.putBoolean("RespawnNormInstantHealth", RespawnNormInstantHealth);
			nbt.putBoolean("RespawnTrueHardcoreGraceStart", RespawnTrueHardcoreGraceStart);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			AngryEngieKillCount = nbt.getDouble("AngryEngieKillCount");
			browniescount = nbt.getDouble("browniescount");
			cheeseballcount = nbt.getDouble("cheeseballcount");
			coincount = nbt.getDouble("coincount");
			EnragedEngieKillCount = nbt.getDouble("EnragedEngieKillCount");
			HHGLookX = nbt.getDouble("HHGLookX");
			HHGLookY = nbt.getDouble("HHGLookY");
			HHGLookZ = nbt.getDouble("HHGLookZ");
			InsanityKillCount = nbt.getDouble("InsanityKillCount");
			lightningX = nbt.getDouble("lightningX");
			lightningY = nbt.getDouble("lightningY");
			lightningZ = nbt.getDouble("lightningZ");
			MadEngieKillCount = nbt.getDouble("MadEngieKillCount");
			OutragedEngieKillCount = nbt.getDouble("OutragedEngieKillCount");
			PlayerX = nbt.getDouble("PlayerX");
			PlayerY = nbt.getDouble("PlayerY");
			PlayerZ = nbt.getDouble("PlayerZ");
			coderedeemblock = nbt.getBoolean("coderedeemblock");
			detecstart = nbt.getBoolean("detecstart");
			DoomsdayAlive = nbt.getBoolean("DoomsdayAlive");
			firstplay = nbt.getBoolean("firstplay");
			GoodLuck = nbt.getBoolean("GoodLuck");
			healthreductiondday = nbt.getBoolean("healthreductiondday");
			multiplayertrophyobtained = nbt.getBoolean("multiplayertrophyobtained");
			playerready = nbt.getBoolean("playerready");
			solotrophyobtained = nbt.getBoolean("solotrophyobtained");
			BlockDeathAliveCOunt = nbt.getBoolean("BlockDeathAliveCOunt");
			timeoverlaytoggle = nbt.getBoolean("timeoverlaytoggle");
			SharkoRideToggle = nbt.getBoolean("SharkoRideToggle");
			TrueHardcoreLifeCount = nbt.getDouble("TrueHardcoreLifeCount");
			RespawnNormInstantHealth = nbt.getBoolean("RespawnNormInstantHealth");
			RespawnTrueHardcoreGraceStart = nbt.getBoolean("RespawnTrueHardcoreGraceStart");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.AngryEngieKillCount = message.data.AngryEngieKillCount;
					variables.browniescount = message.data.browniescount;
					variables.cheeseballcount = message.data.cheeseballcount;
					variables.coincount = message.data.coincount;
					variables.EnragedEngieKillCount = message.data.EnragedEngieKillCount;
					variables.HHGLookX = message.data.HHGLookX;
					variables.HHGLookY = message.data.HHGLookY;
					variables.HHGLookZ = message.data.HHGLookZ;
					variables.InsanityKillCount = message.data.InsanityKillCount;
					variables.lightningX = message.data.lightningX;
					variables.lightningY = message.data.lightningY;
					variables.lightningZ = message.data.lightningZ;
					variables.MadEngieKillCount = message.data.MadEngieKillCount;
					variables.OutragedEngieKillCount = message.data.OutragedEngieKillCount;
					variables.PlayerX = message.data.PlayerX;
					variables.PlayerY = message.data.PlayerY;
					variables.PlayerZ = message.data.PlayerZ;
					variables.coderedeemblock = message.data.coderedeemblock;
					variables.detecstart = message.data.detecstart;
					variables.DoomsdayAlive = message.data.DoomsdayAlive;
					variables.firstplay = message.data.firstplay;
					variables.GoodLuck = message.data.GoodLuck;
					variables.healthreductiondday = message.data.healthreductiondday;
					variables.multiplayertrophyobtained = message.data.multiplayertrophyobtained;
					variables.playerready = message.data.playerready;
					variables.solotrophyobtained = message.data.solotrophyobtained;
					variables.BlockDeathAliveCOunt = message.data.BlockDeathAliveCOunt;
					variables.timeoverlaytoggle = message.data.timeoverlaytoggle;
					variables.SharkoRideToggle = message.data.SharkoRideToggle;
					variables.TrueHardcoreLifeCount = message.data.TrueHardcoreLifeCount;
					variables.RespawnNormInstantHealth = message.data.RespawnNormInstantHealth;
					variables.RespawnTrueHardcoreGraceStart = message.data.RespawnTrueHardcoreGraceStart;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

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
	public static boolean seasonwinter = false;
	public static boolean seasonautumn = false;
	public static boolean seasonsummer = false;
	public static boolean seasonspring = false;

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
			clone.detecstart = original.detecstart;
			clone.coderedeemblock = original.coderedeemblock;
			clone.coincount = original.coincount;
			clone.browniescount = original.browniescount;
			clone.cheeseballcount = original.cheeseballcount;
			clone.PlayerX = original.PlayerX;
			clone.PlayerY = original.PlayerY;
			clone.PlayerZ = original.PlayerZ;
			clone.HHGLookX = original.HHGLookX;
			clone.HHGLookY = original.HHGLookY;
			clone.HHGLookZ = original.HHGLookZ;
			clone.GoodLuck = original.GoodLuck;
			clone.playerready = original.playerready;
			clone.AngryEngieKillCount = original.AngryEngieKillCount;
			clone.EnragedEngieKillCount = original.EnragedEngieKillCount;
			clone.OutragedEngieKillCount = original.OutragedEngieKillCount;
			clone.InsanityKillCount = original.InsanityKillCount;
			if (!event.isWasDeath()) {
				clone.firstplay = original.firstplay;
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
		public boolean SharkoRetryState = false;
		public boolean hewhowatches = false;
		public double nightmare = 0;
		public boolean HHGkilledtoggle = false;
		public double challengeplayerreadyupcount = 0;
		public boolean ChallengeToggle = false;
		public boolean BYEBYE = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			SharkoRetryState = nbt.getBoolean("SharkoRetryState");
			hewhowatches = nbt.getBoolean("hewhowatches");
			nightmare = nbt.getDouble("nightmare");
			HHGkilledtoggle = nbt.getBoolean("HHGkilledtoggle");
			challengeplayerreadyupcount = nbt.getDouble("challengeplayerreadyupcount");
			ChallengeToggle = nbt.getBoolean("ChallengeToggle");
			BYEBYE = nbt.getBoolean("BYEBYE");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("SharkoRetryState", SharkoRetryState);
			nbt.putBoolean("hewhowatches", hewhowatches);
			nbt.putDouble("nightmare", nightmare);
			nbt.putBoolean("HHGkilledtoggle", HHGkilledtoggle);
			nbt.putDouble("challengeplayerreadyupcount", challengeplayerreadyupcount);
			nbt.putBoolean("ChallengeToggle", ChallengeToggle);
			nbt.putBoolean("BYEBYE", BYEBYE);
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
		public boolean firstplay = false;
		public boolean detecstart = false;
		public boolean coderedeemblock = false;
		public double coincount = 0;
		public double browniescount = 0;
		public double cheeseballcount = 0;
		public double PlayerX = 0;
		public double PlayerY = 0;
		public double PlayerZ = 0;
		public double HHGLookX = 0;
		public double HHGLookY = 0;
		public double HHGLookZ = 0;
		public boolean GoodLuck = false;
		public boolean playerready = false;
		public double AngryEngieKillCount = 0;
		public double EnragedEngieKillCount = 0;
		public double OutragedEngieKillCount = 0;
		public double InsanityKillCount = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				AllaboutengieMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("firstplay", firstplay);
			nbt.putBoolean("detecstart", detecstart);
			nbt.putBoolean("coderedeemblock", coderedeemblock);
			nbt.putDouble("coincount", coincount);
			nbt.putDouble("browniescount", browniescount);
			nbt.putDouble("cheeseballcount", cheeseballcount);
			nbt.putDouble("PlayerX", PlayerX);
			nbt.putDouble("PlayerY", PlayerY);
			nbt.putDouble("PlayerZ", PlayerZ);
			nbt.putDouble("HHGLookX", HHGLookX);
			nbt.putDouble("HHGLookY", HHGLookY);
			nbt.putDouble("HHGLookZ", HHGLookZ);
			nbt.putBoolean("GoodLuck", GoodLuck);
			nbt.putBoolean("playerready", playerready);
			nbt.putDouble("AngryEngieKillCount", AngryEngieKillCount);
			nbt.putDouble("EnragedEngieKillCount", EnragedEngieKillCount);
			nbt.putDouble("OutragedEngieKillCount", OutragedEngieKillCount);
			nbt.putDouble("InsanityKillCount", InsanityKillCount);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			firstplay = nbt.getBoolean("firstplay");
			detecstart = nbt.getBoolean("detecstart");
			coderedeemblock = nbt.getBoolean("coderedeemblock");
			coincount = nbt.getDouble("coincount");
			browniescount = nbt.getDouble("browniescount");
			cheeseballcount = nbt.getDouble("cheeseballcount");
			PlayerX = nbt.getDouble("PlayerX");
			PlayerY = nbt.getDouble("PlayerY");
			PlayerZ = nbt.getDouble("PlayerZ");
			HHGLookX = nbt.getDouble("HHGLookX");
			HHGLookY = nbt.getDouble("HHGLookY");
			HHGLookZ = nbt.getDouble("HHGLookZ");
			GoodLuck = nbt.getBoolean("GoodLuck");
			playerready = nbt.getBoolean("playerready");
			AngryEngieKillCount = nbt.getDouble("AngryEngieKillCount");
			EnragedEngieKillCount = nbt.getDouble("EnragedEngieKillCount");
			OutragedEngieKillCount = nbt.getDouble("OutragedEngieKillCount");
			InsanityKillCount = nbt.getDouble("InsanityKillCount");
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
					variables.firstplay = message.data.firstplay;
					variables.detecstart = message.data.detecstart;
					variables.coderedeemblock = message.data.coderedeemblock;
					variables.coincount = message.data.coincount;
					variables.browniescount = message.data.browniescount;
					variables.cheeseballcount = message.data.cheeseballcount;
					variables.PlayerX = message.data.PlayerX;
					variables.PlayerY = message.data.PlayerY;
					variables.PlayerZ = message.data.PlayerZ;
					variables.HHGLookX = message.data.HHGLookX;
					variables.HHGLookY = message.data.HHGLookY;
					variables.HHGLookZ = message.data.HHGLookZ;
					variables.GoodLuck = message.data.GoodLuck;
					variables.playerready = message.data.playerready;
					variables.AngryEngieKillCount = message.data.AngryEngieKillCount;
					variables.EnragedEngieKillCount = message.data.EnragedEngieKillCount;
					variables.OutragedEngieKillCount = message.data.OutragedEngieKillCount;
					variables.InsanityKillCount = message.data.InsanityKillCount;
				}
			});
			context.setPacketHandled(true);
		}
	}
}

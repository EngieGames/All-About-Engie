
package net.mcreator.allaboutengie.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.world.inventory.TrueBanHammerTogglesMenu;
import net.mcreator.allaboutengie.procedures.TBHTKicktoggleonproProcedure;
import net.mcreator.allaboutengie.procedures.TBHTDamagetoggleonproProcedure;
import net.mcreator.allaboutengie.procedures.TBHTBantoggleonproProcedure;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrueBanHammerTogglesButtonMessage {
	private final int buttonID, x, y, z;

	public TrueBanHammerTogglesButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public TrueBanHammerTogglesButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(TrueBanHammerTogglesButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(TrueBanHammerTogglesButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = TrueBanHammerTogglesMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TBHTKicktoggleonproProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TBHTBantoggleonproProcedure.execute(entity);
		}
		if (buttonID == 2) {

			TBHTDamagetoggleonproProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		AllaboutengieMod.addNetworkMessage(TrueBanHammerTogglesButtonMessage.class, TrueBanHammerTogglesButtonMessage::buffer, TrueBanHammerTogglesButtonMessage::new, TrueBanHammerTogglesButtonMessage::handler);
	}
}

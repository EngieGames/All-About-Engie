
package net.mcreator.allaboutengie.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class CreativeEngieBundleUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public CreativeEngieBundleUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AllaboutengieModMenus.CREATIVE_ENGIE_BUNDLE_UI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(154);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 7, 8) {
			private final int slot = 0;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 25, 8) {
			private final int slot = 1;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 43, 8) {
			private final int slot = 2;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 61, 8) {
			private final int slot = 3;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 79, 8) {
			private final int slot = 4;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 97, 8) {
			private final int slot = 5;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 115, 8) {
			private final int slot = 6;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 133, 8) {
			private final int slot = 7;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 151, 8) {
			private final int slot = 8;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 169, 8) {
			private final int slot = 9;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 187, 8) {
			private final int slot = 10;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 205, 8) {
			private final int slot = 11;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 223, 8) {
			private final int slot = 12;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 241, 8) {
			private final int slot = 13;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 259, 8) {
			private final int slot = 14;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 277, 8) {
			private final int slot = 15;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 295, 8) {
			private final int slot = 16;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 313, 8) {
			private final int slot = 17;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 331, 8) {
			private final int slot = 18;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 349, 8) {
			private final int slot = 19;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 367, 8) {
			private final int slot = 20;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 385, 8) {
			private final int slot = 21;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 7, 26) {
			private final int slot = 22;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 25, 26) {
			private final int slot = 23;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 43, 26) {
			private final int slot = 24;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 61, 26) {
			private final int slot = 25;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 79, 26) {
			private final int slot = 26;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 97, 26) {
			private final int slot = 27;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 115, 26) {
			private final int slot = 28;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 133, 26) {
			private final int slot = 29;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 151, 26) {
			private final int slot = 30;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 169, 26) {
			private final int slot = 31;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 187, 26) {
			private final int slot = 32;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 205, 26) {
			private final int slot = 33;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 223, 26) {
			private final int slot = 34;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 241, 26) {
			private final int slot = 35;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 259, 26) {
			private final int slot = 36;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 277, 26) {
			private final int slot = 37;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 295, 26) {
			private final int slot = 38;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 313, 26) {
			private final int slot = 39;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 331, 26) {
			private final int slot = 40;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 349, 26) {
			private final int slot = 41;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 367, 26) {
			private final int slot = 42;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 385, 26) {
			private final int slot = 43;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 7, 44) {
			private final int slot = 44;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 25, 44) {
			private final int slot = 45;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 43, 44) {
			private final int slot = 46;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 61, 44) {
			private final int slot = 47;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 79, 44) {
			private final int slot = 48;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 97, 44) {
			private final int slot = 49;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 115, 44) {
			private final int slot = 50;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 133, 44) {
			private final int slot = 51;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 151, 44) {
			private final int slot = 52;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 169, 44) {
			private final int slot = 53;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 187, 44) {
			private final int slot = 54;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 205, 44) {
			private final int slot = 55;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 223, 44) {
			private final int slot = 56;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 241, 44) {
			private final int slot = 57;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 259, 44) {
			private final int slot = 58;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 277, 44) {
			private final int slot = 59;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 295, 44) {
			private final int slot = 60;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 313, 44) {
			private final int slot = 61;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 331, 44) {
			private final int slot = 62;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 349, 44) {
			private final int slot = 63;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 367, 44) {
			private final int slot = 64;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 385, 44) {
			private final int slot = 65;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 7, 62) {
			private final int slot = 66;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 25, 62) {
			private final int slot = 67;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 43, 62) {
			private final int slot = 68;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 61, 62) {
			private final int slot = 69;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 79, 62) {
			private final int slot = 70;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 97, 62) {
			private final int slot = 71;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 115, 62) {
			private final int slot = 72;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 133, 62) {
			private final int slot = 73;
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 151, 62) {
			private final int slot = 74;
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 169, 62) {
			private final int slot = 75;
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 187, 62) {
			private final int slot = 76;
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 205, 62) {
			private final int slot = 77;
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 223, 62) {
			private final int slot = 78;
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 241, 62) {
			private final int slot = 79;
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 259, 62) {
			private final int slot = 80;
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 277, 62) {
			private final int slot = 81;
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 295, 62) {
			private final int slot = 82;
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 313, 62) {
			private final int slot = 83;
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 331, 62) {
			private final int slot = 84;
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 349, 62) {
			private final int slot = 85;
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 367, 62) {
			private final int slot = 86;
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 385, 62) {
			private final int slot = 87;
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 7, 80) {
			private final int slot = 88;
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 25, 80) {
			private final int slot = 89;
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 43, 80) {
			private final int slot = 90;
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 61, 80) {
			private final int slot = 91;
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 79, 80) {
			private final int slot = 92;
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 97, 80) {
			private final int slot = 93;
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 115, 80) {
			private final int slot = 94;
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 133, 80) {
			private final int slot = 95;
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 151, 80) {
			private final int slot = 96;
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 169, 80) {
			private final int slot = 97;
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 187, 80) {
			private final int slot = 98;
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 205, 80) {
			private final int slot = 99;
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 223, 80) {
			private final int slot = 100;
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 241, 80) {
			private final int slot = 101;
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 259, 80) {
			private final int slot = 102;
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 277, 80) {
			private final int slot = 103;
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 295, 80) {
			private final int slot = 104;
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 313, 80) {
			private final int slot = 105;
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 331, 80) {
			private final int slot = 106;
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 349, 80) {
			private final int slot = 107;
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 367, 80) {
			private final int slot = 108;
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 385, 80) {
			private final int slot = 109;
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 7, 98) {
			private final int slot = 110;
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 25, 98) {
			private final int slot = 111;
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 43, 98) {
			private final int slot = 112;
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 61, 98) {
			private final int slot = 113;
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 79, 98) {
			private final int slot = 114;
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 97, 98) {
			private final int slot = 115;
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 115, 98) {
			private final int slot = 116;
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 133, 98) {
			private final int slot = 117;
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 151, 98) {
			private final int slot = 118;
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 169, 98) {
			private final int slot = 119;
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 187, 98) {
			private final int slot = 120;
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 205, 98) {
			private final int slot = 121;
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 223, 98) {
			private final int slot = 122;
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 241, 98) {
			private final int slot = 123;
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 259, 98) {
			private final int slot = 124;
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 277, 98) {
			private final int slot = 125;
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 295, 98) {
			private final int slot = 126;
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 313, 98) {
			private final int slot = 127;
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 331, 98) {
			private final int slot = 128;
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 349, 98) {
			private final int slot = 129;
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 367, 98) {
			private final int slot = 130;
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 385, 98) {
			private final int slot = 131;
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 7, 116) {
			private final int slot = 132;
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 25, 116) {
			private final int slot = 133;
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 43, 116) {
			private final int slot = 134;
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 61, 116) {
			private final int slot = 135;
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 79, 116) {
			private final int slot = 136;
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 97, 116) {
			private final int slot = 137;
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 115, 116) {
			private final int slot = 138;
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 133, 116) {
			private final int slot = 139;
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 151, 116) {
			private final int slot = 140;
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 169, 116) {
			private final int slot = 141;
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 187, 116) {
			private final int slot = 142;
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 205, 116) {
			private final int slot = 143;
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 223, 116) {
			private final int slot = 144;
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 241, 116) {
			private final int slot = 145;
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 259, 116) {
			private final int slot = 146;
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 277, 116) {
			private final int slot = 147;
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 295, 116) {
			private final int slot = 148;
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 313, 116) {
			private final int slot = 149;
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 331, 116) {
			private final int slot = 150;
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 349, 116) {
			private final int slot = 151;
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 367, 116) {
			private final int slot = 152;
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 385, 116) {
			private final int slot = 153;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 117 + 8 + sj * 18, 50 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 117 + 8 + si * 18, 50 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 154) {
				if (!this.moveItemStackTo(itemstack1, 154, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 154, false)) {
				if (index < 154 + 27) {
					if (!this.moveItemStackTo(itemstack1, 154 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 154, 154 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}

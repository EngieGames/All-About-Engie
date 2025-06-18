package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.TrueBanHammerTogglesMenu;
import net.mcreator.allaboutengie.procedures.TBHTkicktoggledeactivatediconProcedure;
import net.mcreator.allaboutengie.procedures.TBHTkicktoggleactivatediconProcedure;
import net.mcreator.allaboutengie.procedures.TBHTKicktoggleactivatedtextProcedure;
import net.mcreator.allaboutengie.procedures.TBHTKickButtonToggleVisibilityProcedure;
import net.mcreator.allaboutengie.procedures.TBHTDamagetoggledeactivatediconProcedure;
import net.mcreator.allaboutengie.procedures.TBHTDamagetoggleactivatedtextProcedure;
import net.mcreator.allaboutengie.procedures.TBHTDamagetoggleactivatediconProcedure;
import net.mcreator.allaboutengie.procedures.TBHTDamageButtonToggleVisibilityProcedure;
import net.mcreator.allaboutengie.procedures.TBHTBantoggledeactivatediconProcedure;
import net.mcreator.allaboutengie.procedures.TBHTBantoggleactivatedtextProcedure;
import net.mcreator.allaboutengie.procedures.TBHTBantoggleactivatediconProcedure;
import net.mcreator.allaboutengie.procedures.TBHTBanButtonToggleVisibilityProcedure;
import net.mcreator.allaboutengie.procedures.RandomTextTBHTProcedure;
import net.mcreator.allaboutengie.procedures.CurrentTBHStatusProcedure;
import net.mcreator.allaboutengie.network.TrueBanHammerTogglesButtonMessage;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TrueBanHammerTogglesScreen extends AbstractContainerScreen<TrueBanHammerTogglesMenu> {
	private final static HashMap<String, Object> guistate = TrueBanHammerTogglesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_toggle_kick_status_on;
	Button button_toggle_kick_status_on1;
	Button button_toggle_kick_status_on2;

	public TrueBanHammerTogglesScreen(TrueBanHammerTogglesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 250;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("allaboutengie:textures/screens/true_ban_hammer_toggles.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (TBHTkicktoggleactivatediconProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/checkmark.png"));
			this.blit(ms, this.leftPos + 206, this.topPos + 3, 0, 0, 16, 16, 16, 16);
		}
		if (TBHTkicktoggledeactivatediconProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/denymark.png"));
			this.blit(ms, this.leftPos + 206, this.topPos + 3, 0, 0, 16, 16, 16, 16);
		}
		if (TBHTBantoggleactivatediconProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/checkmark.png"));
			this.blit(ms, this.leftPos + 206, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (TBHTBantoggledeactivatediconProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/denymark.png"));
			this.blit(ms, this.leftPos + 206, this.topPos + 35, 0, 0, 16, 16, 16, 16);
		}
		if (TBHTDamagetoggleactivatediconProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/checkmark.png"));
			this.blit(ms, this.leftPos + 206, this.topPos + 67, 0, 0, 16, 16, 16, 16);
		}
		if (TBHTDamagetoggledeactivatediconProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/denymark.png"));
			this.blit(ms, this.leftPos + 206, this.topPos + 67, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.label_ban_toggle_status"), 30, 38, -16777216);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.label_kick_toggle_status"), 30, 6, -16777216);
		this.font.draw(poseStack,

				TBHTKicktoggleactivatedtextProcedure.execute(entity), 139, 6, -16744193);
		this.font.draw(poseStack,

				TBHTBantoggleactivatedtextProcedure.execute(entity), 139, 38, -16678657);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.label_damage_toggle_status"), 30, 70, -16777216);
		this.font.draw(poseStack,

				TBHTDamagetoggleactivatedtextProcedure.execute(entity), 139, 70, -16744193);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.label_current_true_ban_hammer_status"), 41, 103, -16777216);
		this.font.draw(poseStack,

				CurrentTBHStatusProcedure.execute(entity), 41, 112, -16744193);
		this.font.draw(poseStack,

				RandomTextTBHTProcedure.execute(), 3, 134, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_toggle_kick_status_on = new Button(this.leftPos + 56, this.topPos + 17, 134, 20, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.button_toggle_kick_status_on"), e -> {
			if (TBHTKickButtonToggleVisibilityProcedure.execute(entity)) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new TrueBanHammerTogglesButtonMessage(0, x, y, z));
				TrueBanHammerTogglesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (TBHTKickButtonToggleVisibilityProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_toggle_kick_status_on", button_toggle_kick_status_on);
		this.addRenderableWidget(button_toggle_kick_status_on);
		button_toggle_kick_status_on1 = new Button(this.leftPos + 56, this.topPos + 49, 134, 20, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.button_toggle_kick_status_on1"), e -> {
			if (TBHTBanButtonToggleVisibilityProcedure.execute(entity)) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new TrueBanHammerTogglesButtonMessage(1, x, y, z));
				TrueBanHammerTogglesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (TBHTBanButtonToggleVisibilityProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_toggle_kick_status_on1", button_toggle_kick_status_on1);
		this.addRenderableWidget(button_toggle_kick_status_on1);
		button_toggle_kick_status_on2 = new Button(this.leftPos + 56, this.topPos + 81, 134, 20, Component.translatable("gui.allaboutengie.true_ban_hammer_toggles.button_toggle_kick_status_on2"), e -> {
			if (TBHTDamageButtonToggleVisibilityProcedure.execute(entity)) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new TrueBanHammerTogglesButtonMessage(2, x, y, z));
				TrueBanHammerTogglesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (TBHTDamageButtonToggleVisibilityProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:button_toggle_kick_status_on2", button_toggle_kick_status_on2);
		this.addRenderableWidget(button_toggle_kick_status_on2);
	}
}

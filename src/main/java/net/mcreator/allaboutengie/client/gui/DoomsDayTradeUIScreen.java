package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.DoomsDayTradeUIMenu;
import net.mcreator.allaboutengie.procedures.DenymarkdisplayconditionProcedure;
import net.mcreator.allaboutengie.procedures.CheckmarkdisplayconditionProcedure;
import net.mcreator.allaboutengie.network.DoomsDayTradeUIButtonMessage;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DoomsDayTradeUIScreen extends AbstractContainerScreen<DoomsDayTradeUIMenu> {
	private final static HashMap<String, Object> guistate = DoomsDayTradeUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox scythetrade;
	Checkbox bantrade;
	Button button_trade;

	public DoomsDayTradeUIScreen(DoomsDayTradeUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 180;
		this.imageHeight = 140;
	}

	private static final ResourceLocation texture = new ResourceLocation("allaboutengie:textures/screens/dooms_day_trade_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (mouseX > leftPos + 67 && mouseX < leftPos + 91 && mouseY > topPos + 4 && mouseY < topPos + 28)
			this.renderTooltip(ms, Component.translatable("gui.allaboutengie.dooms_day_trade_ui.tooltip_check_this_to_trade_for_a_scythe"), mouseX, mouseY);
		if (mouseX > leftPos + 95 && mouseX < leftPos + 119 && mouseY > topPos + 4 && mouseY < topPos + 28)
			this.renderTooltip(ms, Component.translatable("gui.allaboutengie.dooms_day_trade_ui.tooltip_check_this_to_trade_for_a_ban_ha"), mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (CheckmarkdisplayconditionProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/checkmark.png"));
			this.blit(ms, this.leftPos + 126, this.topPos + 8, 0, 0, 16, 16, 16, 16);
		}
		if (DenymarkdisplayconditionProcedure.execute(world)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("allaboutengie:textures/screens/denymark.png"));
			this.blit(ms, this.leftPos + 126, this.topPos + 8, 0, 0, 16, 16, 16, 16);
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
		button_trade = new Button(this.leftPos + 8, this.topPos + 29, 51, 20, Component.translatable("gui.allaboutengie.dooms_day_trade_ui.button_trade"), e -> {
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new DoomsDayTradeUIButtonMessage(0, x, y, z));
				DoomsDayTradeUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_trade", button_trade);
		this.addRenderableWidget(button_trade);
		scythetrade = new Checkbox(this.leftPos + 69, this.topPos + 6, 20, 20, Component.translatable("gui.allaboutengie.dooms_day_trade_ui.scythetrade"), false);
		guistate.put("checkbox:scythetrade", scythetrade);
		this.addRenderableWidget(scythetrade);
		bantrade = new Checkbox(this.leftPos + 97, this.topPos + 6, 20, 20, Component.translatable("gui.allaboutengie.dooms_day_trade_ui.bantrade"), false);
		guistate.put("checkbox:bantrade", bantrade);
		this.addRenderableWidget(bantrade);
	}
}

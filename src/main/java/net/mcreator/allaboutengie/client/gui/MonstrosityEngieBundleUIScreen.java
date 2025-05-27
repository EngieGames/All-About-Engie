package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.MonstrosityEngieBundleUIMenu;
import net.mcreator.allaboutengie.procedures.MonstrosityEngieBundleDisplayNameCheckProcedure;
import net.mcreator.allaboutengie.network.MonstrosityEngieBundleUIButtonMessage;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MonstrosityEngieBundleUIScreen extends AbstractContainerScreen<MonstrosityEngieBundleUIMenu> {
	private final static HashMap<String, Object> guistate = MonstrosityEngieBundleUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox ChangeBundleName;
	Button button_set_name;

	public MonstrosityEngieBundleUIScreen(MonstrosityEngieBundleUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 380;
		this.imageHeight = 230;
	}

	private static final ResourceLocation texture = new ResourceLocation("allaboutengie:textures/screens/monstrosity_engie_bundle_ui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		ChangeBundleName.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (ChangeBundleName.isFocused())
			return ChangeBundleName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		ChangeBundleName.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack,

				MonstrosityEngieBundleDisplayNameCheckProcedure.execute(entity), 5, 29, -12829636);
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
		ChangeBundleName = new EditBox(this.font, this.leftPos + 5, this.topPos + 6, 120, 20, Component.translatable("gui.allaboutengie.monstrosity_engie_bundle_ui.ChangeBundleName")) {
			{
				setSuggestion(Component.translatable("gui.allaboutengie.monstrosity_engie_bundle_ui.ChangeBundleName").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.allaboutengie.monstrosity_engie_bundle_ui.ChangeBundleName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.allaboutengie.monstrosity_engie_bundle_ui.ChangeBundleName").getString());
				else
					setSuggestion(null);
			}
		};
		ChangeBundleName.setMaxLength(32767);
		guistate.put("text:ChangeBundleName", ChangeBundleName);
		this.addWidget(this.ChangeBundleName);
		button_set_name = new Button(this.leftPos + 129, this.topPos + 6, 66, 20, Component.translatable("gui.allaboutengie.monstrosity_engie_bundle_ui.button_set_name"), e -> {
			if (true) {
				AllaboutengieMod.PACKET_HANDLER.sendToServer(new MonstrosityEngieBundleUIButtonMessage(0, x, y, z));
				MonstrosityEngieBundleUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_set_name", button_set_name);
		this.addRenderableWidget(button_set_name);
	}
}

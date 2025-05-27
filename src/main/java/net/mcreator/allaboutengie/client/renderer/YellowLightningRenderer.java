
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.YellowLightningEntity;
import net.mcreator.allaboutengie.client.model.Modelmissilebombs;

public class YellowLightningRenderer extends MobRenderer<YellowLightningEntity, Modelmissilebombs<YellowLightningEntity>> {
	public YellowLightningRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(YellowLightningEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/yellowlightning.png");
	}
}

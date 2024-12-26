
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigLegendarySharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbboyo;

public class BigLegendarySharkoRenderer extends MobRenderer<BigLegendarySharkoEntity, Modelbboyo<BigLegendarySharkoEntity>> {
	public BigLegendarySharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigLegendarySharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bboyoleg.png");
	}
}

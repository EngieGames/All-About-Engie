
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigMythicSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbboyo;

public class BigMythicSharkoRenderer extends MobRenderer<BigMythicSharkoEntity, Modelbboyo<BigMythicSharkoEntity>> {
	public BigMythicSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bboyomy.png");
	}
}

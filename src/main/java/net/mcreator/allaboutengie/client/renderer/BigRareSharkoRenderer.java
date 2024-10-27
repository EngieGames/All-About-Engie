
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbboyo;

public class BigRareSharkoRenderer extends MobRenderer<BigRareSharkoEntity, Modelbboyo<BigRareSharkoEntity>> {
	public BigRareSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bboyora.png");
	}
}

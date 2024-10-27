
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbboyo;

public class BigSharkoRenderer extends MobRenderer<BigSharkoEntity, Modelbboyo<BigSharkoEntity>> {
	public BigSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bboyo.png");
	}
}


package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CosmoEntity;
import net.mcreator.allaboutengie.client.model.Modelcosmodabigboyo;

public class CosmoRenderer extends MobRenderer<CosmoEntity, Modelcosmodabigboyo<CosmoEntity>> {
	public CosmoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcosmodabigboyo(context.bakeLayer(Modelcosmodabigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/cosmo.png");
	}
}

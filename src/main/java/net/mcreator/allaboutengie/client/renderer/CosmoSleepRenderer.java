
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CosmoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelcosmodabigboyotired;

public class CosmoSleepRenderer extends MobRenderer<CosmoSleepEntity, Modelcosmodabigboyotired<CosmoSleepEntity>> {
	public CosmoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcosmodabigboyotired(context.bakeLayer(Modelcosmodabigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/cosmosleeping.png");
	}
}

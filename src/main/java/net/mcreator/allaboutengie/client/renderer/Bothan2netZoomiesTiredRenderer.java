
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.Bothan2netZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class Bothan2netZoomiesTiredRenderer extends MobRenderer<Bothan2netZoomiesTiredEntity, Modeltobyzoomtired<Bothan2netZoomiesTiredEntity>> {
	public Bothan2netZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzoomtired(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Bothan2netZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bothan2netzoomtired.png");
	}
}

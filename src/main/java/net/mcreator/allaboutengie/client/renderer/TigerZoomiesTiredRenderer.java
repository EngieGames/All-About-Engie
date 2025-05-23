
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.TigerZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class TigerZoomiesTiredRenderer extends MobRenderer<TigerZoomiesTiredEntity, Modeltobyzoomtired<TigerZoomiesTiredEntity>> {
	public TigerZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzoomtired(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TigerZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/tigerzoomtired.png");
	}
}

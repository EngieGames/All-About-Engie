
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MarshalZoomiesTiredEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class MarshalZoomiesTiredRenderer extends MobRenderer<MarshalZoomiesTiredEntity, Modeltobyzoomtired<MarshalZoomiesTiredEntity>> {
	public MarshalZoomiesTiredRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzoomtired(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarshalZoomiesTiredEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/marshaltired.png");
	}
}

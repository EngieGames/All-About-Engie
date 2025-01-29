
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MarshalZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modeltoby;

public class MarshalZoomiesRenderer extends MobRenderer<MarshalZoomiesEntity, Modeltoby<MarshalZoomiesEntity>> {
	public MarshalZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoby(context.bakeLayer(Modeltoby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarshalZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/marshal.png");
	}
}

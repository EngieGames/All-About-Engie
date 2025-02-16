
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CBEZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modelengieboyozoom;

public class CBEZoomiesRenderer extends MobRenderer<CBEZoomiesEntity, Modelengieboyozoom<CBEZoomiesEntity>> {
	public CBEZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengieboyozoom(context.bakeLayer(Modelengieboyozoom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CBEZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharkozooms.png");
	}
}

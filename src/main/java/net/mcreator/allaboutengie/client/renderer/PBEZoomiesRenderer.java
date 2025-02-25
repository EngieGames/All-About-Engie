
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.PBEZoomiesEntity;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyozoom;

public class PBEZoomiesRenderer extends MobRenderer<PBEZoomiesEntity, Modelengiedaboyozoom<PBEZoomiesEntity>> {
	public PBEZoomiesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiedaboyozoom(context.bakeLayer(Modelengiedaboyozoom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBEZoomiesEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko2zoom.png");
	}
}

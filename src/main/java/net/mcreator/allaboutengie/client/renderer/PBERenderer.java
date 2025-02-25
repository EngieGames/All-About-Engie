
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.PBEEntity;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyo;

public class PBERenderer extends MobRenderer<PBEEntity, Modelengiedaboyo<PBEEntity>> {
	public PBERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiedaboyo(context.bakeLayer(Modelengiedaboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBEEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko2.png");
	}
}

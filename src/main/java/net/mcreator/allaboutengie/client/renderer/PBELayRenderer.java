
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.PBELayEntity;
import net.mcreator.allaboutengie.client.model.Modelengiedaboyosit;

public class PBELayRenderer extends MobRenderer<PBELayEntity, Modelengiedaboyosit<PBELayEntity>> {
	public PBELayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengiedaboyosit(context.bakeLayer(Modelengiedaboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBELayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko2.png");
	}
}

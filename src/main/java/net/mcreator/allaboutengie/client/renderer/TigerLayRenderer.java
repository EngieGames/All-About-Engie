
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.TigerLayEntity;
import net.mcreator.allaboutengie.client.model.Modeltobysit;

public class TigerLayRenderer extends MobRenderer<TigerLayEntity, Modeltobysit<TigerLayEntity>> {
	public TigerLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobysit(context.bakeLayer(Modeltobysit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TigerLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/tiger.png");
	}
}

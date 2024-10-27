
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BlueEnragedBoomEntity;
import net.mcreator.allaboutengie.client.model.Modelenraged_boom;

public class BlueEnragedBoomRenderer extends MobRenderer<BlueEnragedBoomEntity, Modelenraged_boom<BlueEnragedBoomEntity>> {
	public BlueEnragedBoomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_boom(context.bakeLayer(Modelenraged_boom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueEnragedBoomEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/blueboom.png");
	}
}

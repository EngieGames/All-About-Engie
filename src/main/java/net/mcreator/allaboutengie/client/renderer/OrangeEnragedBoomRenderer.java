
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.OrangeEnragedBoomEntity;
import net.mcreator.allaboutengie.client.model.Modelenraged_boom;

public class OrangeEnragedBoomRenderer extends MobRenderer<OrangeEnragedBoomEntity, Modelenraged_boom<OrangeEnragedBoomEntity>> {
	public OrangeEnragedBoomRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenraged_boom(context.bakeLayer(Modelenraged_boom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(OrangeEnragedBoomEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/orangeboom.png");
	}
}

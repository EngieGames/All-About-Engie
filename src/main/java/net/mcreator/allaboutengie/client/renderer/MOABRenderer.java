
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MOABEntity;
import net.mcreator.allaboutengie.client.model.Modelmissilebombs;

public class MOABRenderer extends MobRenderer<MOABEntity, Modelmissilebombs<MOABEntity>> {
	public MOABRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(MOABEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/moab.png");
	}
}

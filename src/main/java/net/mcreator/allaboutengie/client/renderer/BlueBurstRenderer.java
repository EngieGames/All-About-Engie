
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BlueBurstEntity;
import net.mcreator.allaboutengie.client.model.Modelmissilebombs;

public class BlueBurstRenderer extends MobRenderer<BlueBurstEntity, Modelmissilebombs<BlueBurstEntity>> {
	public BlueBurstRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueBurstEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/blueburst.png");
	}
}

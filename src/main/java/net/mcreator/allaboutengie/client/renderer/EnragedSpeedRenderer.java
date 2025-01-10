
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedSpeedEntity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeedRenderer extends MobRenderer<EnragedSpeedEntity, Modelenragedzombie<EnragedSpeedEntity>> {
	public EnragedSpeedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed.png");
	}
}
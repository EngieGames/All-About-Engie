
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedNormal9Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedNormal9Renderer extends MobRenderer<EnragedNormal9Entity, Modelenragedzombie<EnragedNormal9Entity>> {
	public EnragedNormal9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal9Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal9.png");
	}
}

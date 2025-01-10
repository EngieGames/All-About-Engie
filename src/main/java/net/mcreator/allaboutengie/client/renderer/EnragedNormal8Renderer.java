
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedNormal8Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedNormal8Renderer extends MobRenderer<EnragedNormal8Entity, Modelenragedzombie<EnragedNormal8Entity>> {
	public EnragedNormal8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal8Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal8.png");
	}
}

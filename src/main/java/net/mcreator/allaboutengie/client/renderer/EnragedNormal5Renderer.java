
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedNormal5Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedNormal5Renderer extends MobRenderer<EnragedNormal5Entity, Modelenragedzombie<EnragedNormal5Entity>> {
	public EnragedNormal5Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal5Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal5.png");
	}
}
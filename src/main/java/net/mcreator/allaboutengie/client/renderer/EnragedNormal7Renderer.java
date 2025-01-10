
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedNormal7Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedNormal7Renderer extends MobRenderer<EnragedNormal7Entity, Modelenragedzombie<EnragedNormal7Entity>> {
	public EnragedNormal7Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormal7Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal7.png");
	}
}

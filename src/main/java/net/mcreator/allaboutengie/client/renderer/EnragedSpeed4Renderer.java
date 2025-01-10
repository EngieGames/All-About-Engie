
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedSpeed4Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed4Renderer extends MobRenderer<EnragedSpeed4Entity, Modelenragedzombie<EnragedSpeed4Entity>> {
	public EnragedSpeed4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed4Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed4.png");
	}
}

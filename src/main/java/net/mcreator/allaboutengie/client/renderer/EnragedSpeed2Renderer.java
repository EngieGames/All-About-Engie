
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedSpeed2Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed2Renderer extends MobRenderer<EnragedSpeed2Entity, Modelenragedzombie<EnragedSpeed2Entity>> {
	public EnragedSpeed2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed2.png");
	}
}

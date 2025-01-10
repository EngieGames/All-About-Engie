
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedSpeed8Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed8Renderer extends MobRenderer<EnragedSpeed8Entity, Modelenragedzombie<EnragedSpeed8Entity>> {
	public EnragedSpeed8Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed8Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed8.png");
	}
}


package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedSpeed3Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedSpeed3Renderer extends MobRenderer<EnragedSpeed3Entity, Modelenragedzombie<EnragedSpeed3Entity>> {
	public EnragedSpeed3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedSpeed3Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedspeed3.png");
	}
}

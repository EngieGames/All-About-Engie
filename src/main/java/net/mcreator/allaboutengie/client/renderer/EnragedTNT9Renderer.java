
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedTNT9Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedTNT9Renderer extends MobRenderer<EnragedTNT9Entity, Modelenragedzombie<EnragedTNT9Entity>> {
	public EnragedTNT9Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT9Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom9.png");
	}
}

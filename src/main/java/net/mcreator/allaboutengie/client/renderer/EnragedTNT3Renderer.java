
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedTNT3Entity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedTNT3Renderer extends MobRenderer<EnragedTNT3Entity, Modelenragedzombie<EnragedTNT3Entity>> {
	public EnragedTNT3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedTNT3Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragedboom3.png");
	}
}

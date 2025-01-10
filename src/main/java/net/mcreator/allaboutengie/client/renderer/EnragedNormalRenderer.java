
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EnragedNormalEntity;
import net.mcreator.allaboutengie.client.model.Modelenragedzombie;

public class EnragedNormalRenderer extends MobRenderer<EnragedNormalEntity, Modelenragedzombie<EnragedNormalEntity>> {
	public EnragedNormalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelenragedzombie(context.bakeLayer(Modelenragedzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EnragedNormalEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/enragednormal.png");
	}
}

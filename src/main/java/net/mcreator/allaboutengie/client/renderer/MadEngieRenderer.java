
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.client.model.ModelMadEngie;

public class MadEngieRenderer extends MobRenderer<MadEngieEntity, ModelMadEngie<MadEngieEntity>> {
	public MadEngieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMadEngie(context.bakeLayer(ModelMadEngie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MadEngieEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/madengienew.png");
	}
}

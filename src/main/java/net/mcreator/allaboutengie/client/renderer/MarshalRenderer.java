
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MarshalEntity;
import net.mcreator.allaboutengie.client.model.Modeltoby;

public class MarshalRenderer extends MobRenderer<MarshalEntity, Modeltoby<MarshalEntity>> {
	public MarshalRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoby(context.bakeLayer(Modeltoby.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MarshalEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/marshal.png");
	}
}

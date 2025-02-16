
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CBEEntity;
import net.mcreator.allaboutengie.client.model.Modelengieboyo;

public class CBERenderer extends MobRenderer<CBEEntity, Modelengieboyo<CBEEntity>> {
	public CBERenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengieboyo(context.bakeLayer(Modelengieboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CBEEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko.png");
	}
}

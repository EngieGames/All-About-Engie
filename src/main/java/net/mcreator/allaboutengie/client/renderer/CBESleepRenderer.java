
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CBESleepEntity;
import net.mcreator.allaboutengie.client.model.Modelengieboyotired;

public class CBESleepRenderer extends MobRenderer<CBESleepEntity, Modelengieboyotired<CBESleepEntity>> {
	public CBESleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengieboyotired(context.bakeLayer(Modelengieboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CBESleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharkotired.png");
	}
}

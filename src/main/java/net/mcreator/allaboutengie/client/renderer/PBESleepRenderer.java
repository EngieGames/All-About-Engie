
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.PBESleepEntity;
import net.mcreator.allaboutengie.client.model.Modelengieboyotired;

public class PBESleepRenderer extends MobRenderer<PBESleepEntity, Modelengieboyotired<PBESleepEntity>> {
	public PBESleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelengieboyotired(context.bakeLayer(Modelengieboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PBESleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engiedasharko2tired.png");
	}
}


package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BuddySleepEntity;
import net.mcreator.allaboutengie.client.model.Modeltobytired;

public class BuddySleepRenderer extends MobRenderer<BuddySleepEntity, Modeltobytired<BuddySleepEntity>> {
	public BuddySleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobytired(context.bakeLayer(Modeltobytired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BuddySleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/buddytired.png");
	}
}

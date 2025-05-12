
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.CosmoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class CosmoLayRenderer extends MobRenderer<CosmoLayEntity, Modelbigboyosit<CosmoLayEntity>> {
	public CosmoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CosmoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/cosmo.png");
	}
}

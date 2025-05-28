
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEngieSharkoRenderer extends MobRenderer<BigEngieSharkoEntity, Modelbigboyo<BigEngieSharkoEntity>> {
	public BigEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigengiesharkonew.png");
	}
}

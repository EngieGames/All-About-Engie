
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigEngieSharkoLayRenderer extends MobRenderer<BigEngieSharkoLayEntity, Modelbigboyosit<BigEngieSharkoLayEntity>> {
	public BigEngieSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigengiesharkonewtamed.png");
	}
}

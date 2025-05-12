
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigRareSharkoLayRenderer extends MobRenderer<BigRareSharkoLayEntity, Modelbigboyosit<BigRareSharkoLayEntity>> {
	public BigRareSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigraresharkonewtamed.png");
	}
}

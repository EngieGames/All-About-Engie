
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigExoticSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigExoticSharkoLayRenderer extends MobRenderer<BigExoticSharkoLayEntity, Modelbigboyosit<BigExoticSharkoLayEntity>> {
	public BigExoticSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigExoticSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigexoticsharkonewtamed.png");
	}
}

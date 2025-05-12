
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigAlbinoSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigAlbinoSharkoLayRenderer extends MobRenderer<BigAlbinoSharkoLayEntity, Modelbigboyosit<BigAlbinoSharkoLayEntity>> {
	public BigAlbinoSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigAlbinoSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigalbinosharkonewtamed.png");
	}
}

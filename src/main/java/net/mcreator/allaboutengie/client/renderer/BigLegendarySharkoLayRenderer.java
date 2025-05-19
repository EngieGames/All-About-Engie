
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigLegendarySharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigLegendarySharkoLayRenderer extends MobRenderer<BigLegendarySharkoLayEntity, Modelbigboyosit<BigLegendarySharkoLayEntity>> {
	public BigLegendarySharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigLegendarySharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/biglegendarysharkonewtamed.png");
	}
}

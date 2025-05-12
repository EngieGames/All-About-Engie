
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigMythicSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigMythicSharkoLayRenderer extends MobRenderer<BigMythicSharkoLayEntity, Modelbigboyosit<BigMythicSharkoLayEntity>> {
	public BigMythicSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/mythicsharkonewtamed.png");
	}
}

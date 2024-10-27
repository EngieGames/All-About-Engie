package net.mcreator.allaboutengie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbboyo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelbboyo"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelbboyo(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 54).addBox(-10.0F, -19.25F, 1.0F, 20.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition backfinst_r1 = body.addOrReplaceChild("backfinst_r1", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, -23.0F, -5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
				.addBox(-1.0F, -21.0F, -7.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(128, 0).addBox(-1.0F, -19.0F, -9.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition backfinsb_r1 = body
				.addOrReplaceChild(
						"backfinsb_r1", CubeListBuilder.create().texOffs(112, 0).addBox(-1.0F, -22.1704F, 15.294F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 2)
								.addBox(-1.0F, -20.1704F, 13.294F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(128, 0).addBox(-1.0F, -18.1704F, 11.294F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, -1.8326F, 0.0F, 0.0F));
		PartDefinition tailbackfinstbw_r1 = body.addOrReplaceChild("tailbackfinstbw_r1",
				CubeListBuilder.create().texOffs(46, 44).addBox(-1.0F, -35.5F, 29.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 44).addBox(-1.0F, -21.5F, 29.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 44)
						.addBox(-1.0F, -31.5F, 33.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 44).addBox(-1.0F, -25.5F, 33.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 80)
						.addBox(-1.0F, -31.5F, 31.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 80).addBox(-1.0F, -25.5F, 31.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 56)
						.addBox(-1.0F, -33.5F, 27.5F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(152, 62).addBox(-1.0F, -31.5F, 25.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 44)
						.addBox(-1.0F, -35.5F, 25.5F, 2.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 104).addBox(-3.0F, -30.6704F, 9.294F, 6.0F, 6.0F, 16.0F, new CubeDeformation(0.4F)).texOffs(0, 104)
						.addBox(-3.0F, -30.6704F, 9.147F, 6.0F, 6.0F, 16.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, -13.0F, -1.8326F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.2F)).texOffs(48, 74)
						.addBox(-14.0F, -11.2F, -22.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(54, 78).addBox(-12.0F, -12.2F, -20.0F, 24.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(80, 52)
						.addBox(-10.0F, -13.2F, -18.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(84, 56).addBox(-8.0F, -14.2F, -16.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(60, 114)
						.addBox(-6.0F, -15.2F, -14.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 106).addBox(-4.0F, -16.2F, -12.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 122)
						.addBox(-2.0F, -17.2F, -10.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition HeadFin_r1 = head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(128, 26).addBox(-6.25F, -5.0F, 0.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -14.0F, -4.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition HeadFin_r2 = head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(128, 16).addBox(2.5F, -21.0F, -9.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 4.0F, 7.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition Ears_r1 = head.addOrReplaceChild("Ears_r1", CubeListBuilder.create().texOffs(0, 8).addBox(2.2F, -15.4F, -10.1F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2F, -1.0F, -6.1F, 0.0F, 0.0F, 0.0524F));
		PartDefinition Ears_r2 = head.addOrReplaceChild("Ears_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.2F, -15.4F, -10.1F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2F, -1.0F, -6.1F, 0.0F, 0.0F, -0.0524F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(128, 106).mirror()
				.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-6.0F, 10.0F, 10.7F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(128, 106).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offset(6.0F, 10.0F, 10.7F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(128, 106).mirror()
				.addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offset(-6.0F, 10.0F, -13.3F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(0, 32).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(128, 106).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 14.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offset(6.0F, 10.0F, -13.3F));
		return LayerDefinition.create(meshdefinition, 160, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}

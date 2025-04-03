// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboyoaprilfools<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boyoaprilfools"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public Modelboyoaprilfools(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -8.0192F, -4.453F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.0F, -8.0192F, -4.453F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 12.547F, -0.4808F, 1.5708F, 0.0F, 0.0F));

		PartDefinition backfinst_r1 = Body.addOrReplaceChild("backfinst_r1",
				CubeListBuilder.create().texOffs(9, 63)
						.addBox(-0.5F, -5.0F, -3.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-0.5F, -4.0F, -4.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-0.5F, -3.0F, -5.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.4808F, 1.547F, -1.5708F, 0.0F, 0.0F));

		PartDefinition tail_r1 = Body.addOrReplaceChild("tail_r1",
				CubeListBuilder.create().texOffs(0, 69).addBox(-1.5F, -15.5852F, 5.147F, 3.0F, 3.0F, 8.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -1.0192F, -11.453F, -1.8326F, 0.0F, 0.0F));

		PartDefinition tailfin_r1 = Body.addOrReplaceChild("tailfin_r1",
				CubeListBuilder.create().texOffs(22, 67)
						.addBox(-0.5F, -18.05F, 13.5F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-0.5F, -16.05F, 13.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 69)
						.addBox(-0.5F, -17.05F, 14.5F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-0.5F, -13.05F, 16.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 63)
						.addBox(-0.5F, -16.05F, 16.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-0.5F, -13.05F, 17.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-0.5F, -11.05F, 15.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-0.5F, -18.05F, 15.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-0.5F, -16.05F, 17.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0692F, -11.403F, -1.8326F, 0.0F, 0.0F));

		PartDefinition backfinsb_r1 = Body.addOrReplaceChild("backfinsb_r1",
				CubeListBuilder.create().texOffs(0, 60)
						.addBox(-0.5F, -2.0852F, 6.147F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(-0.5F, -3.0852F, 7.147F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(9, 63)
						.addBox(-0.5F, -4.0852F, 8.147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4808F, 1.547F, -1.8326F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(48, 11)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 27)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(48, 27)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(48, 27)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 48)
						.addBox(-4.0F, -1.5F, -8.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(48, 27)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(24, 52)
						.addBox(-7.0F, -5.6F, -11.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(28, 54)
						.addBox(-6.0F, -6.1F, -10.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(38, 0)
						.addBox(-5.0F, -6.6F, -9.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 2)
						.addBox(-4.0F, -7.1F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 4)
						.addBox(-3.0F, -7.6F, -7.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(43, 62)
						.addBox(-2.0F, -8.1F, -6.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 55)
						.addBox(-1.0F, -8.6F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -6.0F));

		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1",
				CubeListBuilder.create().texOffs(28, 3).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));

		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2",
				CubeListBuilder.create().texOffs(28, 3).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(63, 69).mirror()
				.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 69)
				.mirror().addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(-3.0F, 18.0F, 7.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(63, 69)
						.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 69)
						.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(3.0F, 18.0F, 7.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(63, 69).mirror()
				.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(47, 69)
				.mirror().addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false),
				PartPose.offset(-3.0F, 18.0F, -5.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(63, 69)
						.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 69)
						.addBox(-2.0F, -1.0F, -3.5F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offset(3.0F, 18.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 80, 80);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
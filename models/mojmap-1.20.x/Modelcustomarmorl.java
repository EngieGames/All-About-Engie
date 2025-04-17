// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustomarmorl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "customarmorl"), "main");
	private final ModelPart Helmet;
	private final ModelPart Chestplate;
	private final ModelPart BootsL;
	private final ModelPart BootsR;
	private final ModelPart ArmsL;
	private final ModelPart ArmsR;

	public Modelcustomarmorl(ModelPart root) {
		this.Helmet = root.getChild("Helmet");
		this.Chestplate = root.getChild("Chestplate");
		this.BootsL = root.getChild("BootsL");
		this.BootsR = root.getChild("BootsR");
		this.ArmsL = root.getChild("ArmsL");
		this.ArmsR = root.getChild("ArmsR");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 22)
				.addBox(-2.0F, -9.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 15)
				.addBox(-3.0F, -9.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 28)
				.addBox(-4.0F, -8.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
				.addBox(-6.0F, -7.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
				.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(96, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(14, 98)
				.addBox(4.05F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(4.2F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94)
				.addBox(3.9F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 88)
				.addBox(3.9F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 98)
				.addBox(-5.5F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 95)
				.addBox(-5.3F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 94).mirror()
				.addBox(-4.7F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 88)
				.addBox(-4.7F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(-4.4F, -8.3F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(-4.8F, -8.7F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(-4.8F, -8.7F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(4.2F, -8.7F, -2.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
				.addBox(4.2F, -8.7F, 1.025F, 0.4F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
				.addBox(4.0F, -8.3F, -2.0F, 0.4F, 2.7F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
				.addBox(-4.0F, -8.4F, -2.0F, 8.0F, 0.4F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
				.addBox(-4.5F, -8.8F, -2.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 50)
				.addBox(-4.5F, -8.8F, 1.0F, 9.0F, 0.4F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 55)
				.addBox(-4.8F, -8.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 55)
				.addBox(3.6F, -8.8F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 69)
				.addBox(-4.1F, -5.95F, -5.0F, 8.2F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 125).mirror()
				.addBox(-1.5F, -8.075F, 4.0F, 3.0F, 2.4F, 0.1F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 126)
				.mirror().addBox(-4.1F, -5.675F, 4.0F, 8.2F, 1.5F, 0.1F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 118).addBox(-4.1F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 118).addBox(4.0F, -5.675F, -4.0F, 0.1F, 1.5F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 119).addBox(-1.5F, -8.075F, -3.975F, 3.0F, 0.1F, 7.975F, new CubeDeformation(0.0F))
				.texOffs(56, 64).addBox(-1.8F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F))
				.texOffs(55, 65).addBox(1.5F, -6.25F, -4.5F, 0.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(64, 0)
				.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.45F)).texOffs(96, 0).addBox(-4.0F,
						-8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = Helmet.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 125).addBox(-1.5F, -1.25F, -0.05F, 3.0F, 2.5F, 0.1F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.8393F, -4.1868F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head_r2 = Helmet.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-6.5F, -6.5F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head_r3 = Helmet.addOrReplaceChild("head_r3",
				CubeListBuilder.create().texOffs(80, 79).mirror()
						.addBox(-6.5F, -6.5F, -1.0F, 13.0F, 13.0F, 2.0F, new CubeDeformation(-5.49F)).mirror(false),
				PartPose.offsetAndRotation(1.975F, -4.95F, -1.05F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head_r4 = Helmet.addOrReplaceChild("head_r4",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(1.975F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition head_r5 = Helmet.addOrReplaceChild("head_r5",
				CubeListBuilder.create().texOffs(58, 78).addBox(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F,
						new CubeDeformation(-2.99F)),
				PartPose.offsetAndRotation(-2.025F, -4.95F, -3.525F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Chestplate = partdefinition.addOrReplaceChild("Chestplate",
				CubeListBuilder.create().texOffs(80, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(80, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition BootsL = partdefinition.addOrReplaceChild("BootsL",
				CubeListBuilder.create().texOffs(64, 48).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false),
				PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition BootsR = partdefinition.addOrReplaceChild("BootsR", CubeListBuilder.create().texOffs(64, 32)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition ArmsL = partdefinition.addOrReplaceChild("ArmsL",
				CubeListBuilder.create().texOffs(96, 48).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)).mirror(false)
						.texOffs(112, 48).mirror()
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.6F)).mirror(false),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition ArmsR = partdefinition.addOrReplaceChild("ArmsR",
				CubeListBuilder.create().texOffs(104, 16)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.45F)).texOffs(104, 32)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Chestplate.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BootsL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BootsR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmsL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmsR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.BootsR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.ArmsR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Helmet.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Helmet.xRot = headPitch / (180F / (float) Math.PI);
		this.BootsL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.ArmsL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
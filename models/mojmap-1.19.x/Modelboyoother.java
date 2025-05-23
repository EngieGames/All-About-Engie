// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelboyoother<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "boyoother"), "main");
	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart TailPrimary;
	private final ModelPart TailSecondary;
	private final ModelPart TailTertiary;
	private final ModelPart Head;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public Modelboyoother(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.TailPrimary = this.Tail.getChild("TailPrimary");
		this.TailSecondary = this.TailPrimary.getChild("TailSecondary");
		this.TailTertiary = this.TailSecondary.getChild("TailTertiary");
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
				CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1",
				CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.9753F, 2.2318F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.9066F, 3.7227F, 2.0F, 6.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 3.8F, -2.2F, -1.5708F, 0.0F, 0.0F));

		PartDefinition TailPrimary = Tail.addOrReplaceChild("TailPrimary", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.5F, 0.75F));

		PartDefinition TailFin_r1 = TailPrimary.addOrReplaceChild("TailFin_r1",
				CubeListBuilder.create().texOffs(68, 16)
						.addBox(-4.0F, 4.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-4.0F, 0.0F, 0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 0.75F, -2.0F, 1.789F, 0.0F, 0.0F));

		PartDefinition Base_r1 = TailPrimary
				.addOrReplaceChild("Base_r1",
						CubeListBuilder.create().texOffs(66, 29).addBox(-2.0F, 0.75F, -0.8F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 1.1781F, 0.0F, 0.0F));

		PartDefinition TailSecondary = TailPrimary.addOrReplaceChild("TailSecondary", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.25F, 4.25F));

		PartDefinition Base_r2 = TailSecondary
				.addOrReplaceChild("Base_r2",
						CubeListBuilder.create().texOffs(47, 19).addBox(-1.5F, -1.3563F, -0.6088F, 3.0F, 5.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.25F, 1.0F, 1.309F, 0.0F, 0.0F));

		PartDefinition TailTertiary = TailSecondary.addOrReplaceChild("TailTertiary", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.5F, 4.5F));

		PartDefinition Base_r3 = TailTertiary.addOrReplaceChild("Base_r3",
				CubeListBuilder.create().texOffs(32, 52)
						.addBox(-0.5F, 5.3462F, -1.8296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(80, 0)
						.addBox(-0.5F, -2.5538F, -1.8296F, 1.0F, 8.0F, 3.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 4.25F, 1.1345F, 0.0F, 0.0F));

		PartDefinition Base_r4 = TailTertiary.addOrReplaceChild("Base_r4",
				CubeListBuilder.create().texOffs(42, 0)
						.addBox(-0.5F, -6.1668F, 0.8821F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 0)
						.addBox(-0.5F, -8.1668F, -2.1179F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 4.25F, -0.8727F, 0.0F, 0.0F));

		PartDefinition Base_r5 = TailTertiary.addOrReplaceChild("Base_r5",
				CubeListBuilder.create().texOffs(66, 22).addBox(-1.0F, -0.3449F, -0.7203F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 0.25F, 1.4835F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(40, 45)
						.addBox(-2.3F, -2.8F, -8.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 45)
						.addBox(1.3F, -2.8F, -8.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 80)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(32, 80)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(0, 80)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(30, 63)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)).texOffs(0, 0)
						.addBox(-7.0F, -5.6F, -11.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-6.0F, -6.1F, -10.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(-5.0F, -6.6F, -9.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(64, 13)
						.addBox(-4.0F, -7.1F, -8.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-3.0F, -7.6F, -7.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(-2.0F, -8.1F, -6.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 32)
						.addBox(-1.0F, -8.6F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, -6.0F));

		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1",
				CubeListBuilder.create().texOffs(64, 64).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));

		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2",
				CubeListBuilder.create().texOffs(0, 68).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));

		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(56, 9)
						.addBox(-2.0F, 5.0F, -2.975F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(30, 30)
						.addBox(-2.0375F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(-1.0125F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(0.0125F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(1.0375F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-3.0F, 17.0F, 5.5F));

		PartDefinition Toe_r1 = leg1.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(36, 29)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 5.8772F, -2.7786F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LowerLeg_r1 = leg1.addOrReplaceChild("LowerLeg_r1",
				CubeListBuilder.create().texOffs(36, 15).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 4.9019F, 0.458F, -0.5236F, 0.0F, 0.0F));

		PartDefinition MidLeg_r1 = leg1.addOrReplaceChild("MidLeg_r1",
				CubeListBuilder.create().texOffs(80, 22).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 3.767F, -0.2385F, 0.5672F, 0.0F, 0.0F));

		PartDefinition UpperLeg_r1 = leg1.addOrReplaceChild("UpperLeg_r1",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 1.142F, -0.5075F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(56, 9).mirror()
				.addBox(-2.0F, 5.0F, -2.975F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).mirror(false)
				.texOffs(30, 30).mirror()
				.addBox(-2.0375F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).mirror(false)
				.texOffs(30, 30).mirror()
				.addBox(-1.0125F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).mirror(false)
				.texOffs(30, 30).mirror().addBox(0.0125F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F))
				.mirror(false).texOffs(30, 30).mirror()
				.addBox(1.0375F, 6.0F, -3.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).mirror(false),
				PartPose.offset(3.0F, 17.0F, 5.5F));

		PartDefinition Toe_r2 = leg2.addOrReplaceChild("Toe_r2", CubeListBuilder.create().texOffs(36, 29).mirror()
				.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).mirror(false)
				.texOffs(36, 29).mirror().addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F))
				.mirror(false).texOffs(36, 29).mirror()
				.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).mirror(false)
				.texOffs(36, 29).mirror().addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F))
				.mirror(false), PartPose.offsetAndRotation(1.55F, 5.8772F, -2.7786F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LowerLeg_r2 = leg2.addOrReplaceChild("LowerLeg_r2",
				CubeListBuilder.create().texOffs(36, 15).mirror()
						.addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)).mirror(false),
				PartPose.offsetAndRotation(0.005F, 4.9019F, 0.458F, -0.5236F, 0.0F, 0.0F));

		PartDefinition MidLeg_r2 = leg2.addOrReplaceChild("MidLeg_r2",
				CubeListBuilder.create().texOffs(80, 22).mirror()
						.addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 3.767F, -0.2385F, 0.5672F, 0.0F, 0.0F));

		PartDefinition UpperLeg_r2 = leg2.addOrReplaceChild("UpperLeg_r2",
				CubeListBuilder.create().texOffs(56, 0).mirror()
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.142F, -0.5075F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(56, 9)
						.addBox(-2.0F, 5.0F, -2.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).texOffs(30, 30)
						.addBox(-2.0375F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(-1.0125F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(0.0125F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(1.0375F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offset(-3.0F, 17.0F, -6.5F));

		PartDefinition Toe_r3 = leg3.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(36, 29)
						.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 5.8772F, -2.5536F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LowerLeg_r3 = leg3.addOrReplaceChild("LowerLeg_r3",
				CubeListBuilder.create().texOffs(36, 15).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 4.9019F, 0.683F, -0.5236F, 0.0F, 0.0F));

		PartDefinition MidLeg_r3 = leg3.addOrReplaceChild("MidLeg_r3",
				CubeListBuilder.create().texOffs(80, 22).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 3.767F, -0.0135F, 0.5672F, 0.0F, 0.0F));

		PartDefinition UpperLeg_r3 = leg3.addOrReplaceChild("UpperLeg_r3",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 1.142F, -0.2825F, -0.2182F, 0.0F, 0.0F));

		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(56, 9).mirror()
				.addBox(-2.0F, 5.0F, -2.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)).mirror(false)
				.texOffs(30, 30).mirror().addBox(-2.0375F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F))
				.mirror(false).texOffs(30, 30).mirror()
				.addBox(-1.0125F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).mirror(false)
				.texOffs(30, 30).mirror().addBox(0.0125F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F))
				.mirror(false).texOffs(30, 30).mirror()
				.addBox(1.0375F, 6.0F, -3.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).mirror(false),
				PartPose.offset(3.0F, 17.0F, -6.5F));

		PartDefinition Toe_r4 = leg4.addOrReplaceChild("Toe_r4", CubeListBuilder.create().texOffs(36, 29).mirror()
				.addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).mirror(false)
				.texOffs(36, 29).mirror().addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F))
				.mirror(false).texOffs(36, 29).mirror()
				.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).mirror(false)
				.texOffs(36, 29).mirror().addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F))
				.mirror(false), PartPose.offsetAndRotation(1.55F, 5.8772F, -2.5536F, -0.6109F, 0.0F, 0.0F));

		PartDefinition LowerLeg_r4 = leg4.addOrReplaceChild("LowerLeg_r4",
				CubeListBuilder.create().texOffs(36, 15).mirror()
						.addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)).mirror(false),
				PartPose.offsetAndRotation(0.005F, 4.9019F, 0.683F, -0.5236F, 0.0F, 0.0F));

		PartDefinition MidLeg_r4 = leg4.addOrReplaceChild("MidLeg_r4",
				CubeListBuilder.create().texOffs(80, 22).mirror()
						.addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(0.01F, 3.767F, -0.0135F, 0.5672F, 0.0F, 0.0F));

		PartDefinition UpperLeg_r4 = leg4.addOrReplaceChild("UpperLeg_r4",
				CubeListBuilder.create().texOffs(56, 0).mirror()
						.addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.142F, -0.2825F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
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
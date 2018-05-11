package werewolf;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * werewolf - cybercat5555
 * Created using Tabula 5.1.0
 */
public class werewolf extends ModelBase {
    public ModelRenderer stomach;
    public ModelRenderer chest;
    public ModelRenderer lLeg01;
    public ModelRenderer fur05;
    public ModelRenderer fur06;
    public ModelRenderer tail01;
    public ModelRenderer rLeg01;
    public ModelRenderer neck;
    public ModelRenderer lArm01;
    public ModelRenderer fur02;
    public ModelRenderer fur03;
    public ModelRenderer fur04;
    public ModelRenderer rArm01;
    public ModelRenderer head;
    public ModelRenderer fur01;
    public ModelRenderer jawUpper01;
    public ModelRenderer jawLower;
    public ModelRenderer lEarFeral01;
    public ModelRenderer rEarFeral01;
    public ModelRenderer lCheekFur;
    public ModelRenderer rCheekFur;
    public ModelRenderer lEarClassic;
    public ModelRenderer rEarClassic;
    public ModelRenderer snout;
    public ModelRenderer jawUpper02;
    public ModelRenderer upperTeeth01;
    public ModelRenderer upperTeeth03;
    public ModelRenderer lowerTeeth01;
    public ModelRenderer lowerTeeth02;
    public ModelRenderer lEarFeral02;
    public ModelRenderer lEarFeral03;
    public ModelRenderer rEarFeral02;
    public ModelRenderer lEarFeral03_1;
    public ModelRenderer upperTeeth02;
    public ModelRenderer lArm02;
    public ModelRenderer lClaw01;
    public ModelRenderer lArmFur;
    public ModelRenderer lClaw02;
    public ModelRenderer lClaw03;
    public ModelRenderer lClaw04;
    public ModelRenderer rArm02;
    public ModelRenderer rClaw01;
    public ModelRenderer rArmFur;
    public ModelRenderer rClaw02;
    public ModelRenderer rClaw03;
    public ModelRenderer rClaw04;
    public ModelRenderer lLeg02;
    public ModelRenderer lLeg03;
    public ModelRenderer lFoot;
    public ModelRenderer tail01Floof;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tail02Floof;
    public ModelRenderer tail03Floof;
    public ModelRenderer rLeg02;
    public ModelRenderer rLeg03;
    public ModelRenderer rFoot;

    public werewolf() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.lowerTeeth01 = new ModelRenderer(this, 57, 50);
        this.lowerTeeth01.setRotationPoint(0.0F, -3.8F, 0.1F);
        this.lowerTeeth01.addBox(-0.6F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.rArmFur = new ModelRenderer(this, 69, 34);
        this.rArmFur.mirror = true;
        this.rArmFur.setRotationPoint(-1.6F, 1.6F, 0.0F);
        this.rArmFur.addBox(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        this.setRotateAngle(rArmFur, 0.0F, -0.091106186954104F, -0.091106186954104F);
        this.tail01Floof = new ModelRenderer(this, 112, 18);
        this.tail01Floof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail01Floof.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.lClaw01 = new ModelRenderer(this, 0, 0);
        this.lClaw01.setRotationPoint(1.1F, 10.6F, -1.2F);
        this.lClaw01.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lClaw01, 0.8196066167365371F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 48);
        this.head.setRotationPoint(0.0F, -4.2F, -0.1999999999999998F);
        this.head.addBox(-3.5F, -5.0F, -3.0F, 7, 5, 6, 0.0F);
        this.setRotateAngle(head, 0.5009094953223726F, 0.0F, 0.0F);
        this.rEarFeral01 = new ModelRenderer(this, 57, 0);
        this.rEarFeral01.mirror = true;
        this.rEarFeral01.setRotationPoint(-2.7F, -2.2F, 1.0F);
        this.rEarFeral01.addBox(-1.0F, 0.0F, -0.9F, 1, 3, 2, 0.0F);
        this.setRotateAngle(rEarFeral01, 0.5462880558742251F, 0.0F, 0.5462880558742251F);
        this.snout = new ModelRenderer(this, 29, 53);
        this.snout.setRotationPoint(0.0F, -4.6F, 0.1F);
        this.snout.addBox(-1.0F, -4.5F, -1.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(snout, 0.18203784098300857F, 0.0F, 0.0F);
        this.lLeg03 = new ModelRenderer(this, 31, 30);
        this.lLeg03.setRotationPoint(0.0F, 9.1F, 0.5F);
        this.lLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(lLeg03, -1.0016444577195436F, 0.0F, 0.091106186954104F);
        this.lClaw04 = new ModelRenderer(this, 28, 0);
        this.lClaw04.setRotationPoint(-0.9F, 0.0F, 0.0F);
        this.lClaw04.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lClaw04, 0.0F, 0.0F, 0.091106186954104F);
        this.stomach = new ModelRenderer(this, 0, 19);
        this.stomach.setRotationPoint(0.0F, 1.4F, 0.0F);
        this.stomach.addBox(-4.0F, -7.5F, -3.0F, 8, 11, 6, 0.0F);
        this.setRotateAngle(stomach, 0.045553093477052F, 0.0F, 0.0F);
        this.lArm01 = new ModelRenderer(this, 71, 0);
        this.lArm01.setRotationPoint(2.8F, -4.9F, 0.0F);
        this.lArm01.addBox(-0.5F, -1.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(lArm01, -8.680917150599262E-16F, -0.18203784098300857F, -0.31869712141416456F);
        this.lEarClassic = new ModelRenderer(this, 59, 8);
        this.lEarClassic.setRotationPoint(2.2F, -2.0F, 3.0F);
        this.lEarClassic.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lEarClassic, -0.18203784098300857F, 0.091106186954104F, 0.0F);
        this.lCheekFur = new ModelRenderer(this, 53, 7);
        this.lCheekFur.setRotationPoint(3.5F, -2.5F, 1.1F);
        this.lCheekFur.addBox(0.0F, -0.5F, -7.5F, 0, 4, 8, 0.0F);
        this.setRotateAngle(lCheekFur, -0.18203784098300857F, -0.091106186954104F, -0.36425021489121656F);
        this.lLeg02 = new ModelRenderer(this, 33, 16);
        this.lLeg02.setRotationPoint(2.0F, 7.0F, -1.2F);
        this.lLeg02.addBox(-2.01F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(lLeg02, 1.2292353921796064F, 0.0F, 0.0F);
        this.lEarFeral03 = new ModelRenderer(this, 64, 0);
        this.lEarFeral03.setRotationPoint(-0.3F, 0.0F, 0.0F);
        this.lEarFeral03.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lEarFeral03, 0.091106186954104F, 0.0F, -0.22759093446006054F);
        this.lArmFur = new ModelRenderer(this, 69, 34);
        this.lArmFur.setRotationPoint(0.6F, 1.6F, 0.0F);
        this.lArmFur.addBox(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        this.setRotateAngle(lArmFur, 0.0F, 0.091106186954104F, 0.091106186954104F);
        this.fur03 = new ModelRenderer(this, 90, 24);
        this.fur03.setRotationPoint(0.0F, -5.9F, 2.5F);
        this.fur03.addBox(-3.0F, -1.0F, 0.0F, 6, 8, 2, 0.0F);
        this.setRotateAngle(fur03, 0.7740535232594852F, 0.0F, 0.0F);
        this.lEarFeral02 = new ModelRenderer(this, 64, 0);
        this.lEarFeral02.setRotationPoint(0.0F, 2.8F, 0.1F);
        this.lEarFeral02.addBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lEarFeral02, 0.36425021489121656F, 0.0F, 0.0F);
        this.upperTeeth02 = new ModelRenderer(this, 51, 44);
        this.upperTeeth02.setRotationPoint(0.0F, -3.2F, -1.0F);
        this.upperTeeth02.addBox(-0.8F, -0.7F, -0.7F, 1, 3, 1, 0.0F);
        this.setRotateAngle(upperTeeth02, 0.0F, 0.0F, -0.13962634015954636F);
        this.rClaw02 = new ModelRenderer(this, 0, 0);
        this.rClaw02.mirror = true;
        this.rClaw02.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.rClaw02.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rClaw02, 0.0F, 0.0F, -0.091106186954104F);
        this.rLeg03 = new ModelRenderer(this, 31, 30);
        this.rLeg03.mirror = true;
        this.rLeg03.setRotationPoint(0.0F, 9.1F, 0.5F);
        this.rLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(rLeg03, -1.0016444577195167F, 0.0F, -0.091106186954104F);
        this.rLeg02 = new ModelRenderer(this, 33, 16);
        this.rLeg02.mirror = true;
        this.rLeg02.setRotationPoint(-2.0F, 7.0F, -1.2F);
        this.rLeg02.addBox(-1.99F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(rLeg02, 1.2292353921796064F, 0.0F, 0.0F);
        this.rClaw04 = new ModelRenderer(this, 28, 0);
        this.rClaw04.mirror = true;
        this.rClaw04.setRotationPoint(0.9F, 0.0F, 0.0F);
        this.rClaw04.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rClaw04, 0.0F, 0.0F, -0.091106186954104F);
        this.tail02Floof = new ModelRenderer(this, 112, 28);
        this.tail02Floof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail02Floof.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
        this.fur05 = new ModelRenderer(this, 90, 43);
        this.fur05.setRotationPoint(0.0F, -5.2F, 1.7F);
        this.fur05.addBox(-2.0F, -1.0F, 0.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(fur05, 0.40980330836826856F, 0.0F, 0.0F);
        this.lFoot = new ModelRenderer(this, 44, 31);
        this.lFoot.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.lFoot.addBox(-2.0F, 0.0F, -4.3F, 4, 2, 6, 0.0F);
        this.setRotateAngle(lFoot, 0.22759093446006054F, 0.0F, 0.0F);
        this.rClaw03 = new ModelRenderer(this, 0, 0);
        this.rClaw03.mirror = true;
        this.rClaw03.setRotationPoint(0.9F, 0.0F, 0.0F);
        this.rClaw03.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rClaw03, 0.0F, 0.0F, -0.091106186954104F);
        this.tail03Floof = new ModelRenderer(this, 112, 44);
        this.tail03Floof.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail03Floof.addBox(-2.0F, 0.7F, -2.0F, 4, 10, 4, 0.0F);
        this.tail01 = new ModelRenderer(this, 116, 0);
        this.tail01.setRotationPoint(0.0F, 2.5F, 2.0F);
        this.tail01.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tail01, 0.5009094953223723F, 0.0F, 0.0F);
        this.rEarClassic = new ModelRenderer(this, 59, 8);
        this.rEarClassic.mirror = true;
        this.rEarClassic.setRotationPoint(-2.2F, -2.0F, 3.0F);
        this.rEarClassic.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rEarClassic, -0.18203784098300857F, -0.091106186954104F, 0.0F);
        this.lowerTeeth02 = new ModelRenderer(this, 51, 50);
        this.lowerTeeth02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lowerTeeth02.addBox(-1.3F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.fur01 = new ModelRenderer(this, 90, 0);
        this.fur01.setRotationPoint(0.0F, -2.8F, 1.1F);
        this.fur01.addBox(-3.0F, -1.0F, 0.0F, 6, 7, 2, 0.0F);
        this.setRotateAngle(fur01, 0.4553564018453205F, 0.0F, 0.0F);
        this.fur06 = new ModelRenderer(this, 90, 52);
        this.fur06.setRotationPoint(0.0F, -2.3F, 1.5F);
        this.fur06.addBox(-2.0F, -1.0F, 0.0F, 4, 5, 2, 0.0F);
        this.setRotateAngle(fur06, 0.36425021489121656F, 0.0F, 0.0F);
        this.rArm02 = new ModelRenderer(this, 71, 16);
        this.rArm02.mirror = true;
        this.rArm02.setRotationPoint(-1.6F, 9.4F, 0.0F);
        this.rArm02.addBox(-1.5F, -1.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(rArm02, -0.9105382707654417F, 0.0F, -0.27314402793711257F);
        this.rEarFeral02 = new ModelRenderer(this, 64, 0);
        this.rEarFeral02.mirror = true;
        this.rEarFeral02.setRotationPoint(0.0F, 2.8F, 0.1F);
        this.rEarFeral02.addBox(-1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rEarFeral02, 0.36425021489121656F, 0.0F, 0.0F);
        this.lEarFeral03_1 = new ModelRenderer(this, 64, 0);
        this.lEarFeral03_1.setRotationPoint(0.3F, 0.0F, 0.0F);
        this.lEarFeral03_1.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lEarFeral03_1, 0.091106186954104F, 0.0F, 0.22759093446006054F);
        this.jawUpper02 = new ModelRenderer(this, 24, 46);
        this.jawUpper02.mirror = true;
        this.jawUpper02.setRotationPoint(-1.0F, -4.9F, -1.1F);
        this.jawUpper02.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(jawUpper02, 0.0F, 0.0F, 0.13962634015954636F);
        this.rFoot = new ModelRenderer(this, 44, 31);
        this.rFoot.mirror = true;
        this.rFoot.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.rFoot.addBox(-2.0F, 0.0F, -4.3F, 4, 2, 6, 0.0F);
        this.setRotateAngle(rFoot, 0.22759093446006054F, 0.0F, 0.0F);
        this.rArm01 = new ModelRenderer(this, 71, 0);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-2.8F, -4.9F, 0.0F);
        this.rArm01.addBox(-3.5F, -1.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(rArm01, -2.852301349482614E-15F, 0.18203784098300857F, 0.31869712141416456F);
        this.lArm02 = new ModelRenderer(this, 71, 16);
        this.lArm02.setRotationPoint(1.6F, 9.4F, 0.0F);
        this.lArm02.addBox(-1.5F, -1.0F, -1.5F, 3, 13, 3, 0.0F);
        this.setRotateAngle(lArm02, -0.9105382707654417F, 0.0F, 0.27314402793711257F);
        this.rLeg01 = new ModelRenderer(this, 36, 0);
        this.rLeg01.mirror = true;
        this.rLeg01.setRotationPoint(-1.1F, 2.5F, -0.3F);
        this.rLeg01.addBox(-4.0F, -1.0F, -2.5F, 4, 10, 5, 0.0F);
        this.setRotateAngle(rLeg01, -0.5009094953223793F, 0.0F, 0.091106186954104F);
        this.rCheekFur = new ModelRenderer(this, 53, 7);
        this.rCheekFur.mirror = true;
        this.rCheekFur.setRotationPoint(-3.5F, -2.5F, 1.1F);
        this.rCheekFur.addBox(0.0F, -0.5F, -7.5F, 0, 4, 8, 0.0F);
        this.setRotateAngle(rCheekFur, -0.18203784098300857F, 0.091106186954104F, 0.36425021489121656F);
        this.lClaw03 = new ModelRenderer(this, 0, 0);
        this.lClaw03.setRotationPoint(-0.9F, 0.0F, 0.0F);
        this.lClaw03.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lClaw03, 0.0F, 0.0F, 0.091106186954104F);
        this.lEarFeral01 = new ModelRenderer(this, 57, 0);
        this.lEarFeral01.setRotationPoint(2.7F, -2.2F, 1.0F);
        this.lEarFeral01.addBox(0.0F, 0.0F, -0.9F, 1, 3, 2, 0.0F);
        this.setRotateAngle(lEarFeral01, 0.5462880558742251F, 0.0F, -0.5462880558742251F);
        this.tail03 = new ModelRenderer(this, 116, 7);
        this.tail03.setRotationPoint(0.0F, 3.8F, 0.1F);
        this.tail03.addBox(-0.5F, 0.0F, -0.5F, 1, 5, 1, 0.0F);
        this.setRotateAngle(tail03, -0.18203784098300857F, 0.0F, 0.0F);
        this.lClaw02 = new ModelRenderer(this, 0, 0);
        this.lClaw02.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.lClaw02.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(lClaw02, 0.0F, 0.0F, 0.091106186954104F);
        this.tail02 = new ModelRenderer(this, 116, 0);
        this.tail02.setRotationPoint(0.0F, 3.8F, 0.1F);
        this.tail02.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(tail02, -0.31869712141416456F, 0.0F, 0.0F);
        this.fur04 = new ModelRenderer(this, 90, 35);
        this.fur04.setRotationPoint(0.0F, -3.4F, 2.9F);
        this.fur04.addBox(-2.5F, -1.0F, 0.0F, 5, 5, 2, 0.0F);
        this.setRotateAngle(fur04, 0.5462880558742251F, 0.0F, 0.0F);
        this.jawUpper01 = new ModelRenderer(this, 24, 46);
        this.jawUpper01.setRotationPoint(1.0F, -4.9F, -1.1F);
        this.jawUpper01.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(jawUpper01, 0.0F, 0.0F, -0.13962634015954636F);
        this.upperTeeth01 = new ModelRenderer(this, 57, 44);
        this.upperTeeth01.setRotationPoint(0.0F, -3.2F, -1.0F);
        this.upperTeeth01.addBox(-0.3F, -0.7F, -0.7F, 1, 3, 1, 0.0F);
        this.setRotateAngle(upperTeeth01, 0.0F, 0.0F, 0.13962634015954636F);
        this.rClaw01 = new ModelRenderer(this, 0, 0);
        this.rClaw01.mirror = true;
        this.rClaw01.setRotationPoint(-1.1F, 10.6F, -1.2F);
        this.rClaw01.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 2, 0.0F);
        this.setRotateAngle(rClaw01, 0.8196066167365371F, 0.0F, 0.0F);
        this.neck = new ModelRenderer(this, 0, 37);
        this.neck.setRotationPoint(0.0F, -7.6F, 0.7F);
        this.neck.addBox(-3.0F, -5.0F, -2.5F, 6, 5, 5, 0.0F);
        this.setRotateAngle(neck, 0.7740535232594852F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 0);
        this.chest.setRotationPoint(0.0F, -7.5F, -0.7F);
        this.chest.addBox(-4.5F, -9.0F, -4.0F, 9, 10, 8, 0.0F);
        this.setRotateAngle(chest, 0.27314402793711257F, 0.0F, 0.0F);
        this.fur02 = new ModelRenderer(this, 90, 11);
        this.fur02.setRotationPoint(0.0F, -8.1F, 2.0F);
        this.fur02.addBox(-4.0F, -1.0F, 0.0F, 8, 10, 2, 0.0F);
        this.setRotateAngle(fur02, 0.9560913642424937F, 0.0F, 0.0F);
        this.upperTeeth03 = new ModelRenderer(this, 62, 44);
        this.upperTeeth03.setRotationPoint(0.0F, -3.2F, -1.0F);
        this.upperTeeth03.addBox(-2.05F, -0.7F, -0.8F, 3, 0, 1, 0.0F);
        this.setRotateAngle(upperTeeth03, 0.0F, 0.0F, 0.13962634015954636F);
        this.lLeg01 = new ModelRenderer(this, 36, 0);
        this.lLeg01.setRotationPoint(1.1F, 2.5F, -0.3F);
        this.lLeg01.addBox(0.0F, -1.0F, -2.5F, 4, 10, 5, 0.0F);
        this.setRotateAngle(lLeg01, -0.5009094953223726F, 0.0F, -0.091106186954104F);
        this.jawLower = new ModelRenderer(this, 37, 48);
        this.jawLower.setRotationPoint(0.0F, -4.8F, -2.5F);
        this.jawLower.addBox(-1.5F, -4.0F, -0.5F, 3, 4, 1, 0.0F);
        this.jawLower.addChild(this.lowerTeeth01);
        this.rArm02.addChild(this.rArmFur);
        this.tail01.addChild(this.tail01Floof);
        this.lArm02.addChild(this.lClaw01);
        this.neck.addChild(this.head);
        this.head.addChild(this.rEarFeral01);
        this.head.addChild(this.snout);
        this.lLeg02.addChild(this.lLeg03);
        this.lClaw03.addChild(this.lClaw04);
        this.chest.addChild(this.lArm01);
        this.head.addChild(this.lEarClassic);
        this.head.addChild(this.lCheekFur);
        this.lLeg01.addChild(this.lLeg02);
        this.lEarFeral01.addChild(this.lEarFeral03);
        this.lArm02.addChild(this.lArmFur);
        this.chest.addChild(this.fur03);
        this.lEarFeral01.addChild(this.lEarFeral02);
        this.jawUpper02.addChild(this.upperTeeth02);
        this.rClaw01.addChild(this.rClaw02);
        this.rLeg02.addChild(this.rLeg03);
        this.rLeg01.addChild(this.rLeg02);
        this.rClaw03.addChild(this.rClaw04);
        this.tail02.addChild(this.tail02Floof);
        this.stomach.addChild(this.fur05);
        this.lLeg03.addChild(this.lFoot);
        this.rClaw02.addChild(this.rClaw03);
        this.tail03.addChild(this.tail03Floof);
        this.stomach.addChild(this.tail01);
        this.head.addChild(this.rEarClassic);
        this.lowerTeeth01.addChild(this.lowerTeeth02);
        this.neck.addChild(this.fur01);
        this.stomach.addChild(this.fur06);
        this.rArm01.addChild(this.rArm02);
        this.rEarFeral01.addChild(this.rEarFeral02);
        this.rEarFeral01.addChild(this.lEarFeral03_1);
        this.head.addChild(this.jawUpper02);
        this.rLeg03.addChild(this.rFoot);
        this.chest.addChild(this.rArm01);
        this.lArm01.addChild(this.lArm02);
        this.stomach.addChild(this.rLeg01);
        this.head.addChild(this.rCheekFur);
        this.lClaw02.addChild(this.lClaw03);
        this.head.addChild(this.lEarFeral01);
        this.tail02.addChild(this.tail03);
        this.lClaw01.addChild(this.lClaw02);
        this.tail01.addChild(this.tail02);
        this.chest.addChild(this.fur04);
        this.head.addChild(this.jawUpper01);
        this.jawUpper01.addChild(this.upperTeeth01);
        this.rArm02.addChild(this.rClaw01);
        this.chest.addChild(this.neck);
        this.stomach.addChild(this.chest);
        this.chest.addChild(this.fur02);
        this.jawUpper01.addChild(this.upperTeeth03);
        this.stomach.addChild(this.lLeg01);
        this.head.addChild(this.jawLower);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.stomach.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

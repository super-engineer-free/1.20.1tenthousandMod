package com.tenthousand.tenthousandMod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob; // または PathfindMob, Monster など、五条悟の挙動に合わせて変更
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject; // RegistryObjectのインポートを追加

// あなたのMODのエンティティ登録クラスの参照が必要です
// 例: import static com.tenthousand.tenthousandMod.entity.EntityLoader.GOJO_SATORU_ENTITY;

public class GojoSatoruEntity extends Mob { // 基本的なMobとして定義

  // スポーンエッグから直接呼び出すためのコンストラクタ（EntityTypeを別途指定）
  // 通常は EntityLoader.GOJO_SATORU_ENTITY のように、登録済みのEntityTypeを使用
  public GojoSatoruEntity(Level level) {
    // ここで、あなたが登録した五条悟のEntityTypeを取得します。
    // 例: EntityLoader.GOJO_SATORU_ENTITY.get() を使用します。
    // EntityLoader.java の EntityLoader.GOJO_SATORU_ENTITY が RegistryObject<EntityType<GojoSatoruEntity>> であれば、
    // get() メソッドで EntityType を取得できます。
    super(EntityLoader.GOJO_SATORU_ENTITY.get(), level); // EntityLoaderを適切にインポートし、エンティティ名を合わせる
  }

  // Minecraftのエンティティシステムが利用するコンストラクタ
  public GojoSatoruEntity(EntityType<? extends GojoSatoruEntity> entityType, Level level) {
    super(entityType, level);
  }

  // エンティティの基本属性（体力、移動速度など）を設定する
  public static AttributeSupplier.Builder createAttributes() {
    return Mob.createMobAttributes()
        .add(Attributes.MAX_HEALTH, 200.0D) // 体力
        .add(Attributes.MOVEMENT_SPEED, 0.35D) // 移動速度
        .add(Attributes.ATTACK_DAMAGE, 15.0D); // 攻撃力
    // .add(Attributes.FOLLOW_RANGE, 64.0D); // AIを追加する場合
  }

  @Override
  protected void registerGoals() {
    super.registerGoals(); // 親クラスの目標も登録する場合
    // ここに五条悟のAI（行動）を登録します
    // 例:
    // this.goalSelector.addGoal(0, new net.minecraft.world.entity.ai.goal.FloatGoal(this));
    // this.goalSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.LookAtPlayerGoal(this, net.minecraft.world.entity.player.Player.class, 8.0F));
    // this.goalSelector.addGoal(2, new net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal(this, 1.0D));

    // 敵対Mobにしたい場合（ターゲットを見つけて攻撃する）
    // this.goalSelector.addGoal(3, new net.minecraft.world.entity.ai.goal.MeleeAttackGoal(this, 1.0D, false));
    // this.targetSelector.addGoal(1, new net.minecraft.world.entity.ai.goal.NearestAttackableTargetGoal<>(this, net.minecraft.world.entity.player.Player.class, true));
  }
}
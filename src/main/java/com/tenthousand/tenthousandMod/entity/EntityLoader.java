package com.tenthousand.tenthousandMod.entity;

import com.tenthousand.tenthousandMod.TenThousandMod; // あなたのMODのメインクラスをインポート
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory; // MobCategory (生物の種類) をインポート
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityLoader {
  // MOD_ID はあなたのMODのメインクラスで定義されているはずです
  public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
      DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TenThousandMod.MOD_ID);

  public static final RegistryObject<EntityType<GojoSatoruEntity>> GOJO_SATORU_ENTITY =
      ENTITY_TYPES.register("gojo_satoru",
          () -> EntityType.Builder.of(GojoSatoruEntity::new, MobCategory.CREATURE) // MobCategory.CREATUREは友好Mob。敵対ならMobCategory.MONSTER
              .sized(0.6F, 1.9F) // エンティティのヒットボックスのサイズ (幅, 高さ)。五条悟の身長に合わせて調整。
              .build("gojo_satoru")); // 内部名（resource location part）

  public static void register(IEventBus eventBus) {
    ENTITY_TYPES.register(eventBus);
  }
}
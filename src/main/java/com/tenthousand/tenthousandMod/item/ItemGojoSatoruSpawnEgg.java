package com.tenthousand.tenthousandMod.item;

import com.tenthousand.tenthousandMod.entity.GojoSatoruEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.SpawnEggItem;

public class ItemGojoSatoruSpawnEgg extends Item {

  public ItemGojoSatoruSpawnEgg() {
    super(new Properties()
        .stacksTo(64)
        .rarity(Rarity.EPIC));
  }


  @Override
  public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
    ItemStack itemStack = player.getItemInHand(hand);
    if (!world.isClientSide) {
      // 五条悟エンティティのインスタンスを生成
      // GojoSatoruEntityのコンストラクタがEntityTypeとLevelを受け取る場合
      // まずはEntityLoader（またはエンティティタイプを登録しているクラス）からEntityTypeを取得する必要があります。
      // ここでは仮にEntityLoader.GOJO_SATORU_ENTITY.get()を使用します。
      // 実際のMODのエンティティ登録方法に合わせて調整してください。
      GojoSatoruEntity gojo = new GojoSatoruEntity(world); // または new GojoSatoruEntity(EntityLoader.GOJO_SATORU_ENTITY.get(), world);

      // スポーン位置を設定（プレイヤーのいる位置の少し前）
      gojo.setPos(player.getX() + player.getLookAngle().x * 2,
          player.getY() + player.getEyeHeight() + player.getLookAngle().y * 2,
          player.getZ() + player.getLookAngle().z * 2);

      // ワールドにエンティティを追加
      world.addFreshEntity(gojo);

      // スポーンエッグを消費
      if (!player.getAbilities().instabuild) { // クリエイティブモードでない場合のみ消費
        itemStack.shrink(1);
      }
    }
    return InteractionResultHolder.success(itemStack);
  }
}

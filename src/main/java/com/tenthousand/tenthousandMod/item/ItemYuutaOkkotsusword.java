package com.tenthousand.tenthousandMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ItemYuutaOkkotsusword  extends SwordItem {

  public ItemYuutaOkkotsusword(Tier tier) {
    super(tier,8,-1.9F,new Item.Properties()
        .rarity(Rarity.EPIC)
        .stacksTo(1)
        .durability(2821)
    );
  }
}

package com.tenthousand.tenthousandMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ItemShakukonto extends SwordItem {

  public ItemShakukonto(Tier tier) {
    super(tier, 9,-2.1F,new Item.Properties()
        .stacksTo(1)
        .rarity(Rarity.EPIC)
        .durability(2012)
    );
  }
}

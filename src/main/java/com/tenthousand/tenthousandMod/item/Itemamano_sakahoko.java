package com.tenthousand.tenthousandMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Tier;

public class Itemamano_sakahoko extends SwordItem {

  public Itemamano_sakahoko(Tier tier) {
    super(tier, 8, -2.4F, new Item.Properties()
        .stacksTo(1)
        .rarity(Rarity.EPIC)
        .durability(2831)
    );
  }
}
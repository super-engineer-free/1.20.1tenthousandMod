package com.tenthousand.tenthousandMod.item;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.SpawnEggItem;

public class ItemGojoSatoruSpawnEgg extends Item {

  public ItemGojoSatoruSpawnEgg() {
    super(new Properties()
        .stacksTo(64)
        .rarity(Rarity.EPIC));
  }
}
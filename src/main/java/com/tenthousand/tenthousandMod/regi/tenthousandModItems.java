package com.tenthousand.tenthousandMod.regi;
import com.tenthousand.tenthousandMod.item.ItemDainata;
import com.tenthousand.tenthousandMod.item.ItemShakukonto;
import com.tenthousand.tenthousandMod.item.ItemYuutaOkkotsusword;
import com.tenthousand.tenthousandMod.item.Itemamano_sakahoko;
import com.tenthousand.tenthousandMod.main.tenthousandMod;
import com.tenthousand.tenthousandMod.item.ItemGojoSatoruSpawnEgg;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Tiers;

public class tenthousandModItems {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, tenthousandMod.MOD_ID);
  public static final RegistryObject<Item> GOJO_SATORU_SPAWN_EGG = ITEMS.register("gojo_satoru_spawn_egg", ItemGojoSatoruSpawnEgg::new);
  public static final RegistryObject<Item> AMANO_SAKAHOKO = ITEMS.register("amano_sakahoko", () -> new Itemamano_sakahoko(Tiers.DIAMOND));
  public static final RegistryObject<Item> Dainata = ITEMS.register("dainata",() -> new ItemDainata(Tiers.DIAMOND));
  public static final RegistryObject<Item> YuutaOkkotsusword = ITEMS.register("yuutaokkotsusword",() -> new ItemYuutaOkkotsusword(Tiers.DIAMOND));
  public static final RegistryObject<Item> Shakukonto = ITEMS.register("shakukonto" ,() -> new ItemShakukonto(Tiers.DIAMOND));
}
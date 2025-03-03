package com.tenthousand.tenthousandMod;

import net.minecraftforge.eventbus.api.IEventBus;
import com.tenthousand.tenthousandMod.entity.EntityLoader;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item; // アイテム登録に必要
// あなたのMODのメインクラスのパスも必要になる場合があります
import com.tenthousand.tenthousandMod.TenThousandMod;

@Mod(TenThousandMod.MOD_ID)
public class TenThousandMod {
  public static final String MOD_ID = "tenthousandmod";

  public TenThousandMod(FMLJavaModLoadingContext context) {
    IEventBus bus = context.getModEventBus();

    ItemLoader.register(bus);
    BlockLoader.register(bus);
    EntityLoader.register(bus); // ★追加

    // ... その他の初期化処理
  }
}
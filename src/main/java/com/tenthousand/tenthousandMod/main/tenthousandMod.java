package com.tenthousand.tenthousandMod.main;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import com.tenthousand.tenthousandMod.regi.tab.tenthousandModTabs;
import com.tenthousand.tenthousandMod.regi.tenthousandModItems;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod(tenthousandMod.MOD_ID)
public class tenthousandMod {

   public static final String MOD_ID = "tenthousandmod";
   public static Object tenthousand_TAB;

   public tenthousandMod(FMLJavaModLoadingContext context){
   IEventBus bus = context.getModEventBus();
      tenthousandModItems.ITEMS.register(bus);
      tenthousandModTabs.MOD_TABS.register(bus);
}
}

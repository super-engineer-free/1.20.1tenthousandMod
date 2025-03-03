package com.tenthousand.tenthousandMod.regi.tab;

import com.tenthousand.tenthousandMod.main.tenthousandMod;
import com.tenthousand.tenthousandMod.regi.tab.tenthousandMain;
import com.tenthousand.tenthousandMod.regi.tenthousandModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import net.minecraft.world.level.block.SpongeBlock;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import com.tenthousand.tenthousandMod.regi.tab.tenthousandModTabs;import com.tenthousand.tenthousandMod.regi.tab.tenthousandModTabs;
public class  tenthousandModTabs {

  public static final  DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,tenthousandMod.MOD_ID);

  public static final RegistryObject<CreativeModeTab> tenthousand_MAIN = MOD_TABS.register("tenthousand_main",
      ()-> {return CreativeModeTab.builder()
          .icon(()->new ItemStack(tenthousandModItems.GOJO_SATORU_SPAWN_EGG.get()))
          .title(Component.translatable(("呪術師")))
          .displayItems((param,output)->{
            for (Item item : tenthousandMain.items){
              output.accept(item);
            }
        })
          .build();
      });
  public static final RegistryObject<CreativeModeTab> tenthousand_SUB= MOD_TABS.register("tenthousand_sub",
      ()-> {return CreativeModeTab.builder()
          .icon(()->new ItemStack(tenthousandModItems.AMANO_SAKAHOKO.get()))
          .title(Component.translatable(("呪具")))
          .displayItems((param,output)->{
            for (Item item : tenthousandMain.items){
              output.accept(item);
            }
          })
          .build();
      });

  public static final RegistryObject<CreativeModeTab> getTenthousand_MAIN= MOD_TABS.register("gettenthousand_sub",
      ()-> {return CreativeModeTab.builder()
          .icon(()->new ItemStack(tenthousandModItems.Dainata.get()))
          .displayItems((param,output)->{
          })
          .build();
      });
  public static final RegistryObject<CreativeModeTab> gettenthousandSub= MOD_TABS.register("gettenthousand_main",
      ()-> {return CreativeModeTab.builder()
          .icon(()->new ItemStack(tenthousandModItems.YuutaOkkotsusword.get()))
          .displayItems((param,output)->{
          })
          .build();
      });

  public static final RegistryObject<CreativeModeTab> gettenthousandMain= MOD_TABS.register("gettenthousand_sin",
      ()-> {return CreativeModeTab.builder()
          .icon(()->new ItemStack(tenthousandModItems.Shakukonto.get()))
          .displayItems((param,output)->{
          })
          .build();

      });
}

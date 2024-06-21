package com.remag.pncepcb.tab;

import com.remag.pncepcb.PNCExtraPCBs;
import com.remag.pncepcb.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PNCExtraPCBs.MODID);

    public static final List<Supplier<? extends ItemLike>> PNCEPCB_TABS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> PNCEPCB_TAB = TABS.register("pncepcb_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.pncepcb_tab"))
                    .icon(ModItems.HIGH_POWER_FINISHED_PCB.get().asItem()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            PNCEPCB_TABS.forEach(itemLike -> output.accept(new ItemStack(itemLike.get()))))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        PNCEPCB_TABS.add(itemLike);
        return itemLike;
    }
}

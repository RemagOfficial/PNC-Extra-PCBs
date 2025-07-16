package com.remag.pncepcb.tab;

import com.remag.pncepcb.PNCExtraPCBs;
import com.remag.pncepcb.config.ModConfig;
import com.remag.pncepcb.item.ModItems;
import me.desht.pneumaticcraft.common.item.CreativeTabStackProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PNCExtraPCBs.MODID);

    public static final List<Supplier<? extends ItemLike>> PNCEPCB_TABS = new ArrayList<>();

    public static final Supplier<CreativeModeTab> PNCEPCB_TAB = TABS.register("pncepcb_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.pncepcb_tab"))
                    .icon(ModItems.HIGH_POWER_FINISHED_PCB.get().asItem()::getDefaultInstance)
                    .displayItems((params, output) -> {
                        for (Supplier<? extends ItemLike> itemSupplier : ModItems.ITEMS.getEntries()) {
                            Item item = itemSupplier.get().asItem();
                            ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);

                            // Check the config here—it's safe now
                            if (id != null && ModConfig.COMMON.isItemEnabled(id.toString())) {
                                output.accept(item);
                            }
                        }
                    })
                    .build()
    );

    private static Stream<ItemStack> stacksForItem(ItemLike item) {
        ItemStack stack = new ItemStack(item);
        if (item instanceof CreativeTabStackProvider provider) {
            return provider.getStacksForItem();
        }
        return Stream.of(stack);
    }

    public static <T extends Item> DeferredItem<T> addToTab(DeferredItem<T> itemLike) {
            PNCEPCB_TABS.add(itemLike);
        return itemLike;
    }

}

package com.remag.pncepcb.compat;

import com.remag.pncepcb.config.ModConfig;
import com.remag.pncepcb.item.ModItems;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.forge.REIPluginClient;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

import java.util.function.Supplier;

@REIPluginClient
public class PNCEPCBReiPlugin  implements REIClientPlugin {

    @Override
    public void registerEntries(EntryRegistry registry) {
        for (Supplier<? extends ItemLike> itemSupplier : ModItems.ITEMS.getEntries()) {
            Item item = itemSupplier.get().asItem();
            ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);

            if (id != null && !ModConfig.COMMON.isItemEnabled(id.toString())) {
                registry.removeEntry(EntryStacks.of(item));
            }
        }
    }
}
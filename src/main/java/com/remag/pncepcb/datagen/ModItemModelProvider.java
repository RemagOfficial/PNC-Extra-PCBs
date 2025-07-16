package com.remag.pncepcb.datagen;

import com.remag.pncepcb.PNCExtraPCBs;
import com.remag.pncepcb.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PNCExtraPCBs.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (DeferredHolder<Item, ? extends Item> item : ModItems.ITEMS.getEntries()) {
            basicItem(item.get());
        }
    }
}

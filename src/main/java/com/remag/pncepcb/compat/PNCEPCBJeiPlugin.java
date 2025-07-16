package com.remag.pncepcb.compat;

import com.remag.pncepcb.PNCExtraPCBs;
import com.remag.pncepcb.config.ModConfig;
import com.remag.pncepcb.item.ModItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.*;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.function.Supplier;

@JeiPlugin
public class PNCEPCBJeiPlugin implements IModPlugin {
    private static final ResourceLocation ID = new ResourceLocation(PNCExtraPCBs.MODID, "jei_item_filter");

    @Override
    public ResourceLocation getPluginUid() {
        return ID;
    }

    @Override
    public void registerItemSubtypes(ISubtypeRegistration registration) {}

    @Override
    public void registerIngredients(IModIngredientRegistration registration) {}

    @Override
    public void registerRecipes(IRecipeRegistration registration) {}

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {}

    @Override
    public void registerRuntime(IRuntimeRegistration jeiRuntime) {
        IIngredientManager ingredientManager = jeiRuntime.getIngredientManager();

        for (Supplier<? extends ItemLike> itemSupplier : ModItems.ITEMS.getEntries()) {
            Item item = itemSupplier.get().asItem();
            ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);
            String pcbType = ModItems.ITEM_PCB_TYPES.getOrDefault(itemSupplier, "none");

            if (id != null && !ModConfig.COMMON.isItemEnabled(id.toString()) && !ModConfig.COMMON.isPcbTypeEnabled(pcbType)) {
                ingredientManager.removeIngredientsAtRuntime(VanillaTypes.ITEM_STACK,
                        List.of(new ItemStack(item)));
            }
        }
    }
}

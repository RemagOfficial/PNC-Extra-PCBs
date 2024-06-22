package com.remag.pncepcb.item;

import me.desht.pneumaticcraft.common.block.entity.UVLightBoxBlockEntity;
import me.desht.pneumaticcraft.common.item.EmptyPCBItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.MapColor;
import org.apache.commons.lang3.Validate;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static me.desht.pneumaticcraft.common.util.PneumaticCraftUtils.xlate;

public class PCBItem extends EmptyPCBItem {

    private static final String NBT_ETCH_PROGRESS = "pneumaticcraft:etch_progress";

    public static int getEtchProgress(ItemStack stack) {
        return stack.hasTag() ? Objects.requireNonNull(stack.getTag()).getInt(NBT_ETCH_PROGRESS) : 0;
    }

    public static void setEtchProgress(ItemStack stack, int progress) {
        Validate.isTrue(progress >= 0 && progress <= 100);
        stack.getOrCreateTag().putInt(NBT_ETCH_PROGRESS, progress);
    }

    @Override
    public boolean isBarVisible(ItemStack pStack) {
        return true;
    }

    @Override
    public int getBarWidth(ItemStack pStack) {
        int progress = UVLightBoxBlockEntity.getExposureProgress(pStack);
        return Math.round(progress / 100F * 13F);
    }

    @Override
    public int getBarColor(ItemStack pStack) {
        int progress = UVLightBoxBlockEntity.getExposureProgress(pStack);
        return progress * 2 << 16 | 0xFF;
    }

    @Override
    public boolean shouldShowCustomDurabilityBar(ItemStack stack) {
        return EmptyPCBItem.getEtchProgress(stack) > 0;
    }

    @Override
    public int getCustomDurabilityColour(ItemStack stack) {
        return MapColor.EMERALD.col;
    }

    @Override
    public float getCustomDurability(ItemStack stack) {
        return EmptyPCBItem.getEtchProgress(stack) / 100f;
    }

    @Override
    public boolean isShowingOtherBar(ItemStack stack) {
        return true;
    }

    @Override
    public Stream<ItemStack> getStacksForItem() {
        ItemStack stack = new ItemStack(this);
        ItemStack stack2 = UVLightBoxBlockEntity.setExposureProgress(stack.copy(), 100);
        return Stream.of(stack, stack2);
    }
}

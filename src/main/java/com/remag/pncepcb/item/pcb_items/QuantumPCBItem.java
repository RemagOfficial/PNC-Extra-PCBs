package com.remag.pncepcb.item.pcb_items;

import com.remag.pncepcb.item.ModItems;
import me.desht.pneumaticcraft.api.data.PneumaticCraftTags;
import me.desht.pneumaticcraft.common.block.entity.UVLightBoxBlockEntity;
import me.desht.pneumaticcraft.common.item.EmptyPCBItem;
import me.desht.pneumaticcraft.lib.BlockEntityConstants;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.MapColor;
import org.apache.commons.lang3.Validate;

import java.util.Objects;
import java.util.stream.Stream;

public class QuantumPCBItem extends EmptyPCBItem {

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
    public boolean onEntityItemUpdate(ItemStack stack, ItemEntity entityItem) {
        super.onEntityItemUpdate(stack, entityItem);

        if (entityItem.level().getFluidState(entityItem.blockPosition()).getType().is(PneumaticCraftTags.Fluids.ETCHING_ACID)) {
            if (!stack.hasTag()) {
                stack.setTag(new CompoundTag());
            }
            int etchProgress = getEtchProgress(stack);
            if (etchProgress < 100) {
                if (entityItem.tickCount % (BlockEntityConstants.PCB_ETCH_TIME / 5) == 0) {
                    setEtchProgress(stack, etchProgress + 1);
                }
                Level world = entityItem.getCommandSenderWorld();
                if (world.random.nextInt(15) == 0) {
                    double x = entityItem.getX() + world.random.nextDouble() * 0.3 - 0.15;
                    double y = entityItem.getY() - 0.15;
                    double z = entityItem.getZ() + world.random.nextDouble() * 0.3 - 0.15;
                    world.addParticle(ParticleTypes.CLOUD, x, y, z, 0.0, 0.05, 0.0);
                }
            } else if (!entityItem.level().isClientSide) {
                int successCount = 0;
                int failedCount = 0;
                int uvProgress = UVLightBoxBlockEntity.getExposureProgress(stack);
                for (int i = 0; i < stack.getCount(); i++) {
                    if (entityItem.level().random.nextInt(100) <= uvProgress) {
                        successCount++;
                    } else {
                        failedCount++;
                    }
                }

                ItemStack successStack = new ItemStack(successCount == 0 ? ModItems.QUANTUM_FAILED_PCB.get() : ModItems.QUANTUM_UNASSEMBLED_PCB.get(),
                        successCount == 0 ? failedCount : successCount);
                entityItem.setItem(successStack);

                // Only when we have failed items and the existing item entity wasn't reused already for the failed items.
                if (successCount > 0 && failedCount > 0) {
                    ItemStack failedStack = new ItemStack(ModItems.QUANTUM_FAILED_PCB.get(), failedCount);
                    entityItem.level().addFreshEntity(new ItemEntity(entityItem.level(), entityItem.getX(), entityItem.getY(), entityItem.getZ(), failedStack));
                }
            }
        }
        return false;
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

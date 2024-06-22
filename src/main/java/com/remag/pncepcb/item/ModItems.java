package com.remag.pncepcb.item;

import com.remag.pncepcb.PNCExtraPCBs;
import me.desht.pneumaticcraft.common.item.EmptyPCBItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.remag.pncepcb.tab.ModCreativeModeTab.addToTab;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, PNCExtraPCBs.MODID);

    // items

    public static final RegistryObject<Item> PRIMITIVE_UNASSEMBLED_PCB = addToTab(ITEMS.register("primitive_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> PRIMITIVE_FAILED_PCB = addToTab(ITEMS.register("primitive_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> PRIMITIVE_FINISHED_PCB = addToTab(ITEMS.register("primitive_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> PRIMITIVE_EMPTY_PCB = addToTab(ITEMS.register("primitive_empty_pcb",
            PrimitivePCBItem::new));

    public static final RegistryObject<Item> PRIMITIVE_SUBSTRATE = addToTab(ITEMS.register("primitive_substrate",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> FLEXIBLE_UNASSEMBLED_PCB = addToTab(ITEMS.register("flexible_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> FLEXIBLE_FAILED_PCB = addToTab(ITEMS.register("flexible_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> FLEXIBLE_FINISHED_PCB = addToTab(ITEMS.register("flexible_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> FLEXIBLE_EMPTY_PCB = addToTab(ITEMS.register("flexible_empty_pcb",
            FlexiblePCBItem::new));

    public static final RegistryObject<Item> FLEXIBLE_SUBSTRATE = addToTab(ITEMS.register("flexible_substrate",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_POWER_UNASSEMBLED_PCB = addToTab(ITEMS.register("high_power_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_POWER_FAILED_PCB = addToTab(ITEMS.register("high_power_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_POWER_FINISHED_PCB = addToTab(ITEMS.register("high_power_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_POWER_EMPTY_PCB = addToTab(ITEMS.register("high_power_empty_pcb",
            HighPowerPCBItem::new));
    public static final RegistryObject<Item> WATERPROOF_UNASSEMBLED_PCB = addToTab(ITEMS.register("waterproof_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> WATERPROOF_FAILED_PCB = addToTab(ITEMS.register("waterproof_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> WATERPROOF_FINISHED_PCB = addToTab(ITEMS.register("waterproof_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> WATERPROOF_EMPTY_PCB = addToTab(ITEMS.register("waterproof_empty_pcb",
            WaterproofPCBItem::new));
    public static final RegistryObject<Item> HIGH_TEMP_UNASSEMBLED_PCB = addToTab(ITEMS.register("high_temp_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_TEMP_FAILED_PCB = addToTab(ITEMS.register("high_temp_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_TEMP_FINISHED_PCB = addToTab(ITEMS.register("high_temp_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> HIGH_TEMP_EMPTY_PCB = addToTab(ITEMS.register("high_temp_empty_pcb",
            HighTempPCBItem::new));
    public static final RegistryObject<Item> NANO_UNASSEMBLED_PCB = addToTab(ITEMS.register("nano_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> NANO_FAILED_PCB = addToTab(ITEMS.register("nano_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> NANO_FINISHED_PCB = addToTab(ITEMS.register("nano_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> NANO_EMPTY_PCB = addToTab(ITEMS.register("nano_empty_pcb",
            NanoPCBItem::new));
    public static final RegistryObject<Item> QUANTUM_UNASSEMBLED_PCB = addToTab(ITEMS.register("quantum_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> QUANTUM_FAILED_PCB = addToTab(ITEMS.register("quantum_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> QUANTUM_FINISHED_PCB = addToTab(ITEMS.register("quantum_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> QUANTUM_EMPTY_PCB = addToTab(ITEMS.register("quantum_empty_pcb",
            QuantumPCBItem::new));
}

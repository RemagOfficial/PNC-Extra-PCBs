package com.remag.pncepcb.item;

import com.remag.pncepcb.PNCExtraPCBs;
import com.remag.pncepcb.item.pcb_items.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static com.remag.pncepcb.tab.ModCreativeModeTab.addToTab;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PNCExtraPCBs.MODID);
    public static final Map<Supplier<? extends ItemLike>, String> ITEM_PCB_TYPES = new HashMap<>();

    // items

    public static final DeferredItem<Item> PRIMITIVE_UNASSEMBLED_PCB = addToTab(ITEMS.register("primitive_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> PRIMITIVE_FAILED_PCB = addToTab(ITEMS.register("primitive_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> PRIMITIVE_FINISHED_PCB = addToTab(ITEMS.register("primitive_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> PRIMITIVE_EMPTY_PCB = addToTab(ITEMS.register("primitive_empty_pcb",
            PrimitivePCBItem::new));

    public static final DeferredItem<Item> PRIMITIVE_SUBSTRATE = addToTab(ITEMS.register("primitive_substrate",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> FLEXIBLE_UNASSEMBLED_PCB = addToTab(ITEMS.register("flexible_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> FLEXIBLE_FAILED_PCB = addToTab(ITEMS.register("flexible_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> FLEXIBLE_FINISHED_PCB = addToTab(ITEMS.register("flexible_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> FLEXIBLE_EMPTY_PCB = addToTab(ITEMS.register("flexible_empty_pcb",
            FlexiblePCBItem::new));

    public static final DeferredItem<Item> FLEXIBLE_SUBSTRATE = addToTab(ITEMS.register("flexible_substrate",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> SMD_CAPACITOR = addToTab(ITEMS.register("smd_capacitor",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> SMD_TRANSISTOR = addToTab(ITEMS.register("smd_transistor",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_POWER_UNASSEMBLED_PCB = addToTab(ITEMS.register("high_power_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_POWER_FAILED_PCB = addToTab(ITEMS.register("high_power_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_POWER_FINISHED_PCB = addToTab(ITEMS.register("high_power_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_POWER_EMPTY_PCB = addToTab(ITEMS.register("high_power_empty_pcb",
            HighPowerPCBItem::new));

    public static final DeferredItem<Item> WATERPROOF_UNASSEMBLED_PCB = addToTab(ITEMS.register("waterproof_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> WATERPROOF_FAILED_PCB = addToTab(ITEMS.register("waterproof_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> WATERPROOF_FINISHED_PCB = addToTab(ITEMS.register("waterproof_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> WATERPROOF_EMPTY_PCB = addToTab(ITEMS.register("waterproof_empty_pcb",
            WaterproofPCBItem::new));

    public static final DeferredItem<Item> HIGH_TEMP_UNASSEMBLED_PCB = addToTab(ITEMS.register("high_temp_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_TEMP_FAILED_PCB = addToTab(ITEMS.register("high_temp_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_TEMP_FINISHED_PCB = addToTab(ITEMS.register("high_temp_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> HIGH_TEMP_EMPTY_PCB = addToTab(ITEMS.register("high_temp_empty_pcb",
            HighTempPCBItem::new));

    public static final DeferredItem<Item> NANO_UNASSEMBLED_PCB = addToTab(ITEMS.register("nano_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> NANO_FAILED_PCB = addToTab(ITEMS.register("nano_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> NANO_FINISHED_PCB = addToTab(ITEMS.register("nano_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> NANO_EMPTY_PCB = addToTab(ITEMS.register("nano_empty_pcb",
            NanoPCBItem::new));

    public static final DeferredItem<Item> QUANTUM_UNASSEMBLED_PCB = addToTab(ITEMS.register("quantum_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> QUANTUM_FAILED_PCB = addToTab(ITEMS.register("quantum_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> QUANTUM_FINISHED_PCB = addToTab(ITEMS.register("quantum_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> QUANTUM_EMPTY_PCB = addToTab(ITEMS.register("quantum_empty_pcb",
            QuantumPCBItem::new));

    public static final DeferredItem<Item> MICROCONTROLLER_UNASSEMBLED_PCB = addToTab(ITEMS.register("microcontroller_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> MICROCONTROLLER_FAILED_PCB = addToTab(ITEMS.register("microcontroller_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> MICROCONTROLLER_FINISHED_PCB = addToTab(ITEMS.register("microcontroller_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> MICROCONTROLLER_EMPTY_PCB = addToTab(ITEMS.register("microcontroller_empty_pcb",
            MicrocontrollerPCBItem::new));

    public static final DeferredItem<Item> MICROCONTROLLER_CAPACITOR = addToTab(ITEMS.register("microcontroller_capacitor",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> MICROCONTROLLER_TRANSISTOR = addToTab(ITEMS.register("microcontroller_transistor",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> CRYSTAL_CLEAR_UNASSEMBLED_PCB = addToTab(ITEMS.register("crystal_clear_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> CRYSTAL_CLEAR_FAILED_PCB = addToTab(ITEMS.register("crystal_clear_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> CRYSTAL_CLEAR_FINISHED_PCB = addToTab(ITEMS.register("crystal_clear_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> CRYSTAL_CLEAR_EMPTY_PCB = addToTab(ITEMS.register("crystal_clear_empty_pcb",
            CrystalClearPCBItem::new));

    public static final DeferredItem<Item> RADIATION_HARDENED_UNASSEMBLED_PCB = addToTab(ITEMS.register("radiation_hardened_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> RADIATION_HARDENED_FAILED_PCB = addToTab(ITEMS.register("radiation_hardened_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> RADIATION_HARDENED_FINISHED_PCB = addToTab(ITEMS.register("radiation_hardened_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> RADIATION_HARDENED_EMPTY_PCB = addToTab(ITEMS.register("radiation_hardened_empty_pcb",
            RadiationHardenedPCBItem::new));

    public static final DeferredItem<Item> BIO_COMPATIBLE_UNASSEMBLED_PCB = addToTab(ITEMS.register("bio_compatible_unassembled_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> BIO_COMPATIBLE_FAILED_PCB = addToTab(ITEMS.register("bio_compatible_failed_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> BIO_COMPATIBLE_FINISHED_PCB = addToTab(ITEMS.register("bio_compatible_finished_pcb",
            () -> new Item(new Item.Properties())));

    public static final DeferredItem<Item> BIO_COMPATIBLE_EMPTY_PCB = addToTab(ITEMS.register("bio_compatible_empty_pcb",
            BioCompatiblePCBItem::new));

    // put items in type groups

    static {
        // primitive

        ITEM_PCB_TYPES.put(PRIMITIVE_EMPTY_PCB, "primitive");
        ITEM_PCB_TYPES.put(PRIMITIVE_UNASSEMBLED_PCB, "primitive");
        ITEM_PCB_TYPES.put(PRIMITIVE_FAILED_PCB, "primitive");
        ITEM_PCB_TYPES.put(PRIMITIVE_FINISHED_PCB, "primitive");
        ITEM_PCB_TYPES.put(PRIMITIVE_SUBSTRATE, "primitive");

        // flexible

        ITEM_PCB_TYPES.put(FLEXIBLE_EMPTY_PCB, "flexible");
        ITEM_PCB_TYPES.put(FLEXIBLE_UNASSEMBLED_PCB, "flexible");
        ITEM_PCB_TYPES.put(FLEXIBLE_FAILED_PCB, "flexible");
        ITEM_PCB_TYPES.put(FLEXIBLE_FINISHED_PCB, "flexible");
        ITEM_PCB_TYPES.put(FLEXIBLE_SUBSTRATE, "flexible");

        // high power

        ITEM_PCB_TYPES.put(HIGH_POWER_EMPTY_PCB, "high_power");
        ITEM_PCB_TYPES.put(HIGH_POWER_UNASSEMBLED_PCB, "high_power");
        ITEM_PCB_TYPES.put(HIGH_POWER_FAILED_PCB, "high_power");
        ITEM_PCB_TYPES.put(HIGH_POWER_FINISHED_PCB, "high_power");

        // waterproof

        ITEM_PCB_TYPES.put(WATERPROOF_EMPTY_PCB, "waterproof");
        ITEM_PCB_TYPES.put(WATERPROOF_UNASSEMBLED_PCB, "waterproof");
        ITEM_PCB_TYPES.put(WATERPROOF_FAILED_PCB, "waterproof");
        ITEM_PCB_TYPES.put(WATERPROOF_FINISHED_PCB, "waterproof");

        // high temp

        ITEM_PCB_TYPES.put(HIGH_TEMP_EMPTY_PCB, "high_temp");
        ITEM_PCB_TYPES.put(HIGH_TEMP_UNASSEMBLED_PCB, "high_temp");
        ITEM_PCB_TYPES.put(HIGH_TEMP_FAILED_PCB, "high_temp");
        ITEM_PCB_TYPES.put(HIGH_TEMP_FINISHED_PCB, "high_temp");

        // nano

        ITEM_PCB_TYPES.put(NANO_EMPTY_PCB, "nano");
        ITEM_PCB_TYPES.put(NANO_UNASSEMBLED_PCB, "nano");
        ITEM_PCB_TYPES.put(NANO_FAILED_PCB, "nano");
        ITEM_PCB_TYPES.put(NANO_FINISHED_PCB, "nano");

        // quantum

        ITEM_PCB_TYPES.put(QUANTUM_EMPTY_PCB, "quantum");
        ITEM_PCB_TYPES.put(QUANTUM_UNASSEMBLED_PCB, "quantum");
        ITEM_PCB_TYPES.put(QUANTUM_FAILED_PCB, "quantum");
        ITEM_PCB_TYPES.put(QUANTUM_FINISHED_PCB, "quantum");

        // microcontroller

        ITEM_PCB_TYPES.put(MICROCONTROLLER_EMPTY_PCB, "microcontroller");
        ITEM_PCB_TYPES.put(MICROCONTROLLER_UNASSEMBLED_PCB, "microcontroller");
        ITEM_PCB_TYPES.put(MICROCONTROLLER_FAILED_PCB, "microcontroller");
        ITEM_PCB_TYPES.put(MICROCONTROLLER_FINISHED_PCB, "microcontroller");

        // crystal clear

        ITEM_PCB_TYPES.put(CRYSTAL_CLEAR_EMPTY_PCB, "crystal_clear");
        ITEM_PCB_TYPES.put(CRYSTAL_CLEAR_UNASSEMBLED_PCB, "crystal_clear");
        ITEM_PCB_TYPES.put(CRYSTAL_CLEAR_FAILED_PCB, "crystal_clear");
        ITEM_PCB_TYPES.put(CRYSTAL_CLEAR_FINISHED_PCB, "crystal_clear");

        // radiation hardened

        ITEM_PCB_TYPES.put(RADIATION_HARDENED_EMPTY_PCB, "radiation_hardened");
        ITEM_PCB_TYPES.put(RADIATION_HARDENED_UNASSEMBLED_PCB, "radiation_hardened");
        ITEM_PCB_TYPES.put(RADIATION_HARDENED_FAILED_PCB, "radiation_hardened");
        ITEM_PCB_TYPES.put(RADIATION_HARDENED_FINISHED_PCB, "radiation_hardened");

        // bio compatible

        ITEM_PCB_TYPES.put(BIO_COMPATIBLE_EMPTY_PCB, "bio_compatible");
        ITEM_PCB_TYPES.put(BIO_COMPATIBLE_UNASSEMBLED_PCB, "bio_compatible");
        ITEM_PCB_TYPES.put(BIO_COMPATIBLE_FAILED_PCB, "bio_compatible");
        ITEM_PCB_TYPES.put(BIO_COMPATIBLE_FINISHED_PCB, "bio_compatible");

        // components

        ITEM_PCB_TYPES.put(SMD_CAPACITOR, "components");
        ITEM_PCB_TYPES.put(SMD_TRANSISTOR, "components");
        ITEM_PCB_TYPES.put(MICROCONTROLLER_CAPACITOR, "components");
        ITEM_PCB_TYPES.put(MICROCONTROLLER_TRANSISTOR, "components");

    }
}

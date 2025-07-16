package com.remag.pncepcb.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class ModConfig {
    public static final ModConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static {
        final Pair<Common, ModConfigSpec> specPair = new ModConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Common {
        public final ModConfigSpec.ConfigValue<List<? extends String>> disabledItems;

        public Common(ModConfigSpec.Builder builder) {
            builder.push("general");

            disabledItems = builder
                    .comment("List of item registry names to disable, e.g., [\"pncepcb:high_power_finished_pcb\", \"pncepcb:high_power_unassembled_pcb\"]")
                    .defineListAllowEmpty(
                            "disabledItems",
                            List.of(), // default
                            () -> "",
                            obj -> obj instanceof String // validator
                    );

            builder.pop();
        }

        public boolean isItemEnabled(String itemName) {
            return !disabledItems.get().contains(itemName);
        }
    }
}
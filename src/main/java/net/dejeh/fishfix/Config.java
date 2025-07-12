package net.dejeh.fishfix;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.ConfigValue<Integer> SEA_LEVEL = BUILDER
            .comment("Max sea level (default: 63)")
            .define("seaLevel", 63);

    public static final ModConfigSpec.ConfigValue<Integer> OFFSET_VALUE = BUILDER
            .comment("Downward spawning offset (max sea level minus desired minimum spawn level) (default: 13)")
            .define("offsetValue", 13);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static int getSeaLevel() {
        return SEA_LEVEL.get();
    }
    public static int getOffsetValue() {
        return OFFSET_VALUE.get();
    }
}

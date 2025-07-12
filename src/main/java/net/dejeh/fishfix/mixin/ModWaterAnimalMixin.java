package net.dejeh.fishfix.mixin;

import net.dejeh.fishfix.Config;
import net.minecraft.world.entity.animal.WaterAnimal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WaterAnimal.class)
public class ModWaterAnimalMixin {
    @ModifyConstant(method = "checkSurfaceWaterAnimalSpawnRules", constant = @Constant(intValue = 13))
    private static int replaceOffsetValue(int constant) {
        return Config.getOffsetValue();
    }
}

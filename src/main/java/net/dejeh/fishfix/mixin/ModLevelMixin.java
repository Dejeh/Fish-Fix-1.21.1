package net.dejeh.fishfix.mixin;

import net.dejeh.fishfix.Config;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Level.class)
public class ModLevelMixin {
    @ModifyConstant(method = "getSeaLevel", constant = @Constant(intValue = 63))
    public int replaceSeaLevel(int constant) {
        return Config.getSeaLevel();
    }
}
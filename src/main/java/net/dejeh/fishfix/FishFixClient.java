package net.dejeh.fishfix;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = FishFix.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = FishFix.MODID, value = Dist.CLIENT)
public class FishFixClient {
    public FishFixClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        FishFix.LOGGER.info("Fish Fix 1.21.1-1.0.0 loaded on the client.");
    }
}

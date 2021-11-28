package com.legoleggins.legolegginsmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.legoleggins.legolegginsmod.core.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LegoLegginsMod.MOD_ID)
public class LegoLegginsMod
{
	public static final String MOD_ID = "legolegginsmod";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public LegoLegginsMod() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		eventBus.addListener(this::setup);
		
		ItemInit.ITEMS.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
 
    }



}

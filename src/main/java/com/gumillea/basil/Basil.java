package com.gumillea.basil;

import com.gumillea.basil.core.reg.BasilBlocks;
import com.gumillea.basil.core.reg.BasilEffects;
import com.gumillea.basil.core.reg.BasilItems;
import com.gumillea.basil.core.reg.data.BasilCompostableItems;
import com.gumillea.basil.core.reg.data.tags.providers.BasilBlockTagsProvider;
import com.gumillea.basil.core.reg.data.tags.providers.BasilItemTagsProvider;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(Basil.MODID)
@Mod.EventBusSubscriber(modid = Basil.MODID)
public class Basil {

    public static final String MODID = "basil";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Basil() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::gatherData);

        BasilItems.ITEMS.register(modEventBus);
        BasilBlocks.BLOCKS.register(modEventBus);
        BasilEffects.EFFECTS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        BasilCompostableItems.registerCompostable();
    }

    private void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        boolean includeServer = event.includeServer();
        BasilBlockTagsProvider blockTagsProvider = new BasilBlockTagsProvider(generator, existingFileHelper);
        generator.addProvider(includeServer, blockTagsProvider);
        generator.addProvider(includeServer, new BasilItemTagsProvider(generator, blockTagsProvider, existingFileHelper));
    }

}

package com.gumillea.basil.core.data.compat;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.ModList;
import vectorwing.farmersdelight.FarmersDelight;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.function.Supplier;

public class ModCompat {
    public static final String FD = "farmersdelight";

    //Effect
    public static Supplier<MobEffect> COMFORT = ((ModList.get().isLoaded(FD)) ? ModEffects.COMFORT : null);
    public static Supplier<MobEffect> NOURISHMENT = ((ModList.get().isLoaded(FD)) ? ModEffects.NOURISHMENT : null);

    //Stack
    public static int DF_STEW = ((ModList.get().isLoaded(FD)) ? 16 : 1);

    //Tag
    public static final CreativeModeTab DF_ITEM = ((ModList.get().isLoaded(FD)) ? (FarmersDelight.CREATIVE_TAB) : null);
}


package com.gumillea.basil.core.reg;

import com.gumillea.basil.Basil;
import com.gumillea.basil.common.effect.PhototaxisEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasilEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Basil.MODID);

    public static final RegistryObject<MobEffect> PHOTOTAXIS = EFFECTS.register("phototaxis", PhototaxisEffect::new);
}

package com.gumillea.basil.common.Item;

import com.gumillea.basil.core.reg.BasilEffects;
import com.gumillea.basil.core.data.compat.ModCompat;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.Objects;

public class BasilFoodProperties {
    public static final FoodProperties ARBUTUS_BERRIES = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(0.3F)
            .effect(() -> new MobEffectInstance(BasilEffects.PHOTOTAXIS.get(), 600), 1.0F)
            .build();
    public static final FoodProperties GOLDEN_ARBUTUS_BERRIES = (new FoodProperties.Builder())
            .nutrition(3)
            .saturationMod(1.2F)
            .effect(() -> new MobEffectInstance(BasilEffects.PHOTOTAXIS.get(), 600, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600), 1.0F)
            .build();
    public static final FoodProperties ARBUTUS_BERRY_JUICE = (new FoodProperties.Builder())
            .effect(() -> new MobEffectInstance(BasilEffects.PHOTOTAXIS.get(), 1800), 1.0F)
            .build();
    public static final FoodProperties MIRACLE_BERRIES = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.1F)
            .alwaysEat()
            .effect(() -> new MobEffectInstance(BasilEffects.PHOTOTAXIS.get(), 600, 1), 1.0F)
            .build();
    public static final FoodProperties FIDDLEHEAD = (new FoodProperties.Builder())
            .nutrition(2)
            .saturationMod(0.1F)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.05F)
            .build();
    public static final FoodProperties COOKED_FIDDLEHEAD = (new FoodProperties.Builder())
            .nutrition(4)
            .saturationMod(0.2F)
            .fast()
            .build();
    public static final FoodProperties FERN_CREAM_SOUP = (new FoodProperties.Builder())
            .nutrition(6)
            .saturationMod(0.6F)
            .effect(() -> new MobEffectInstance(Objects.requireNonNull(ModCompat.COMFORT).get(), 3600), 1.0F)
            .build();
    public static final FoodProperties CREAM_STEW = (new FoodProperties.Builder())
            .nutrition(12)
            .saturationMod(1.5F)
            .effect(() -> new MobEffectInstance(Objects.requireNonNull(ModCompat.NOURISHMENT).get(), 3600), 1.0F)
            .build();
}

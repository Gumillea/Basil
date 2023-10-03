package com.gumillea.basil.core.loot;

import com.gumillea.basil.Basil;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasilLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Basil.MODID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_SEEDS_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_seeds_item", SeedsItemModifier.CODEC);
    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_FRUIT_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_fruit_item", FruitItemModifier.CODEC);
}
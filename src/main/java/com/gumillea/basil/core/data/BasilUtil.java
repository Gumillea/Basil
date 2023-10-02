package com.gumillea.basil.core.data;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BasilUtil {
    public static TagKey<Block> block(String modid, String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(modid, name));
    }

    public static TagKey<Item> item(String modid, String name) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(modid, name));
    }

}

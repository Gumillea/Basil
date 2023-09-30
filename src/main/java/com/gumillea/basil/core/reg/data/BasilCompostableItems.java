package com.gumillea.basil.core.reg.data;

import com.gumillea.basil.core.reg.BasilItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.ComposterBlock;

public class BasilCompostableItems {

    public static void registerCompostable() {
        //Fruits
        registerCompostable(BasilItems.ARBUTUS_BERRIES.get(), 0.65F);

        //Ferns
        registerCompostable(BasilItems.COOKED_FIDDLEHEAD.get(), 0.7F);
        registerCompostable(BasilItems.FIDDLEHEAD.get(), 0.5F);
        registerCompostable(BasilItems.FERN_SPORANGIA.get(), 0.15F);

    }

    private static void registerCompostable(Item item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item, chance);
    }
}

package com.gumillea.basil.core.reg;

import com.gumillea.basil.Basil;
import com.gumillea.basil.common.Item.BasilFoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasilItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Basil.MODID);

    //Foods
    public static final RegistryObject<Item> ARBUTUS_BERRIES = ITEMS.register("arbutus_berries", () -> new Item(new Item.Properties()
            .food(BasilFoodProperties.ARBUTUS_BERRIES)
            .tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> GOLDEN_ARBUTUS_BERRIES = ITEMS.register("golden_arbutus_berries", () -> new Item(new Item.Properties()
            .food(BasilFoodProperties.GOLDEN_ARBUTUS_BERRIES)
            .rarity(Rarity.RARE)
            .tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> FIDDLEHEAD = ITEMS.register("fiddlehead", () -> new Item(new Item.Properties()
            .food(BasilFoodProperties.FIDDLEHEAD)
            .tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> COOKED_FIDDLEHEAD = ITEMS.register("cooked_fiddlehead", () -> new Item(new Item.Properties()
            .food(BasilFoodProperties.COOKED_FIDDLEHEAD)
            .tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> FERN_CREAM_SOUP = ITEMS.register("fern_cream_soup", () -> new BowlFoodItem(new Item.Properties()
            .food(BasilFoodProperties.FERN_CREAM_SOUP)
            .stacksTo(1)
            .tab(CreativeModeTab.TAB_FOOD)));

    //Crops
    public static final RegistryObject<Item> FERN_SPORANGIA = ITEMS.register("fern_sporangia", () -> new ItemNameBlockItem(BasilBlocks.VEGETABLE_FERNS.get(),new Item.Properties()
            .tab(CreativeModeTab.TAB_MISC)));
}

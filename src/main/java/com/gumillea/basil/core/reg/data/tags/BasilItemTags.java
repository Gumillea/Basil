package com.gumillea.basil.core.reg.data.tags;

import com.gumillea.basil.core.reg.data.Util;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class BasilItemTags {

    //Forge
    public static final TagKey<Item> CROPS = Util.item("forge", "crops");
    public static final TagKey<Item> FRUITS = Util.item("forge", "fruits");
    public static final TagKey<Item> BERRIES = Util.item("forge", "fruits/berries");
    public static final TagKey<Item> VEGETABLES = Util.item("forge", "vegetables");
    public static final TagKey<Item> SALAD_INGREDIENTS = Util.item("forge", "salad_ingredients");
    public static final TagKey<Item> SPORANGIA = Util.item("forge", "seeds/fern");
    public static final TagKey<Item> MILK = Util.item("forge", "milk");

    //Diet
    public static final TagKey<Item> DIET_FRUITS = Util.item("diet", "fruits");
    public static final TagKey<Item> DIET_VEGETABLES = Util.item("diet", "vegetables");
}

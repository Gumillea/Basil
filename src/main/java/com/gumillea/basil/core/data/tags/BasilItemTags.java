package com.gumillea.basil.core.data.tags;

import com.gumillea.basil.core.data.BasilUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class BasilItemTags {

    //Forge
    public static final TagKey<Item> CROPS = BasilUtil.item("forge", "crops");
    public static final TagKey<Item> FRUITS = BasilUtil.item("forge", "fruits");
    public static final TagKey<Item> BERRIES = BasilUtil.item("forge", "fruits/berries");
    public static final TagKey<Item> VEGETABLES = BasilUtil.item("forge", "vegetables");
    public static final TagKey<Item> SALAD_INGREDIENTS = BasilUtil.item("forge", "salad_ingredients");
    public static final TagKey<Item> SPORANGIA = BasilUtil.item("forge", "seeds/fern");
    public static final TagKey<Item> MILK = BasilUtil.item("forge", "milk");

    //Diet
    public static final TagKey<Item> DIET_FRUITS = BasilUtil.item("diet", "fruits");
    public static final TagKey<Item> DIET_VEGETABLES = BasilUtil.item("diet", "vegetables");
}

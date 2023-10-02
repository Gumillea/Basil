package com.gumillea.basil.core.data.tags;

import com.gumillea.basil.Basil;
import com.gumillea.basil.core.data.BasilUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class BasilBlockTags {
    public static final TagKey<Block> FERN_CROPS_GROWABLE = BasilUtil.block(Basil.MODID, "fern_crops_growable");
    public static final TagKey<Block> COBBLESTONE = BasilUtil.block("forge", "cobblestone");

}

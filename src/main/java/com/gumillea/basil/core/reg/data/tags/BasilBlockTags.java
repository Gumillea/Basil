package com.gumillea.basil.core.reg.data.tags;

import com.gumillea.basil.Basil;
import com.gumillea.basil.core.reg.data.Util;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class BasilBlockTags {
    public static final TagKey<Block> FERN_CROPS_GROWABLE = Util.block(Basil.MODID, "fern_crops_growable");
    public static final TagKey<Block> COBBLESTONE = Util.block("forge", "cobblestone");

}

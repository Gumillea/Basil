package com.gumillea.basil.core.data.tags.providers;

import com.gumillea.basil.Basil;
import com.gumillea.basil.core.data.tags.BasilBlockTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BasilBlockTagsProvider extends BlockTagsProvider {
    public BasilBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Basil.MODID, existingFileHelper);
    }

    @Override
    public void addTags() {
        this.tag(BasilBlockTags.FERN_CROPS_GROWABLE).add(
                Blocks.FARMLAND,
                Blocks.CLAY)
                .addTag(BasilBlockTags.COBBLESTONE)
                .addTag(BlockTags.DIRT)
                .addTag(BlockTags.LOGS)
                .addTag(BlockTags.PLANKS)
                .addTag(BlockTags.BASE_STONE_OVERWORLD);
    }

}

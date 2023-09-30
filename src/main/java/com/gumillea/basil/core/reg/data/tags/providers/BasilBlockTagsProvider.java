package com.gumillea.basil.core.reg.data.tags.providers;

import com.gumillea.basil.Basil;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BasilBlockTagsProvider extends BlockTagsProvider {
    public BasilBlockTagsProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Basil.MODID, existingFileHelper);
    }

}

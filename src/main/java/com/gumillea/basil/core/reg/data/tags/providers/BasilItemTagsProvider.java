package com.gumillea.basil.core.reg.data.tags.providers;

import com.gumillea.basil.Basil;
import com.gumillea.basil.core.reg.BasilItems;
import com.gumillea.basil.core.reg.data.tags.BasilItemTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BasilItemTagsProvider extends ItemTagsProvider {
    public BasilItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper existingFileHelper) {
        super(generator, blockTags, Basil.MODID, existingFileHelper);
    }

    @Override
    public void addTags() {
        this.tag(BasilItemTags.CROPS).add(
                BasilItems.FIDDLEHEAD.get()
        );
        this.tag(BasilItemTags.SALAD_INGREDIENTS).add(
                BasilItems.FIDDLEHEAD.get()
        );
        this.tag(BasilItemTags.SPORANGIA).add(
                BasilItems.FERN_SPORANGIA.get()
        );
        this.tag(BasilItemTags.VEGETABLES).add(
                BasilItems.FIDDLEHEAD.get()
        );

        this.tag(BasilItemTags.BERRIES).add(
                BasilItems.ARBUTUS_BERRIES.get()
        );
        this.tag(ItemTags.FOX_FOOD).add(
                BasilItems.ARBUTUS_BERRIES.get()
        );
        this.tag(ItemTags.PIGLIN_LOVED).add(
                BasilItems.GOLDEN_ARBUTUS_BERRIES.get()
        );

        this.tag(BasilItemTags.MILK).add(
                Items.MILK_BUCKET
        );

        this.tag(BasilItemTags.DIET_VEGETABLES).add(
                BasilItems.FIDDLEHEAD.get()
        );
        this.tag(BasilItemTags.DIET_FRUITS).add(
                BasilItems.ARBUTUS_BERRIES.get()
        );
    }
}
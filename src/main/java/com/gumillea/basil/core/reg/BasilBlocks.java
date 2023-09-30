package com.gumillea.basil.core.reg;

import com.gumillea.basil.Basil;
import com.gumillea.basil.common.block.VegetableFernsBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BasilBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Basil.MODID);
    public static final RegistryObject<Block> VEGETABLE_FERNS = BLOCKS.register("vegetable_ferns",
            () -> new VegetableFernsBlock(BlockBehaviour.Properties.of(Material.PLANT)
            .sound(SoundType.FLOWERING_AZALEA).instabreak().noCollission().randomTicks().offsetType(BlockBehaviour.OffsetType.XZ)));

}

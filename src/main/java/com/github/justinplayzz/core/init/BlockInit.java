package com.github.justinplayzz.core.init;

import com.github.justinplayzz.ForgeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ForgeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ForgeMod.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
                    .harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()));
}

package com.github.justinplayzz.core.init;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import com.github.justinplayzz.ForgeMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ForgeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BlockInit {

    public static final BlockHelper HELPER = ForgeMod.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);

    public static final RegistryObject<Block> RUBY_BLOCK = HELPER.createSimpleBlock("ruby_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED).harvestTool(ToolType.PICKAXE).harvestLevel(2).strength(5.0F, 6.0F).sound(SoundType.METAL).requiresCorrectToolForDrops()), ForgeMod.FORGE_TAB);
}

package com.github.justinplayzz.core.init;

import com.github.justinplayzz.ForgeMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ForgeMod.MOD_ID);

    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby_item",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    //Block Items
    public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block.json",
            ()-> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
}

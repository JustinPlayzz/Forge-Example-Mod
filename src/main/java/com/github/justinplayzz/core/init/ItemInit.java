package com.github.justinplayzz.core.init;

import co.eltrut.differentiate.core.registrator.ItemHelper;
import com.github.justinplayzz.ForgeMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ForgeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ItemInit {

    public static final ItemHelper HELPER = ForgeMod.REGISTRATOR.getHelper(ForgeRegistries.ITEMS);

    public static final RegistryObject<Item> RUBY_ITEM = HELPER.createItem("ruby_item", () -> new Item(new Item.Properties().tab(ForgeMod.FORGE_TAB)));
}

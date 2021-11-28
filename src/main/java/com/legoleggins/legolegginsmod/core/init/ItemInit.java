package com.legoleggins.legolegginsmod.core.init;

import com.legoleggins.legolegginsmod.LegoLegginsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			LegoLegginsMod.MOD_ID);
	
	public static final RegistryObject<Item> BORK_SHARD = ITEMS.register("bork_shard",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
}

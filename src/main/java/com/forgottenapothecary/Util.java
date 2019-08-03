package com.forgottenapothecary;

import com.forgottenapothecary.registry.ModRegistries;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Joseph on 7/27/2019.
 */
public class Util {
	
	
	public static <T extends Item> T registerItem(T item, String name, List<Predicate<ItemStack>> predicates, String... oreDictionaryNames) {
		ResourceLocation loc = new ResourceLocation(Forgottenapothecary.MODID, name);
		item.setRegistryName(loc);
		item.setTranslationKey(loc.toString().replace(":", "."));
		//object.setCreativeTab(Forgottenapothecary.tab);
		ModRegistries.MODEL_PREDICATES.put(item, predicates);
		ModRegistries.ORE_DICTIONARY_ENTRIES.put(item, oreDictionaryNames);
		return item;
	}
	
	public static Item registerItem(Item item, String name, String... oreDictionaryNames) {
		return registerItem(item, name, Arrays.asList(), oreDictionaryNames);
	}
	
	public static Item registerItem(String name, String... oreDictionaryNames) {
		return registerItem(new Item(), name, oreDictionaryNames);
	}
	
}

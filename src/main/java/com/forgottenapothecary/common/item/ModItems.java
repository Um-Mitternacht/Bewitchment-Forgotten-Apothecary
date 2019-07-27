package com.forgottenapothecary.common.item;

import com.forgottenapothecary.Forgottenapothecary;
import com.forgottenapothecary.common.lib.LibItemName;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Joseph on 7/27/2019.
 */

@SuppressWarnings("ConstantConditions")
@GameRegistry.ObjectHolder(Forgottenapothecary.MODID)
public class ModItems {
	
	public static final Item moonstone = null;
	
	public static void register(final IForgeRegistry<Item> registry) {
		
		registry.registerAll(new ItemMod(LibItemName.MOONSTONE));
	}
	
	public static void init() {
		initOreDictionary();
	}
	
	private static void initOreDictionary() {
	}
}
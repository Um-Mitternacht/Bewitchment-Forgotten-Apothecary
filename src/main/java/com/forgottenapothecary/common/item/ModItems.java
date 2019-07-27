package com.forgottenapothecary.common.item;

import com.forgottenapothecary.Forgottenapothecary;
import com.forgottenapothecary.common.lib.LibItemName;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.LoaderException;
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
	
	private static Item itemBlock(Block block) {
		if (block == null) {
			throw new LoaderException("[" + Forgottenapothecary.NAME + "] Trying to register an ItemBlock for a null block");
		}
		if (block.getRegistryName() == null) {
			throw new LoaderException("[" + Forgottenapothecary.NAME + "] Trying to register an ItemBlock for a block with null name - " + block.getTranslationKey());
		}
		if (block.getRegistryName().toString() == null) {
			throw new LoaderException("[" + Forgottenapothecary.NAME + "] There's something wrong with the registry implementation of " + block.getTranslationKey());
		}
		return new ItemBlock(block).setRegistryName(block.getRegistryName());
	}
	
	public static void init() {
		initOreDictionary();
	}
	
	private static void initOreDictionary() {
	}
}
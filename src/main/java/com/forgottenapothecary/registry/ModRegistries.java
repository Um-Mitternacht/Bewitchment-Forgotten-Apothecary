package com.forgottenapothecary.registry;

import com.forgottenapothecary.Forgottenapothecary;
import com.forgottenapothecary.common.object.ModObjects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * Created by Joseph on 7/27/2019.
 */
@Mod.EventBusSubscriber
public class ModRegistries {
	
	public static final Map<Item, String[]> ORE_DICTIONARY_ENTRIES = new HashMap();
	public static final Map<Item, List<Predicate<ItemStack>>> MODEL_PREDICATES = new HashMap();
	
	public ModRegistries() {
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		try {
			Field[] var1 = ModObjects.class.getFields();
			int var2 = var1.length;
			
			for (int var3 = 0; var3 < var2; ++var3) {
				Field f = var1[var3];
				Object obj = f.get((Object) null);
				if (obj instanceof Item) {
					Item item = (Item) obj;
					List<Predicate<ItemStack>> predicates = (List) MODEL_PREDICATES.get(item);
					event.getRegistry().register(item);
					if (predicates.isEmpty()) {
						Forgottenapothecary.proxy.registerTexture(item, "normal");
					}
					else {
						Forgottenapothecary.proxy.registerTextureVariant(item, predicates);
					}
				}
			}
		}
		catch (Exception var8) {
			;
		}
		
		Iterator var9 = ORE_DICTIONARY_ENTRIES.keySet().iterator();
		
		while (var9.hasNext()) {
			Item item = (Item) var9.next();
			String[] var11 = (String[]) ORE_DICTIONARY_ENTRIES.get(item);
			int var12 = var11.length;
			
			for (int var13 = 0; var13 < var12; ++var13) {
				String ore = var11[var13];
				OreDictionary.registerOre(ore, item);
			}
		}
		
	}
	
}

package com.forgottenapothecary.common.item;

import com.bewitchment.Util;
import com.forgottenapothecary.Forgottenapothecary;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Joseph on 7/27/2019.
 */

@SuppressWarnings({"unused", "WeakerAccess", "ConstantConditions", "SameParameterValue"})
public class ModItems {
	
	public static final Item moonstone = Util.registerItem("moonstone", "gemMoonstone");
	
	public static void preInit() {
	}
}
package com.forgottenapothecary.common.object;

import com.forgottenapothecary.Util;
import net.minecraft.item.Item;

/**
 * Created by Joseph on 7/27/2019.
 */

@SuppressWarnings({"unused", "WeakerAccess", "ConstantConditions", "SameParameterValue"})
public class ModObjects {
	
	public static final Item moonstone = Util.registerItem("moonstone", "gemMoonstone");
	
	public static void preInit() {
	}
}
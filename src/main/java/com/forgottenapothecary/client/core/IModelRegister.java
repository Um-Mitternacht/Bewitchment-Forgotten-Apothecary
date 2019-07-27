package com.forgottenapothecary.client.core;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Joseph on 7/27/2019.
 */
public interface IModelRegister {
	@SideOnly(Side.CLIENT)
	void registerModel();
}

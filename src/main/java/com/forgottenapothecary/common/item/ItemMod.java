package com.forgottenapothecary.common.item;

import com.forgottenapothecary.Forgottenapothecary;
import com.forgottenapothecary.client.core.IModelRegister;
import com.forgottenapothecary.client.handler.ModelHandler;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Joseph on 7/27/2019.
 */
public class ItemMod extends Item implements IModelRegister {
	
	public ItemMod(String id) {
		super();
		setRegistryName(id);
		setTranslationKey(Forgottenapothecary.MODID + "." + id);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}

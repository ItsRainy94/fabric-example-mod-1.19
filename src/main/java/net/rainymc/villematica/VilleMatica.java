package net.rainymc.villematica;

import net.fabricmc.api.ModInitializer;
import net.rainymc.villematica.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VilleMatica implements ModInitializer {
	public static final String MOD_ID = "villematica";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}


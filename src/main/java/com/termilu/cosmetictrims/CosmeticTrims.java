package com.termilu.cosmetictrims;

import com.termilu.cosmetictrims.item.ModItemGroups;
import com.termilu.cosmetictrims.item.ModItems;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CosmeticTrims implements ModInitializer {
	public static final String MOD_ID = "cosmetictrims";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		// Register mod's resource folder with Polymer
		if (!PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			System.out.println(MOD_ID + " Failed to add mod assets to Polymer RP.");
		}else {
			System.out.println(MOD_ID + " Successfully added mod assets to Polymer RP.");
		}

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

	}
}
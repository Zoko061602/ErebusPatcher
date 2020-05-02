package com.gtnewhorizons.erebuspatcher;

import static erebus.ModBiomes.elysianFields;
import static erebus.ModBiomes.elysianFieldsID;
import static erebus.ModBiomes.fieldsSubForest;
import static erebus.ModBiomes.fieldsSubForestID;
import static erebus.ModBiomes.fungalForest;
import static erebus.ModBiomes.fungalForestID;
import static erebus.ModBiomes.submergedSwamp;
import static erebus.ModBiomes.submergedSwampID;
import static erebus.ModBiomes.subterraneanSavannah;
import static erebus.ModBiomes.subterraneanSavannahID;
import static erebus.ModBiomes.ulteriorOutback;
import static erebus.ModBiomes.ulteriorOutbackID;
import static erebus.ModBiomes.undergroundJungle;
import static erebus.ModBiomes.undergroundJungleID;
import static erebus.ModBiomes.volcanicDesert;
import static erebus.ModBiomes.volcanicDesertID;

import erebus.world.biomes.BiomeElysianFields;
import erebus.world.biomes.BiomeFungalForest;
import erebus.world.biomes.BiomeSubmergedSwamp;
import erebus.world.biomes.BiomeSubterraneanSavannah;
import erebus.world.biomes.BiomeUlteriorOutback;
import erebus.world.biomes.BiomeUndergroundJungle;
import erebus.world.biomes.BiomeVolcanicDesert;
import net.minecraft.world.biome.BiomeGenBase;

public class ErebusBiomes {

	public static void init(){

		for (int id : new int[] { undergroundJungleID, volcanicDesertID, subterraneanSavannahID, elysianFieldsID, ulteriorOutbackID, fungalForestID, submergedSwampID, fieldsSubForestID }) {
			BiomeGenBase biome = BiomeGenBase.getBiomeGenArray()[id];
			if (biome != null)
				throw new IllegalArgumentException("Erebus can not use biome ID " + id + " because it's being used by " + biome + ". Please choose a different one.");
		}
			// CREATE BIOMES

			undergroundJungle = new BiomeUndergroundJungle(undergroundJungleID);
			volcanicDesert = new BiomeVolcanicDesert(volcanicDesertID);
			subterraneanSavannah = new BiomeSubterraneanSavannah(subterraneanSavannahID);
			elysianFields = new BiomeElysianFields(elysianFieldsID);
			ulteriorOutback = new BiomeUlteriorOutback(ulteriorOutbackID);
			fungalForest = new BiomeFungalForest(fungalForestID);
			submergedSwamp = new BiomeSubmergedSwamp(submergedSwampID);
			fieldsSubForest = new BiomeElysianFields.BiomeElysianForest(fieldsSubForestID);

			// MUTATIONS
		//	undergroundJungle.createMutation();
		//	volcanicDesert.createMutation();
		//	subterraneanSavannah.createMutation();
		//	elysianFields.createMutation();
		//	ulteriorOutback.createMutation();
		//	fungalForest.createMutation();
		//	submergedSwamp.createMutation();
		//	fieldsSubForest.createMutation();

	}

	public static void postInit() {

	}

}

package com.gtnewhorizons.erebuspatcher;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ErebusPatcher.ModID, name=ErebusPatcher.ModName, version=ErebusPatcher.Version, dependencies="required-after:erebus")
public class ErebusPatcher {

	public static final String ModID = "ErebusPatcher";
	public static final String ModName = "Erebus Patcher";
	public static final String Version = "1.0";

	@EventHandler
	public void preInit(FMLPreInitializationEvent e){

	}

	@EventHandler
	public void init(FMLInitializationEvent e){

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e){

	}
}

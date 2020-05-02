package com.gtnewhorizons.erebuspatcher.asm;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.7.10")
@IFMLLoadingPlugin.Name(ErebusPatcherCore.NAME)
public class ErebusPatcherCore implements IFMLLoadingPlugin {

	public static final String NAME = "ErebusPatcherCore";

	@Override
	public String[] getASMTransformerClass() {
		return new String[]{ErebusBiomeTransformer.class.getName()};
	}

	@Override
	public String getSetupClass() {
		return null;
	}
	@Override
	public void injectData(Map<String, Object> data) {

	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}


	@Override
	public String getModContainerClass() {
		return null;
	}


}

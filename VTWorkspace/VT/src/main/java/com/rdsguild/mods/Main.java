package com.rdsguild.mods;

import com.rdsguild.mods.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME, useMetadata = References.METADATA)
public class Main {

	@Instance(References.MODID)
	public static Main instance;
	
	@SidedProxy(clientSide = References.CLIENT_SIDE_PROXY, serverSide = References.SERVER_SIDE_PROXY)
	public static CommonProxy proxy;
	
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void init(FMLInitializationEvent e) {
		
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
}

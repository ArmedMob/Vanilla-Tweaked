package com.rdsguild.mods;

import org.apache.logging.log4j.Logger;

import com.rdsguild.mods.items.VTItems;
import com.rdsguild.mods.proxies.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME, useMetadata = References.METADATA)
public class Main {

	@Instance(References.MODID)
	public static Main instance;
	
	@SidedProxy(clientSide = References.CLIENT_SIDE_PROXY, serverSide = References.SERVER_SIDE_PROXY)
	public static CommonProxy proxy;
	
	public static Logger logger;
	
	public final CreativeTabs tab = new CreativeTabs(References.MODID)  {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(VTItems.ingotLithium);
		}
		
		@Override
		public Item getTabIconItem() {
			return null;
		}
	};
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		proxy.preInit(e);		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		
	}
}

package com.rhinoxo.organicraft;

import com.rhinoxo.organicraft.handler.ConfigurationHandler;
import com.rhinoxo.organicraft.proxy.IProxy;
import com.rhinoxo.organicraft.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Rhinoxo on 9/21/2014.
 */
@Mod(modid = Reference.MOD_ID ,name = Reference.MOD_NAME ,version = Reference.VERSION)
public class Organicraft {

    @Mod.Instance(Reference.MOD_ID)
    public static Organicraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public  void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public  void postInit(FMLPostInitializationEvent event){

    }
}

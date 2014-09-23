package com.rhinoxo.organicraft.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Rhinoxo on 9/21/2014.
 */
public class ConfigurationHandler {
    public static void init(File configFile){
        Configuration configuration = new Configuration(configFile);
        int compostPileID = 0;
        int compostID = 0;

        try {
            configuration.load();

            compostPileID = configuration.get("IDs","Compost Pile",665).getInt(665);
            compostID = configuration.get("IDs","Compost",666).getInt(666);
        }
        catch (Exception e) {
            //Log Exception
        }
        finally {
            configuration.save();
        }

        System.out.println("Compost Pile :" + compostPileID);
        System.out.println("Compost :" + compostID);
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

    }
}

package com.scaler.dp.factory.example2;

/**
 * PRACTICAL FACTORY
 */
public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(String platform){
        if(platform.equals("Android")){
            return new AndroidFactory();
        }else if(platform.equals("ios")){
            return new iOSFactory();
        }else
            return new WindowsUIFactory();

    }
}
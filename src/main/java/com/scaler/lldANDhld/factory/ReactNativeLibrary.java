package com.scaler.lldANDhld.factory;

public class ReactNativeLibrary {


    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}

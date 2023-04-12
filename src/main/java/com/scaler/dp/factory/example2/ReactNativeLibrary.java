package com.scaler.dp.factory.example2;

public class ReactNativeLibrary {


    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }

}

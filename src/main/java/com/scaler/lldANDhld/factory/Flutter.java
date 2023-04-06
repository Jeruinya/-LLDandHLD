package com.scaler.lldANDhld.factory;

public class Flutter {
    public void setTheme(){
        System.out.println("setting theme for both");
    }
    public void setRefreshRate(){
        System.out.println("setting refesh rate for both");
    }



    // PRACTICAL FACTORY
    public UIFactory createUIFactory(String platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }
}
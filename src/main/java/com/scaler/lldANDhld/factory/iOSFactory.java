package com.scaler.lldANDhld.factory;

import com.scaler.lldANDhld.factory.component.button.IOSButton;
import com.scaler.lldANDhld.factory.component.dropdown.IOSDropDown;
import com.scaler.lldANDhld.factory.component.menu.IOSMenu;

public class iOSFactory implements UIFactory {
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDropDown() {
        return new IOSDropDown();
    }
}
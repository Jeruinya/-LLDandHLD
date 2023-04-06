package com.scaler.lldANDhld.factory;

import com.scaler.lldANDhld.factory.component.button.AndroidButton;
import com.scaler.lldANDhld.factory.component.dropdown.AndroidDropDown;
import com.scaler.lldANDhld.factory.component.menu.AndroidMenu;

public class AndroidFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
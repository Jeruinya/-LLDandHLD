package com.scaler.dp.factory.example2;

import com.scaler.dp.factory.component.button.AndroidButton;
import com.scaler.dp.factory.component.dropdown.AndroidDropDown;
import com.scaler.dp.factory.component.menu.AndroidMenu;

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
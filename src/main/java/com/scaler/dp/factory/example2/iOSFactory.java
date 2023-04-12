package com.scaler.dp.factory.example2;

import com.scaler.dp.factory.component.button.IOSButton;
import com.scaler.dp.factory.component.dropdown.IOSDropDown;
import com.scaler.dp.factory.component.menu.IOSMenu;

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
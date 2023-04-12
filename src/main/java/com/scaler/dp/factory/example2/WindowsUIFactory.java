package com.scaler.dp.factory.example2;

import com.scaler.dp.factory.component.button.Button;
import com.scaler.dp.factory.component.dropdown.DropDown;
import com.scaler.dp.factory.component.menu.Menu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public DropDown createDropDown() {
        return null;
    }
}

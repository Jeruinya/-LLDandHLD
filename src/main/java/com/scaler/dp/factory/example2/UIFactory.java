package com.scaler.dp.factory.example2;

import com.scaler.dp.factory.component.button.Button;
import com.scaler.dp.factory.component.dropdown.DropDown;
import com.scaler.dp.factory.component.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
package com.scaler.lldANDhld.factory;

import com.scaler.lldANDhld.factory.component.button.Button;
import com.scaler.lldANDhld.factory.component.dropdown.DropDown;
import com.scaler.lldANDhld.factory.component.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
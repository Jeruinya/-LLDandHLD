package com.scaler.dp.factory.component.button;

public class IOSButton implements Button {
    @Override
    public IOSButton clickButton() {
        return new IOSButton();
    }
}
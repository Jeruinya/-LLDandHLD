package com.scaler.lldANDhld.factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory factory = flutter.createUIFactory("windows");
        factory.createButton();
        factory.createDropDown();

    }
}
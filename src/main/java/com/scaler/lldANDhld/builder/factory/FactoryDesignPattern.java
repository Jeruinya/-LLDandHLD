package com.scaler.lldANDhld.builder.factory;

import com.scaler.lldANDhld.service.Notification;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
}
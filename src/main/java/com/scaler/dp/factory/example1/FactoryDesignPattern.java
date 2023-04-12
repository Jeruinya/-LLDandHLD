package com.scaler.dp.factory.example1;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
}
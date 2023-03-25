package com.scaler.lldANDhld.factory;

import com.scaler.lldANDhld.service.EmailNotification;
import com.scaler.lldANDhld.service.Notification;
import com.scaler.lldANDhld.service.PushNotification;
import com.scaler.lldANDhld.service.SMSNotification;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
        case "SMS":
            return new SMSNotification();
        case "EMAIL":
            return new EmailNotification();
        case "PUSH":
            return new PushNotification();
        default:
            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
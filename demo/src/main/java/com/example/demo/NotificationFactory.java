package com.example.demo;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        if ("email".equals(channel)) {
            return new EmailNotification();
        } else if ("sms".equals(channel)) {
            return new SMSNotification();
        } else if ("app".equals(channel)) {
            return new AppNotification();
        }
        return null;
    }
}

package com.example.demo;

public class UrgentNotificationFactory implements Factory{

    @Override
    public EmailNotification createEmailNotification() {
        return new EmailNotification()
    }

    @Override
    public SMSNotification createSMSNotification() {
        return new SMSNotification();
    }

    @Override
    public AppNotification createAppNotification() {
        return new AppNotification();
    }
}

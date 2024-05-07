package com.example.demo;

public interface Factory {
    EmailNotification createEmailNotification();
    SMSNotification createSMSNotification();
    AppNotification createAppNotification();

}

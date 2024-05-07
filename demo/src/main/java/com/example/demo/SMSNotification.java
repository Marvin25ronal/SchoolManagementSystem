package com.example.demo;

public class SMSNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS notification: " + message);
    }
}

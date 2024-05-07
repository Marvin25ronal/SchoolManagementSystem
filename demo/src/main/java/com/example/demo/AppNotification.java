package com.example.demo;

public class AppNotification implements Notification{
    @Override
    public void sendMessage(String message) {
        System.out.println("App notification: " + message);
    }
}

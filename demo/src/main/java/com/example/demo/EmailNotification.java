package com.example.demo;

public class EmailNotification implements Notification{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email notification: " + message);
    }
}

package com.wxh.store;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotification implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("SMS: " +message );
    }
}

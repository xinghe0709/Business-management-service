package com.wxh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService notificationService;

    public NotificationManager(@Qualifier("SMS") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void send(String message,String recipient) {
        notificationService.send(message,recipient);
    }
}

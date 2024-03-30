package com.patika.notificationservice.strategy;

import com.patika.notificationservice.dto.enums.NotificationType;

public interface NotificationStrategy {
    void sendMessage(String message);

    NotificationType notificationType();
}
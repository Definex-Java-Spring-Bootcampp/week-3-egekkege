package com.patika.notificationservice.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.patika.notificationservice.dto.enums.NotificationType;

@Slf4j
@Component
public class EmailStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Notification sent to email: " + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
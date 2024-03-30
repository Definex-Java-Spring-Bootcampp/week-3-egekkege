package com.patika.notificationservice.strategy;

import lombok.extern.slf4j.Slf4j;
import com.patika.notificationservice.dto.enums.NotificationType;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MobileStrategy implements NotificationStrategy {
    @Override
    public void sendMessage(String message) {
        log.info("Notification sent to mobile: " + message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}
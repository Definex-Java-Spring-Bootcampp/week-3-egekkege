package com.patika.notificationservice.listener;

import com.patika.notificationservice.dto.NotificationDTO;
import lombok.extern.slf4j.Slf4j;
import com.patika.notificationservice.strategy.NotificationStrategy;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.patika.notificationservice.dto.enums.*;

import java.util.Map;

/**
 * A Spring component responsible for listening to notifications from a RabbitMQ queue and dispatching
 * them to the appropriate notification strategy based on the notification type.
 */
@Component
@Slf4j
public class NotificationListener {

    // A map storing notification strategies for different notification types
    private final Map<NotificationType, NotificationStrategy> sendNotificationByType;

    /**
     * Constructs the listener with a map of notification strategies.
     *
     * @param sendNotificationByType The map of notification strategies for different types
     */
    public NotificationListener(Map<NotificationType, NotificationStrategy> sendNotificationByType) {
        this.sendNotificationByType = sendNotificationByType;
    }

    /**
     * Sends a message using the appropriate notification strategy based on the type.
     *
     * @param message            The message to be sent
     * @param notificationType   The type of notification to be sent
     */
    public void sendMessage(String message, NotificationType notificationType) {
        // Retrieve the notification strategy for the given type
        NotificationStrategy notificationStrategy = sendNotificationByType
                .getOrDefault(notificationType, null);

        // Send the message using the strategy if found, otherwise log a warning
        if (notificationStrategy != null) {
            notificationStrategy.sendMessage(message);
        } else {
            log.warn("No notification strategy found for type: {}", notificationType);
        }
    }

    /**
     * Listens to incoming notifications from a RabbitMQ queue and invokes message sending.
     *
     * @param notificationDTO The notification data transfer object received from the queue
     */
    @RabbitListener(queues = "${rabbitmq.queue}")
    public void sendNotification(NotificationDTO notificationDTO) {
        // Log the received notification for debugging
        log.info("kuyruktan okudun: {}", notificationDTO);

        // Delegate message sending to the sendMessage method with appropriate arguments
        sendMessage(notificationDTO.getMessage(), notificationDTO.getNotificationType());
    }
}

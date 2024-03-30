package com.patika.notificationservice.strategy;

import com.patika.notificationservice.dto.enums.NotificationType;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * Spring configuration class responsible for creating a map of available notification strategies
 * for different notification types.
 */
@Configuration
@AllArgsConstructor
public class StrategyConfig {

    // A list of available notification strategies
    private final List<NotificationStrategy> notificationStrategies;

    /**
     * Creates a {@link Map} with {@link NotificationType} as keys and corresponding {@link NotificationStrategy} instances as values.
     *
     * @return A map of notification strategies mapped to their associated notification types
     */
    @Bean
    public Map<NotificationType, NotificationStrategy> sendNotificationByType() {
        // Create an EnumMap to efficiently map notification types to strategies
        Map<NotificationType, NotificationStrategy> messagesByType = new EnumMap<>(NotificationType.class);

        // Populate the map by iterating through available strategies
        notificationStrategies.forEach(notificationStrategy -> messagesByType.put(notificationStrategy.notificationType(), notificationStrategy));

        return messagesByType;
    }
}

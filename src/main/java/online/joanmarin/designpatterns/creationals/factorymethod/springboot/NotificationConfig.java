package online.joanmarin.designpatterns.creationals.factorymethod.springboot;

import online.joanmarin.designpatterns.creationals.factorymethod.java.product.EmailNotification;
import online.joanmarin.designpatterns.creationals.factorymethod.java.product.Notification;
import online.joanmarin.designpatterns.creationals.factorymethod.java.product.PushNotification;
import online.joanmarin.designpatterns.creationals.factorymethod.java.product.SMSNotification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Bean
    public Notification notificationService() {
        // Aquí se puede implementar lógica para seleccionar el tipo de servicio
        // de notificación basado en una configuración externa, por ejemplo.
        String type = "email"; // Esto podría venir de una propiedad o configuración externa
        switch (type) {
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                return new EmailNotification();
        }
    }
}

package online.joanmarin.designpatterns.creationals.factorymethod.java.factory;

import online.joanmarin.designpatterns.creationals.factorymethod.java.product.EmailNotification;
import online.joanmarin.designpatterns.creationals.factorymethod.java.product.Notification;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

package online.joanmarin.designpatterns.creationals.factorymethod.java.factory;

import online.joanmarin.designpatterns.creationals.factorymethod.java.product.Notification;
import online.joanmarin.designpatterns.creationals.factorymethod.java.product.PushNotification;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

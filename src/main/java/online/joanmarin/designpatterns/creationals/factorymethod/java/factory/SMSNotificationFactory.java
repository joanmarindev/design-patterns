package online.joanmarin.designpatterns.creationals.factorymethod.java.factory;

import online.joanmarin.designpatterns.creationals.factorymethod.java.product.Notification;
import online.joanmarin.designpatterns.creationals.factorymethod.java.product.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

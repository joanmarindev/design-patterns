package online.joanmarin.designpatterns.creationals.factorymethod.java.factory;

import online.joanmarin.designpatterns.creationals.factorymethod.java.product.Notification;

public abstract class NotificationFactory {
    public abstract Notification createNotification();
    public void performNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}

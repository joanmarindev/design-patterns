package online.joanmarin.designpatterns.creationals.factorymethod.java.product;

public class PushNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending push notification");
    }
}

package online.joanmarin.designpatterns.creationals.factorymethod.java.product;

public class SMSNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification");
    }
}

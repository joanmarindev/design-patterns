package online.joanmarin.designpatterns.creationals.factorymethod.java.product;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending email notification");
    }
}

package online.joanmarin.designpatterns.creationals.singleton.java;

public class UseDBConnect {
    public String connectToXDB(){
        return DBConnect.getInstance().connect();
    }
}

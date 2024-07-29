package online.joanmarin.designpatterns.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseDBConnectSB {
    @Autowired
    public DBConnectSB dbConnectSB;

    public String connect(){
        return dbConnectSB.connect();
    }
}

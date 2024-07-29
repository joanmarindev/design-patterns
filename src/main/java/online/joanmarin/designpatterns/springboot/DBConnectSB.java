package online.joanmarin.designpatterns.springboot;

import org.springframework.stereotype.Service;

@Service
public class DBConnectSB {
    public String connect(){
        return "DB connection created.";
    }
}

package online.joanmarin.designpatterns.creationals.singleton.springboot;

import org.springframework.stereotype.Service;

@Service
public class DBConnectSB {
    public String connect(){
        return "DB connection created.";
    }
}

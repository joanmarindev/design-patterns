package online.joanmarin.designpatterns.creationals.singleton.springboot;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DBConnectSB dbConnectSB(){
        return new DBConnectSB();
    }
}

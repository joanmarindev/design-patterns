package online.joanmarin.designpatterns.creationals.prototype.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DocumentConfig {
    @Bean
    @Scope("prototype")
    public Document wordDocument() {
        return new WordDocument("Default Word Content");
    }

    @Bean
    @Scope("prototype")
    public Document pdfDocument() {
        return new PDFDocument("Default PDF Content");
    }
}

package online.joanmarin.designpatterns.creationals.prototype.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DocumentManager {

    private final ApplicationContext context;

    @Autowired
    public DocumentManager(ApplicationContext context) {
        this.context = context;
    }

    public void createAndPrintDocuments() {
        Document wordDoc1 = context.getBean("wordDocument", Document.class); // Instancia 1
        Document wordDoc2 = context.getBean("wordDocument", Document.class); // Instancia 2

        wordDoc1.printContent(); // Output: Word Document: Default Word Content
        wordDoc2.printContent(); // Output: Word Document: Default Word Content
    }
}

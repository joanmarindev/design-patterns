package online.joanmarin.designpatterns.creationals.prototype.springboot;

public class PDFDocument implements Document{
    private final String content;
    public PDFDocument(String content){
        this.content = content;
    }
    @Override
    public void printContent() {
        System.out.println("PDF document content: " + content);
    }
}

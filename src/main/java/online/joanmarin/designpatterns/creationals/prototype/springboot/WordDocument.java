package online.joanmarin.designpatterns.creationals.prototype.springboot;

public class WordDocument implements Document{
    public final String content;
    public WordDocument(String content){
        this.content = content;
    }
    @Override
    public void printContent() {
        System.out.println("Word document content: " + content);
    }
}

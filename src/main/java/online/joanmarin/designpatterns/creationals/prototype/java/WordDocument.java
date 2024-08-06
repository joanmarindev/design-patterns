package online.joanmarin.designpatterns.creationals.prototype.java;

public class WordDocument implements Document{
    public final String content;
    public WordDocument(String content){
        this.content = content;
    }
    @Override
    public Document clone() {
        return new WordDocument(this.content);
    }

    @Override
    public void printContent() {
        System.out.println("Word document content: " + content);
    }
}

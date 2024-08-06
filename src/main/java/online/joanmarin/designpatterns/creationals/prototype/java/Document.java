package online.joanmarin.designpatterns.creationals.prototype.java;

//Lo primero será crear una interface común para todos los tipos de documentos
public interface Document extends Cloneable {
    //Nos aseguramos además, de crear la firma correspondiente a la clonación
    Document clone();
    //Puedes agregar otras firmas si lo deseas.
    void printContent();
}

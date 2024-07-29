package online.joanmarin.designpatterns.creationals.singleton.java;

public class DBConnect {
    //1. Creas una variable estática y privada que contiene la única instancia
    private static DBConnect instance;

    //2. El constructor debe ser privado
    private DBConnect(){}

    //3. Creas un método que obtenga la instancia validando para que, en caso de no existir aún, procedamos a crearla
    public static DBConnect getInstance(){
        if(instance == null)
            instance = new DBConnect();

        return instance;
    }

    //Aquí implementas tus métodos de conexión
    public String connect(){
        //TODO all your code here...

        return "DB connection created.";
    }

    public String disconnect(){
        //TODO all your code here...

        return "DB disconnected.";
    }
}

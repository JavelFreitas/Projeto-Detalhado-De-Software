package app;

public class App {
    public static void main(String[] args) throws Exception {
        DBSingleton sing = DBSingleton.getSingleton();
        
        sing.addUser("Joao");
        sing.addUser("Felipe");

        sing.sayAllNames();
    }
}
package app;

import java.util.ArrayList;

public class DBSingleton {
    private static DBSingleton singleton = new DBSingleton();
    private ArrayList<Usuario> usuarios;

    private DBSingleton() {
        usuarios = new ArrayList<Usuario>();
    }

    public void addUser(String name) {
        usuarios.add(new Usuario(name));
    }

    public void sayAllNames(){
        for (Usuario u : usuarios) {
            u.sayMyName();
        }
    }

    public static DBSingleton getSingleton(){
        return singleton;
    }
}
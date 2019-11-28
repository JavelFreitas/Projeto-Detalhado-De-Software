package main.app.generic;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        General<String> teste = new General<String>( new ArrayList<>() , "Lista de String");
        System.out.println(teste.name);
        ArrayList<String> t = new ArrayList<String>();
        t.add("Batata");
        teste.set(t);

    }
}
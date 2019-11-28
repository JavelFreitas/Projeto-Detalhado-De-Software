package app;

public class Usuario {
    String nome;

    Usuario(String name){
        nome = name;
    }

    public void sayMyName(){
        System.out.println("My name is: " + nome);
    }
    
}
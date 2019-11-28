package app;

public class Cliente implements ICliente{
    String nome;
    boolean temFornada;

    Cliente(String name){
        this.nome = name;
        this.temFornada = false;
    }

    public void mostrar(){
        System.out.println(this.nome + " fornada: " + this.temFornada);
    }

    public void update(boolean bool) {
        this.temFornada = bool;
    }
    
}
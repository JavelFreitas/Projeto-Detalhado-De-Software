package app.hello;

import java.util.ArrayList;

public abstract class NavioAbstrato implements INavio{
    private ArmaAbstrata arma1;
    private ArrayList<ArmaAbstrata> armas;
    private String nome;
    
    public NavioAbstrato(String name){
        this.arma1 = null;
        this.armas = new ArrayList<ArmaAbstrata>();
        this.nome = name;
    }

    public double atirar(){
        return arma1.darDano();
    }

    public void showArmas(){
        int index = 0;
        for(ArmaAbstrata arma: armas){
            System.out.println("Nº: " + index + "Nome: " + arma.getNome());
            index++;
        }
    }

    public void setArma1(int indexArma){
        this.arma1 = armas.get(indexArma); 
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
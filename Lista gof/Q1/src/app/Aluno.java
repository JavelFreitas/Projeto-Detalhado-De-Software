package app;

public class Aluno implements IObserver{
    protected int aNota;


    public void update(int nota) {
        this.aNota = nota;

    }

    public void mostrar(){
        System.out.println("A Nota = " + this.aNota);
    }
    
}
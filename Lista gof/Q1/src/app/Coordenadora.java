package app;

public class Coordenadora implements IObserver{
    protected int cNota;

    public void update(int nota) {
        this.cNota = nota;
    }

    public void mostrar() {
        System.out.println("C Nota = " + this.cNota);
    }
    
}
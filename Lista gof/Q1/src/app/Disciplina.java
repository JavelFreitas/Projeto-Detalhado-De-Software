package app;

import java.util.ArrayList;

/**
 * Disciplina
 */
public class Disciplina implements IDisciplina{
    private int nota;
    
    ArrayList<IObserver> observers;

    public Disciplina(){
        this.observers = new ArrayList<IObserver>();
    }
    
    public void setNota(int nota) {
        this.nota = nota;
        Notify();   
    }

    public void attache(IObserver o){ 
        observers.add(o);
        
    }

    public void detache(IObserver o){
        observers.remove(o);
    }

    public void Notify(){ // como o update do observador funciona
        for (IObserver obs : observers) {
            obs.update(this.nota);
        }
    }

    public void mostrarTudo(){
        for (IObserver o : observers) {
            o.mostrar();
        }
    }

    public int getNota() {
        return nota;
    }
}
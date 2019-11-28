package app;

public interface IDisciplina {

    public void attache(IObserver o); 
    public void detache(IObserver o);
    public void Notify();
}
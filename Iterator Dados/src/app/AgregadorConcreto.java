package app;

/**
 * AgregadorConcreto
 */
public class AgregadorConcreto implements Agregador{

    
    public IteradorConcreto criarIterator() {
        return new IteradorConcreto();
    }

    
}
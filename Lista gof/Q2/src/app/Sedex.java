package app;

/**
 * PAC
 */
public class Sedex implements IFrete {

    Sedex() {
        
    }

    public double calcularFrete(Produto produto) {
        return produto.getPreco() + (1.75*produto.getPeso());
        
    }
    
}
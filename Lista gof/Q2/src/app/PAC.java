package app;

/**
 * PAC
 */
public class PAC implements IFrete {
    PAC() {
        
    }

    public double calcularFrete(Produto product) {
        
        return product.getPreco() + 10;
    }
    
}
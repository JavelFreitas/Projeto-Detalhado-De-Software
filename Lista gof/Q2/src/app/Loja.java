package app;

import java.util.ArrayList;

/**
 * Loja
 */
public class Loja {
    ArrayList<Produto> produtos;

    Loja(){
        this.produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto novo){
        produtos.add(novo);
    }

    public double precoEnvio(IFrete frete, int index){
        return frete.calcularFrete(produtos.get(index));
    }

    public double precoTudo(){
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void mostrarProdutos(){
        for (Produto p : produtos) {
            System.out.println(p.mostrar());
        }
    }
    
}
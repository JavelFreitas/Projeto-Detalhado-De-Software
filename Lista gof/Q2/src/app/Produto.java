package app;

/**
 * Produto
 */
public class Produto {
    double preco;
    String nome;
    double peso;

    Produto(String name, double price, double weight){
        this.preco = price;
        this.nome = name;
        this.peso = weight;
    }

    public double getPreco() {
        return preco;
    }


    public double getPeso() {
        return peso;
    }

    public String mostrar(){
        return this.nome + ": " + this.preco + ", " + this.peso + "kg";
    }
    
}
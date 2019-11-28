package app;

public abstract class ProdutoAbstrato {
    
    public ProdutoAbstrato(String nom, double pes, double prec){
        this.nome = nom;
        this.peso = pes;
        this.preco = prec;
    }

    String nome;
    double peso;
    double preco;
}
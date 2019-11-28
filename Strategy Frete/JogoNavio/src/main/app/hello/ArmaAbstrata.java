package app.hello;

/**
 * ArmaAbstrata
 */
public abstract class ArmaAbstrata implements IAtirar {
    private double dano;
    private String nome;

    public ArmaAbstrata(double damage, String name) {
        this.dano = damage;
        this.nome = name;
    }

    public double darDano() {
        return dano;
    }

    public double getDano() {
        return dano;
    }
    
    public void setDano(double dano) {
        this.dano = dano;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
}
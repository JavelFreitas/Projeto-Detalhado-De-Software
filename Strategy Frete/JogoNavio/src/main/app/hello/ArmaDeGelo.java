package app.hello;

/**
 * ArmaDeGelo
 */
public class ArmaDeGelo extends ArmaAbstrata{
    private String efeito;
    
    public ArmaDeGelo(double damage,String name){
        super(damage, name);
        this.efeito = "congelar";
    }
    
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }
}
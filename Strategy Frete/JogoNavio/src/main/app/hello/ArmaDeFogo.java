package app.hello;

public class ArmaDeFogo extends ArmaAbstrata{
    private String efeito;
    
    public ArmaDeFogo(double damage, String name){
        super(damage, name);
        this.efeito = "ignicao";
    }
    
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }
}
package app.hello;

public class Ak47DeFogo extends ArmaDeFogo{
    String efeitoSecundario;
    public Ak47DeFogo() {
        super(45, "Ak47 de Fogo");
        this.efeitoSecundario = "contucao";
    }
    
    public String getEfeitoSecundario() {
        return efeitoSecundario;
    }
    
    public void setEfeitoSecundario(String efeitoSecundario) {
        this.efeitoSecundario = efeitoSecundario;
    }
}
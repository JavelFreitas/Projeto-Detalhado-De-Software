package app.hello;

public class GlockDeGelo extends ArmaDeGelo{
    String efeitoSecundario;
    public GlockDeGelo() {
        super(15, "Glock de Gelo");
        this.efeitoSecundario = "sangramento";
    }
    
    public String getEfeitoSecundario() {
        return efeitoSecundario;
    }
    
    public void setEfeitoSecundario(String efeitoSecundario) {
        this.efeitoSecundario = efeitoSecundario;
    }
}
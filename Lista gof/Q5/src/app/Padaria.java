package app;

import java.util.ArrayList;

public class Padaria implements IPadaria{
    ArrayList<ICliente> clientes;
    boolean novaFornada;
    
    
    public Padaria(){
        this.clientes = new ArrayList<ICliente>();
        this.novaFornada = false;
    }

    public void notificar() {
        for (ICliente icli : clientes) {
            icli.update(this.novaFornada);
            icli.mostrar();
        }   

    }

    public void setFornada(boolean bool) {
        this.novaFornada = bool;
    }

    public void fornadaFeita(){
        setFornada(true);
        notificar();
    }
    
    public void acabouFornada() {
        setFornada(false);
        notificar();
    }
    


    public void attache(ICliente cli) {
        this.clientes.add(cli);
    }

    public void detache(ICliente cli) {
        this.clientes.remove(cli);
    }
    
}
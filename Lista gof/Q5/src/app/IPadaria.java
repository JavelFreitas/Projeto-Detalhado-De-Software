package app;

public interface IPadaria {

    public void attache(ICliente cli);
    public void detache(ICliente cli);
    public void notificar(); 
    public void fornadaFeita();
    public void acabouFornada();

}
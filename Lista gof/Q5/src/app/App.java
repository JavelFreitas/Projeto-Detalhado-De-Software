package app;

public class App {
    public static void main(String[] args) throws Exception {
        IPadaria padaria = new Padaria();
        ICliente cli1= new Cliente("Joao");
        ICliente cli2= new Cliente("Carlos");
        
        padaria.attache(cli1);
        padaria.attache(cli2);

        padaria.notificar();

        System.out.println("\n");

        padaria.fornadaFeita();

        System.out.println("\n");

        padaria.acabouFornada();
    }
}
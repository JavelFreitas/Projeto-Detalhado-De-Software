package app;

public class App {
    public static void main(String[] args) throws Exception {
        IFabrica fabrica = new QuintaEstacao();
        IPizza pizza = fabrica.criaPizza("Mussarela");
        
        System.out.println(pizza.getValor());

        pizza = fabrica.criaPizza("Frango");
        System.out.println(pizza.getValor());
    }
}
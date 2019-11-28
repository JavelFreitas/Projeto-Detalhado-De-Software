package app;

/**
 * QuintaEstacao
 */
public class QuintaEstacao implements IFabrica{

    public IPizza criaPizza(String tipo) {
        switch (tipo) {
            case "Mussarela": return new Mussarela();
            case "Frango": return new Frango();
            default:
                System.out.println("Opcao nao reconhecida");
                break;
        }
        return null;
    }

    
}
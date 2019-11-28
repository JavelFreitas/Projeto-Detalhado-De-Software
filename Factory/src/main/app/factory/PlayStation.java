package main.app.factory;

public class PlayStation implements IFabrica{

    public Jogo criarJogos(String nomeJogo) {

        switch (nomeJogo) {
            case "The Last Of Us 2": return new TheLastOfUs2();
            case "God Of War": return new GodOfWar();
            case "Horizon Zero Dawn": return new HorizonZeroDawn();
            default:
                return new HorizonZeroDawn();
        }
        
    }

    public void mostrarJogos(){
        System.out.println("- Jogos:");
        System.out.println("- The Last Of Us 2");
        System.out.println("- God Of War");
        System.out.println("- Horizon Zero Dawn");
    }
    
}
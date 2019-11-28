package main.app.factory;

/**
 * XBox
 */
public class XBox implements IFabrica{

    public Jogo criarJogos(String nomeJogo) {
        switch (nomeJogo) {
            case "Gears Of War 4": return new GearsOfWar4(); 
            case "Sea Of Thieves": return new SeaOfThieves();
            default:
                return new SeaOfThieves();
        }
    }

    public void mostrarJogos() {
        System.out.println("- Jogos");
        System.out.println("- Gears Of War 4");
        System.out.println("- Sea Of Thieves");

    }

    
}
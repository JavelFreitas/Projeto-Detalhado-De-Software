package main.app.factory;

public class App {

    ControllerEscolhas control = new ControllerEscolhas();
    public static void main(String[] args) throws Exception {
        ControllerEscolhas control = new ControllerEscolhas();
        while (true){
            control.programExecution();
        }
        
        // IFabrica fab = new PlayStation();
        // Jogo jogo1 = fab.criarJogos("God Of War");
        // fab = new XBox();
        // Jogo jogo2 = fab.criarJogos("Gears Of War 4");
        // System.out.println(jogo1.nome);
        // System.out.println(jogo2.nome);

    }
}
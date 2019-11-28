package main.app.factory;

import java.util.Scanner;

/**
 * ControllerEscolhas
 */
public class ControllerEscolhas {
    IFabrica fabrica;
    Scanner scanner;
    
    public ControllerEscolhas(){
        this.fabrica = new PlayStation();
    }
    
    public void programExecution(){
        int op = 0;
        String option = "";
        
        while (true) {
            menuEscolhas();
            scanner = new Scanner(System.in);

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("- Escolha uma fabrica");
                    System.out.println("- PlayStation");
                    System.out.println("- XBox");

                    scanner = new Scanner(System.in);
                    option = scanner.nextLine();

                    escolherFabrica(option);
                    break;
                case 2:
                    fabrica.mostrarJogos();
                    scanner = new Scanner(System.in);
                    option = scanner.nextLine();
                    //Jogo jogo = fabrica.criarJogos(option);
                    
                    break;
                case 3:
                System.out.println("Saindo ... ... ... .. .. . ");
                    return;
                default:
                    System.out.println("Nao existe a Opcao " + op);
                    break;
            }

        }


    }

    public boolean escolherFabrica(String fabricaName){
        switch (fabricaName) {
            case "PlayStation":
                this.fabrica = new PlayStation();
                break;
            case "XBox": 
                this.fabrica = new XBox();
            default:
                this.fabrica = new XBox();
                break;
        }
        return true;
    }

    public void menuEscolhas(){
        System.out.println("Voce pode fazer as seguintes coisas:");
        System.out.println("1) Escolher uma Fabrica (Fabrica default é PlayStation)");
        System.out.println("2) Escolher um Jogo (Depende da fabrica)");
        System.out.println("3) Sair da Execucao");
    }
    
}
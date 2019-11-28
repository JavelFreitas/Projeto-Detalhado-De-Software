package app;

// import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {
    
        // Scanner input = new Scanner(System.in);
        // int op = input.nextInt();
        Agregador agregou = new AgregadorConcreto();
        IteradorConcreto iterando = agregou.criarIterator();
        for (int i = 1; i < 20; i++) {
            iterando.adicionarElemento(i);
        }

        System.out.println(iterando.getAtual());
        iterando.anterior();
        System.out.println(iterando.getAtual());
        iterando.proximo();
        System.out.println(iterando.getAtual());
        for (int i = 0; i < 5; i++) {
            iterando.proximo();
            System.out.println(iterando.getAtual());
        }
        System.out.println("\n");
        iterando.mostrarLista();





        // switch (op) {
        //     case 1:
                
        //         break;
        //     case 2:
                
        //         break;
        //     case 3:
                
        //         break;
                
        //     default:
        //         break;
        // }
    }
    

    public void menu(){
        System.out.println("Opcoes: ");
        System.out.println("1: adicionar numero à lista");
        System.out.println();
    }
}
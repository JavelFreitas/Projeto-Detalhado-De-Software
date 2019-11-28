package app;

public class App {
    public static void main(String[] args) throws Exception {
        Loja lolja = new Loja();
        Produto novo = new Produto("Macarrao", 2.90, 1.0);
        lolja.addProduto(novo);
        novo = new Produto("Queijo", 5.60, 3.0);
        lolja.addProduto(novo);
        novo = new Produto("Presunto", 7.40, 4.30);
        lolja.addProduto(novo);
        
        lolja.mostrarProdutos();

        System.out.println(lolja.precoTudo());
        
        IFrete frete = new PAC();

        System.out.println(lolja.precoEnvio(frete, 1));

        frete = new Sedex();

        System.out.println(lolja.precoEnvio(frete, 1));
        

        // while(op != 0){
        //     Scanner scan = new Scanner(System.in);
        //     op = scan.nextInt();
        //     switch (op) {
        //         case 1:
                    
        //             break;
            
        //         default:
        //             break;
        //     }
        //     scan.close();
        // }
    }
}
package main.app.decorator;

public class App {
    public static void main(String[] args) throws Exception {        
        
        SanduicheAbstrato batata = new PaoDeBatata();

        SanduicheAbstrato presunto = new Presunto(batata);

        SanduicheAbstrato presunto2 = new Presunto(presunto);

        SanduicheAbstrato queijo = new Queijo(presunto2);

        SanduicheAbstrato frango = new Frango(queijo);

        System.out.println(frango.getCusto());

    }
}
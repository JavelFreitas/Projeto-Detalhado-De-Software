package main.app.decorator;

public class Frango extends DecoratorIngrediente{

    public Frango(SanduicheAbstrato sanduiche2){
        super(sanduiche2);
        this.custo = 4;
    }
    public float getCusto() {
        return this.custo + sanduiche.getCusto();
    }

    
}
package main.app.decorator;


public class Queijo extends DecoratorIngrediente{
    public Queijo(SanduicheAbstrato sanduiche2){
        super(sanduiche2);
        this.custo = 2;
    }

    public float getCusto() {
        return this.custo + sanduiche.getCusto();
    }
}
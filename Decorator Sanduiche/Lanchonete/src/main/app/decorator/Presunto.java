package main.app.decorator;


public class Presunto extends DecoratorIngrediente{
    public Presunto(SanduicheAbstrato sanduiche2){
        super(sanduiche2);
        this.custo = 3;
    }

    public float getCusto() {
        return this.custo + sanduiche.getCusto();
    }
}
package main.app.decorator;

public class DecoratorIngrediente extends SanduicheAbstrato{
    SanduicheAbstrato sanduiche;

    DecoratorIngrediente(SanduicheAbstrato sanduiche2){
        this.sanduiche = sanduiche2;
    }

    public float getCusto() {
        return this.custo + sanduiche.getCusto();
    }
}
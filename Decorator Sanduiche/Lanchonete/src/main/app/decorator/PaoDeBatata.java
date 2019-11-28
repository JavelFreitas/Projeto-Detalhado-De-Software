package main.app.decorator;

public class PaoDeBatata extends SanduicheAbstrato{
    
    public PaoDeBatata(){
        this.custo = 2;
    }


    public float getCusto() {
        return this.custo;

    }
}
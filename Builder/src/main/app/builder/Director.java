package main.app.builder;

public class Director {
    BuilderPizza buipi;

    public void setPizzaBuilder(BuilderPizza newBuilder){
        this.buipi = newBuilder;
    }

    public Pizza getPizza(){
        return buipi.getPizza();
    }

    public void constructPizza(){
        buipi.createNewPizza();
        buipi.buildSabor();
    }
    
}
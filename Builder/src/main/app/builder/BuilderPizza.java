package main.app.builder;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void createNewPizza(){
        pizza = new Pizza();
    }

    public abstract void buildSabor();
    
}
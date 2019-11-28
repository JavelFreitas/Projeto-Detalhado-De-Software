package main.app.builder;

public class App {
    public static void main(String[] args) throws Exception {
        BuilderPizza cala = new PizzaCalabresa();
        
        Director brownie = new Director();
        brownie.setPizzaBuilder(cala);
        brownie.constructPizza();
        
        
        Pizza pizza = brownie.getPizza();
        BuilderPizza choco = new PizzaChocolate();
        
        

        System.out.println(pizza.sabor);
        brownie.setPizzaBuilder(choco);
        brownie.constructPizza();
        pizza = brownie.getPizza();
        System.out.println(pizza.sabor); 
        
    }
}
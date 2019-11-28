package main.app.dice_structure;


public class D6 implements IRandomSorter{
    String name;
    int sides;

    public D6(){
        this.name = "D6";
        this.sides = 6;
    }
    
    public int getRandomInteger() {
        int randomNumber = 1 + (int)(Math.random() * 6);
        return randomNumber;
    }

    
}
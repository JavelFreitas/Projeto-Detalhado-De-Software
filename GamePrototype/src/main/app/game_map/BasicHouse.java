package main.app.game_map;

public class BasicHouse extends AbstractHouse{

    
    public BasicHouse(int pos) {
        super(pos);
    }

    public String toString() {
        return new String("[B: " + Integer.toString(position) + "]");
    }
    
}
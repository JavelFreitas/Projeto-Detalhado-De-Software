package main.app.game_map;

public abstract class AbstractHouse {
    int position;
    
    public AbstractHouse(int pos){
        this.position = pos;
    }
    
    public abstract String toString();

    public int getPosition() {
        return position;
    }
}
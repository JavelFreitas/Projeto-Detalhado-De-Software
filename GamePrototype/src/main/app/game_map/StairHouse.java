package main.app.game_map;

public class StairHouse extends AbstractHouse{
    int lastStep;

    public StairHouse(int pos, int step) {
        super(pos);
        this.lastStep = step;
    }

    @Override
    public String toString() {
        return new String("{St: " + Integer.toString(position) + " up to: " + Integer.toString(lastStep) + "}");
    }
    
}
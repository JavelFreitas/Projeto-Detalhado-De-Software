package main.app.game_map;

public class SnakeHouse extends AbstractHouse{
    int tailPosition;

    public SnakeHouse(int pos, int tail) {
        super(pos);
        this.tailPosition = tail;
    }

    public String toString() {
        return new String("(Sn: " + Integer.toString(position) + " down to: " + Integer.toString(tailPosition) + ")");
    }
}
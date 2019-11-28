package main.app.game_map;

import java.util.ArrayList;

public class Map {
    ArrayList<AbstractHouse> houses;

    public Map(){
        this.houses = new ArrayList<AbstractHouse>();
        setHouses();
    }

    private void setHouses() {
        int positioning = 0;

        for (int i = 1; i < 101; i++) {
            int houseType = 1 + (int)(Math.random() * 10);//TODO Create a class with a randomizer for choices, using the IRandomSorter;
            if(houseType > 2){
                houseType = 3; 
            }
            if(i > 90 && houseType == 2){
                houseType = 1 + (int)(Math.random() * 2);
            }
            if(i == 1 || i == 100){
                houseType = 3;
            }
            
            switch (houseType) {
                case 1:
                    positioning = (int) (i < 20 ? (i - 1) : 20); 
                    int tail = ((i-1) - (int)(Math.random() * positioning));
                    AbstractHouse snake = new SnakeHouse(i, tail);
                    houses.add(snake);
                    break;
                case 2:
                    positioning = (int) (i > 91 ? (99 - (i+1)) : 10);
                    int step = ((i+1) + (int)(Math.random() * positioning));
                    
                    AbstractHouse stair = new StairHouse(i, step);
                    houses.add(stair);
                    break;
                case 3:
                    AbstractHouse basic = new BasicHouse(i);
                    houses.add(basic);
                    break;
                default:
                    break;
            }

        }

    }

    public void showMap() {
        System.out.println("Showing Map: \n");

        int lastElement = 0;
        for (AbstractHouse house : houses) {
            if(lastElement == 10){
                lastElement = 0;
                System.out.println("\n");
            }
            lastElement++;
            System.out.println(house.toString());
        }
        return ;
    }
    
}
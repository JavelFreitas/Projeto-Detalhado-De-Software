package main.app.game_root;

import java.util.Scanner;

public class FirstInterfaceController {

    public void menu(){

        System.out.println("Options available");
        System.out.println("1 - Start Game");
        System.out.println("2 - Show Menu");
        System.out.println();
    }
    public void shell(int line) throws Exception {// FIXME Too much if statements, how to reduce them?
        menu();
        switch (line) {
            case 1:
                
                break;
            case 2:
                menu();
                break;

            default:
            throw new Exception();
            
        }
    }

    public void execution(){

        Scanner scanInput = new Scanner(System.in);
        int option = scanInput.nextInt();

        while(true){

            if(option == 0){
                break;
            }
            try {
                shell(option);
            } catch (Exception e) {
                System.out.println("Something went wrong:");
            }
        }

        scanInput.close();

        System.out.println("Closing Game ... .. .. . . .");

    }
    
}
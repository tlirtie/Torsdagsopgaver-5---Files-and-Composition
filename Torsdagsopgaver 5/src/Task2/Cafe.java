package Task2;

import java.util.*;
import java.io.*;

public class Cafe {

    private ArrayList<String> coffeeMenu;

    public Cafe(){
        coffeeMenu = new ArrayList<>(); // Initialize the ArrayList
    }

    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }

    public void loadMenuData(){

        File file = new File("src/Task2/coffees.txt");

        try{
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                coffeeMenu.add(fileScanner.nextLine());
            }
            fileScanner.close();
            System.out.println("done");
        } catch (Exception FileNotFoundError) {
            System.out.println("Filen blev ikke fundet");
        }
    }
}

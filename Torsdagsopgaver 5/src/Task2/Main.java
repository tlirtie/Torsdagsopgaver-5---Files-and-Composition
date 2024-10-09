package Task2;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args){
        Cafe caf1 = new Cafe();
        caf1.loadMenuData();

        ArrayList<String> coffeeMenu = caf1.getCoffeeMenu();

        for (String c : coffeeMenu){
            System.out.println(c);
        }
    }
}

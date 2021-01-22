package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    public static void main (String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();
        Date currentDate = new Date(2021, 00, 11);

        MenuItem veganTaco = new MenuItem(5.50, "Vegan Taco: A delicious vegan taco",
                "Main Course", true);

        menu.add(veganTaco);

        MenuItem fajitas = new MenuItem(10.50, "Fajitas: Sizzling fajitas",
                "Main Course", false);

        menu.add(fajitas);

        MenuItem nachos = new MenuItem(7.50, "Nachos: A huge plate of loaded nachos",
                "Appetizer", false);

        menu.add(nachos);



        //Code for the menu to print out to the console:
        System.out.println("This menu was last updated on: " + currentDate);

        for (int i = 0; i < menu.size(); i++) {
            System.out.println("Ask for the #" + i + "!");
            System.out.println("Price $" + menu.get(i).getPrice());
            System.out.println(menu.get(i).getDescription());
            System.out.println(menu.get(i).getCategory());
            if (menu.get(i).getNewItem() == true) {
                System.out.println("This is a new item!");
            }
        }

    }
}

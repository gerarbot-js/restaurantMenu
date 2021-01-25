package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    // Class Variables
    private ArrayList<MenuItem> menu = new ArrayList<>();
    private Date lastUpdated;

    // Constructors
    public Menu() { this.lastUpdated = new Date(); }

    // Methods
    // Getters and Setters
    public ArrayList<MenuItem> getMenu() { return this.menu; }

    public void setMenu(ArrayList<MenuItem> aMenuItems) { this.menu = aMenuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }

    public void setLastUpdated(Date aDate) { this.lastUpdated = aDate; }

    // Other Methods
    public void addMenuItem(MenuItem item) {
        // Add to the list of menu items if item is not a duplicate
        if (!this.menu.contains(item))
        this.menu.add(item);

        else System.out.println(item.getName() + " is a duplicate menu item and was not added a second" +
                " time to the menu.");

        // update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        // Remove from the list of menu items
        this.menu.remove(item);

        // update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "Menu last updated on: " + this.lastUpdated + "\n\n";

        // for menuItem in menu
        for (MenuItem item : this.menu) {
            // menu.printOutMenuItem();
            returnString += item.toString() + "\n";
        }
        return returnString;
        }
}






/*
    public static void main (String[] args) {
        ArrayList<MenuItem> menu = new ArrayList<>();
        Date currentDate = new Date(2021, 00, 11);

        MenuItem veganTaco = new MenuItem("Vegan Taco", "Vegan Taco: A delicious vegan taco", 5.50,
                "Main Course", true);

        menu.add(veganTaco);

        MenuItem fajitas = new MenuItem("Fajitas", "Fajitas: Sizzling fajitas", 10.50,
                "Main Course", false);

        menu.add(fajitas);

        MenuItem nachos = new MenuItem("Nachos", "Nachos: A huge plate of loaded nachos", 7.50,
                "Appetizer", false);

        menu.add(nachos);



        //Code for the menu to print out to the console:
        System.out.println("This menu was last updated on: " + currentDate);

        for (int i = 0; i < menu.size(); i++) {
            System.out.println("******\nAsk for the #" + i + "!");
            System.out.println("Price $" + menu.get(i).getPrice());
            System.out.println(menu.get(i).getDescription());
            System.out.println(menu.get(i).getCategory());
            if (menu.get(i).getNewItem() == true) {
                System.out.println("This is a new item!");
            }
        }

    }

 */


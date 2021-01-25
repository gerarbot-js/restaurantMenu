package restaurant;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Fajitas", "A sizzling plate of fajitas served with guacamole, beans, and rice.",10.50,
                "Main Course", false);
        MenuItem item2 = new MenuItem("Fajitas", "A sizzling plate of fajitas served with guacamole, beans, and rice.",10.50,
                "Main Course", false);
        MenuItem item3 = new MenuItem("Flan", "A classic Mexican dessert",6.50,
                "Dessert", false);

        // Create restaurantMenu object
        Menu restaurantMenu = new Menu();

        // Add menu items to restaurantMenu object
        restaurantMenu.addMenuItem(item1);
        restaurantMenu.addMenuItem(item2);
        restaurantMenu.addMenuItem(item3);

        // print out restaurantMenu object with all items
        System.out.println(restaurantMenu.toString());

        // print out an individual item from restaurantMenu
        System.out.println("This is an individual menu item: \n" + item1.toString());

        // Remove menu item from restaurantMenu object
        restaurantMenu.removeMenuItem(item1);

        // print out restaurantMenu object with item removed;
        System.out.println(restaurantMenu);

        /*
        // Test out the toString method
        System.out.println(item1.toString());
        System.out.println(item2.toString());

        // Test out the equals method
        System.out.println(item1.equals(item3));
         */
    }
}

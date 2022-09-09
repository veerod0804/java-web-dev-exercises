package Studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem hamburger = new MenuItem("Hamburger", 5.99, "hamburger with onion, pickle, tomato, lettuce", "entree", false);
        MenuItem cheeseburger = new MenuItem("Cheeseburger", 6.99, "cheeseburger with onion, pickle, tomato, lettuce", "entree", false);
        MenuItem cheesecake = new MenuItem("Cheesecake", 4.99, "new york style cheesecake", "dessert", true);

        ArrayList<MenuItem> ourMenu = new ArrayList<>();
        Date updatedDate = new Date();

        Menu newMenu = new Menu(ourMenu, updatedDate);

        newMenu.addItem(hamburger);
        newMenu.addItem(cheeseburger);
        newMenu.addItem(cheesecake);

        newMenu.printMenu();
    }
}

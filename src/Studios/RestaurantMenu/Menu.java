package Studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    private HashMap<String, ArrayList<MenuItem>> items;

    public Menu(HashMap<String, ArrayList<MenuItem>> items) {
        this.items = items;
    }

    public HashMap<String, ArrayList<MenuItem>> getItems() {
        return items;
    }

    public void setItems(HashMap<String, ArrayList<MenuItem>> items) {
        this.items = items;
    }
}


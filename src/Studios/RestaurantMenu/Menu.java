package Studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date updatedDate;

    public Menu(ArrayList<MenuItem> items, Date updatedDate) {
        this.items = items;
        this.updatedDate = updatedDate;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public ArrayList<MenuItem> addItem(MenuItem addedItem) {
        this.items.add(addedItem);
        return this.items;
    }

    public ArrayList<MenuItem> deleteItem(MenuItem deletedItem) {
        this.items.remove(deletedItem);
        return this.items;
    }

    public void printMenu() {
        String myString = "";
        for (MenuItem item: this.items) {
            myString += item.getName() + ":" + item.getPrice() + "\n";
        }
        System.out.println(myString);
    }

}


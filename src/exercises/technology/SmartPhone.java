package exercises.technology;

import java.util.HashMap;

public class SmartPhone extends Computer{
    //add 1 additional property and method

    private HashMap<String, String> contactBook;

    public  SmartPhone(int storage, int CPU, boolean hasPhysicalKeyboard) {
        super(storage, CPU, hasPhysicalKeyboard);
    }

    public void addContact(String name, String phoneNumber) {
        contactBook.put(name, phoneNumber);
    }
}

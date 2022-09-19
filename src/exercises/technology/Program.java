package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(2, 3, true, 5);
        SmartPhone mySmartPhone = new SmartPhone(1, 3, false);
        System.out.println("my laptop has: " + myLaptop.getStorage() + " storage and " + myLaptop.getCPUlockSpeed() + " CPU lockSpeed and has a physical keyboard: " + myLaptop.isHasPhysicalKeyboard());
        System.out.println("my smartPhone has: " + mySmartPhone.getStorage() + " storage and " + mySmartPhone.getCPUlockSpeed() + " lockSpeed");

//        mySmartPhone.addContact("Victoria", "618-402-2431");

    }
}

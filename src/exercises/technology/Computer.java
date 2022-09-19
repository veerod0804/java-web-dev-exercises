package exercises.technology;

public class Computer extends AbstractEntity{
    //list 3 properties
    private int storage;
    private int CPUlockSpeed;
    private boolean hasPhysicalKeyboard;

    //list a constructor

public Computer(int storage, int CPU, boolean hasPhysicalKeyboard) {
    super();
    this.storage = storage;
    this.CPUlockSpeed = CPU;
    this.hasPhysicalKeyboard = hasPhysicalKeyboard;
    }

    public int getStorage() {
        return storage;
    }

    public int getCPUlockSpeed() {
        return CPUlockSpeed;
    }

    public boolean isHasPhysicalKeyboard() {
        return hasPhysicalKeyboard;
    }

    // list 2 methods
    public void increaseStorage(int amountIncreasing) {
    this.storage = this.storage + amountIncreasing;
    };

    public static void clean() {

    };
//    public void
}

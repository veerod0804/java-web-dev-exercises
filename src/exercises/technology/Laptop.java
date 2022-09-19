package exercises.technology;

public class Laptop extends Computer {
    //add 1 additional property and method

//    Laptop myLaptop = new Laptop();

    private int weight;

    Laptop(int storage, int CPU, boolean hasPhysicalKeyboard, int weight) {
        super(storage, CPU, hasPhysicalKeyboard);
        this.weight = weight;
    }
@Override
    public String toString() {
        return "This is a laptop with" + this.toString();
}

}

package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas have been consumed?");
        Double gallonsConsumed = input.nextDouble();

        Double milesPerGallon =  milesDriven / gallonsConsumed;
        System.out.println("Your have driven at " + milesPerGallon + "miles per gallon");
    }
}

package exercises;
import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double rectangleLength = input.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double rectangleWidth = input.nextDouble();

        Double rectangleArea =  rectangleLength * rectangleWidth;
        System.out.println("The rectangle's area is: " + rectangleArea);
    }
}

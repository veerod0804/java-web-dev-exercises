package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("apple");
        arr.add("cat");
        arr.add("mouse");

        System.out.println(letterCount(arr));
    }

    public static String letterCount(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("What word length would you like to sort by?");
        int sortLength = input.nextInt();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).length() == sortLength) {
                System.out.println(arr.get(i));

            }
        }
        return null;
    }

}


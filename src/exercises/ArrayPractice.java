package exercises;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] practiceArray = {1, 1, 2, 3, 5, 8};

        for (int integer: practiceArray) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}

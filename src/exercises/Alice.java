package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice '" +
                "without pictures or conversation?'";

        System.out.println("Search for a term within the first sentence of 'Alice's Adventures in Wonderland'.");
        String searchTerm = input.nextLine().toLowerCase();
        System.out.println(firstSentence.toLowerCase().contains(searchTerm.trim()));

        //problem 5:
        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}

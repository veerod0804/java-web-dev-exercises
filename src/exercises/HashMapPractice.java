package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentID;
        String studentName;

        System.out.println("Enter the student's Name (or ENTER to finish): ");

        do {
            System.out.println("Student Name: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.print("Student ID: ");
                studentID = input.nextInt();
                students.put(studentID, studentName);

                input.nextLine();
            }
        } while (!studentName.equals(""));

        input.close();
        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
        System.out.println("Number of students in roster: " + students.size());

    }
}

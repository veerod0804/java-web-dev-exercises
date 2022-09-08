package org.launchcode.java.demos.lsn3classes1;

import org.launchcode.java.demos.lsn3classes1.school.Course;
import org.launchcode.java.demos.lsn3classes1.school.Teacher;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {

        Student Victoria = new Student("Victoria", 1, 1, 4.0);
        Teacher Paul = new Teacher("Paul", "Smith", "Math", 5);
//        Course Math = new Course(Paul, "Math", enrolledStudents);

        System.out.println(Victoria.getGpa());
        System.out.println(Paul.getSubject());
    }
}



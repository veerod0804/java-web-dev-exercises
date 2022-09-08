package org.launchcode.java.demos.lsn3classes1.school;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.util.ArrayList;

public class Course {
        private Teacher instructor;
        private String courseTitle;
        private ArrayList<Student> enrolledStudents;

    public Course(Teacher instructor, String courseTitle, ArrayList<Student> enrolledStudents) {
        this.instructor = instructor;
        this.courseTitle = courseTitle;
        this.enrolledStudents = enrolledStudents;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}


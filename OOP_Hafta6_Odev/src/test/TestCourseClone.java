package test;

import istiklal.edu.tr.Course;

public class TestCourseClone {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        course1.addStudent("Ali");
        course1.addStudent("Ayse");

        Course course2 = (Course) course1.clone();
        course2.addStudent("Mehmet");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
    }
}
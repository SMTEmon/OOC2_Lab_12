package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1: Initialize DataStore
        DataStore<Student> studentStore = new DataStore<>();

        // Add sample students
        studentStore.add(new Student("101", "Alice", 3.8, "Female"));
        studentStore.add(new Student("102", "Bob", 3.5, "Male"));
        studentStore.add(new Student("103", "Charlie", 3.9, "Male"));
        studentStore.add(new Student("104", "Diana", 3.7, "Female"));
        studentStore.add(new Student("105", "Eve", 4.0, "Female"));

        // Task 2: Sort Student Records according to GPA (Descending)
        List<Student> students = studentStore.getAll();
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("--- Students sorted by GPA (Descending) ---");
        students.forEach(System.out::println);

        // Task 3: Search the Student Records for a particular student (by name)
        String ID = "101";
        System.out.println("\n--- Searching for student: " + ID + " ---");
        System.out.println(studentStore.getById(ID));

        // Task 4: Group the students into two lists by their gender
        List<Student> femaleStudents = studentStore.getByGender("Female");
        List<Student> maleStudents = studentStore.getByGender("Male");
        System.out.println("\n--- Students grouped by Gender ---");
        System.out.println("Female Students: " + femaleStudents);
        System.out.println("Male Students: " + maleStudents);
    }

}

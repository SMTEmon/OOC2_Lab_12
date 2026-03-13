package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Task 1
        DataStore<Student> studentStore = new DataStore<>();
        studentStore.add(new Student("101", "Alice", 3.8, "Female"));
        studentStore.add(new Student("102", "Bob", 3.5, "Male"));
        studentStore.add(new Student("103", "Charlie", 3.9, "Male"));
        studentStore.add(new Student("104", "Diana", 3.7, "Female"));
        studentStore.add(new Student("105", "Eve", 4.0, "Female"));

        // Task 2
        System.out.println("--- Students sorted by GPA (Descending) ---");
        displaySorted(studentStore.getAll());

        // Task 3
        System.out.println("\n--- Searching for student ID: 101 ---");
        studentStore.findFirst(s -> s.getId().equals("101"))
                .ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));

        // Task 4
        System.out.println("\n--- Students grouped by Gender ---");
        groupAndDisplay(studentStore.getAll());
    }

    // Helper for Task 2
    public static void displaySorted(List<Student> students) {
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .forEach(System.out::println);
    }

    // Helper for Task 4
    public static void groupAndDisplay(List<Student> students) {
        Map<String, List<Student>> grouped = students.stream()
                .collect(Collectors.groupingBy(Student::getGender));

        grouped.forEach((gender, list) -> System.out.println(gender + ": " + list));
    }
}

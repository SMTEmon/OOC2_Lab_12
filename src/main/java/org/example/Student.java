package org.example;

public class Student {
    private String id;
    private String name;
    private double gpa;
    private String gender;

    public Student(String id, String name, double gpa, String gender) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.gender = gender;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Student[ID=%s, Name=%s, GPA=%.2f, Gender=%s]", id, name, gpa, gender);
    }
}

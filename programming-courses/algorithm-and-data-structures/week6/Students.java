package week6;

public class Students {
    String name;
    int entryYear;
    int age;
    double gpa;

    Students(String n, int y, int a, double g) {
        name = n;
        entryYear = y;
        age = a;
        gpa = g;
    }

    void print() {
        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", name, entryYear, age, gpa);
        // System.out.println("Name: " + name);
        // System.out.println("Entry Year: " + entryYear);
        // System.out.println("Age: " + age);
        // System.out.println("GPA: " + gpa);
    }
}

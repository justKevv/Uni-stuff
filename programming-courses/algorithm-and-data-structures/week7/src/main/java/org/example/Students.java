package org.example;

import net.datafaker.providers.base.IdNumber;

public class Students {
    int nim, age;
    String name;
    double gpa;

    Students(int nim, String name, int age, double gpa) {
        this.nim = nim;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void display() {
        System.out.printf("| %-10s | %-20s | %-10s | %-10s |%n", nim, name, age, gpa);
    }
}

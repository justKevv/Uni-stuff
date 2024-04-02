package org.example;

import java.util.Random;
import java.util.Scanner;

import net.datafaker.Faker;

public class MainStudent {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();
        Faker faker = new Faker();
        SearchStudent data = new SearchStudent();

        for (int i = 0; i < data.listStd.length; i++) {
            Students student = new Students(r.nextInt(1000, 3000), faker.name().fullName(), r.nextInt(17, 20), (Math.random() * 4.1));
            data.add(student);
        }

        System.out.println("+-------------------------------+");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s |%n", "NIM", "Name", "Age", "GPA");
        System.out.println("+-------------------------------+");
        data.display();
        System.out.println("+-------------------------------+");
        System.out.println("Enter the NIM you want to search: ");
        int search = data.listStd[r.nextInt(data.listStd.length)].nim;
        System.out.println(search);
        System.out.println("Sequential Search");
        int pos = data.findSeqSearch(search);
        data.showPosition(search, pos);
        data.showData(search, pos);
    }
}


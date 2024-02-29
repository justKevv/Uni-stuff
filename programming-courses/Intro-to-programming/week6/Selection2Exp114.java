package week6;

import java.util.Scanner;

public class Selection2Exp114 {
    public static void main(String[] args) {
        int year;
        Scanner input14 = new Scanner(System.in);

        System.out.print("Enter the year : ");
        year = input14.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("A Leap Year");
            } else {
                if (year % 400 == 0 ) {
                    System.out.println("A Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            }
        } else {
            System.out.println("Not a Leap Year");
        }

    }
}

package week5;

import java.util.Scanner;

public class MainSquared {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("+-----------------------------------+");
        System.out.print("Input the number of elements you want to count: ");
        int elements = sc.nextInt();

        Squared[] png = new Squared[elements];

        for (int i = 0; i < elements; i++) {
            png[i] = new Squared(0, 0);
            System.out.print("Input the data value to-" + (i + 1) + ": ");
            png[i].num = sc.nextInt();
            System.out.print("Input the squared value to-" + (i + 1) + ": ");
            png[i].squared = sc.nextInt();
            png[i] = new Squared(png[i].num, png[i].squared);
        }

        System.out.println("+-----------------------------------+");
        System.out.println("Results with Brute Force Squared");
        for (int i = 0; i < elements; i++) {
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is: "
                    + png[i].SquaredBF(png[i].num, png[i].squared));
        }

        System.out.println("+-----------------------------------+");
        System.out.println("Results with Divide and Conquer Squared");
        for (int i = 0; i < elements; i++) {
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is: "
                    + png[i].SquaredDC(png[i].num, png[i].squared));
        }

 
    }
}

package week5;

import java.util.Scanner;

public class MainSquared {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("+-----------------------------------+");

        Squared[] png = new Squared[2];

        png[0] = new Squared(2, 2);
        png[1] = new Squared(3, 9);

        System.out.println("+-----------------------------------+");
        System.out.println("Results with Brute Force Squared");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is: "
                    + png[i].SquaredBF(png[i].num, png[i].squared));
        }

        System.out.println("+-----------------------------------+");
        System.out.println("Results with Divide and Conquer Squared");
        for (int i = 0; i < png.length; i++) {
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is: "
                    + png[i].SquaredDC(png[i].num, png[i].squared));
        }

    }
}

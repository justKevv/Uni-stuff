package week14;

import java.util.Scanner;

public class PowerRecursive14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input Base Number: ");
        int base = sc.nextInt();
        System.out.print("Input Power Number: ");
        int pow = sc.nextInt();
        
        System.out.println("Result of "+base+"^"+pow+" = "+calculatePower(base, pow));

        printPower(base, pow);
    }
    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        return base * calculatePower(base, pow - 1);
    }

    static void printPower(int base, int pow) {
        String series = "";
        for (int i = 0; i < pow; i++) {
            series += base;
            if (i < pow - 1) {
                series += "x";
            }
        }
        series += "x1";
        System.out.println(series + " = " + calculatePower(base, pow));
    }
}

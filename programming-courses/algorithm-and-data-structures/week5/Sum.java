package week5;

import java.util.Scanner;

public class Sum {
    public int elemen;
    public double profit[];
    public double total;

    public Sum(int elemen) {
        this.elemen = elemen;
        profit = new double[elemen];
        total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=====================================================");
        System.out.println("Program for calculating total profits");
        System.out.print("Input how many company you want to calculate: ");
        int companyCount = inp.nextInt();
        Sum[] sm = new Sum[companyCount];

        System.out.println("=====================================================");
        System.out.print("Input the number of month : ");
        int totElemn = inp.nextInt();

        for (int i = 0; i < companyCount; i++) {
            sm[i] = new Sum(totElemn);
        }

        System.out.println("=====================================================");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Company " + (i + 1));
            for (int j = 0; j < sm[0].elemen; j++) {
                System.out.println("Input the profit of the month to - " + (i + 1) + " = ");
                sm[i].profit[j] = inp.nextDouble();
            }
        }

        System.out.println("=====================================================");
        System.out.println("Algorithm brute force");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total profits of company " + (i + 1) + " for " + sm[i].elemen + " month is = "
                    + sm[i].totalBF(sm[i].profit));
        }

        System.out.println("=====================================================");
        System.out.println("Algorithm divide and conquer");
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Total profits of company " + (i + 1) + " for " + sm[i].elemen + " month is = "
                    + sm[i].totalDC(sm[i].profit, 0, sm[i].elemen - 1));
        }
    }
}

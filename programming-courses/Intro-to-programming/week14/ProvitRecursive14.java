package week14;

import java.util.Scanner;

public class ProvitRecursive14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter balance: ");
        double initialBalance = sc.nextInt();
        System.out.println("Enter Invesment period: ");
        int investPeriod = sc.nextInt();
        
        System.out.println("Balance after "+investPeriod+" years: "+calculateProfit(initialBalance, investPeriod));
    }
    static double calculateProfit(double balance, int period) {
        if (period == 0) {
            return balance;
        } else {
            return 1.11 * calculateProfit(balance, period-1);
        }
    }
}

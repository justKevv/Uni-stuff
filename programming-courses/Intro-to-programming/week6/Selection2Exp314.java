package week6;

import java.util.Scanner;

public class Selection2Exp314 {
    public static void main(String[] args) {
        String category;
        int income = 0;
        double tax =0;
        int netcome;

        Scanner input14 = new Scanner(System.in);

        System.out.println("Category list : ");
        System.out.println("1. Workers");
        System.out.println("2. Bussiness man");

        System.out.print("Enter your category : ");
        category = input14.nextLine();


        if (category.equals("1")) {
            System.out.print("Enter your income : ");
            income = input14.nextInt();
            if (income <= 200000) {
                tax = 0.1;
            } else if (income <= 300000) {
                tax = 0.15;
            } else {
                tax = 0.2;
            }
        } else if (category.equals("2")) {
            System.out.print("Enter your income : ");
            income = input14.nextInt();
            if (income <= 2500000) {
                tax = 0.15;
            } else if (income <= 3500000) {
                tax = 0.2;
            } else {
                tax = 0.25;
            }
        } else {
            System.out.println("Invalid category");
            System.exit(0);
        }

        netcome = (int) (income - (income * tax));
        System.out.println("Your netcome is " + netcome);
    }
}

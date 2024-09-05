package week7;

import java.util.Scanner;

public class WhileOvertimePay14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEmployee, overtimeHours, overtimePay = 0;
        double totalOvertimePay = 0;
        String position;

        System.out.print("Employee Number = ");
        numEmployee = sc.nextInt();

        int i = 0;
        while (i < numEmployee) {
            System.out.print("Position of employee " + (i + 1) + " (Director, Manager, Staff) = ");
            position = sc.next();
            System.out.print("Employee "+(i + 1)+" overtime hours = ");
            overtimeHours = sc.nextInt();
            i++;

            if (position.equalsIgnoreCase("director")) {
                continue;
            } else if (position.equalsIgnoreCase("manager")) {
                overtimePay = overtimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                overtimePay = overtimeHours * 15000;
            } else {
                System.out.println("Invalid position");
            }

            totalOvertimePay += overtimePay;
            
        }
        i++;

        System.out.println("Total overtime pay = " + totalOvertimePay);
    }
}

package app.src.main.java.week3;

import java.util.Scanner;

public class TaskDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberTask donny = new MemberTask("111333444", "Donny", 5000000);

        System.out.println("Borrow money: ");
        int loanAmount = scanner.nextInt();
        donny.borrow(loanAmount);
        System.out.println("Current loan amount: " + donny.getLoanAmount());

        System.out.println("Pay installments: ");
        int installment = scanner.nextInt();
        donny.installments(installment);
        System.out.println("Current loan amount: " + donny.getLoanAmount());
    }
}

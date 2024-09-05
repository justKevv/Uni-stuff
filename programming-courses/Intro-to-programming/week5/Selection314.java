package week5;

import java.util.Scanner;

public class Selection314 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        double operand1, operand2, result;
        char operator;

        System.out.println("Enter the first operand : ");
        operand1 = input14.nextDouble();
        System.out.println("Enter the second operand : ");
        operand2 = input14.nextDouble();
        System.out.println("Enter the operator (+ - * /): ");
        operator = input14.next().charAt(0);

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;
            case '-':
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;
            case '*':
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;
            case '/':
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

package week5;

import java.util.Scanner;

/**
 * Selection14
 */
public class Selection14 {
    
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input14.nextInt();

        String numba = number % 2 == 0 ? "Number is even" : "Number is odd";

        System.out.println(numba);


    }

}
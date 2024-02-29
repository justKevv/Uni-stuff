package week11;

import java.util.Scanner;

public class individu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // left triangle pattern from input user
        System.out.print("Masukkan angka : ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 2 * (number - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }
}

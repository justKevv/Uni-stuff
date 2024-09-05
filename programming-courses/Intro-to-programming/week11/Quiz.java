package week11;

import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'n';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < number) {
                    System.out.println("Angka yang Anda masukkan lebih kecil dari jawaban.");
                } else if (answer > number) {
                    System.out.println("Angka yang Anda masukkan lebih besar dari jawaban.");
                } else {
                    success = true;
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (y/n)?");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}

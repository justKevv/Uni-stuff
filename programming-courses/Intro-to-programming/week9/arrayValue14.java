package week9;

import java.util.Scanner;

public class arrayValue14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] finalScores = new int[10];

        for (int i = 0; i < finalScores.length; i++) {
            System.out.println("Enter final score " + i + ": ");
            finalScores[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (finalScores[i] > 70) {
                System.out.println("Student " + i + " Passed!");
            } else {
                System.out.println("Student " + i + " Failed!");
            }
        }
    }
}

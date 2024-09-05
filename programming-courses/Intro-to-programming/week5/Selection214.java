package week5;

import java.util.Scanner;

/**
 * Selection214
 */
public class Selection214 {

    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);

       String letter = "A";

        System.out.print("Nilai uas : ");
        double uas = input14.nextInt();
        System.out.print("Nilai uts : ");
        double uts = input14.nextInt();
        System.out.print("Nilai tugas : ");
        double tugas = input14.nextInt();
        System.out.print("Nilai quiz : ");
        double quiz = input14.nextInt();

        double total = (uas *0.4) + (uts * 0.3) + (tugas * 0.2) + (quiz * 0.1);

        if (80 <= total && total <= 100) {
            letter = "A";
        } else if (73 <= total && total < 80) {
            letter = "B+";
        } else if (65 <= total && total < 73) {
            letter = "B";
        } else if (60 <= total && total < 65) {
            letter = "C+";
        } else if (50 <= total && total < 60) {
            letter = "C";
        } else if (39 <= total && total < 50) {
            letter = "D";
        } else {
            letter = "E";
        }
        

        String message  = total < 65 ? "Retake" : "Pass";

        System.out.println("Total : " + total + "\n" + message);
        System.out.println("Grade : " + letter);
}
}
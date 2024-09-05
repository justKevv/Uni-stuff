package week9;

import java.util.Scanner;

public class arrayAverageScore14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[10];
        double total = 0, counterPasses = 0, counterFails = 0, totalPasses = 0, totalFails = 0;
        double average, averagePasses = 0, averageFails = 0;

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        for (int i = 0; i < students; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            if (scores[i] > 70) {
                counterPasses++;
            } else {
                counterFails++;
            }
            total += scores[i];
        }

        for (int i = 0; i < students; i++) {
            if (scores[i] > 70) {
                totalPasses += scores[i];
                averagePasses = totalPasses / counterPasses;
            } else {
                totalFails += scores[i];
                averageFails = totalFails / counterFails;
            }
        }

        average = total / students;
        System.out.println("The number of student who passes is " + counterPasses);
        System.out.println("The class average score is " + average);

        System.out.println();

        System.out.println("The average score of student who passes is " + averagePasses);
        System.out.println("The average score of student who fails is " + averageFails);
    }
}

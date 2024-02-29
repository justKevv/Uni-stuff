package week13;

import java.util.Scanner;

public class weeklyGrades {
    static int[][] grades = new int[5][7];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inputStudentWeeks();
        inputGrades();
        displayStudentGrades();
        int highestWeek = findHighestWeek();
        System.out.println("Week with the highest grade: " + (highestWeek + 1));
        int highestGrade = findHighestGrade();
        System.out.println("Highest grade: " + highestGrade);
    }

    static void inputStudentWeeks () {
        System.out.print("Enter the number of students to input: ");
        int numStudents = input.nextInt();
        System.out.print("Enter the number of weeks to input: ");
        int numWeeks = input.nextInt();

        grades = new int[numStudents][numWeeks];
    }

    static void inputGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter the grades for student " + (i + 1) + ":");
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print("Week " + (j + 1) + ": ");
                grades[i][j] = input.nextInt();
            }
        }
    }

    static void displayStudentGrades() {
        System.out.println("Weekly grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int findHighestWeek() {
        int highestWeek = 0;
        int highestGrade = grades[0][0];

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    highestWeek = j;
                }
            }
        }

        return highestWeek;

    }

    static int findHighestGrade() {
        int highestGrade = grades[0][0];
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                }
            }
        }
        return highestGrade;

    }
}
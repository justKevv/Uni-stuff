package week6;

import java.util.Scanner;

public class Selection2Exp214 {
    public static void main(String[] args) {
        int angle1, angle2, angle3;
        int totalAngle;
        Scanner input14 = new Scanner(System.in);

        System.out.print("Enter the first angle : ");
        angle1 = input14.nextInt();
        System.out.print("Enter the second angle : ");
        angle2 = input14.nextInt();
        System.out.print("Enter the third angle : ");
        angle3 = input14.nextInt();

        totalAngle = angle1 + angle2 + angle3;

        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right Angled Triangle");
            } else {
                System.out.println("Not a Right Angled Triangle");

            }
        } else if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral Triangle");
        } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }

    }
}

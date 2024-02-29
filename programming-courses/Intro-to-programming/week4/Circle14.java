package week4;

import java.util.Scanner;
public class Circle14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int r;
			double circumference, area, phi = 3.14;

			System.out.print("Enter the radius of the circle: ");
			r = scanner.nextInt();

			area = phi * r * r;
			circumference = 2 * phi * r;

			System.out.println("Area: " + area);
			System.out.println("Circumference: " + circumference);
		}
    }
}

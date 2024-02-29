package week3;
import java.util.Scanner;
public class Triangle14 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int base, height;
            float area;

            System.out.print("Enter base: ");
            base = in.nextInt();
            System.out.print("Enter height: ");
            height = in.nextInt();
            area = base * height/2;

            System.out.println("Area of a triangle: " + area);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

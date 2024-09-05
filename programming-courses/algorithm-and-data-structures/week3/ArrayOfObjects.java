package week3;

import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle "+ i);

            System.out.print("Input length : ");
            rectangleArray[i].length = input.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle "+ i);
            System.out.println("width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        }

        System.out.print("Input how many: ");
        int howMany = input.nextInt();
        Square[] squareArray = new Square[howMany];

    }
}

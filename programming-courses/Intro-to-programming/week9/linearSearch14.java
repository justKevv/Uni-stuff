package week9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class linearSearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[0];
        int key = 0;
        int result = 0;
        System.out.print("Enter the number of array elements: ");
        int number = sc.nextInt();
        arrayInt = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Enter the key you want to search: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                System.out
                        .println("The key in the array is located at index position "
                                + Arrays.binarySearch(arrayInt, key));
            } else {
                System.out.println("Key not found");
            }
        }

    }
}

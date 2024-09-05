package week9;

import java.util.Arrays;
import java.util.Scanner;

public class searchHighLowArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[0];
        int total = 0;
        double average = 0;

        System.out.print("Enter the number of array elements: ");
        int number = sc.nextInt();
        arrayInt = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
            total += arrayInt[i];
        }
        average = total / number;   
        Arrays.sort(arrayInt);

        System.out.println("Highest value is " + arrayInt[number - 1]);
        System.out.println("Lowest value is " + arrayInt[0]);
        System.out.println("Average value is " + average);


    }
}

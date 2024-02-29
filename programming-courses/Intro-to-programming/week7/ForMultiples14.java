package week7;

import java.util.Scanner;

public class ForMultiples14 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple, sum=0, counter=0;
        int average =0;

        System.out.print("Input the multiple : ");
        multiple = sc.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum += i;
                counter++;
                //calculate the average
                average = sum / counter;
            }
            

        }

        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 to 50 is %d.\n", multiple, sum);
        //Print the output for the average
        System.out.printf("The average of all multiples of %d in range 1 to 50 is %d.\n", multiple, average);

    }

    

}

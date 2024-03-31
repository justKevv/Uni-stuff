package week5;

import java.util.Scanner;

public class MainFaktorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Input the number of elements you want to count : ");
        int element = sc.nextInt();

        Faktorial[] fk = new Faktorial[element];
        for (int i = 0; i < element; i++) {
            fk[i] = new Faktorial();
            System.out.print("Input the data value to-"+(i+1)+" : ");
            fk[i].num = sc.nextInt();
        }
        System.out.println("+--------------------------------+");
        System.out.println("Factorial results with Brute Force");
        for (int i = 0; i < fk.length; i++) {
            long startBF = System.nanoTime();
            System.out.println("Factorial of value "+fk[i].num+" is : "+fk[i].FaktorialBF(fk[i].num));
            long endBF = System.nanoTime();
            long timeBF = endBF - startBF;
            System.out.println("Time : "+timeBF+" ns");
        }
        System.out.println("+--------------------------------+");
        System.out.println("Factorial results with Divide and Conquer");
        for (int i = 0; i < fk.length; i++) {
            long startDC = System.nanoTime();
            System.out.println("Factorial of value "+fk[i].num+" is : "+fk[i].FaktorialDC(fk[i].num));
            long endDC = System.nanoTime();
            long timeDC = endDC - startDC;
            System.out.println("Time : "+timeDC+" ns");
        }
        System.out.println("+--------------------------------+");
    }
}

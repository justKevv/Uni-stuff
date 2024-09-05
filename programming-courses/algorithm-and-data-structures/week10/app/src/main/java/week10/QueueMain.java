package week10;

import java.util.Random;
import java.util.Scanner;

public class QueueMain {
    static void menu() {
        System.out.println("Choose menu");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Exit");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Enter max size: ");
        int max = sc.nextInt();
        Queue Q = new Queue(max);
        int choice;

        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int n = r.nextInt(100);
                    System.out.println("New element added: " + n);
                    Q.enqueue(n);
                    break;
                case 2:
                    System.out.println(Q.Dequeue());
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    for (int i = 0; i < max; i++) {
                        System.out.println(Q.Q[i]);
                    }
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (choice != 6);
    }

}
package week10;

import java.util.Random;
import java.util.Scanner;
import net.datafaker.Faker;

public class PassengerQueueMain {
    static void menu() {
        System.out.println("Choose menu");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue element");
        System.out.println("4. Check last queue element");
        System.out.println("5. Check all queue elements");
        System.out.println("6. Clear");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random r = new Random();

        System.out.print("Enter max size: ");
        int max = sc.nextInt();
        PassengerQueue Q = new PassengerQueue(max);
        
        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Passenger p = new Passenger(faker.name().firstName(), faker.address().city(),
                            faker.address().city(), r.nextInt(1, 10), r.nextInt(10000, 50000));
                    
                    Q.Enqueue(p);
                    break;
                case 2:
                    Passenger data = Q.Dequeue();
                    System.out.println("Data removed: " + data.name + " " + data.cityOrigin + " " + data.cityDestination
                            + " " + data.ticketAmount + " " + data.price);
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.peekRear();
                    break;
                case 5:
                    Q.print();
                    break;
                case 6:
                    Q.clear();
                    break;
            }
        } while (choose != 6);
    }
}

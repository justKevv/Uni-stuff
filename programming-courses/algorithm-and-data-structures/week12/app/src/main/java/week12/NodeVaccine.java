package week12;

import java.util.Scanner;
public class NodeVaccine {
    int queueNumber;
    String name;
    NodeVaccine next, prev;

    public NodeVaccine(int queueNumber, String name) {
        this.prev = null;
        this.queueNumber = queueNumber;
        this.name = name;
        this.next = null;
    }
    
}

class VaccineQueue {
    NodeVaccine head;

    void addPerson(int queueNumber, String name) {
        NodeVaccine newNode = new NodeVaccine(queueNumber, name);
        if (head == null) {
            head = newNode;
        } else {
            NodeVaccine last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    void removePerson() {
        if (head == null) {
            System.out.println("Empty queue");
        } else {
            System.out.println(head.name + " has been vaccinated");
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    void displayQueue() {
        if (head == null) {
            System.out.println("Empty queue");
        }
        System.out.println("Vaccine queue: ");
        System.out.println("No.\t\tName");
        NodeVaccine current = head;
        int count= 0;
        while (current != null) {
            System.out.println(current.queueNumber + "\t\t" + current.name);
            current = current.next;
            count++;
        }
        System.out.println("Queue left: " + count);
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        VaccineQueue queue = new VaccineQueue();
        int choice;
        do {
            System.out.println("\nExtravaganza Vaccine Queue");
            System.out.println("1. Add Vaccine queue");
            System.out.println("2. Remove Vaccine queue");
            System.out.println("3. Display vaccine queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter queue number: ");
                    int queueNumber = in.nextInt();
                    in.nextLine();
                    System.out.println("Enter name: ");
                    String name = in.nextLine();
                    queue.addPerson(queueNumber, name);
                    break;
                case 2:
                    queue.removePerson();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 4);

    }
}

package week11;

import java.util.Scanner;

public class Bank {
    Customer head;

    void addCustomer(String name, String address, String accountNumber) {
        Customer newCustomer = new Customer(name, address, accountNumber);
        if (head == null) {
            head = newCustomer;
        } else {
            Customer temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newCustomer;
        }
    }

    Customer findCustomer(String accountNumber) {
        Customer temp = head;
        while (temp != null) {
            if (temp.accountNumber.equals(accountNumber)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    void displayCustomers() {
        Customer temp = head;
        while (temp != null) {
            System.out.println(temp.name + ", " + temp.address + ", " + temp.accountNumber);
            temp = temp.next;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();
        int choice;
        while (true) {
            System.out.println("1. Add customer");
            System.out.println("2. Find customer");
            System.out.println("3. Display customers");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = sc.next();
                    System.out.println("Enter address: ");
                    String address = sc.next();
                    System.out.println("Enter account number: ");
                    String accountNumber = sc.next();
                    bank.addCustomer(name, address, accountNumber);
                    break;
                case 2:
                    System.out.println("Enter account number: ");
                    String accountNumber2 = sc.next();
                    Customer customer = bank.findCustomer(accountNumber2);
                    if (customer == null) {
                        System.out.println("Customer not found");
                    } else {
                        System.out.println(customer.name + ", " + customer.address + ", " + customer.accountNumber);
                    }
                    break;
                case 3:
                    bank.displayCustomers();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

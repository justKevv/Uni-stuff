package week12;

import java.util.Scanner;
public class NodeBook {
    String bookTitle;
    NodeBook next, prev;

    public NodeBook(String bookTitle) {
        this.prev = null;
        this.bookTitle = bookTitle;
        this.next = null;
    }
}

class BookStack {
    NodeBook top;

    boolean isEmpty() {
        return top == null;
    }

    void push(String bookTitle) {
        NodeBook newNode = new NodeBook(bookTitle);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top.prev = newNode;
            top = newNode;
        }
    }

    String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String bookTitle = top.bookTitle;
            top = top.next;
            if (top != null) {
                top.prev = null;  
            }
            return bookTitle;
        }
    }

    String peek() {
        if (isEmpty()) {
            return "Empty stack";
        } else {
            return top.bookTitle;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty stack");
        } else {
            NodeBook current = top;
            while (current != null) {
                System.out.println(current.bookTitle);
                current = current.next;
            }
        }
        System.out.println();
    }

    static void menu() {
        System.out.println("1. Add new book");
        System.out.println("2. Pop book");
        System.out.println("3. Peek book title from top");
        System.out.println("4. Display all books");
        System.out.println("5. Exit");
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BookStack stack = new BookStack();
        int choice;
        while (true) {
            menu();
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter book title: ");
                    String bookTitle = in.nextLine();
                    stack.push(bookTitle);
                    break;
                case 2:
                    System.out.println("Book removed: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top book: " + stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

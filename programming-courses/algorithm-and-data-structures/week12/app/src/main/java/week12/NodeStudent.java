package week12;

import java.util.Scanner;

class Student {
    String nim, name;
    double gpa;
    
    Student(String nim, String name, double gpa) {
        this.nim = nim;
        this.name = name;
        this.gpa = gpa;
    }
}

public class NodeStudent {
    StudentNode head, tail;

    class StudentNode {
        Student student;
        StudentNode next, prev;

        StudentNode(Student student) {
            this.student = student;
            this.next = null;
            this.prev = null;
        }
    }

    void addFirst(Student student) {
        StudentNode newNode = new StudentNode(student);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student student) {
        StudentNode newNode = new StudentNode(student);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void addAtPosition(int position, Student student) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        StudentNode newNode = new StudentNode(student);
        if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            StudentNode current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next.prev = newNode;
            newNode.prev = current;
            current.next = newNode;
        }
    }

    void display() {
        StudentNode current = head;
        while (current != null) {
            System.out.println(current.student.nim + "\t\t" + current.student.name + "\t\t" + current.student.gpa);
            current = current.next;
        }
    }

    void search(String nim) {
        StudentNode current = head;
        while (current != null) {
            if (current.student.nim.equals(nim)) {
                System.out.println(current.student.nim + "\t\t" + current.student.name + "\t\t" + current.student.gpa);
                return;
            }
            current = current.next;
        }
        System.out.println("Student not found");
    }

    void sort() {
        StudentNode current = head;
        StudentNode next;
        boolean sorted = true;
        while (current != null) {
            next = current.next;
            while (next != null) {
                if (current.student.gpa < next.student.gpa) {
                    swapStudents(current, next);
                    sorted = false;
                }
                next = next.next;
            }
            current = current.next;
        }
        if (sorted) {
            return; // List is already sorted, no need to continue sorting
        }
    }
    
    void swapStudents(StudentNode current, StudentNode next) {
        Student temp = current.student;
        current.student = next.student;
        next.student = temp;
    }

    void removeFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        StudentNode temp = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        System.out.println(temp.student.nim + "\t\t" + temp.student.name + "\t\t" + temp.student.gpa);
    }

    void removeLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        System.out.println(temp.student.nim + "\t\t" + temp.student.name + "\t\t" + temp.student.gpa);
    }

    void removeAtPosition(int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        StudentNode current = head;
        for (int i = 1; i < position - 1; i++) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Student not found");
            return;
        }
        current.next = current.next.next;
        if (current.next != null) {
            current.next.prev = current;
        }
        System.out.println(current.student.nim + "\t\t" + current.student.name + "\t\t" + current.student.gpa);
    }

    static Scanner in = new Scanner(System.in);
     static void menu() {
        System.out.println("1. Add student at the beginning");
        System.out.println("2. Add student at the end");
        System.out.println("3. Add student at position");
        System.out.println("4. Remove student from the beginning");
        System.out.println("5. Remove student from the end");
        System.out.println("6. Remove student from position");
        System.out.println("7. Display student list");
        System.out.println("8. Search student");
        System.out.println("9. Sort student list - DESC");
        System.out.println("10. Exit");
     }
    
    public static void main(String[] args) {
        NodeStudent list = new NodeStudent();
        while (true) {
            menu();
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter student NIM: ");
                    String nim = in.nextLine();
                    
                    System.out.println("Enter student name: ");
                    String name = in.nextLine();
                    
                    System.out.println("Enter student GPA: ");
                    double gpa = in.nextDouble();
                    list.addFirst(new Student(nim, name, gpa));
                    break;
                case 2:
                    System.out.println("Enter student NIM: ");
                    String nim1 = in.nextLine();
                    
                    System.out.println("Enter student name: ");
                    String name2 = in.nextLine();
                    
                    System.out.println("Enter student GPA: ");
                    double gpa3 = in.nextDouble();
                    list.addLast(new Student(nim1, name2, gpa3));
                    break;
                case 3:
                    System.out.println("Enter student NIM: ");
                    String nim2 = in.nextLine();
                    
                    System.out.println("Enter student name: ");
                    String name3 = in.nextLine();
                    
                    System.out.println("Enter student GPA: ");
                    double gpa4 = in.nextDouble();
                    System.out.println("Enter position: ");
                    int position1 = in.nextInt();
                    list.addAtPosition(position1, new Student(nim2, name3, gpa4));
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.println("Enter position: ");
                    int position = in.nextInt();
                    list.removeAtPosition(position);
                    break;
                case 7:
                    list.display();
                    break;
                case 8:
                    System.out.println("Enter student NIM: ");
                    String nim4 = in.nextLine();
                    list.search(nim4);
                    break;
                case 9:
                    list.sort();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

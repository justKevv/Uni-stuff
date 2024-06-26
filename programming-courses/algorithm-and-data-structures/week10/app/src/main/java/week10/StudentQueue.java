package week10;
import java.util.Scanner;

public class StudentQueue {
    int max, size, front, rear;
    Student Q[];

    StudentQueue(int max) {
        this.max = max;
        Create();
    }

    void Create() {
        Q = new Student[max];
        size = 0;
        front = rear = -1;
    }

    boolean IsEmpty() {
        return (size == 0);
    }

    boolean IsFull() {
        return (size == max);
    }

    void enqueue(Student stdQueue) {
        if (IsFull()) {
            System.out.println("Queue is Full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;

                }
            }
            Q[rear] = stdQueue;
            size++;
        }
    }

    Student Dequeue() {
        Student data = null;
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    void print() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i].nim + " " + Q[i].name + " " + Q[i].classNumber + " " + Q[i].gpa + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i].nim + " " + Q[i].name + " " + Q[i].classNumber + " " + Q[i].gpa + " ");
            System.out.println("Element amount: " + size);
        }
    }

    void peek() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            System.out.println(
                    Q[front].nim + " " + Q[front].name + " " + Q[front].classNumber + " " + Q[front].gpa + " ");
        }
    }

    void peekRear() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            System.out.println(Q[rear].nim + " " + Q[rear].name + " " + Q[rear].classNumber + " " + Q[rear].gpa + " ");
        }
    }

    void peekPosition(String nim) {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            int i = front;
            while (i != rear) {
                if (Q[i].nim.equals(nim)) {
                    System.out.println(Q[i].nim + " " + Q[i].name + " " + Q[i].classNumber + " " + Q[i].gpa + " ");
                    return;
                }
                i = (i + 1) % max;
            }
            System.out.println("Student not found");
        }
    }

    void printStudents(int position) {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else if (position < 0 || position >= size) {
            System.out.println("Invalid position");
        } else {
            int index = (front + position) % max;
            System.out.println(
                    Q[index].nim + " " + Q[index].name + " " + Q[index].classNumber + " " + Q[index].gpa + " ");
        }
    }
    
    static void menu() {
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Print Students");
        System.out.println("8. Exit");
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        StudentQueue queue = new StudentQueue(5);
        int choice;
        while (true) {
            menu();
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter student information");
                    String nim = in.next();
                    String name = in.next();
                    int classNumber = in.nextInt();
                    double gpa = in.nextDouble();
                    Student std = new Student(nim, name, classNumber, gpa);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.Dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    System.out.println("Enter student NIM");
                    String nimS = in.nextLine();
                    queue.peekPosition(nimS);
                    break;
                case 7:
                    System.out.println("Enter position");
                    int position = in.nextInt();
                    queue.printStudents(position);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

}

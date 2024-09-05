package week10;

public class Queue {
    int max, size, front, rear;
    int Q[];

    Queue(int max) {
        this.max = max;
        Create();
    }

    void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean IsEmpty() {
        return (size == 0);
    }

    boolean IsFull() {
        return (size == max);
    }

    void Display() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            System.out.println("The first element: "+ Q[front]);
        }
    }

    void print() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Element amount: "+ size);
        }
    }

    void clear() {
        if (IsEmpty())
            System.out.println("Queue is Empty");
        else {
            front = rear = -1;
            size = 0;
            System.out.println("Queue is cleared");            
        }
    }

    void enqueue(int n) {
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
            Q[rear] = n;
            size++;
        }
    }

    int Dequeue() {
        int data = 0;
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
}

package week11;

public class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Queue
 */ 
class Queue {
    QueueNode front, rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(int data) {
        QueueNode temp = new QueueNode(data);
        if (isEmpty()) {
            front = temp;
            rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }
    
     void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        QueueNode temp = front;
        front = front.next;
        System.out.println(temp.data);
    }
    
    boolean isEmpty() {
        return front == null;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            QueueNode temp = front;
            System.out.print("Queue content: \t");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.printQueue();
        System.out.println("Front element: " + queue.peek());
        queue.dequeue();
        System.out.println("Front element: " + queue.peek());
        queue.printQueue();
    }
    
}

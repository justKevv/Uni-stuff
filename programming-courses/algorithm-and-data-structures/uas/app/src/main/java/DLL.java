import java.util.Comparator;


public class DLL<T> {
    private Node<T> head;
    private Node<T> tail;

    public DLL() {
        head = null;
        tail = null;
    }

    void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void sort(Comparator<T> comparator) {
        if (head == null) return; // Jika linked list kosong, keluar dari method

        // bubble sort untuk mengurutkan elemennya
        boolean swapped;
        do {
            swapped = false;
            Node<T> current = head;
            while (current.next != null) {
                if (comparator.compare(current.data, current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }



    public Node<T> getHead() {
        return head;
    }

}

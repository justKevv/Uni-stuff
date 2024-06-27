package week12;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        if (isEmpty()) {
            head = new Node(null, data, null);

        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int data, int index) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Index out of bounds");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "\t");
                current = current.next;
            }
            System.out.println();

        } else {
            System.out.println("Empty");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
            
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Index out of bounds");
        } else if (size == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                removeLast();
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        } else {
            return head.data;
        }
    }

    int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.data;
        }
    }

    int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("List is empty");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

}

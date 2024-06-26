package week11;

public class SingleLinkedList {

    private Node head;
    private Node tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Linked List content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List is empty");
        }
    }

    void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input) {
        if (index < 0) {
            System.out.println("Invalid index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    int getData(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    int indexOf(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            return -1;
        } else {
            return index;
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Cannot remove a data");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Cannot remove a data");
        } else if (head == tail) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
    void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked List is empty. Cannot remove a data");
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key && temp == head) {
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

    void insertBefore(int key, int input) {
        if (isEmpty()) {
            addFirst(input);
        } else {
            Node temp = head;
            while (temp.data != key) {
                temp = temp.next;
            }
            Node ndInput = new Node(input, temp.next);
            temp.next = ndInput;
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
}

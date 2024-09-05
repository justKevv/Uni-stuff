package quiz2;

public class DoubleLinkedList {
    Node head, tail;
    int size;

    DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            nu.n = head;
            head.p = nu;
            head = nu;
        }
        size++;
    }

    void deleteFirst() {
        head = head.n;
        head.p = null;
        size--;
    }

    void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print("" + tmp.data + "-");
            tmp = tmp.n;
        }
        System.out.println("");
    }

    // 1. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    void addLast(int data) {
        Node nu = new Node(data);
        if (isEmpty()) {
            head = tail = nu;
        } else {
            tail.n = nu;
            nu.p = tail;
            tail = nu;

        }
        size++;
    }

    // 2. complete the deleteLast
    /**
     * this method will remove tail
     */
    void deleteLast() {
        tail = tail.p;
        tail.n = null;
        size--;

    }

    // 3. complete the printFromTail
    /**
     * this method will print all data from tail to head
     */
    void printFromTail() {
        Node tmp = tail;
        while (tmp != null) {
            System.out.print("" + tmp.data + "-");
            tmp = tmp.p;
        }
        System.out.println("");
    }

    // 4. complete getPositionFromTail
    // and modify return 1
    /**
     * this method will return the position of data from last
     */
    int getPositionFromTail(int data) {
        Node tmp = tail;
        int pos = 0;
        while (tmp != null) {
            if (tmp.data == data) {
                return pos;
            }
            tmp = tmp.p;
            pos++;
        }
        return -1;
    }

    // 5. complete getLastPositionFromTail
    // and modify return 1
    /**
     * this method will return the last position where the data found
     * and the searching start from last
     */
    int getLastPositionFromTail(int data) {
        Node tmp = tail;
        Node last = head;
        int Tailpos = 0;
        int Headpos = 0;
        while (tmp != null) {
            if (tmp.data == data) {
                break;
            }
            tmp = tmp.p;
            Tailpos++;
        }
        while (last != null) {
            if (last.data == data) {
                break;
            }
            last = last.n;
            Headpos++;
        }
        if (Tailpos == Headpos) {
            return Tailpos;
        }
        return Tailpos + Headpos;
        
    }

    // 6. complete getAverage
    /**
     * this method will return average from all data
     */
    double getAverage() {
        double sum = 0;
        Node tmp = head;
        while (tmp != null) {
            sum += tmp.data;
            tmp = tmp.n;
        }
        return sum / size;
    }

    // 7. complete the missing code getNodeByIndex
    /**
     * this method will return NODE at certain index
     * you may use this method at sort() and getMedian()
     */
    Node getNodeByIndex(int index) {
        Node tmp = head;
        // complete by using loop to get node at certain index below
        for (int i = 1; i <= index; i++) {
            tmp = tmp.n;
        }
        return tmp;
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            // comparisson data with adjacent
            for (int j = 1; j < size - i; j++) {
                Node node1 = getNodeByIndex(j);
                Node node2 = getNodeByIndex(j - 1);
                if (node2.data > node1.data) {
                    // SWAP
                    int tmp = node2.data;
                    node2.data = node1.data;
                    node1.data = tmp;
                }
            }
        }
    }

    // 8. complete getMedian
    /**
     * this method will return median value
     * median is calculated by the following steps:
     * 1) sort the data in ascending mode
     * 2) if the size of data is odd, then median is the data at the middle
     * 3) if the size of data is even, then median is the average of
     * 2 data at the middle
     */
    double getMedian() {
        double median = 0;
        // complete to calculate median below
        sort();
        if (size % 2 == 1) {
            median = getNodeByIndex(size / 2).data;
        } else {
            median = (getNodeByIndex(size / 2).data + getNodeByIndex(size / 2 - 1).data) / 2;
        }
        return median;
    }

    // 9. complete main to make a simulation
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        // -----------------------------------------------
        dll.addLast(70);
        dll.print();
        dll.deleteLast();
        dll.print();
        dll.addLast(20);
        dll.print();
        dll.printFromTail();
        System.out.println(dll.getPositionFromTail(45));
        System.out.println(dll.getLastPositionFromTail(10));
        System.out.println(dll.getAverage());
        dll.sort();
        dll.print();
        System.out.println(dll.getMedian());
        // continue to call addLast, deleteLast, printFromTail,
        // getPositionFromTail, getLastPositionFromTail,
        // getAverage, getMedian
    }
}

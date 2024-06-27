package week12;

import java.util.Scanner;

public class NodeAssignment1 {
    int data;
    NodeAssignment1 next, prev;

    public NodeAssignment1(NodeAssignment1 prev, int data, NodeAssignment1 next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    
}

class DoubleLinkedLists1 {
    NodeAssignment1 head;
    int size;

    public DoubleLinkedLists1() {
        this.head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int data) {
        if (isEmpty()) {
            head = new NodeAssignment1(null, data, null);
        } else {
            NodeAssignment1 newNode = new NodeAssignment1(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int data) {
        if (isEmpty()) {
            addFirst(data);
        } else {
            NodeAssignment1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeAssignment1 newNode = new NodeAssignment1(current, data, null);
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
            NodeAssignment1 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                NodeAssignment1 newNode = new NodeAssignment1(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeAssignment1 newNode = new NodeAssignment1(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
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
        NodeAssignment1 current = head;
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
            NodeAssignment1 current = head;
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

    void print() {
        if (!isEmpty()) {
            NodeAssignment1 current = head;
            while (current != null) {
                System.out.print(current.data + "\t");
                current = current.next;
            }
            System.out.println();

        } else {
            System.out.println("Empty");
        }
    }

    boolean search(int data) {
        NodeAssignment1 current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void sortData() {
        if (isEmpty()) {
            return;
        }
        NodeAssignment1 current = head;
        while (current.next != null) {
            if (current.data < current.next.data) {
                NodeAssignment1 temp = current.next;
                current.next = temp.next;
                temp.next = current;
                current = temp;
            }
            current = current.next;
        }
        
    }

    void bubbleSort(NodeAssignment1 head) {
        boolean swapped;
        do {
            swapped = false;
            NodeAssignment1 current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    int getIndex(int data) {
        NodeAssignment1 current = head;
        int index = 0;
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    static void menu() {
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Add data at nth index");
        System.out.println("4. Remove First");
        System.out.println("5. Remove Last");
        System.out.println("6. Remove byindex");
        System.out.println("7. Print");
        System.out.println("8. Search Data");
        System.out.println("9. Sort Data");
        System.out.println("10. Exit");
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists1 list = new DoubleLinkedLists1();
        int choice;
        while (true) {
            menu();
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter data: ");
                    int data = in.nextInt();
                    list.addFirst(data);
                    break;
                case 2:
                    System.out.println("Enter data: ");
                    int data1 = in.nextInt();
                    list.addLast(data1);
                    break;
                case 3:
                    System.out.println("Enter data: ");
                    int data2 = in.nextInt();
                    System.out.println("Enter index: ");
                    int index = in.nextInt();
                    list.add(data2, index);
                    break;
                case 4:
                    try {
                        list.removeFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        list.removeLast();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Enter index: ");
                    int index1 = in.nextInt();
                    try {
                        list.remove(index1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    list.print();
                    break;
                case 8:
                    System.out.println("Enter data: ");
                    int data3 = in.nextInt();
                    if (list.search(data3)) {
                        System.out.println("Element found at index " + list.getIndex(data3));
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 9:
                    list.bubbleSort(list.head);
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

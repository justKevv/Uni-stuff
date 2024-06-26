package week11;

public class CharLL {
    private Node2 head;

    void addFirst(char input) {
        Node2 ndInput = new Node2(input);
        ndInput.next = head;
        head = ndInput;
    }

    void addLast(char input) {
        Node2 ndInput = new Node2(input);
        if (head == null) {
            head = ndInput;
            return;
        }
        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ndInput;
    }

    void insertAfter(char key, char input) {
        Node2 temp = head;
        while (temp.data != key) {
            temp = temp.next;
        }
        Node2 ndInput = new Node2(input);
        ndInput.next = temp.next;
        temp.next = ndInput;
    }

    void insertAt(int index, char input) {
        if (index < 0) {
            System.out.println("Invalid index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node2 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node2 ndInput = new Node2(input);
            ndInput.next = temp.next;
            temp.next = ndInput;
        }
    }

    void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            Node2 temp = head;
            System.out.print("Linked List content: \t");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        CharLL charLL = new CharLL();

        charLL.addFirst('a');
        charLL.addLast('e');
        charLL.insertAfter('a', 'b');
        charLL.insertAt(2, 'c');
        charLL.insertAt(3, 'd');

        charLL.print();
    }
}

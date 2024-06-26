package week11;

public class Stack {
    NodeStack top;

    boolean isEmpty() {
        return top == null;
    }

    void push(String input) {
        NodeStack ndInput = new NodeStack(input);
        ndInput.next = top;
        top = ndInput;
    }

    String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        String temp = top.data;
        top = top.next;
        return temp;
    }

    String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            NodeStack temp = top;
            System.out.print("Stack content: \t");
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push("Bahasa");
        stack.push("Android");
        stack.push("Komputer");
        stack.push("Basis Data");
        stack.push("Matematika");
        stack.push("Algoritma");
        stack.push("Statistika");
        stack.push("Multimedia");

        System.out.println("Stack content(top to bottom): ");
        stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());

    }
}

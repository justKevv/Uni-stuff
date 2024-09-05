public class Node<T> {
    T data; // Data stored in the node
    Node<T> next; // Next node
    Node<T> prev; // Previous node

    /**
     * Constructor for Node class.
     * @param data The data to be stored in the node.
     */
    Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
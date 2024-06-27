package week12;

public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists list = new DoubleLinkedLists();
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.addFirst(3);
        list.addLast(4);
        list.addFirst(7);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.add(40, 1);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.clear();
        list.print();
        System.out.println("Size: " + list.size());
        list.addLast(50);
        list.addLast(40);
        list.addLast(10);
        list.addLast(20);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.removeFirst();
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.removeLast();
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.remove(1);
        list.print();
        System.out.println("Size: " + list.size());
        list.clear();
        System.out.println("=============================");
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        list.addFirst(3);
        list.addLast(4);
        list.addFirst(7);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");

        list.add(40, 1);
        list.print();
        System.out.println("Size: " + list.size());
        System.out.println("=============================");
        System.out.println("Data in the head of linked list: " + list.getFirst());
        System.out.println("Data in the tail of linked list: " + list.getLast());
        System.out.println("Data at index 1: " + list.get(1));
        
    }
}

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

    }
}

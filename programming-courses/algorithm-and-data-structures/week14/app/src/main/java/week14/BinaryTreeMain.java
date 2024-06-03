package week14;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        tree.add(1);
        tree.add(9);
        tree.add(10);

        tree.traversePreOrder(tree.root);
        System.out.println("");
        tree.traverseInOrder(tree.root);
        System.out.println("");
        tree.traversePostOrder(tree.root);
        System.out.println("");
        System.out.println("Find "+tree.find(8));
        tree.delete(1);
        tree.traversePreOrder(tree.root);
        System.out.println("");
    }
}

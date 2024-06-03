package week15;
import java.util.*;

public class graphArray {
    private final int vertices;
    private final int[][] twoD_array;

    public graphArray(int v) {
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("There is no vertex");
        }
    }

    int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("There is no vertex");
        }
        return -1;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        int v, e, count = 1, to = 0, from = 0;
        graphArray graph;
        try {
            System.out.println("Enter the number of vertices");
            v = sc.nextInt();
            System.out.println("Enter the number of edges");
            e = sc.nextInt();

            graph = new graphArray(v);
            System.out.println("Enter the edges: <to> <from>");
            while (count <= e) {
                to = rand.nextInt(v);
                from = rand.nextInt(v);

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("2D Array as representation of graph: ");
            System.out.print("  ");
            for (int i = 1; i <= v; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Please try again\n" + E.getMessage());
        }
        sc.close();
    }
}

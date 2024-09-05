package week15;

import java.util.*;

public class Graph {
    int vertex;
    LinkedList list[];
    boolean isDirected;

    Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        this.isDirected = isDirected;
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    boolean isDirected() {
        return isDirected;
    }

    void addEdge(int source, int destination) {
        // Add edge from source to destination
        list[source].addFirst(destination);
        // Add back edge (undirected graph)
        list[destination].addFirst(source);

        
    }

    void degree(int source) throws Exception {
        if (isDirected) {
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == source) {
                        ++totalIn;
                    }
                }

                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }

                totalOut = k;

            }

            System.out.println("InDegree vertex " + source + " : " + totalIn);
            System.out.println("OutDegree vertex " + source + " : " + totalOut);
            System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
        } else {
            // Degree undirected graph
            System.out.println("Degree vertex " + source + " : " + list[source].size());
        }

        // Degree directed graph
        // InDegree

    }

    void removeEdge(int source, int destination) throws Exception {
        list[source].remove(destination);
        list[destination].remove(source);

    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph cleared");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("1. Add edge");
        System.out.println("2. Degree");
        System.out.println("3. Remove edge");
        System.out.println("4. Remove all edges");
        System.out.println("5. Print graph");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();
        System.out.println("Enter 1 for directed graph and 0 for undirected graph");
        boolean isDirected = sc.nextInt() == 1;
        Graph graph = new Graph(v, isDirected);
        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    int source = rand.nextInt(v);
                    int destination = rand.nextInt(v);
                    graph.addEdge(source, destination);
                    break;
                case 2:
                    System.out.println("Enter the source");
                    source = sc.nextInt();
                    graph.degree(source);
                    break;
                case 3:
                    System.out.println("Enter the source and destination");
                    source = sc.nextInt();
                    destination = sc.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 4:
                    graph.removeAllEdges();
                    break;
                case 5:
                    graph.printGraph();
                    break;
            }
        } while (choose != 6);
    }
}

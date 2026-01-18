package DataStructre.graph.GraphBasic;

import java.util.*;

class Graph {
    private final int vertexCount;
    private final List<List<Integer>> adjacencyList;

    // Constructor
    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertexCount; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    //Undirected Graph (Both Direction)
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    //Directed Graph
    public void addDirectedEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    //print graph
    public void printGraph() {
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

}

public class GraphBasic {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
    }
}


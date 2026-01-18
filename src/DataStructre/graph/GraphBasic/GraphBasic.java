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

    //Breadth Fist Search
    public void bfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertexCount];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int neighbor : adjacencyList.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

   //Depth first Search
    public void dfsTraversal(int startVertex) {
        boolean[] visited = new boolean[vertexCount];
        dfsUtil(startVertex, visited);
    }

    private void dfsUtil(int currentVertex, boolean[] visited) {
        visited[currentVertex] = true;
        System.out.print(currentVertex + " ");

        for (int neighbor : adjacencyList.get(currentVertex)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }


    //Cycle detection
    public boolean hasCycle() {
        boolean[] visited = new boolean[vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            if (!visited[i]) {
                if (hasCycleUtil(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasCycleUtil(int currentVertex, boolean[] visited, int parent) {
        visited[currentVertex] = true;

        for (int neighbor : adjacencyList.get(currentVertex)) {
            if (!visited[neighbor]) {
                if (hasCycleUtil(neighbor, visited, currentVertex)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
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


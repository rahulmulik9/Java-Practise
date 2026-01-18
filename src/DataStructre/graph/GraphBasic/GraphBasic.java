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
}

public class GraphBasic {
    public static void main(String[] args) {

    }
}


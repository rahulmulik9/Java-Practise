package DataStructre.graph.GraphBasic;
import java.util.*;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int vertices) {
        V = vertices;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this line for directed graph
    }

public class GraphBasic {
    public static void main(String[] args) {

    }
  }
}


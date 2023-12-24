package dataStructre.graph.adjacencyList;

import java.util.ArrayList;

public class GraphNode {
    private String name;
    private int index;
    private ArrayList<GraphNode> neighbour = new ArrayList<GraphNode>();

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setNeighbour(ArrayList<GraphNode> neighbour) {
        this.neighbour = neighbour;
    }

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
    public ArrayList<GraphNode> getNeighbour() {
        return neighbour;
    }
}

package dataStructre.graph.adjacencyMatrix;

import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    int[][] adjacentMatrix;

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
        adjacentMatrix=new int[nodeList.size()][nodeList.size()];
    }
    public void addUnidrectionalEdge(int n, int m){
        adjacentMatrix[n][m]=1;
        adjacentMatrix[m][n]=1;
    }

    public String toString(){
        StringBuilder s=new StringBuilder();
        s.append(" ");
        for (GraphNode graphNode : nodeList) {
            s.append(graphNode.getName()).append(" ");
        }
        s.append("\n");

        for(int i=0;i< nodeList.size();i++){
            s.append(nodeList.get(i).getName()).append(": ");
            for (int j : adjacentMatrix[i]){
                s.append(j).append(" ");
            }
            s.append("\n");
        }

        return s.toString();
    }
}

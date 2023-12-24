package dataStructre.graph.adjacencyList;


import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addUndirectionalEdge(int i, int j){
        GraphNode first=nodeList.get(i);
        GraphNode second=nodeList.get(j);
        first.getNeighbour().add(second);
        second.getNeighbour().add(first);
    }

    public String toString(){
        StringBuilder s =new StringBuilder();
        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).getName()).append(": ");
            for (int j=0;j<nodeList.get(i).getNeighbour().size();j++){
                if(j == nodeList.get(i).getNeighbour().size()-1){
                    s.append(nodeList.get(i).getNeighbour().get(j).getName());
                }else {
                    s.append(nodeList.get(i).getNeighbour().get(j).getName()).append(" => ");
                }
            }
            s.append("\n");
        }

     return s.toString();
    }
}

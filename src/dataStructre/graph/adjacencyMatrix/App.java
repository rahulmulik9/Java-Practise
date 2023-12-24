package dataStructre.graph.adjacencyMatrix;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<GraphNode> list=new ArrayList<GraphNode>();
        list.add(new GraphNode("A",0));
        list.add(new GraphNode("B",1));
        list.add(new GraphNode("B",2));
        list.add(new GraphNode("D",3));
        list.add(new GraphNode("E",4));

        Graph g =new Graph(list);
        g.addUnidrectionalEdge(0,1);
        g.addUnidrectionalEdge(0,2);
        g.addUnidrectionalEdge(0,3);
        g.addUnidrectionalEdge(1,4);
        g.addUnidrectionalEdge(2,3);
        g.addUnidrectionalEdge(3,4);

        System.out.println(g.toString());
    }
}

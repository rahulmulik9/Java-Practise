package dataStructre.graph.adjacencyList;

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
        g.addUndirectionalEdge(0,1);
        g.addUndirectionalEdge(0,2);
        g.addUndirectionalEdge(0,3);
        g.addUndirectionalEdge(1,4);
        g.addUndirectionalEdge(2,3);
        g.addUndirectionalEdge(3,4);

        System.out.println(g.toString());
    }
}

package graph.node;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    public String val;
    public int index;

    //This is for adjacencyList
    public List<GraphNode> neighbours;
    public boolean isVisited;

    public GraphNode(String val, int index){
        this.val = val;
        this.index = index;
        neighbours = new LinkedList<>();
        isVisited = false;
    }
}

package graph.node;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    private final String name;

    private final int index;

    // This is used for Adjancency List to add the neghbours
    private final List<GraphNode> neighbours = new ArrayList<>();

    private GraphNode parentNode;

    private boolean isVisited;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        isVisited=false;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public List<GraphNode> getNeighbours() {
        return neighbours;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public GraphNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(GraphNode parentNode) {
        this.parentNode = parentNode;
    }
}

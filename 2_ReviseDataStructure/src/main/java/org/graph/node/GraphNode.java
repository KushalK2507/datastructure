package org.graph.node;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    String value;

    int index;

    List<GraphNode> neighbours;

    boolean isVisited;
    GraphNode parentNode;

    public GraphNode(String name, int index){
        this.value = name;
        isVisited = false;
        this.index = index;
        this.neighbours = new ArrayList<>();

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public List<GraphNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<GraphNode> neighbours) {
        this.neighbours = neighbours;
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
